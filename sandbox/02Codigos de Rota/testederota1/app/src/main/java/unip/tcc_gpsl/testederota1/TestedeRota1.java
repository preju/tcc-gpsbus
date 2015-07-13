package unip.tcc_gpsl.testederota1;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//Exemplo de importacoes para usar em mapas
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestedeRota1 extends ActionBarActivity {

    //Variaveis Globais
    //Lista de Pontos
    public ArrayList<LatLng> listadePontos = new ArrayList<LatLng>();
    public ArrayList<LatLng> listadePontosVolta = new ArrayList<LatLng>();

    //Variaveis privadas
    //Exemplo de variavel de mapa
    private GoogleMap googleMap;

    //Exemplo de variavel de Marcador
    private LatLng centralizarSantos = new LatLng(-23.9678823,-46.3288865);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testede_rota1);

        //Exemplo de iniciacao de mapa, necessario realizar alteracoes nos arquivos XML
        googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapaFragment)).getMap();

        //Centralizar em SANTOS
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralizarSantos, 12));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(12),2000,null);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_testede_rota1, menu);
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


    private void pontosIda()
    {
        //ida
        listadePontos.add(new LatLng(-23.935769, -46.333491));
        listadePontos.add(new LatLng(-23.93658339, -46.33024573));
        listadePontos.add(new LatLng(-23.93724228, -46.32697574));
        listadePontos.add(new LatLng(-23.93746612, -46.32561414));
        listadePontos.add(new LatLng(-23.93919197, -46.32580189));
        listadePontos.add(new LatLng(-23.94312543, -46.32629913));
        listadePontos.add(new LatLng(-23.94350785, -46.32632327));
        listadePontos.add(new LatLng(-23.94325045, -46.32843417));
        listadePontos.add(new LatLng(-23.94314994, -46.32989329));
        listadePontos.add(new LatLng(-23.94364512, -46.33004618));
        listadePontos.add(new LatLng(-23.96658763, -46.33282721));
        listadePontos.add(new LatLng(-23.9670239, -46.33295327));
        listadePontos.add(new LatLng(-23.96728615, -46.33318126));
        listadePontos.add(new LatLng(-23.96762438, -46.33313835));
        listadePontos.add(new LatLng(-23.96776899, -46.33300692));
        listadePontos.add(new LatLng(-23.96952875, -46.33322954));
        listadePontos.add(new LatLng(-23.96920803, -46.33437474));
        listadePontos.add(new LatLng(-23.96935508, -46.33461077));
        listadePontos.add(new LatLng(-23.97081083, -46.32929103));
        listadePontos.add(new LatLng(-23.97412437, -46.32137315));
        listadePontos.add(new LatLng(-23.97478337, -46.32085919));
        listadePontos.add(new LatLng(-23.97529313, -46.31967902));
        listadePontos.add(new LatLng(-23.97954763, -46.31366014));
        listadePontos.add(new LatLng(-23.98388042, -46.30925596));
        listadePontos.add(new LatLng(-23.98673291, -46.30861223));
        listadePontos.add(new LatLng(-23.987015, -46.30852));
        listadePontos.add(new LatLng(-23.98919201, -46.3078466));
        listadePontos.add(new LatLng(-23.99106775, -46.30529653));
        listadePontos.add(new LatLng(-23.99134221, -46.30302202));
        listadePontos.add(new LatLng(-23.990281, -46.30030634));
        listadePontos.add(new LatLng(-23.98865981, -46.29735545));
        listadePontos.add(new LatLng(-23.98723144, -46.29497866));
        listadePontos.add(new LatLng(-23.98651587, -46.2952147));
        listadePontos.add(new LatLng(-23.9861924, -46.294807));
        Polyline linhadeTesteIda = googleMap.addPolyline(new PolylineOptions()
                .addAll(listadePontos)
                .width(4)
                .color(Color.BLUE));

    }


    private void pontosVolta()
    {
        //volta
        listadePontosVolta.add(new LatLng(-23.9861924, -46.294807));
        listadePontosVolta.add(new LatLng(-23.98579324, -46.29464883));
        listadePontosVolta.add(new LatLng(-23.98532273, -46.29502434));
        listadePontosVolta.add(new LatLng(-23.98576384, -46.295196));
        listadePontosVolta.add(new LatLng(-23.98266625, -46.29757781));
        listadePontosVolta.add(new LatLng(-23.98111215, -46.29895665));
        listadePontosVolta.add(new LatLng(-23.98053772, -46.2995249));
        listadePontosVolta.add(new LatLng(-23.9804789, -46.3000077));
        listadePontosVolta.add(new LatLng(-23.9785502, -46.30010232));
        listadePontosVolta.add(new LatLng(-23.97839335, -46.29942641));
        listadePontosVolta.add(new LatLng(-23.97798143, -46.29895902));
        listadePontosVolta.add(new LatLng(-23.9770717, -46.30020838));
        listadePontosVolta.add(new LatLng(-23.97620904, -46.29904967));
        listadePontosVolta.add(new LatLng(-23.9759239, -46.298615));
        listadePontosVolta.add(new LatLng(-23.97389983, -46.30160926));
        listadePontosVolta.add(new LatLng(-23.97087183, -46.30215347));
        listadePontosVolta.add(new LatLng(-23.96881308, -46.30527556));
        listadePontosVolta.add(new LatLng(-23.96529352, -46.31044686));
        listadePontosVolta.add(new LatLng(-23.96456803, -46.3109833));
        listadePontosVolta.add(new LatLng(-23.96431313, -46.31175578));
        listadePontosVolta.add(new LatLng(-23.96293075, -46.31396592));
        listadePontosVolta.add(new LatLng(-23.96215623, -46.31386936));
        listadePontosVolta.add(new LatLng(-23.95546962, -46.31324708));
        listadePontosVolta.add(new LatLng(-23.95067505, -46.31300032));
        listadePontosVolta.add(new LatLng(-23.94758642, -46.31351531));
        listadePontosVolta.add(new LatLng(-23.94752759, -46.3128823));
        listadePontosVolta.add(new LatLng(-23.94517431, -46.31326854));
        listadePontosVolta.add(new LatLng(-23.94525275, -46.3138479));
        listadePontosVolta.add(new LatLng(-23.93840837, -46.31512463));
        listadePontosVolta.add(new LatLng(-23.9379769, -46.31450236));
        listadePontosVolta.add(new LatLng(-23.93527042, -46.31492078));
        listadePontosVolta.add(new LatLng(-23.93505468, -46.31514609));
        listadePontosVolta.add(new LatLng(-23.9353979, -46.31563962));
        listadePontosVolta.add(new LatLng(-23.93392696, -46.32781684));
        listadePontosVolta.add(new LatLng(-23.933672, -46.33049905));
        listadePontosVolta.add(new LatLng(-23.93424077, -46.33088529));
        listadePontosVolta.add(new LatLng(-23.93381909, -46.33228004));
        listadePontosVolta.add(new LatLng(-23.9349272, -46.33264482));
        listadePontosVolta.add(new LatLng(-23.935769, -46.333491));
        Polyline linhadeTesteVolta = googleMap.addPolyline(new PolylineOptions()
                .addAll(listadePontosVolta)
                .width(4)
                .color(Color.RED));

    }



}
