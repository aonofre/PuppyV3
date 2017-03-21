package mx.com.onofre.alejandro.puppy;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import mx.com.onofre.alejandro.puppy.Adapter.Fragment.MascotaDetalleFragment;
import mx.com.onofre.alejandro.puppy.Adapter.PageAdapter;

public class MascotasActivity extends AppCompatActivity {



    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        if(toolbar== null) {
        setSupportActionBar(toolbar);
        }

        fragments = new ArrayList<Fragment>();
        fragments.add(new mx.com.onofre.alejandro.puppy.Adapter.Fragment.RecyclerView());
        fragments.add(new MascotaDetalleFragment());

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), fragments) );
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favoritos:
                Intent intentDetail = new Intent(MascotasActivity.this, topMascotaActivity.class);
                startActivity(intentDetail);
                return true;

            case R.id.opcContact:
                Intent intentContact = new Intent(MascotasActivity.this, ContactActivity.class);
                startActivity(intentContact);
                return true;

            case R.id.opcAbout:
                Intent intentAbout = new Intent(MascotasActivity.this, AboutActivity.class);
                startActivity(intentAbout);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }


}

