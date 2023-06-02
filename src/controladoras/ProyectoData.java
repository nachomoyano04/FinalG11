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
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto"+ex.getMessage());
        }
    }
    
    public ArrayList<Proyecto> listarProyectos(){
        ArrayList<Proyecto> proyectos = new ArrayList();
        try{        
            String sql = "SELECT * FROM proyecto WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Proyecto proyecto = new Proyecto();
                proyecto.setIdProyecto(res.getInt("idProyecto"));
                proyecto.setNombre(res.getString("nombre"));
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
    
}
