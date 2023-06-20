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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Isma
 */
public class MiembrosEquipoData {
    
    private MiembroData md = new MiembroData();
    private EquipoData ed = new EquipoData();
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
                miembrosEquipo.setMiembro(md.buscarMiembroPorId(res.getInt("idMiembro")));
                miembrosEquipo.setEquipo(ed.buscarEquipoPorId(res.getInt("idEquipo")));
                miembrosEquipo.setFechaIncorporacion(res.getDate("fechaIncorporacion").toLocalDate());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar MiembrosEquipo: " + ex.getMessage());
        }
        return miembrosEquipo;
    }
    
    public ArrayList<Equipo> buscarEquipoConDni(int dni){
        String sql = "SELECT miembrosequipo.idEquipo FROM miembrosequipo JOIN miembro ON miembrosequipo.idMiembro = miembro.idMiembro WHERE miembro.dni = ?";
        EquipoData ed = new EquipoData();
        ArrayList<Equipo>equipos = new ArrayList();
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                equipos.add(ed.buscarEquipoPorId(res.getInt("idEquipo")));
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al buscar equio "+ex.getMessage());
        }
        return equipos;
    }
    
    public int codigoGeneradoSegunEquipoYMiembro(int idEquipo, int idMiembro){
        String sql = "SELECT miembrosequipo.idMiembroEq FROM miembrosequipo WHERE idEquipo = ? AND idMiembro = ?";
        int codigo = 0;
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idEquipo);
            ps.setInt(2, idMiembro);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                codigo = res.getInt("idMiembroEq");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al generar codigo miembro equipo: "+ex.getMessage());
        }
        return codigo;
    }
    
    public ArrayList<MiembrosEquipo> listarMiembrosEquipos(int idEquipo){
        String sql = "SELECT * FROM miembrosequipo WHERE idEquipo = ?";
        ArrayList<MiembrosEquipo>miembrosEquipos = new ArrayList();
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idEquipo);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                MiembrosEquipo me = new MiembrosEquipo();
                me.setIdMiembroEq(res.getInt("idMiembroEq"));
                me.setEquipo(ed.buscarEquipoPorId(res.getInt("idEquipo")));
                me.setMiembro(md.buscarMiembroPorId(res.getInt("idMiembro")));
                me.setFechaIncorporacion(res.getDate("fechaIncorporacion").toLocalDate());
                miembrosEquipos.add(me);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar miembrosEquipo");
        }
        return miembrosEquipos;
    }
    
    public ArrayList<MiembrosEquipo> listarTodosMiembrosEquipos(){
        String sql = "SELECT * FROM miembrosequipo";
        ArrayList<MiembrosEquipo>miembrosEquipos = new ArrayList();
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                MiembrosEquipo me = new MiembrosEquipo();
                me.setIdMiembroEq(res.getInt("idMiembroEq"));
                me.setEquipo(ed.buscarEquipoPorId(res.getInt("idEquipo")));
                me.setMiembro(md.buscarMiembroPorId(res.getInt("idMiembro")));
                me.setFechaIncorporacion(res.getDate("fechaIncorporacion").toLocalDate());
                miembrosEquipos.add(me);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar miembrosEquipo");
        }
        return miembrosEquipos;
    }
    
    public ArrayList<MiembrosEquipo> listarMiembrosEquipoPorIdProyecto(int idProyecto){
        String sql = "SELECT miembrosequipo.* FROM miembrosequipo JOIN equipo ON miembrosequipo.idEquipo = equipo.idEquipo JOIN proyecto ON equipo.idProyecto = proyecto.idProyecto WHERE proyecto.idProyecto = ?";
        ArrayList<MiembrosEquipo>miembrosEq = new ArrayList();
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProyecto);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                MiembrosEquipo me = new MiembrosEquipo();
                me.setIdMiembroEq(res.getInt("idMiembroEq"));
                me.setEquipo(new EquipoData().buscarEquipoPorId(res.getInt("idEquipo")));
                me.setMiembro(new MiembroData().buscarMiembroPorId(res.getInt("idMiembro")));
                me.setFechaIncorporacion(res.getDate("fechaIncorporacion").toLocalDate());
                miembrosEq.add(me);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al listar miembrosEquipo: "+ex.getMessage());
        }
        return miembrosEq;
    }
}
