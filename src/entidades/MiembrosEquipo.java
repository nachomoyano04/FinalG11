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
public class MiembrosEquipo {
    
    private int idMiembroEq;
    private Miembro miembro;
    private Equipo equipo;
    private LocalDate fechaIncorporacion;

    public MiembrosEquipo() {
    }

    public MiembrosEquipo(Miembro miembro, Equipo equipo, LocalDate fechaIncorporacion) {
        this.miembro = miembro;
        this.equipo = equipo;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public MiembrosEquipo(int idMiembroEq, Miembro miembro, Equipo equipo, LocalDate fechaIncorporacion) {
        this.idMiembroEq = idMiembroEq;
        this.miembro = miembro;
        this.equipo = equipo;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int getIdMiembroEq() {
        return idMiembroEq;
    }

    public void setIdMiembroEq(int idMiembroEq) {
        this.idMiembroEq = idMiembroEq;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    
    public String toString(){
        return miembro+"\n"+equipo+"\n"+fechaIncorporacion;
    }
}
