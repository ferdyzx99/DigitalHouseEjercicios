package com.example.ma.entregable3;


import android.app.Activity;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Lista_de_Recetas extends Fragment {
    private Activity putoContextoActivityOloqueMierdaSeaQueEs;
    private EditText hlfilterEditText;
    private RecyclerView hlRecyclerView;
    private RecetasAdapter hlRecetasAdapter;
    List<Receta> listarecetas;



    public Fragment_Lista_de_Recetas() {
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

        hlfilterEditText = (EditText)  view.findViewById(R.id.filterEditText);


        //armo los datos, sospecho que seria mejor hacerlo en el activity main, por el momento lo hago asi para hacer mas rapido
        if(listarecetas == null){  //este if no es necesario pero me molesta crear todo de vuelta cada vez que hagon un back
        listarecetas = new ArrayList<>();
        listarecetas.add(new Receta("Panqueques",R.drawable.panqueques,getString(R.string.panquequesIngredientes),getString(R.string.panquequesReceta)  ));
        listarecetas.add(new Receta("Salsa Blanca",R.drawable.salsablanca,getString(R.string.salsablancaIngredientes),getString(R.string.salsablancaReceta)  ));
        listarecetas.add(new Receta("Bizcochuelo",R.drawable.bizcochuelo,getString(R.string.bizcochueloIngredientes),getString(R.string.bizcochueloReceta)  ));
        listarecetas.add(new Receta("Pinchos de pollo",R.drawable.pinchos_de_pollo,getString(R.string.pinchospolloIngredientes),getString(R.string.pinchospolloReceta)  ));

            listarecetas.add(new Receta("Bifes a la criolla",R.drawable.bifes_criolla,getString(R.string.bifescriollaIngredientes),getString(R.string.bifescriollaReceta)  ));

            listarecetas.add(new Receta("Carbonada",R.drawable.carbonada,getString(R.string.carbonadaIngredientes),getString(R.string.carbonadaReceta)  ));

            listarecetas.add(new Receta("Colita Rellena",R.drawable.colita_rellena,getString(R.string.colitarellenaIngredientes),getString(R.string.colitarellenaReceta)  ));


            listarecetas.add(new Receta("Barrita de chocolate",R.drawable.barrita_de_chocolate,getString(R.string.barradechocolateIngredientes),getString(R.string.barradechocolateReceta  )));

            listarecetas.add(new Receta("Helado de frutos rojos",R.drawable.helado_frutos_rojos,getString(R.string.heladofrutosIngredientes),getString(R.string.heladofrutosReceta)  ));

            listarecetas.add(new Receta("Volcan",R.drawable.volcan,getString(R.string.volcanIngredientes),getString(R.string.volcanReceta)  ));


        }



        Collections.sort(listarecetas);


        hlRecyclerView = (RecyclerView)  view.findViewById(R.id.recyclerViewRecetasEntrega3);
        hlRecetasAdapter = new RecetasAdapter(listarecetas, putoContextoActivityOloqueMierdaSeaQueEs);
        hlRecyclerView.setAdapter(hlRecetasAdapter);
        hlRecyclerView.setLayoutManager(new LinearLayoutManager(putoContextoActivityOloqueMierdaSeaQueEs, LinearLayoutManager.VERTICAL, false));





        hlfilterEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
              //  Toast.makeText(putoContextoActivityOloqueMierdaSeaQueEs, editable.toString(), Toast.LENGTH_SHORT).show();
            filter(editable.toString());

            }
        });



        return view;
    }




    void filter(String text){
        List<Receta> listatemporal = new ArrayList();

        for( Receta unaReceta: listarecetas){

            if(unaReceta.getTitulo().toUpperCase().contains(text.toUpperCase())){
              listatemporal.add(unaReceta);
            }
        }
        //update recyclerview

        hlRecetasAdapter.updateList(listatemporal);

   }

}
