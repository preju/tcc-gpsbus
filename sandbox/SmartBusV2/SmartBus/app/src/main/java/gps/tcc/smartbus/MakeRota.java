package gps.tcc.smartbus;

import android.graphics.Color;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
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

/**
 * Created by Rafael Magalhães on 12/09/2015 Setembro.
 */
public class MakeRota
{

    public float desenhaRota(ArrayList<LatLng> pontoIda)
    {

        if (googleMap != null) {
            //Rotas rotas = new Rotas(this);
            googleMap.setMyLocationEnabled(true);

            pontoIda = (new Rotas(this)).linha154Ida();

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
