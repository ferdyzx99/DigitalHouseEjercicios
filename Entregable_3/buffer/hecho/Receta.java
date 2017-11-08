package com.prueba.validaciones;

/**
 * Created by FL on 08/11/2017.
 */
public class Receta {


    String titulo;
    Integer foto;
    String ingredientes;
    String preparacion;


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
