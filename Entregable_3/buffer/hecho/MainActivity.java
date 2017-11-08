package com.prueba.validaciones;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


import android.support.v7.app.AppCompatActivity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RecetasAdapter.NotificableRecyclerView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Register_fragment registerFragment = new Register_fragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorFragment, registerFragment).commit();









    }

    @Override
    public void notificarClick(Receta recetaClickeada) {

        Toast.makeText(this,recetaClickeada.getTitulo(),Toast.LENGTH_SHORT).show();
    }
}
