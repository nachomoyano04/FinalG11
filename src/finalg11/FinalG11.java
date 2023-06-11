/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalg11;

import controladoras.EquipoData;
import controladoras.MiembroData;
import controladoras.MiembrosEquipoData;
import controladoras.ProyectoData;
import controladoras.TareaData;
import entidades.Equipo;
import entidades.Miembro;
import entidades.MiembrosEquipo;
import entidades.Proyecto;
import entidades.Tarea;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author nacho
 */
public class FinalG11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un proyecto
//        Proyecto proyecto = new Proyecto(9,"Scaloneta", "Salir campeon mundial", LocalDate.now(), true);
//        ProyectoData pd = new ProyectoData();
//        pd.crearProyecto(proyecto);
        //Asignamos un miembro a un equipo
          MiembrosEquipo me = new MiembrosEquipo(5, new MiembroData().buscarMiembroPorDni(44480378), new EquipoData().buscarEquipoPorId(1), LocalDate.now());
          MiembrosEquipoData med = new MiembrosEquipoData();
          med.crearMiembrosEquipo(me);
    }
    
}
