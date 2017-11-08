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

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                    Toast.makeText(getApplicationContext(), item.getTitle() ,Toast.LENGTH_SHORT).show();
                    break;


                default:
                Toast.makeText(getApplicationContext(), "Este mensaje no debiera aparecer, consultar programador" ,Toast.LENGTH_SHORT).show();


            }


            drawerLayout.closeDrawers();

            return false;
        }
    }




    private void lanzarFragmentRecetas(){

        FragmentManager mifragmentmanager = getSupportFragmentManager();
        FragmentTransaction mifragmentTransaction = mifragmentmanager.beginTransaction();

        Fragment fragmentRecetas = new Fragment_Recetas();

        mifragmentTransaction.add(R.id.ActivityMain_contenedor,fragmentRecetas);
        mifragmentTransaction.addToBackStack(null);
        mifragmentTransaction.commit();



    }


}
