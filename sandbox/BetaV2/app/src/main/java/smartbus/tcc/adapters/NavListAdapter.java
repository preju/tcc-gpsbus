package smartbus.tcc.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import smartbus.tcc.models.NavItem;
import smartbus.tcc.smartbus.R;

/**
 * Created by Rafael Magalhães on 05/10/2015 Outubro.
 */


/**
 * Classe NavListAdapter
 * Essa classe serve para exibir itens do slide menu quando selecionados
 */
public class NavListAdapter extends ArrayAdapter<NavItem>
{
    Context context;
    int resLayout;
    List<NavItem> listNavItens;
    public NavListAdapter(Context context, int resLayout, List<NavItem> listNavItens) {
        super(context, resLayout, listNavItens);
        this.context = context;
        this.resLayout = resLayout;
        this.listNavItens = listNavItens;
    }

    @SuppressLint("ViewHolder") @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, resLayout, null);

        TextView tvTitulo = (TextView) v.findViewById(R.id.titulo);
        TextView tvSubTitulo = (TextView) v.findViewById(R.id.subtitulo);
        ImageView navIcon = (ImageView) v.findViewById(R.id.nav_icon);

        NavItem navItem = listNavItens.get(position);
        tvTitulo.setText(navItem.getTitulo());
        tvSubTitulo.setText(navItem.getSubTitulo());
        navIcon.setImageResource(navItem.getResIcone());


        return v;
    }
}
