package com.example.win8.foodtemplate.clases;

/**
 * Created by WIN8 on 25/07/2018.
 */

public class Categoria {
    public String nombre;
    public String descripcion;
    public int imagen;
    public Categoria(){}

    public Categoria(String nombre, String descripcion, int imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
