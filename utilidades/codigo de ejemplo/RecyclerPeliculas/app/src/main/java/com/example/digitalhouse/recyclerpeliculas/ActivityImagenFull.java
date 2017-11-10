package com.example.digitalhouse.recyclerpeliculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityImagenFull extends AppCompatActivity {

    public static final String CLAVE_IMAGEN_FULL = "imagenFull";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_full);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        ImageView imageView = (ImageView) findViewById(R.id.imageViewImagenPeliculaFull);
        imageView.setImageResource(bundle.getInt(CLAVE_IMAGEN_FULL));
    }
}
