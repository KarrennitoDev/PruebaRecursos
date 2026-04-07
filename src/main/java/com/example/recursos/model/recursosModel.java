package com.example.recursos.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class recursosModel {

    @NotNull(message = "El Id no puede ser nulo")
    private int id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El tipo es obligatorio")
    private String tipo;

    @NotNull(message = "La cantidad no puede ser nula")
    private int cantidad;

    @NotBlank(message = "La persona responsable es obligatoria")
    private String pResponsable;

    @NotNull(message = "La disponibilidad no puede ser nula")
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

