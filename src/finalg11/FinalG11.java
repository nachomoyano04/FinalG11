/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalg11;

import controladoras.ComentariosData;
import controladoras.EquipoData;
import controladoras.MiembroData;
import controladoras.MiembrosEquipoData;
import controladoras.ProyectoData;
import controladoras.TareaData;
import entidades.Comentarios;
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
        //PROYECTO DATA TEST
//        System.out.println("------PROYECTO DATA TEST------");
        Proyecto proyecto = new Proyecto(9,"Scaloneta", "festejar con los pibes", LocalDate.now(), true);
//        ProyectoData pd = new ProyectoData();
//        pd.crearProyecto(proyecto);
//        System.out.println("Proyecto con id 2: "+pd.buscarProyecto(2));
//        for (Proyecto listarProyecto : pd.listarProyectos()) {
//           System.out.println("-------------");
//           System.out.println(listarProyecto);
//        }
//        pd.modificarDatosProyecto(proyecto);
//        pd.inactivarProyecto(3);
//        pd.activarProyecto(3);
        //EQUIPO DATA TEST 
//        System.out.println("-----EQUIPO DATA TEST------");
        Equipo equipo = new Equipo(5,proyecto, "Manchester City", LocalDate.now(), true);
//        EquipoData ed = new EquipoData();
//        ed.crearEquipo(equipo);
//        System.out.println(ed.buscarEquipoPorId(4));
//        ed.darDeBajaEquipo(3);
        //MIEMBRO DATA
//        System.out.println("-----MIEMBRO DATA TEST------");
        Miembro miembro = new Miembro(6,"Carlos", "Vives", 87654321, true);
//        MiembroData md = new MiembroData();
//        md.ingresarMiembro(miembro);
//        md.modificarDatosMiembro(miembro);
//        System.out.println(md.buscarMiembroPorDni(44480378));
//        System.out.println(md.buscarMiembroPorId(2));
//        md.inactivarMiembro(2);
//        md.activarMiembro(2);
//        for (Miembro listarMiembro : md.listarMiembros()) {
//            System.out.println(listarMiembro);
//        }
        //MIEMBRO EQUIPO DATA
//        System.out.println("-----MIEMBRO EQUIPO DATA TEST------");
        MiembrosEquipo miembrosEquipo = new MiembrosEquipo(20,miembro, equipo, LocalDate.now());
//        MiembrosEquipoData med = new MiembrosEquipoData();
//        med.crearMiembrosEquipo(miembrosEquipo);
//        System.out.println(med.buscarMiembrosEquipoPorId(20));
//        System.out.println("------TAREA DATA TEST------");
        Tarea tarea = new Tarea(39,miembrosEquipo, "Festejar la champions nero", LocalDate.of(2022, 10, 8), LocalDate.of(2023,10,6), 1);
        TareaData td = new TareaData();
        for (Tarea tarea1 : td.tareasPorEstado(1)) {
            System.out.println("ID tarea: "+tarea1.getIdTarea());
            System.out.println("ID miembro equipo: "+tarea1.getMiembroEq().getIdMiembroEq());
            System.out.println("Nombre: "+tarea1.getNombre());
            System.out.println("Fecha creacion: "+tarea1.getFechaCreacion());
            System.out.println("Fecha cierre: "+tarea1.getFechaCierre());
            System.out.println("Estado: "+tarea1.getEstado());
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-");
        }
//        td.asignarTareas(tarea);
//        for (Tarea tareas : td.listaTareasPorIdProyectos(4)) {
//            System.out.println(tareas);
//        }
//        for (Tarea tarea1 : td.tareasPorProyectosEstado(4, 3)) {
//            System.out.println(tarea1);
//        }
//        for (Tarea tarea1 : td.tareasPorProyectosMiembro(9, 20)) {
//            System.out.println(tarea1);
//        }
//        System.out.println(td.buscarTareaXiD(5)); 
//        td.actualizarEstadoDeLasTareas(tarea, 3);
//        td.modificarTarea(tarea);
//        System.out.println("------COMENTARIO DATA TEST------");
        Comentarios comentario = new Comentarios(tarea,"Les faltó poner a Julian chiee", LocalDate.of(2023,06,10));
//        ComentariosData cd = new ComentariosData();
//        cd.crearComentarios(comentario);
//        for (Comentarios listarComentario : cd.listarComentarios()) {
//            System.out.println(listarComentario);
//        }
//        cd.modificarComentarios(comentario);
    }
}
