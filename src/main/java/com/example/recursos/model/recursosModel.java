package com.example.recursos.model;

import java.time.LocalDate;

public class recursosModel {

    private int id;
    private String nombre;
    private String tipo;
    private int cantidad;
    private String pResponsable;
    private Boolean disponibilidad;
    private LocalDate fCreacion;

    public recursosModel() {
    }

    public recursosModel(int id, String nombre, String tipo, int cantidad, String pResponsable, Boolean disponibilidad, LocalDate fCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.pResponsable = pResponsable;
        this.disponibilidad = disponibilidad;
        this.fCreacion = fCreacion;
    }

    public int getid() { return id; }
    public void setid(int id) { this.id = id; }

    public String getnombre() { return nombre; }
    public void setnombre(String nombre) { this.nombre = nombre; }

    public String gettipo() { return tipo; }
    public void settipo(String tipo) { this.tipo = tipo; }

    public int getcantidad() { return cantidad; }
    public void setcantidad(int cantidad) { this.cantidad = cantidad; }

    public String getpResponsable() { return pResponsable; }
    public void setpResponsable(String pResponsable) { this.pResponsable = pResponsable; }

    public boolean isdisponibilidad() { return disponibilidad; }
    public void setdisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    public LocalDate getfCreacion() { return fCreacion; }
    public void setfCreacion(LocalDate fCreacion) { this.fCreacion = fCreacion; }
}

