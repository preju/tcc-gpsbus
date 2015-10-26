package smartbus.tcc.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

import smartbus.tcc.smartbus.R;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;


/**
 * Created by Rafael Magalhães on 06/10/2015 Outubro.
 */
public class MapaFragment extends Fragment
{

    public GoogleMap googleMap;
    View v;
    Context context;

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstaceState)
    {
        v = inflater.inflate(R.layout.fragment_mapa, container, false);
        googleMap = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapfragment)).getMap();
        configuracaoDeCamera();
        configuracoesMapa();
        return v;

    }
    public void configuracaoDeCamera() {
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
            public void onFinish() {
                Log.i("Script", "CancelableCallBack.onFinish()");
            }

            @Override
            public void onCancel() {
                Log.i("Script", "CancelableCallBack.onCancel()");
            }
        });
    }

    public void configuracoesMapa() {
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.setMyLocationEnabled(true);
    }




}
