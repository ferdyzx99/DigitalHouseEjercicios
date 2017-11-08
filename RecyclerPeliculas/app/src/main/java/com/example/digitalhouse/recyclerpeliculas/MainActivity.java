package com.example.digitalhouse.recyclerpeliculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
//Implemento la interfaz que cree en el adapter para responder a los clicks
public class MainActivity extends AppCompatActivity implements AdapterRecycler.ComunicadorClick{

    List<Pelicula> listaDePeliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarPeliculas();

        //Busco el recyclerView en el layout
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewPeliculas);
        //Seteo al recycler el LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        //Instancio un adaptador
        AdapterRecycler adapterRecycler = new AdapterRecycler(this, listaDePeliculas);
        //Seteo al recycler el adapter
        recyclerView.setAdapter(adapterRecycler);


    }

    public void cargarPeliculas(){
        listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(new Pelicula(R.drawable.arma_mortal, "Arma mortal", "Accion", "Descripcion pelicula", 4.5));
        listaDePeliculas.add(new Pelicula(R.drawable.avatar, "Avatar", "Ciencia ficcion", "Descripcion pelicula", 4.8));
        listaDePeliculas.add(new Pelicula(R.drawable.el_dia_de_la_marmota, "El dia de la marmota", "Comedia", "Descripcion pelicula", 4.6));
        listaDePeliculas.add(new Pelicula(R.drawable.el_senor_de_los_anillos, "El señor de los anillos", "Fantasia", "Descripcion pelicula", 4.1));
        listaDePeliculas.add(new Pelicula(R.drawable.forrest_gump, "Forest Gump", "Comedia dramatica", "Descripcion pelicula", 4.7));
        listaDePeliculas.add(new Pelicula(R.drawable.indiana_jones, "Indiana Jones", "Accion", "Descripcion pelicula", 4.8));
        listaDePeliculas.add(new Pelicula(R.drawable.matrix, "Matrix", "Ciencia ficcion", "Descripcion pelicula", 4.6));
        listaDePeliculas.add(new Pelicula(R.drawable.piratas_del_caribe, "Piratas del caribe", "Fantasia", "Descripcion pelicula", 3.8));
        listaDePeliculas.add(new Pelicula(R.drawable.rambo, "Rambo", "Accion", "Descripcion pelicula", 4.5));
        listaDePeliculas.add(new Pelicula(R.drawable.rescantando_a_soldado_ryan, "Rescatando al soldado Ryan", "Drama", "Descripcion pelicula", 4.0));
        listaDePeliculas.add(new Pelicula(R.drawable.rocky, "Rocky", "Drama", "Descripcion pelicula", 4.5));
        listaDePeliculas.add(new Pelicula(R.drawable.shrek, "Shrek", "Comedia", "Descripcion pelicula", 4.3));
        listaDePeliculas.add(new Pelicula(R.drawable.terminator, "Terminator", "Accion", "Descripcion pelicula", 4.8));
        listaDePeliculas.add(new Pelicula(R.drawable.titanic, "Titanic", "Drama", "Descripcion pelicula", 4.6));
        listaDePeliculas.add(new Pelicula(R.drawable.toy_story, "Toy Story", "Comedia", "Descripcion pelicula", 4.7));
        listaDePeliculas.add(new Pelicula(R.drawable.volver_al_futuro, "Volver al futuro", "Ciencia ficcion", "Descripcion pelicula", 5.0));
    }

    //Sobreescribo el método y hago las acciones correspondientes al click en la imagen de la celda
    @Override
    public void clickEnImagen(Integer idImagen) {
        Intent intent = new Intent(this, ActivityImagenFull.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActivityImagenFull.CLAVE_IMAGEN_FULL, idImagen);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    //Sobreescribo el método y hago las acciones correspondientes al click en el resto de la celda
    @Override
    public void clickEnTexto(Pelicula pelicula) {
        Intent intent = new Intent(this, ActivityDetalle.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActivityDetalle.CLAVE_IMAGE_DETALLE, pelicula.getIdImagen());
        bundle.putString(ActivityDetalle.CLAVE_TITULO_DETALLE, pelicula.getTitulo());
        bundle.putString(ActivityDetalle.CLAVE_GENERO_DETALLE, pelicula.getGenero());
        bundle.putString(ActivityDetalle.CLAVE_DESCRIPCION_DETALLE, pelicula.getDescripcion());
        bundle.putDouble(ActivityDetalle.CLAVE_RATING_DETALLE, pelicula.getRating());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
