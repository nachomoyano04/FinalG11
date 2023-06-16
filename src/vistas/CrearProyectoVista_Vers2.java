/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import controladoras.ProyectoData;
import entidades.Proyecto;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
/**
 *
 * @author TECNOVENTAS
 */
public class CrearProyectoVista_Vers2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProyectoVista
     */
    public CrearProyectoVista_Vers2() {
        initComponents();
        btngEstadoProyecto.add(jrbEstadoActivo);
        btngEstadoProyecto.add(jrbEstadoInactivo);
        btnCrear.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngEstadoProyecto = new javax.swing.ButtonGroup();
        jlTitulo = new javax.swing.JLabel();
        jlNombreProyecto = new javax.swing.JLabel();
        jtfNombreProyecto = new javax.swing.JTextField();
        jlDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jlFechaInicio = new javax.swing.JLabel();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jlEstado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jrbEstadoActivo = new javax.swing.JRadioButton();
        jrbEstadoInactivo = new javax.swing.JRadioButton();
        btnNuevoProyecto = new javax.swing.JButton();
        jlIdProyecto = new javax.swing.JLabel();
        jlIdGenerada = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));

        jlTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jlTitulo.setText("Datos de Proyecto");

        jlNombreProyecto.setText("NOMBRE DEL PROYECTO:");

        jtfNombreProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreProyectoKeyReleased(evt);
            }
        });

        jlDescripcion.setText("DESCRIPCION:");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jlFechaInicio.setText("FECHA DE INICIO:");

        jdcFechaInicio.setDateFormatString("dd-MM-yyyy");

        jlEstado.setText("ESTADO:");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jrbEstadoActivo.setText("Proyecto Activo");

        jrbEstadoInactivo.setText("Proyecto Inactivo");

        btnNuevoProyecto.setText("NUEVO");
        btnNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProyectoActionPerformed(evt);
            }
        });

        jlIdProyecto.setText("ID DE PROYECTO GENERADA");

        jlIdGenerada.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jlIdGenerada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jbtnModificar.setText("MODIFICAR");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombreProyecto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(jdcFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbEstadoActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbEstadoInactivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreProyecto)
                                    .addComponent(jlDescripcion)
                                    .addComponent(jlFechaInicio)
                                    .addComponent(jlEstado)
                                    .addComponent(jlIdProyecto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlIdGenerada, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreProyecto)
                    .addComponent(jtfNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaInicio)
                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlEstado)
                        .addComponent(jrbEstadoActivo))
                    .addComponent(jrbEstadoInactivo))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdProyecto)
                    .addComponent(jlIdGenerada, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCrear)
                    .addComponent(btnNuevoProyecto)
                    .addComponent(jbtnModificar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        java.util.Date fecha = jdcFechaInicio.getDate();
        Proyecto proyecto = new Proyecto();
        ProyectoData pd = new ProyectoData();
            /*if (jtfNombreProyecto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El campo Nombre del Proyecto es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                proyecto.setNombre(jtfNombreProyecto.getText());
            }
            if (jtaDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Descripción es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                proyecto.setDescripcion(jtaDescripcion.getText());
            }
            if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de inicio válida", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                LocalDate inicio = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                proyecto.setFechaInicio(inicio);
            }*/
        proyecto.setNombre(jtfNombreProyecto.getText());  
        proyecto.setDescripcion(jtaDescripcion.getText());
        LocalDate inicio = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        proyecto.setFechaInicio(inicio);
        //proyecto.setEstado(true);
        if (!jrbEstadoActivo.isSelected() && !jrbEstadoInactivo.isSelected()) {
                   JOptionPane.showMessageDialog(this, "Debe seleccionar un estado para el proyecto", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jrbEstadoActivo.isSelected()) {
            proyecto.setEstado(true);
        } else {
            proyecto.setEstado(false);
        }
        
        pd.crearProyecto(proyecto);
                    //jlIdGenerada.setText(String.valueOf(proyecto.getIdProyecto()));

        
    }                                        

    private void btnNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        jtfNombreProyecto.setText("");
        jtaDescripcion.setText("");
        jdcFechaInicio.setDate(null);
        btngEstadoProyecto.clearSelection();
        jlIdGenerada.setText("");
        btnCrear.setEnabled(false);
    }                                                

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        ModificarProyectoVista vistaModificarProyecto = new ModificarProyectoVista();
        JDesktopPane escritorio = getDesktopPane();
        escritorio.add(vistaModificarProyecto);
        vistaModificarProyecto.setVisible(true);
    }                                             

    private void jtfNombreProyectoKeyReleased(java.awt.event.KeyEvent evt) {                                              
        // TODO add your handling code here:
        habilitarBoton();
    }                                             

    private void jtaDescripcionKeyReleased(java.awt.event.KeyEvent evt) {                                           
        // TODO add your handling code here:
        habilitarBoton();
    }                                                                    
    
    public void habilitarBoton(){
        if (!jtfNombreProyecto.getText().isEmpty() && !jtaDescripcion.getText().isEmpty()){// && (jrbEstadoActivo.isSelected() || jrbEstadoInactivo.isSelected())){
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            jdcFechaInicio.setDate(currentDate);
            btnCrear.setEnabled(true);    
            //jrbEstadoActivo.setEnabled(true);
            jrbEstadoActivo.setSelected(true);
        }        
    } 
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
/*
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        java.util.Date fecha = jdcFechaInicio.getDate();
        Proyecto proyecto = new Proyecto();
        ProyectoData pd = new ProyectoData();
        if (jtfNombreProyecto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Nombre del Proyecto es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            proyecto.setNombre(jtfNombreProyecto.getText());
        }
        if (jtaDescripcion.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo Descripción es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            proyecto.setDescripcion(jtaDescripcion.getText());
        }
        if (fecha == null) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de inicio válida", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            LocalDate inicio = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            proyecto.setFechaInicio(inicio);
        }
        if (!jrbEstadoActivo.isSelected() && !jrbEstadoInactivo.isSelected()) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un estado para el proyecto", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(jrbEstadoActivo.isSelected()){
            proyecto.setEstado(true);        
        }else{
            proyecto.setEstado(false);
        }
        pd.crearProyecto(proyecto);
        jlIdGenerada.setText(String.valueOf(proyecto.getIdProyecto()));
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProyectoActionPerformed
        // TODO add your handling code here:
        jtfNombreProyecto.setText("");
        jtaDescripcion.setText("");
        jdcFechaInicio.setDate(null);
        btngEstadoProyecto.clearSelection();
        jlIdGenerada.setText("");
    }//GEN-LAST:event_btnNuevoProyectoActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
        ModificarProyectoVista vistaModificarProyecto = new ModificarProyectoVista();
        JDesktopPane escritorio = getDesktopPane();
        escritorio.add(vistaModificarProyecto);
        vistaModificarProyecto.setVisible(true);
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jtfNombreProyectoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreProyectoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreProyectoKeyReleased

    private void jtaDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaDescripcionKeyReleased
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnNuevoProyecto;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngEstadoProyecto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnModificar;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaInicio;
    private javax.swing.JLabel jlIdGenerada;
    private javax.swing.JLabel jlIdProyecto;
    private javax.swing.JLabel jlNombreProyecto;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbEstadoActivo;
    private javax.swing.JRadioButton jrbEstadoInactivo;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
