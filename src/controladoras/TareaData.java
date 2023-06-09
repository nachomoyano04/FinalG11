/*
 * 
 * 
 */

package controladoras;

import entidades.MiembrosEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import entidades.Tarea;
import entidades.Proyecto;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TareaData {
    private Connection con = null;
    private ProyectoData pd = new ProyectoData();
//    private MiembrosEquiposData med = new MiembrosEquiposData(); // Para cuando este la clase lista... Para usar el metodo buscar miembro por id. implementado en linea 78 y 79, 132 y 133 

    public TareaData() {
        con = Conexion.getConexion();
    }

    public void asignarTareas(Tarea tarea){
        String sql = "INSERT INTO tarea (idMiembroEq, nombre, fechaCreacion, fechaCierre, estado) VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, tarea.getMiembroEq().getIdMiembroEq());
            ps.setString(2,tarea.getNombre());
            ps.setDate(3, tarea.getFechaCreacion());
            ps.setDate(4, tarea.getFechaCierre());
            ps.setInt(5, tarea.getEstado());
            ps.executeUpdate();
            ResultSet res = ps.getGeneratedKeys();
            if(res.next()){
                tarea.setIdTarea(res.getInt("idTarea"));
                JOptionPane.showMessageDialog(null, "Tarea añadida con éxito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al asignar tarea: "+ex.getMessage());
        }
    }
    public void actualizarEstadoDeLasTareas(Tarea tarea, int estado){
        String sql = "UPDATE tarea SET estado = ? WHERE idTarea = ? ";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,estado);
            ps.setInt(2,tarea.getIdTarea());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Estado actualizado con éxito");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar estado");
        }
    }
//    Consultar proyectos y tareas: Los usuarios podrán ver la lista de proyectos y sus respectivas tareas, así como filtrar las 
//    tareas por estado y miembro del equipo.
    public ArrayList<Tarea> listaTareasPorProyectos(Proyecto proyecto){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea JOIN miembrosequipo ON miembrosequipo.idMiembroEq = tarea.idMiembroEq JOIN equipo ON equipo.idEquipo = miembrosequipo.idEquipo JOIN proyecto ON proyecto.idProyecto = equipo.idEquipo WHERE proyecto.idProyecto = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,proyecto.getIdProyecto());
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int idTarea = res.getInt("idTarea");
                int idMiembroEq = res.getInt("idMiembroEq");
                MiembrosEquipo miembroEquipo = null;
//              miembroEquipo = med.buscarMiembroPorId(idMiembroEq);  COMENTADO HASTA QUE SE CREE LA CLASE DATA
                String nombre = res.getString("nombre");
                Date fechaCreacion = res.getDate("fechaCreacion");
                Date fechaCierre = res.getDate("fechaCierre");
                int estado = res.getInt("estado");
                Tarea tarea = new Tarea(idTarea, miembroEquipo, nombre, fechaCreacion, fechaCierre, estado);
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar las tareas "+ex.getMessage());
        }
        return tareas;
    }
    public ArrayList<Tarea> tareasPorProyectosEstado(Proyecto proyecto, int estado){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea JOIN miembrosequipo ON tarea.idMiembroEq = miembrosequipo.idMiembroEq JOIN equipo ON miembrosequipo.idEquipo = equipo.idEquipo JOIN proyecto ON equipo.idProyecto = proyecto.idProyecto WHERE proyecto.idProyecto = ? AND tarea.estado = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,proyecto.getIdProyecto());
            ps.setInt(2,estado);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int idTarea = res.getInt("idTarea");
                MiembrosEquipo miembroEquipo = null;                
                int idMiembroEq = res.getInt("idMiembroEq");
//              miembroEquipo = med.buscarMiembroPorId(idMiembroEq);
                String nombre = res.getString("nombre");
                Date fechaCreacion = res.getDate("fechaCreacion");
                Date fechaCierre = res.getDate("fechaCierre");
                Tarea tarea = new Tarea(idTarea, miembroEquipo, nombre, fechaCreacion, fechaCierre, estado);
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar tareas por estado "+ ex.getMessage());
        }
        return tareas;
    }
   
    public ArrayList<Tarea> tareasPorProyectosMiembro(Proyecto proyecto, int idMiembroEquipo){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea JOIN miembrosequipo ON miembrosequipo.idMiembroEq = tarea.idMiembroEq JOIN equipo ON miembrosequipo.idEquipo = equipo.idEquipo JOIN proyecto ON proyecto.idProyecto = equipo.idProyecto WHERE proyecto.idProyecto = ? AND miembrosEquipo.idMiembroEquipo = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,proyecto.getIdProyecto());
            ps.setInt(2,idMiembroEquipo);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int idTarea = res.getInt("idTarea");
                String nombre = res.getString("nombre");
                MiembrosEquipo miembroEquipo = null;
//              miembroEquipo = med.buscarMiembroPorId(idMiembroEq);
                Date fechaCreacion  = res.getDate("fechaCreacion");
                Date fechaCierre  = res.getDate("fechaCierre");
                int estado = res.getInt("estado");
                Tarea tarea = new Tarea(idTarea, miembroEquipo, nombre, fechaCreacion, fechaCierre, estado);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar tareas por idMiembro "+ex.getMessage());
        }
        return tareas;
    }
    
    
}
