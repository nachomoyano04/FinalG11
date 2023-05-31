/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladoras;

import entidades.Miembro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOVENTAS
 */
public class MiembroData {
    
    private Connection con = null;

    public MiembroData() {
        con = Conexion.getConexion();
    }
    
    public void ingresarMiembro(Miembro miembro) {

        String sql = "INSERT INTO miembro (nombre, apellido, dni, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, miembro.getNombre());
            ps.setString(2, miembro.getApellido());
            ps.setInt(3, miembro.getDni());
            ps.setBoolean(5, miembro.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                miembro.setIdMiembro(rs.getInt("idMiembro"));
                JOptionPane.showMessageDialog(null, "datos añadidos con exito.");
            } 
            ps.close();            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Miembro"+ex.getMessage());
        }
    }
    
    public Miembro buscarMiembroPorId(int id) {
        Miembro miembro = null;
        String sql = "SELECT  nombre, apellido, dni, estado FROM miembro WHERE idMiembro=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                miembro =new Miembro();
                miembro.setIdMiembro(id);
                miembro.setNombre(rs.getString("nombre"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el miembro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Miembro "+ex.getMessage());
        }
        return miembro;
    }
    
    public Miembro buscarMiembroPorDni(int dni) {
        Miembro miembro = null;
        String sql = "SELECT idMiembro, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni );
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                miembro = new Miembro();
                miembro.setIdMiembro(rs.getInt("id_alumno"));
                miembro.setDni(rs.getInt("dni"));
                miembro.setApellido(rs.getString("apellido"));
                miembro.setNombre(rs.getString("nombre"));
                miembro.setEstado(rs.getBoolean("estado"));
                System.out.println("estado: "+rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el miembro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return miembro;
    }
    
    
    
}
