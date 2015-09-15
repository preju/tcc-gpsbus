package gps.tcc.smartbus;

import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class SmartBus extends FragmentActivity {
    //variaveis privadas
    public GoogleMap googleMap;

    //variaveis publicas
        Context context;

    public LatLng test = new LatLng(-23.9678823, -46.3288865);
    public LatLng test2 = new LatLng(-23.938535, -46.387567);
    public void desenhaRota()
    {

        if (googleMap != null) {
            //Rotas rotas = new Rotas(this);
            googleMap.setMyLocationEnabled(true);

            ArrayList<LatLng> pontoIda = (new Rotas(this)).linha154Ida();

            for(int a = 0; a < pontoIda.size(); a++ ) {
            int b = 1;
            LatLng origem = pontoIda.get(a);
            LatLng destino = pontoIda.get(b);
            String url = getDirectionsUrl(origem, destino);
            DownloadTask downloadTask = new DownloadTask();
            downloadTask.execute(url);
            b = b+1;
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_bus);
        //iniciar o mapa e centralizar em Santos
        googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapFragment)).getMap();
        configuracaoMapa();
        Rotas rotas = new Rotas(this);
        //rotas.linha154();
        this.context = context;
        desenhaRota();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_smart_bus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void configuracaoMapa() {

        LatLng centralizarSantos = new LatLng(-23.9678823, -46.3288865);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralizarSantos, 12));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(12), 2000, null);
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    }

   /** public void desenhaRota2()
    {
        Rotas rotas = new Rotas(this);
        //Polyline polyone = googleMap.addPolyline(new PolylineOptions().addAll(rotas.pontoIda).width(6).color(Color.RED));
        //Polyline polytwo = googleMap.addPolyline(new PolylineOptions().addAll(rotas.pontoVolta).width(4).color(Color.GREEN).geodesic(true));

    }
    */




    /*********************PARTE DO CODIGO FORNECIDO PELO GOOGLE PARA CONEXAO COM O GOOGLE DIRECTIONS API**************/

    private String getDirectionsUrl(LatLng origem, LatLng destino) {
        String str_origem = "origin=" + origem.latitude + "," + origem.longitude;
        String str_destino = "destination=" + destino.latitude + "," + destino.longitude;
        String sensor = "sensor=false";
        String parameters = str_origem + "&" + str_destino + "&" + sensor;
        String output = "json";
        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters;
        return url;
    }

    private String downloadUrl(String strUrl) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(strUrl);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            iStream = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
            StringBuffer sb = new StringBuffer();

            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            data = sb.toString();
            br.close();

        } catch (Exception error) {
            Log.d("Erro durante o procedimento de download da url", error.toString());
        } finally {
            iStream.close();
            urlConnection.disconnect();
        }
        return data;
    }

    private class DownloadTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... url) {
            String data = "";
            try {
                data = downloadUrl(url[0]);
            } catch (Exception error) {
                Log.d("Segundo plano", error.toString());
            }
            return data;
        }

        @Override
        protected void onPostExecute(String result)
        {
            super.onPostExecute(result);
            ParserTask parserTask = new ParserTask();
            parserTask.execute(result);
        }
    }

    private class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String, String>>>> {
        @Override
        protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {
            JSONObject jObject;
            List<List<HashMap<String, String>>> routes = null;
            try {
                jObject = new JSONObject(jsonData[0]);
                DirectionsJSONParser parser = new DirectionsJSONParser();
                routes = parser.parse(jObject);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return routes;

        }

        protected void onPostExecute(List<List<HashMap<String, String>>> result) {
            ArrayList<LatLng> points = null;
            PolylineOptions lineOptions = null;


            // Traversing through all the routes
            for (int i = 0; i < result.size(); i++) {
                points = new ArrayList<LatLng>();
                lineOptions = new PolylineOptions();

                // Fetching i-th route
                List<HashMap<String, String>> path = result.get(i);

                // Fetching all the points in i-th route
                for (int j = 0; j < path.size(); j++) {
                    HashMap<String, String> point = path.get(j);

                    double lat = Double.parseDouble(point.get("lat"));
                    double lng = Double.parseDouble(point.get("lng"));
                    LatLng position = new LatLng(lat, lng);

                    points.add(position);
                }

                // Adding all the points in the route to LineOptions
                lineOptions.addAll(points);
                lineOptions.width(4);
                lineOptions.color(Color.GREEN);

            }

            // Drawing polyline in the Google Map for the i-th route
            googleMap.addPolyline(lineOptions);
        }
    }
}
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
*/




