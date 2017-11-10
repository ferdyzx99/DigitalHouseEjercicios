package com.example.digitalhouse.recyclerpeliculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetalle extends AppCompatActivity {

    public static final String CLAVE_IMAGE_DETALLE = "imagenDetalle";
    public static final String CLAVE_TITULO_DETALLE = "tituloDetalle";
    public static final String CLAVE_GENERO_DETALLE = "generoDetalle";
    public static final String CLAVE_DESCRIPCION_DETALLE = "descripcionDetalle";
    public static final String CLAVE_RATING_DETALLE = "ratingDetalle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ImageView imageView = (ImageView) findViewById(R.id.imageViewPeliculaDetalle);
        TextView textViewTitulo = (TextView) findViewById(R.id.textViewTituloDetalle);
        TextView textViewGenero = (TextView) findViewById(R.id.textViewGeneroDetalle);
        TextView textViewDescripcion = (TextView) findViewById(R.id.textViewDescripcionDetalle);
        TextView textViewRating = (TextView) findViewById(R.id.textViewRatingDetalle);

        Double rating = bundle.getDouble(CLAVE_RATING_DETALLE);

        imageView.setImageResource(bundle.getInt(CLAVE_IMAGE_DETALLE));
        textViewTitulo.setText(bundle.getString(CLAVE_TITULO_DETALLE));
        textViewGenero.setText(bundle.getString(CLAVE_GENERO_DETALLE));
        textViewDescripcion.setText(bundle.getString(CLAVE_DESCRIPCION_DETALLE));
        textViewRating.setText(rating.toString());
    }
}
