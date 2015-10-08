package gps.tcc.smartbus;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
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

public class MainActivity extends FragmentActivity
{



    /********VARIAVEIS LOCAIS********/
    Context context;

    /********VARIAVEIS GLOBAIS********/
    public GoogleMap googleMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapFragment)).getMap();
        configuracoesMapa();
        configuracaoDeCamera();
        makeRota();
        this.context = context;
        //ArrayList<LatLng> linha154I = (new Rotas(this)).linha04();
        //Polyline polyone = googleMap.addPolyline(new PolylineOptions().addAll(linha154I).width(6).color(Color.RED));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /********CONFIGURACAO DO MAPA********/
    public void configuracoesMapa()//Configuracoes do google maps
    {
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.setMyLocationEnabled(true);


    }
    public void configuracaoDeCamera()
    {
        LatLng centralizarSantos = new LatLng(-23.9678823, -46.3288865);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralizarSantos, 12));
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(centralizarSantos)
                .zoom(13)
                .tilt(90)
                .build();

        CameraUpdate update = CameraUpdateFactory.newCameraPosition(cameraPosition);
        googleMap.animateCamera(update, 3000, new GoogleMap.CancelableCallback() {
            @Override
            public void onFinish()
            {
                Log.i("Script","CancelableCallBack.onFinish()");
            }

            @Override
            public void onCancel()
            {
                Log.i("Script","CancelableCallBack.onCancel()");
            }
        });
    }



    /********METODOS RELACIONADO A ROTA********/
    public void makeRota()
    {
        if (googleMap != null)
        {
            ArrayList<LatLng> linha = (new Rotas(this)).linha04();
            //int b = 1;
            for(int a = 0; a < (linha.size()-1); a++ )
            {
                LatLng origem = linha.get(a);
                LatLng destino = linha.get(a+1);
                String url = getDirectionsUrl(origem, destino);
                DownloadTask downloadTask = new DownloadTask();
                downloadTask.execute(url);
                //b++;

            }
        }
    }


    /*********************PARTE DO CODIGO FORNECIDO PELO GOOGLE - VIA COMUNIDADE - PARA CONEXAO COM O GOOGLE DIRECTIONS API*********************/
    /**
     * Foi realizado algumas alteracoes nas variaveis que foram fornecidas pelo codigo original
     * Os parametros origem e destino tem seus valores via o metodo makeRota()
     * @param origem
     * @param destino
     * @return
     */
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
            Log.d("Erro de download da url", error.toString());
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
            PolylineOptions lineOptions = new PolylineOptions();


            // Traversing through all the routes
            for (int i = 0; i < result.size(); i++) {
                points = new ArrayList<LatLng>();


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
                lineOptions.width(10).color(Color.argb(200,60,179,113));
            }
            // Drawing polyline in the Google Map for the i-th route
            googleMap.addPolyline(lineOptions);
        }
    }
    /*********************FIM DA PARTE FORNECIDA PELO GOOGLE*********************/


}
