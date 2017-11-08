package com.example.ma.entregable3;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Recetas extends Fragment {
    private Activity putoContextoActivityOloqueMierdaSeaQueEs;

    public Fragment_Recetas() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        putoContextoActivityOloqueMierdaSeaQueEs = activity;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recetas, container, false);
    //armo los datos, sospecho que seria mejor hacerlo en el activity main, por el momento lo hago asi para hacer mas rapido

        List<Receta> listarecetas= new ArrayList<>();

        listarecetas.add(new Receta("Panqueques",R.drawable.panqueques,getString(R.string.panquequesIngredientes),"@string/panquequesReceta"  ));
        listarecetas.add(new Receta("Salsa Blanca",R.drawable.salsablanca,"@string/salsablancaIngredientes","@string/salsablancaReceta"  ));
        listarecetas.add(new Receta("Bizcochuelo",R.drawable.bizcochuelo,"@string/bizcochueloIngredientes","@string/bizcochueloReceta"  ));


        RecyclerView miRecyclerView = (RecyclerView)  view.findViewById(R.id.recyclerViewRecetasEntrega3);
        RecetasAdapter recetasAdapter = new RecetasAdapter(listarecetas, putoContextoActivityOloqueMierdaSeaQueEs);
        miRecyclerView.setAdapter(recetasAdapter);
        miRecyclerView.setLayoutManager(new LinearLayoutManager(putoContextoActivityOloqueMierdaSeaQueEs, LinearLayoutManager.VERTICAL, false));


        return view;
    }

}
