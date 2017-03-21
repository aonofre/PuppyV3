package mx.com.onofre.alejandro.puppy.Adapter.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.com.onofre.alejandro.puppy.Mascota;
import mx.com.onofre.alejandro.puppy.MascotaAdaptador;
import mx.com.onofre.alejandro.puppy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerView extends Fragment {

    private ArrayList<Mascota> mascotas;
    private android.support.v7.widget.RecyclerView listadoMascotas;

    public RecyclerView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rView = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Harry", R.drawable.harry, 4));
        mascotas.add(new Mascota("Larry", R.drawable.larry, 2));
        mascotas.add(new Mascota("Lasie", R.drawable.lasie, 1));
        mascotas.add(new Mascota("Lucas", R.drawable.lucas, 5));
        mascotas.add(new Mascota("Mey", R.drawable.mey, 3));
        mascotas.add(new Mascota("Pancho", R.drawable.pancho, 6));
        mascotas.add(new Mascota("Puppy", R.drawable.puppy, 5));
        mascotas.add(new Mascota("Rufy", R.drawable.rufy, 4));
        mascotas.add(new Mascota("Terrie", R.drawable.terrier, 7));
        mascotas.add(new Mascota("White", R.drawable.white, 5));

        listadoMascotas = (android.support.v7.widget.RecyclerView) rView.findViewById(R.id.rvMascotas);

        LinearLayoutManager lMng = new LinearLayoutManager(getActivity());
        lMng.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager(lMng);

        MascotaAdaptador mAdaptador = new MascotaAdaptador(mascotas);
        listadoMascotas.setAdapter(mAdaptador);

        return rView;
    }

}
