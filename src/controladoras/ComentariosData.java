/*
 * 
 * 
 */

package controladoras;

import entidades.Comentarios;
import entidades.Tarea;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ComentariosData {
    
    private Connection con = null;

    public ComentariosData() {
        con = Conexion.getConexion();
    }
    
    public void crearComentarios(Comentarios comentarios){
        String sql = "INSERT INTO comentarios (idTarea, comentario, fechaAvance) VALUES (?, ?, ?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comentarios.getTarea().getIdTarea());
            ps.setString(2, comentarios.getComentario());
            ps.setDate(3, Date.valueOf(comentarios.getFechaAvance()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                comentarios.setIdComentario(rs.getInt("idComentario"));
                JOptionPane.showMessageDialog(null, "Comentario creado con exito");
            } 
            ps.close();            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cometarios"+ex.getMessage());
        }
    }

    
    public ArrayList<Comentarios> listarComentariosXTarea(Tarea tarea){
        TareaData td=new TareaData();
        ArrayList<Comentarios> listaComent =new ArrayList();
        PreparedStatement ps=null;
        String sql = "SELECT * FROM comentarios WHERE idTarea=?";
        try{            
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tarea.getIdTarea());
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Comentarios coment=new Comentarios();
                coment.setIdComentario(res.getInt("idComentario"));
                coment.setComentario(res.getString("comentario"));
                coment.setFechaAvance(res.getDate("fechaAvance").toLocalDate()); 
                coment.setTarea(td.buscarTareaXiD(res.getInt("idTarea"))); 
                listaComent.add(coment);
            }
            ps.close();
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al mostrar Comentarios");
                }        
        return listaComent;
    }
    
    public void modificarComentarios(Comentarios comentarios){
        
        String sql="UPDATE comentarios SET comentario=?, fechaAvance=?, idTarea=? WHERE idComentario=? ";
        
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, comentarios.getComentario());
            ps.setDate(2, Date.valueOf(comentarios.getFechaAvance()));  
            ps.setInt(3, comentarios.getTarea().getIdTarea());
            ps.setInt(4, comentarios.getIdComentario());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            }else {
                JOptionPane.showMessageDialog(null, "No existe el comentario");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
    }
}
