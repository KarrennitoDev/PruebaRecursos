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

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getPResponsable() { return pResponsable; }
    public void setPResponsable(String pResponsable) { this.pResponsable = pResponsable; }

    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    public LocalDate getFCreacion() { return fCreacion; }
    public void setFCreacion(LocalDate fCreacion) { this.fCreacion = fCreacion; }
}

