/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author TECNOVENTAS
 */
public class Tarea {
    
    private int idTarea;
    private MiembrosEquipo miembroEq;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaCierre;
    private int estado;

    public Tarea() {
    }

    public Tarea(MiembrosEquipo miembroEq, String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, int estado) {
        this.miembroEq = miembroEq;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
    }

    public Tarea(int idTarea, MiembrosEquipo miembroEq, String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, int estado) {
        this.idTarea = idTarea;
        this.miembroEq = miembroEq;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public MiembrosEquipo getMiembroEq() {
        return miembroEq;
    }

    public void setMiembroEq(MiembrosEquipo miembroEq) {
        this.miembroEq = miembroEq;
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

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return miembroEq+"\n\n"+nombre+"\n\n"+fechaCreacion+"\n\n"+fechaCierre+"\n\n"+estado;
    }
    
}
