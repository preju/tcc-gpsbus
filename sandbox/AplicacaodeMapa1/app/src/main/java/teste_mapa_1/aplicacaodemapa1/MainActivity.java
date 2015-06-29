package teste_mapa_1.aplicacaodemapa1;

import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//imports do google maps e fragmentos para por no mapa
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

//imports do google para marcadores no mapa
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

//marcadores para pontos de onibus
import android.app.Activity;
import android.os.Bundle;





public class MainActivity extends ActionBarActivity
{

    //Definindo variaveis

    private LatLng unip = new LatLng(-23.94356677, -46.33214807);
    private LatLng shop = new LatLng(-46.33236264,-46.33236264);


    private LatLng santos = new LatLng(-23.9561304, -46.3264089);
    private GoogleMap mapa;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Defini��o de linhas de codigo para gerar o mapa
        //O R id a principio vai dar erro pois ainda nao foi definido. Voce pode defini-lo no activity_main
        //Pode ser definido como fragment android:id="@+id/mapa"

        mapa = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa)).getMap();

         /*
        //teste 1: de marcacoes no mapa usando variaveis private
        mapa.addMarker(new MarkerOptions().position(unip).title("Universidade Paulista").snippet("Estudamos Ciencia da Computação aqui"));
        mapa.addMarker(new MarkerOptions().position(shop).title("Patio Iporanga").snippet("Shopping de Santos"));
        */


        //teste 2: de marcacao inline, gostei desse modo, pois é mais facil de trabalhar
        //a LatLng define a localidade da marcacao, voce pode procurar por coordenadas no google
        //Esse trabalho em colocar cada ponto individualmente pode ser dispensado atraves da api do google direcions
        Marker ponto1 = mapa.addMarker(
                new MarkerOptions()
                .position(new LatLng(-23.9367, -46.32937946)));
        Marker ponto2 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9376628, -46.3244822)));
        Marker ponto2b = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9376628, -46.3244822)));
        Marker ponto3 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9392458, -46.3258017)));
        Marker ponto4 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.942857, -46.3262361)));
        Marker ponto5 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.943058, -46.328356)));
        Marker ponto6 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9463987, -46.3304562)));
        Marker ponto7 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9491156, -46.3308411)));
        Marker ponto8 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9524959, -46.3311189)));
        Marker ponto9 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9544499, -46.3314941)));
        Marker ponto10 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.95812175, -46.33189917)));
        Marker ponto11 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.96219295, -46.33237295)));
        Marker ponto12 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.96418785, -46.33261441)));
        Marker ponto13 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.96649926, -46.33289161)));
        Marker ponto14 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.969943, -46.331607)));
        Marker ponto15 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.970614, -46.329803)));
        Marker ponto16 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.97173, -46.326412)));
        Marker ponto17 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.973495, -46.3221)));
        Marker ponto18 = mapa.addMarker(
            new MarkerOptions()
                    .position(new LatLng(-23.975318, -46.319595)));
        Marker ponto19 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.97613, -46.317963)));
        Marker ponto20 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9780989, -46.3150167)));
        Marker ponto21 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9814717, -46.3117683)));
        Marker ponto22 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9832366, -46.309507)));
        Marker ponto23 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9869943, -46.3076824)));
        Marker ponto24 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.991249, -46.3028337)));
        Marker ponto25 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9902847, -46.3004658)));
        Marker ponto26 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.988601, -46.2974842)));
        Marker ponto27 = mapa.addMarker(
            new MarkerOptions()
                    .position(new LatLng(-23.98686409, -46.29505917)));
        Marker ponto28 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.969943, -46.331607)));
        Marker ponto29 = mapa.addMarker(
            new MarkerOptions()
                    .position(new LatLng(-23.9840092, -46.2967946)));
        Marker ponto30 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9823817, -46.297885)));
        Marker ponto31 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9812984, -46.2986026)));

        Marker ponto32 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9776454, -46.3001561)));

        Marker ponto33 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.97856, -46.299759)));
        Marker ponto34 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9772266, -46.2998817)));
        Marker ponto35 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9764149, -46.2991355)));
        Marker ponto36 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9759239, -46.298615)));
        Marker ponto37 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9741155, -46.3013625)));
        Marker ponto38 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.971317, -46.30225)));
        Marker ponto39 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9703355, -46.3032308)));
        Marker ponto40 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9692923, -46.3045173)));
        Marker ponto41 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9586423, -46.3205994)));
        Marker ponto42 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9667101, -46.3082249)));
        Marker ponto43 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9579151, -46.321537)));
        Marker ponto44 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9753159, -46.2997134)));
        Marker ponto45 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.962216, -46.313783)));
        Marker ponto46 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.95995, -46.313567)));
        Marker ponto47 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.956947, -46.313312)));
        Marker ponto48 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.9555, -46.3132)));
        Marker ponto49 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-22.7570615, -47.4120865)));
        Marker ponto50 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-22.7574005, -47.4115624)));
        Marker ponto51 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-22.7581085, -47.4104621)));
        Marker ponto52 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-20.0400138, -47.7469529)));
        Marker ponto53 = mapa.addMarker(
                new MarkerOptions()
                        .position(new LatLng(-23.934878, -46.333236)));


        //Camera (focar em santos com o zoom) de 1 ate 16 (quanto maior, mais zoom)
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(santos, 12));
        mapa.animateCamera(CameraUpdateFactory.zoomTo(12), 2000, null);

        /*
        //Linhas para gps no android (minha localidade)
        mapa.setMyLocationEnabled(true);
        */
        /*
        //Tracar as rotas - NAO ESTA PRONTO!
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(santos, 13));
        mapa.addMarker(new MarkerOptions()
                .position(santos)
                .rotation(245)
                .flat(true));


        CameraPosition posicaodaCamera = CameraPosition.builder()
                .target(santos)
                .zoom(13)
                .tilt(90)
                .bearing(45)
                .zoom(mapa.getCameraPosition().zoom)
                .build();

        mapa.animateCamera(CameraUpdateFactory.newCameraPosition(posicaodaCamera),2000,null);
       */



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
}
