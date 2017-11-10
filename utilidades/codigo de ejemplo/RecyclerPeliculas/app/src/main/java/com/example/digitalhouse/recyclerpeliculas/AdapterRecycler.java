package com.example.digitalhouse.recyclerpeliculas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 10/12/17.
 */
//Extiendo mi adapter de RecyclerView.Adapter y le digo que quiero un ViewHolder del tipo de mi ViewHolder
public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.PeliculaViewHolder>{
    //Atributos: contexto y lista
    private Context context;
    private List<Pelicula> listaDePeliculas;
    private ComunicadorClick comunicadorClick;
    //Constructor
    public AdapterRecycler(Context context, List<Pelicula> listaDePeliculas) {
        this.context = context;
        this.listaDePeliculas = listaDePeliculas;
        //Casteo el contexto al tipo de la interfaz
        comunicadorClick = (ComunicadorClick) context;
    }

    @Override
    public PeliculaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Busco el inflador
        LayoutInflater inflater = LayoutInflater.from(context);
        //Inflo la vista de la celda que cree para mostrar las peliculas
        View view = inflater.inflate(R.layout.celda_pelicula, parent, false);
        //Instancio un ViewHolder y le paso la vista inflada
        PeliculaViewHolder peliculaViewHolder = new PeliculaViewHolder(view);
        //Devuelvo la vista
        return peliculaViewHolder;
    }

    @Override
    public void onBindViewHolder(PeliculaViewHolder holder, int position) {
        //Busco la pelicula en la posicion correspondiente
        final Pelicula pelicula = listaDePeliculas.get(position);
        //Le paso al viewHolder la pelicula
        holder.bindPelicula(pelicula);
        //Seteo un click listener al imageView que tiene la imagen de la pelicula
        holder.imageViewPelicula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ejecuto el metodo de la interfaz
                comunicadorClick.clickEnImagen(pelicula.getIdImagen());
            }
        });
        //Seteo un click listener al layout que envuelve el titulo y genero de la pelicula
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ejecuto el metodo de la interfaz
                comunicadorClick.clickEnTexto(pelicula);
            }
        });
    }

    @Override
    public int getItemCount() {
        //Devuelvo la cantidad de peliculas en la lista
        return listaDePeliculas.size();
    }

    //Extiendo mi ViewHolder de RecyclerView.ViewHolder
    public class PeliculaViewHolder extends RecyclerView.ViewHolder{
        //Atributos: componentes del layout de la celda
        private ImageView imageViewPelicula;
        private TextView textViewTitulo;
        private TextView textViewGenero;
        private LinearLayout layout;

        //Constructor
        public PeliculaViewHolder(View itemView) {
            super(itemView);
            //Busco los componentes correspondientes en la vista de la celda
            imageViewPelicula = itemView.findViewById(R.id.imageViewCeldaPelicula);
            textViewTitulo = itemView.findViewById(R.id.textViewCeldaTitulo);
            textViewGenero = itemView.findViewById(R.id.textViewCeldaGenero);
            layout = itemView.findViewById(R.id.layoutContenidoCelda);
        }

        //Metodo para cargar la información de la pelicula en los componentes
        public void bindPelicula(Pelicula pelicula){
            imageViewPelicula.setImageResource(pelicula.getIdImagen());
            textViewTitulo.setText(pelicula.getTitulo());
            textViewGenero.setText(pelicula.getGenero());
        }
    }

    //Interface para comunicarme con quien tiene el recycler
    public interface ComunicadorClick{
        //Metodo para click en imagen
        public void clickEnImagen(Integer idImagen);
        //Metodo para click en el resto de la celda
        public void clickEnTexto(Pelicula pelicula);
    }
}
