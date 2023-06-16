/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author TECNOVENTAS
 */
public class Equipo {
    
    private int idEquipo;
    private Proyecto proyecto;
    private String nombre;
    private LocalDate fechaCreacion;
    private boolean estado;

    public Equipo() {
    }

    public Equipo(Proyecto proyecto, String nombre, LocalDate fechaCreacion, boolean estado) {
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public Equipo(int idEquipo, Proyecto proyecto, String nombre, LocalDate fechaCreacion, boolean estado) {
        this.idEquipo = idEquipo;
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String toString(){
        return idEquipo+"_ "+nombre;
    }
    
}
