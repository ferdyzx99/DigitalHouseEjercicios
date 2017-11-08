package com.example.ma.entregable3;


import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Recetas extends Fragment {


    public Fragment_Recetas() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    //armo los datos, sospecho que seria mejor hacerlo en el activity main, por el momento lo hago asi para hacer mas rapido

        List<Receta> listarecetas= new ArrayList<>();
        listarecetas.add(new Receta("Panqueques",R.drawable.panqueques,"@string/panquequesIngredientes","@string/panquequesReceta"  ));

        listarecetas.add(new Receta("Salsa Blanca",R.drawable.panqueques,"@string/salsablancaIngredientes","@string/salsablancaReceta"  ));


        return inflater.inflate(R.layout.fragment_recetas, container, false);
    }

}
