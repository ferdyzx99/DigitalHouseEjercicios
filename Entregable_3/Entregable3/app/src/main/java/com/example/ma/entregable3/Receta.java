package com.example.ma.entregable3;

import java.io.Serializable;

/**
 * Created by ma on 07/11/17.
 */

public class Receta implements Serializable {
    private String titulo;
    private Integer foto;
    private String ingredientes;
    private String preparacion;

    public Receta(String titulo, Integer foto, String ingredientes, String preparacion) {
        this.titulo = titulo;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public Integer getFoto() {
        return foto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }
}
