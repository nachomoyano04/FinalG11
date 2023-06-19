/* 
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.sql.Connection;
import entidades.Equipo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class EquipoData {

    private Connection con = null;

    public EquipoData() {
        con = Conexion.getConexion();
    }

    public void crearEquipo(Equipo equipo) {
        String sql = "INSERT INTO equipo (idProyecto, nombre, fechaCreacion, estado) VALUES (?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, equipo.getProyecto().getIdProyecto());
            ps.setString(2, equipo.getNombre());
            ps.setDate(3, Date.valueOf(equipo.getFechaCreacion()));
            ps.setBoolean(4, equipo.isEstado());
            int exito = ps.executeUpdate();
            ResultSet res = ps.getGeneratedKeys();
            if (exito == 1) {
                if (res.next()) {
                    equipo.setIdEquipo(res.getInt("idEquipo"));
                }
                JOptionPane.showMessageDialog(null, "Equipo añadido con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear equipo");
        }
    }

    public void darDeBajaEquipo(int idEquipo) {
        String sql = "UPDATE equipo SET estado = 0 WHERE idEquipo = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "dado de baja con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al equipo " + ex.getMessage());
        }
    }
    public void darDeAltaEquipo(int idEquipo) {
        String sql = "UPDATE equipo SET estado = 1 WHERE idEquipo = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEquipo);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dado de alta con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de alta al equipo " + ex.getMessage());
        }
    }

    public Equipo buscarEquipoPorId(int idEquipo) {
        String sql = "SELECT equipo.* FROM equipo WHERE idEquipo = ?";
        Equipo team = new Equipo();
        ProyectoData pd = new ProyectoData();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idEquipo);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                team.setIdEquipo(idEquipo);
                team.setProyecto(pd.buscarProyecto(res.getInt("idProyecto")));
                team.setNombre(res.getString("nombre"));
                team.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                team.setEstado(res.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar equipo " + ex.getMessage());
        }
        return team;
    }
    
    public ArrayList<Equipo> listarEquipos(){
        ArrayList<Equipo>equipos = new ArrayList();
        ProyectoData pd = new ProyectoData();
        String sql = "SELECT * FROM equipo";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(res.getInt("idEquipo"));
                equipo.setProyecto(pd.buscarProyecto(res.getInt("idProyecto")));
                equipo.setNombre(res.getString("nombre"));
                equipo.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                equipo.setEstado(res.getBoolean("estado"));
                equipos.add(equipo);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar equipos");
        }
        return equipos;
    }
        public ArrayList<Equipo> listarEquiposPorEstado(int estado){
        ArrayList<Equipo>equipos = new ArrayList();
        ProyectoData pd = new ProyectoData();
        String sql = "SELECT * FROM equipo WHERE estado = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, estado);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(res.getInt("idEquipo"));
                equipo.setProyecto(pd.buscarProyecto(res.getInt("idProyecto")));
                equipo.setNombre(res.getString("nombre"));
                equipo.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                equipo.setEstado(res.getBoolean("estado"));
                equipos.add(equipo);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar equipos por estado");
        }
        return equipos;
    }
        
        public ArrayList<Equipo> listarEquiposPorProyectos(int idProyecto){
            ArrayList<Equipo>equipos = new ArrayList();
            String sql = "SELECT * FROM equipo WHERE idProyecto = ?";
            ProyectoData pd = new ProyectoData();
            PreparedStatement ps = null;
            try{
               ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
               ps.setInt(1, idProyecto);
               ResultSet res = ps.executeQuery();
               while(res.next()){
                   Equipo equipo = new Equipo();
                   equipo.setProyecto(pd.buscarProyecto(res.getInt("idProyecto")));
                   equipo.setIdEquipo(res.getInt("idEquipo"));
                   equipo.setNombre(res.getString("nombre"));
                   equipo.setFechaCreacion(res.getDate("fechaCreacion").toLocalDate());
                   equipo.setEstado(res.getBoolean("estado"));
                   equipos.add(equipo);
               }
               ps.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error al listar equipos por id proyecto");
            }
            return equipos;
        }
        
        public void modificarEquipo(Equipo equipo){
            String sql = "UPDATE equipo SET nombre = ?, fechaCreacion = ? WHERE idEquipo = ? AND idProyecto = ?";
            PreparedStatement ps = null;
            try{
                ps = con.prepareStatement(sql);
                ps.setString(1, equipo.getNombre());
                ps.setDate(2, Date.valueOf(equipo.getFechaCreacion()));
                ps.setInt(3, equipo.getIdEquipo());
                ps.setInt(4, equipo.getProyecto().getIdProyecto());
                int exito = ps.executeUpdate();
                if(exito == 1){
                    JOptionPane.showMessageDialog(null,"Equipo modificado con éxito.");
                }
                ps.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error al modificar equipo");
            }
            
        }
    
}
