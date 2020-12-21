package com.clases;

import javax.swing.*;
import java.util.List;

public class Clientes {
    private String nombre;
    private String telefono;
    private String direccion;
    private Integer tipoDoc;
    private Integer documento;
    private List<Producto> productos;

    public Integer getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(Integer tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Clientes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoDoc=" + tipoDoc +
                ", documento=" + documento +
                ", productos=" + productos +
                '}';
    }
}
