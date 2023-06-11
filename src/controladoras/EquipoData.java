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
import java.time.LocalDate;
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
            JOptionPane.showMessageDialog(null, "Error al crear equipo" + ex.getMessage());
        }
    }

    public void darDeBajaEquipo(Equipo equipo) {
        String sql = "UPDATE equipo SET estado = 0 WHERE idEquipo = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, equipo.getIdEquipo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, equipo.getNombre() + " dado de baja.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al equipo " + ex.getMessage());
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
}
