/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author TECNOVENTAS
 */
public class Tarea {
    
    private int idTarea;
    private MiembrosEquipo miembroEq;
    private String nombre;
    private Date fechaCreacion;
    private Date fechaCierre;
    private int estado;

    public Tarea() {
    }

    public Tarea(MiembrosEquipo miembroEq, String nombre, Date fechaCreacion, Date fechaCierre, int estado) {
        this.miembroEq = miembroEq;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
    }

    public Tarea(int idTarea, MiembrosEquipo miembroEq, String nombre, Date fechaCreacion, Date fechaCierre, int estado) {
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
