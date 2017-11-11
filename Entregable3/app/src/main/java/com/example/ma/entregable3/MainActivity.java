package com.example.ma.entregable3;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements RecetasAdapter.NotificableRecyclerView {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private FragmentManager mifragmentmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mifragmentmanager = getSupportFragmentManager();
        drawerLayout = (DrawerLayout) findViewById(R.id.miDrawerLayout);
        navigationView = (NavigationView) findViewById(R.id.miNavigationView);
        navigationView.setNavigationItemSelectedListener(new ListenerMenu());


    }


    private class ListenerMenu implements  NavigationView.OnNavigationItemSelectedListener{


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Integer itemSelected = item.getItemId()  ;


            switch (itemSelected){

                case R.id.item1 :
               lanzarFragmentRecetas();
                break;



                case R.id.item2 :
                    lanzarFragmentAbout();
                    break;


                default:
                Toast.makeText(getApplicationContext(), "Este mensaje no debiera aparecer, consultar programador" ,Toast.LENGTH_SHORT).show();


            }


            drawerLayout.closeDrawers();

            return false;
        }
    }

    private void lanzarFragmentAbout() {
        FragmentTransaction mifragmentTransaction = mifragmentmanager.beginTransaction();
        Fragment fragmentAbout = new FragmentAbout();
        mifragmentTransaction.addToBackStack(null);
        mifragmentTransaction.replace(R.id.ActivityMain_contenedor,fragmentAbout).commit();


    }


    private void lanzarFragmentRecetas(){


        FragmentTransaction mifragmentTransaction = mifragmentmanager.beginTransaction();
        Fragment fragmentRecetas = new Fragment_Lista_de_Recetas();
        mifragmentTransaction.addToBackStack(null);
        mifragmentTransaction.replace(R.id.ActivityMain_contenedor,fragmentRecetas).commit();




    }

    @Override
    public void notificarClick(Receta recetaClickeada) {

        FragmentTransaction mifragmentTransaction = mifragmentmanager.beginTransaction();
        Fragment fragmentDetalle = new FragmentDetalle();
        Bundle bundle = new Bundle();

        bundle.putSerializable(FragmentDetalle.clavereceta, (Serializable) recetaClickeada);
        fragmentDetalle.setArguments(bundle);


        mifragmentTransaction.addToBackStack(null);
        mifragmentTransaction.replace(R.id.ActivityMain_contenedor,fragmentDetalle).commit();



    }




}
