package smartbus.tcc.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import smartbus.tcc.smartbus.R;

/**
 * Created by th on 21/10/2015.
 */
public class AjudaFragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstaceState)
    {
        View v = inflater.inflate(R.layout.fragment_ajuda, container, false);
        return v;

    }


}