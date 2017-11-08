package com.example.digitalhouse.recyclerpeliculas;

/**
 * Created by digitalhouse on 10/12/17.
 */

public class Pelicula {
    private Integer idImagen;
    private String titulo;
    private String genero;
    private String descripcion;
    private Double rating;

    public Pelicula(Integer idImagen, String titulo, String genero, String descripcion, Double rating) {
        this.idImagen = idImagen;
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.rating = rating;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getRating() {
        return rating;
    }
}
