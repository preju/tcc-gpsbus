package smartbus.tcc.adapters;

import android.content.Context;
import android.text.style.LineBackgroundSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.lang.reflect.Array;
import java.util.List;

import smartbus.tcc.models.SelectLinha;

/**
 * Created by Rafael Magalhães on 08/10/2015 Outubro.
 */

public class SelectLinhaAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<SelectLinha> itens;

    public SelectLinhaAdapter(Context context, List<SelectLinha> itens) {
        //Itens a serem criados
        this.itens = itens;

        //Reposnavel por pegar o layoutl
        layoutInflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
