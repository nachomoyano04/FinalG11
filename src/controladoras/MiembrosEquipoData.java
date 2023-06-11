/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import entidades.Equipo;
import entidades.Miembro;
import entidades.MiembrosEquipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Isma
 */
public class MiembrosEquipoData {

    private Connection con = null;

    public MiembrosEquipoData() {
        con = Conexion.getConexion();
    }

    public void crearMiembrosEquipo(MiembrosEquipo miembrosEquipo) {
        String sql = "INSERT INTO miembrosequipo (idMiembro, idEquipo, fechaIncorporacion) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, miembrosEquipo.getMiembro().getIdMiembro());
            ps.setInt(2, miembrosEquipo.getEquipo().getIdEquipo());
            ps.setDate(3, Date.valueOf(miembrosEquipo.getFechaIncorporacion()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                miembrosEquipo.setIdMiembroEq(rs.getInt("idMiembroEq"));
                JOptionPane.showMessageDialog(null, "Miembro de equipo creado con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla MiembrosEquipo: " + ex.getMessage());
        }
    }

    public MiembrosEquipo buscarMiembrosEquipoPorId(int idMiembroEq) {
        String sql = "SELECT * FROM miembrosequipo WHERE idMiembroEq = ?";
        MiembrosEquipo miembrosEquipo = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMiembroEq);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                miembrosEquipo = new MiembrosEquipo();
                miembrosEquipo.setIdMiembroEq(res.getInt("idMiembroEq"));
                miembrosEquipo.setMiembro(buscarMiembroPorId(res.getInt("idMiembro")));
                miembrosEquipo.setEquipo(buscarEquipoPorId(res.getInt("idEquipo")));
                miembrosEquipo.setFechaIncorporacion(res.getDate("fechaIncorporacion").toLocalDate());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar MiembrosEquipo: " + ex.getMessage());
        }
        return miembrosEquipo;
    }

    private Miembro buscarMiembroPorId(int idMiembro) {
        MiembroData miembroData = new MiembroData();
        return miembroData.buscarMiembroPorId(idMiembro);
    }

    private Equipo buscarEquipoPorId(int idEquipo) {
        EquipoData equipoData = new EquipoData();
        Equipo equipo = new Equipo();
        equipo.setIdEquipo(idEquipo);
        return equipoData.buscarEquipoPorId(idEquipo);
    }

}
