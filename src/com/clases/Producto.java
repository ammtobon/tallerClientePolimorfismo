package com.clases;

import javax.swing.*;
import java.util.List;

public class Producto {
    private String nombre;
    private String carateristicas;
    private String idProducto;
    private String condiciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarateristicas() {
        return carateristicas;
    }

    public void setCarateristicas(String carateristicas) {
        this.carateristicas = carateristicas;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", carateristicas='" + carateristicas + '\'' +
                ", idProducto='" + idProducto + '\'' +
                ", condiciones='" + condiciones + '\'' +
                '}';
    }
}
