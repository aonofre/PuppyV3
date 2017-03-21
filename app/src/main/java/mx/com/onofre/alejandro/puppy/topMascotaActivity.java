package mx.com.onofre.alejandro.puppy;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class topMascotaActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listadoMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_mascota);
/*
        Toolbar topToolBar = (Toolbar) findViewById(R.id.myToolBar);
        setSupportActionBar(topToolBar);
        ActionBar actionBar = getSupportActionBar();;
        actionBar.setDisplayHomeAsUpEnabled(true);
*/
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Terrie", R.drawable.terrier, 7 ));
        mascotas.add(new Mascota("Pancho", R.drawable.pancho, 6));
        mascotas.add(new Mascota("Puppy", R.drawable.puppy, 5 ));
        mascotas.add(new Mascota("White", R.drawable.white, 5 ));
        mascotas.add(new Mascota("Lucas", R.drawable.lucas, 5 ));

        listadoMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager lMng = new LinearLayoutManager(this);
        lMng.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager(lMng);

        MascotaAdaptador mAdaptador = new MascotaAdaptador(mascotas);
        listadoMascotas.setAdapter(mAdaptador);

//        ImageButton btnStar = (ImageButton)findViewById(R.id.btnEstrella);
/*
        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(MascotasActivity.this, topMascotaActivity.class);

                startActivity(intentDetail);
                finish();
            }

        });*/
    }
}
