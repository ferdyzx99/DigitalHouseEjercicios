package com.example.ma.entregable3;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FL on 08/11/2017.
 */
public class RecetasAdapter extends RecyclerView.Adapter {

    private List<Receta> listaRecetas;
    private NotificableRecyclerView notificableDeRecyclerView;


    //Constructor
    public RecetasAdapter(List<Receta> listaRecetas,Activity notificable) {

        this.listaRecetas = listaRecetas;
        this.notificableDeRecyclerView =  (NotificableRecyclerView) notificable;
    }



    //primer override
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View celda = inflater.inflate(R.layout.celdalista, parent, false);

        RecetaViewHolder viewHolder = new RecetaViewHolder(celda);

        return viewHolder;

    }



//segundo override
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        final RecetaViewHolder recetaViewHolder = (RecetaViewHolder) holder;


        recetaViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificableDeRecyclerView.notificarClick(listaRecetas.get(position));
            }
        });




        recetaViewHolder.cargarReceta(listaRecetas.get(position));
    }


    @Override
    public int getItemCount() {
        return  listaRecetas.size();
    }



    private class RecetaViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;

        public RecetaViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.ListaRecetas_TVtitulo);
            imageView = (ImageView) itemView.findViewById(R.id.ListaRecetas_IMGfoto);
        }

        public void cargarReceta(Receta unareceta){

            textView.setText(unareceta.getTitulo());
            imageView.setImageResource(unareceta.getFoto());
        }
    }

    public interface NotificableRecyclerView{
        public void notificarClick(Receta recetaClickeada);


    }

}





