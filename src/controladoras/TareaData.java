package controladoras;

import entidades.MiembrosEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import entidades.Tarea;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class TareaData {
    private Connection con = null;
    private ProyectoData pd = new ProyectoData();
    private MiembrosEquipoData med = new MiembrosEquipoData(); // Para cuando este la clase lista... Para usar el metodo buscar miembro por id. implementado en linea 78 y 79, 132 y 133 

    public TareaData() {
        con = Conexion.getConexion();
    }

    public void asignarTareas(Tarea tarea){
        String sql = "INSERT INTO tarea (idMiembroEq, nombre, fechaCreacion, fechaCierre, estado) VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tarea.getMiembroEq().getIdMiembroEq());
            ps.setString(2,tarea.getNombre());
            ps.setDate(3, Date.valueOf(tarea.getFechaCreacion()));
            ps.setDate(4, Date.valueOf(tarea.getFechaCierre()));
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
    
    public void actualizarEstadoDeLasTareas(int idTarea, int estado){
        String sql = "UPDATE tarea SET estado = ? WHERE idTarea = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, idTarea);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Estado actualizado con éxito");
            }else{
                JOptionPane.showMessageDialog(null,"La tarea no existe");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar estado");
        }
    }
//    Consultar proyectos y tareas: Los usuarios podrán ver la lista de proyectos y sus respectivas tareas, así como filtrar las 
//    tareas por estado y miembro del equipo.
    public ArrayList<Tarea> listaTareasPorIdProyectos(int idProyecto){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea JOIN miembrosequipo ON miembrosequipo.idMiembroEq = tarea.idMiembroEq JOIN equipo ON equipo.idEquipo = miembrosequipo.idEquipo JOIN proyecto ON proyecto.idProyecto = equipo.idProyecto WHERE proyecto.idProyecto = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProyecto);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int idTarea = res.getInt("idTarea");
                int idMiembroEq = res.getInt("idMiembroEq");
                MiembrosEquipo miembroEquipo = null;
                miembroEquipo = med.buscarMiembrosEquipoPorId(idMiembroEq);  
                String nombre = res.getString("nombre");
                LocalDate fechaCreacion = res.getDate("fechaCreacion").toLocalDate();
                LocalDate fechaCierre = res.getDate("fechaCierre").toLocalDate();
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
    
    // NO SE SI ES NECESARIO ESTE METODO O LA DE LISTAR TAREAS POR ESTADO SOLO
    public ArrayList<Tarea> tareasPorProyectosEstado(int idProyecto, int estado){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea JOIN miembrosequipo ON tarea.idMiembroEq = miembrosequipo.idMiembroEq JOIN equipo ON miembrosequipo.idEquipo = equipo.idEquipo JOIN proyecto ON equipo.idProyecto = proyecto.idProyecto WHERE proyecto.idProyecto = ? AND tarea.estado = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProyecto);
            ps.setInt(2,estado);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int idTarea = res.getInt("idTarea");
                MiembrosEquipo miembroEquipo = null;                
                int idMiembroEq = res.getInt("idMiembroEq");
                miembroEquipo = med.buscarMiembrosEquipoPorId(idMiembroEq);
                String nombre = res.getString("nombre");
                LocalDate fechaCreacion = res.getDate("fechaCreacion").toLocalDate();
                LocalDate fechaCierre = res.getDate("fechaCierre").toLocalDate();
                Tarea tarea = new Tarea(idTarea, miembroEquipo, nombre, fechaCreacion, fechaCierre, estado);
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar tareas por estado "+ ex.getMessage());
        }
        return tareas;
    }
    public ArrayList<Tarea> tareasPorEstado(int estado){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT * FROM tarea WHERE estado = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, estado);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Tarea tarea = new Tarea();
                tarea.setIdTarea(res.getInt("idTarea"));
                tarea.setMiembroEq(med.buscarMiembrosEquipoPorId(res.getInt("idMiembroEq")));
                tarea.setNombre(res.getString("nombre"));
                tarea.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                tarea.setFechaCierre(res.getDate("fechaCierre").toLocalDate());
                tarea.setEstado(estado);
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar tareas por estado "+ex.getMessage());
        }
        return tareas;
    }
   //NO SE SI ESTE ES METODO ES EL QUE PIDE O EL DE LISTAR TAREAS POR IDMIEMBROEQUIPO, SIN TENER EN CUENTA EL ID PROYECTO
    public ArrayList<Tarea> tareasPorProyectosMiembro(int idProyecto, int idMiembroEquipo){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea JOIN miembrosequipo ON miembrosequipo.idMiembroEq = tarea.idMiembroEq JOIN equipo ON miembrosequipo.idEquipo = equipo.idEquipo JOIN proyecto ON proyecto.idProyecto = equipo.idProyecto WHERE proyecto.idProyecto = ? AND miembrosequipo.idMiembroEq = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProyecto);
            ps.setInt(2,idMiembroEquipo);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                int idTarea = res.getInt("idTarea");
                String nombre = res.getString("nombre");
                MiembrosEquipo miembroEquipo = null;
                miembroEquipo = med.buscarMiembrosEquipoPorId(idMiembroEquipo);
                LocalDate fechaCreacion  = res.getDate("fechaCreacion").toLocalDate();
                LocalDate fechaCierre  = res.getDate("fechaCierre").toLocalDate();
                int estado = res.getInt("estado");
                Tarea tarea = new Tarea(idTarea, miembroEquipo, nombre, fechaCreacion, fechaCierre, estado);
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar tareas por idMiembro "+ex.getMessage());
        }
        return tareas;
    }
    public ArrayList<Tarea> tareasPorMiembroEquipoyEstado(int idMiembroEquipo, int estado){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT tarea.* FROM tarea WHERE idMiembroEq = ? AND estado = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMiembroEquipo);
            ps.setInt(2, estado);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Tarea tarea = new Tarea();
                tarea.setIdTarea(res.getInt("idTarea"));
                tarea.setMiembroEq(new MiembrosEquipoData().buscarMiembrosEquipoPorId(res.getInt("idMiembroEq")));
                tarea.setNombre(res.getString("nombre"));
                tarea.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                tarea.setFechaCierre(res.getDate("fechaCierre").toLocalDate());
                tarea.setEstado(res.getInt("estado"));
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar tareas por miembro equipo y estado");
        }
        return tareas;
    }
    public ArrayList<Tarea> listarTareasPorIdMiembroEquipo(int idMiembroEquipo){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT * FROM tarea WHERE idMiembroEq = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMiembroEquipo);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Tarea tarea = new Tarea();
                tarea.setIdTarea(res.getInt("idTarea"));
                tarea.setMiembroEq(med.buscarMiembrosEquipoPorId(idMiembroEquipo));
                tarea.setNombre(res.getString("nombre"));
                tarea.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                tarea.setFechaCierre(res.getDate("fechaCierre").toLocalDate());
                tarea.setEstado(res.getInt("estado"));
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar tareas: "+ex.getMessage());
        }
        return tareas;
    }
    public Tarea buscarTareaXiD(int idTarea){ // exlusivamente para marcel
        Tarea tarea = new Tarea();
        String sql = "SELECT * FROM tarea WHERE idTarea = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idTarea);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                tarea.setNombre(res.getString("nombre"));
                tarea.setMiembroEq(med.buscarMiembrosEquipoPorId(res.getInt("idMiembroEq")));
                tarea.setEstado(res.getInt("estado"));
                tarea.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                tarea.setFechaCierre(res.getDate("fechaCierre").toLocalDate());
                tarea.setIdTarea(idTarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar tarea por id: "+ex.getMessage());
        }
        return tarea;
    }

    public void modificarTarea(Tarea tarea){
        String sql = "UPDATE tarea SET idMiembroEq = ?, nombre = ?, fechaCreacion = ?, fechaCierre = ?, estado = ? WHERE idTarea = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,tarea.getMiembroEq().getIdMiembroEq());
            ps.setString(2, tarea.getNombre());
            ps.setDate(3, Date.valueOf(tarea.getFechaCreacion()));
            ps.setDate(4, Date.valueOf(tarea.getFechaCierre()));
            ps.setInt(5, tarea.getEstado());
            ps.setInt(6,tarea.getIdTarea());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Tarea modificada");
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al modificar tarea"+ex.getMessage());
        }
    }
    
    public ArrayList<Tarea> listarTareas(){
        ArrayList<Tarea>tareas = new ArrayList();
        String sql = "SELECT * FROM tarea";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Tarea tarea = new Tarea();
                tarea.setIdTarea(res.getInt("idTarea"));
                tarea.setMiembroEq(new MiembrosEquipoData().buscarMiembrosEquipoPorId(res.getInt("idMiembroEq")));
                tarea.setNombre(res.getString("nombre"));
                tarea.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                tarea.setFechaCierre(res.getDate("fechaCierre").toLocalDate());
                tarea.setEstado(res.getInt("estado"));
                tareas.add(tarea);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar tareas");
        }
        return tareas;
    }
    
}
