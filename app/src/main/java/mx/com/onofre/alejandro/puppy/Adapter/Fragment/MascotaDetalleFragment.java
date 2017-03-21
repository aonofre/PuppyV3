package mx.com.onofre.alejandro.puppy.Adapter.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.com.onofre.alejandro.puppy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MascotaDetalleFragment extends Fragment {


    public MascotaDetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_mascota_detalle, container, false);
        return fragment;
    }

}
