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
public class Comentarios {
    
    private int idComentario;
    private Tarea tarea;
    private String comentario;
    private Date fechaAvance;

    public Comentarios() {
    }

    public Comentarios(Tarea tarea, String comentario, Date fechaAvance) {
        this.tarea = tarea;
        this.comentario = comentario;
        this.fechaAvance = fechaAvance;
    }

    public Comentarios(int idComentario, Tarea tarea, String comentario, Date fechaAvance) {
        this.idComentario = idComentario;
        this.tarea = tarea;
        this.comentario = comentario;
        this.fechaAvance = fechaAvance;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaAvance() {
        return fechaAvance;
    }

    public void setFechaAvance(Date fechaAvance) {
        this.fechaAvance = fechaAvance;
    }
    
    
    
}
