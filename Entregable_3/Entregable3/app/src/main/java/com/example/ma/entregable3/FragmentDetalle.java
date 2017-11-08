package com.example.ma.entregable3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ma.entregable3.R;

import java.io.Serializable;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment  {

    public static final  String clavereceta = "clavereceta"; //no logro hacer funcionar el static final ???
    private TextView hlTVtitulo;
    private TextView hlTVingredientes;
    private TextView hlTVreceta;
    private ImageView hlimagen;



    public FragmentDetalle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       Bundle bundle = getArguments();
       Receta recetadetalle = (Receta) bundle.getSerializable(clavereceta);


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.celda_detalle, container, false);

        //armo todo el choclo infame de los handlers

       hlTVtitulo = view.findViewById(R.id.fragmentRecetas_TVtitulo);
       hlTVingredientes = view.findViewById(R.id.fragmentRecetas_TVingedientes);
       hlTVreceta= view.findViewById(R.id.fragmentRecetas_TVreceta);
       hlimagen= view.findViewById(R.id.fragmentRecetas_IMGfoto);


       hlTVtitulo.setText(recetadetalle.getTitulo());
       hlTVingredientes.setText(recetadetalle.getIngredientes());
       hlTVreceta.setText(recetadetalle.getPreparacion().toString());
       hlimagen.setImageResource(recetadetalle.getFoto());

        return view;



    }

}
