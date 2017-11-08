package com.example.ma.entregable3;

/**
 * Created by ma on 07/11/17.
 */

public class Receta {
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


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}
