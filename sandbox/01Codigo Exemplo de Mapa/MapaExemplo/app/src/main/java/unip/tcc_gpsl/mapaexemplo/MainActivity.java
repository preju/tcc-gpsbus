package unip.tcc_gpsl.mapaexemplo;

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

public class MainActivity extends ActionBarActivity {

    //Exemplo de variavel de mapa
    private GoogleMap googleMap;

    //Exemplo de variavel de Marcador
    private LatLng centralizarSantos = new LatLng(-23.9678823,-46.3288865);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Exemplo de iniciacao de mapa, necessario realizar alteracoes nos arquivos XML
        googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapaFragment)).getMap();


        //Centralizar em SANTOS
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralizarSantos, 12));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(12),2000,null);


        //Exemplo de marcacao no mapa, para ver o marcador defina o alpha de 0 a 1 0 transparente e 1 visivel
        Marker marcadorGenerico = googleMap.addMarker(
                new MarkerOptions().position(new LatLng(-23.9678823,-46.3288865)).alpha(0));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
