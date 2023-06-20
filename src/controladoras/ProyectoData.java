/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladoras;

import entidades.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOVENTAS
 */
public class ProyectoData {
    
    private Connection con = null;

    public ProyectoData() {
        con = Conexion.getConexion();
    }
    
    public void crearProyecto(Proyecto proyecto) {

        String sql = "INSERT INTO proyecto (nombre, descripcion, fechaInicio, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proyecto.getNombre());
            ps.setString(2, proyecto.getDescripcion());
            ps.setDate(3, Date.valueOf(proyecto.getFechaInicio()));
            ps.setBoolean(4, proyecto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proyecto.setIdProyecto(rs.getInt("idProyecto"));
                JOptionPane.showMessageDialog(null, "Proyecto creado con exito");
            } 
            ps.close();            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto"+ ex.getMessage());
        }
    }
    
    public ArrayList<Proyecto> listarProyectos(){
        ArrayList<Proyecto> proyectos = new ArrayList();
        try{        
            String sql = "SELECT * FROM proyecto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Proyecto proyecto = new Proyecto();
                proyecto.setIdProyecto(res.getInt("idProyecto"));
                proyecto.setNombre(res.getString("nombre"));
                proyecto.setFechaInicio(res.getDate("fechaInicio").toLocalDate());
                proyecto.setDescripcion(res.getString("descripcion"));
                proyecto.setEstado(true);
                proyectos.add(proyecto);
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al mostrar proyectos "+ ex.getMessage());
        }
        return proyectos;
    }
    
    public ArrayList<Proyecto> listarProyectosPorEstado(int estado){
        ArrayList<Proyecto> proyectos = new ArrayList();
        try{        
            String sql = "SELECT * FROM proyecto WHERE estado = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Proyecto proyecto = new Proyecto();
                proyecto.setIdProyecto(res.getInt("idProyecto"));
                proyecto.setNombre(res.getString("nombre"));
                proyecto.setFechaInicio(res.getDate("fechaInicio").toLocalDate());
                proyecto.setDescripcion(res.getString("descripcion"));
                proyecto.setEstado(true);
                proyectos.add(proyecto);
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al mostrar proyectos "+ ex.getMessage());
        }
        return proyectos;
    }
    
    public Proyecto buscarProyecto(int id) {
        Proyecto proyecto = null;
        String sql = "SELECT nombre, descripcion, fechaInicio, estado FROM proyecto WHERE idProyecto=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proyecto = new Proyecto();
                proyecto.setIdProyecto(id); //FALTABA SETEAR ESTE DATO
                proyecto.setNombre(rs.getString("nombre"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                proyecto.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el proyecto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proyecto "+ex.getMessage());
        }
        return proyecto;
    }
    
    public void modificarDatosProyecto(Proyecto proyecto) {

        String sql = "UPDATE proyecto SET nombre = ?, descripcion = ?, fechaInicio = ? WHERE  idProyecto = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, proyecto.getNombre());
            ps.setString(2,proyecto.getDescripcion());
            ps.setDate(3, Date.valueOf(proyecto.getFechaInicio())); 
            ps.setInt(4, proyecto.getIdProyecto());
            int modificar = ps.executeUpdate();
            if (modificar == 1){
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El proyecto no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto "+ex.getMessage());
        }
    }
    
    public void inactivarProyecto(int id) {
        try {
            if(this.buscarProyecto(id).isEstado()){
                String sql = "UPDATE proyecto SET estado = 0 WHERE idProyecto = ? ";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int inactivar = ps.executeUpdate();          
                if(inactivar == 1){
                    JOptionPane.showMessageDialog(null, " Se inactivo el proyecto.");
                }
                ps.close();            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Proyecto");
        }
    }

    public void activarProyecto(int id) {
        try {
            if(!this.buscarProyecto(id).isEstado()){
                String sql = "UPDATE proyecto SET estado = 1 WHERE idProyecto = ? ";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int activar = ps.executeUpdate();
                if(activar == 1){
                    JOptionPane.showMessageDialog(null, " Se activo el proyecto.");
                }
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Proyecto");
        }
    }
    
}
