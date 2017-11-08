package com.prueba.validaciones;


import android.app.Activity;
import android.os.Bundle;
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
public class Register_fragment extends Fragment {
private  Activity putoContextoActivityOloqueMierdaSeaQueEs;

    public Register_fragment() {
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register_fragment, container, false);
        List<Receta> listarecetas= new ArrayList<>();


        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));
        listarecetas.add(new Receta("Panqueques",R.drawable.space2,"ingredientes panqueque", "receta panqueque"));
        listarecetas.add(new Receta("Salsa blanca",R.drawable.space2,"ingredientes salsa blanca", "receta salsa blanca"));





        RecyclerView miRecyclerView = (RecyclerView)  view.findViewById(R.id.recyclerViewRecetasEntrega3);
        RecetasAdapter recetasAdapter = new RecetasAdapter(listarecetas, putoContextoActivityOloqueMierdaSeaQueEs);


        miRecyclerView.setAdapter(recetasAdapter);

        miRecyclerView.setLayoutManager(new LinearLayoutManager(putoContextoActivityOloqueMierdaSeaQueEs, LinearLayoutManager.VERTICAL, false));


        return view;
    }

}
