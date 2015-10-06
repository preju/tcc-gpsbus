package smartbus.tcc.smartbus;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import smartbus.tcc.adapters.NavListAdapter;
import smartbus.tcc.fragment.MapaFragment;
import smartbus.tcc.models.NavItem;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    RelativeLayout drawerPane;
    ListView lvNav;

    List<NavItem> listNavItens;
    List<Fragment> listFragments;

    ActionBarDrawerToggle actionBarDrawerToggle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerPane = (RelativeLayout) findViewById(R.id.drawer_pane);
        lvNav = (ListView) findViewById(R.id.nav_list);

        listNavItens = new ArrayList<NavItem>();
        listNavItens.add(new NavItem("Linha 04","Circular", R.drawable.bus));
        listNavItens.add(new NavItem("Linha 04", "Circular", R.drawable.bus));
        listNavItens.add(new NavItem("Linha 04", "Circular", R.drawable.bus));

        NavListAdapter navListAdapter = new NavListAdapter(getApplicationContext(), R.layout.itens_nav_list, listNavItens);

        lvNav.setAdapter(navListAdapter);

        listFragments = new ArrayList<Fragment>();
        listFragments.add (new MapaFragment());

        //primeiro fragment a carregar é o default
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_content, listFragments.get(0)).commit();
        setTitle(listNavItens.get(0).getTitulo());
        lvNav.setItemChecked(0, true);
        drawerLayout.closeDrawer(drawerPane);


        //setar o os itens da nav list
        lvNav.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(AdapterView<?> parent, View view, int position, long id)
            {
                //substituindo o fragment com o item que foi slecionado na navlist
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_content, listFragments.get(position)).commit();

                setTitle(listNavItens.get(position).getTitulo());
                lvNav.setItemChecked(position, true);
                drawerLayout.closeDrawer(drawerPane);




            }
        }

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
