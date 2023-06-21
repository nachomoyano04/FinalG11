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
public class CrearProyectoVista extends javax.swing.JInternalFrame {


    public CrearProyectoVista() {
        initComponents();
        btngEstadoProyecto.add(jrbEstadoActivo);
        btngEstadoProyecto.add(jrbEstadoInactivo);
        btnCrear.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngEstadoProyecto = new javax.swing.ButtonGroup();
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
        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();

        setBorder(new javax.swing.border.MatteBorder(null));

        jlNombreProyecto.setText("NOMBRE DEL PROYECTO:");

        jtfNombreProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreProyectoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreProyectoKeyTyped(evt);
            }
        });

        jlDescripcion.setText("DESCRIPCION:");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jlFechaInicio.setText("FECHA DE INICIO:");

        jdcFechaInicio.setDateFormatString("yyyy/MM/dd");

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

        jlIdProyecto.setText("NUMERO DE PROYECTO:");

        jlIdGenerada.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jlIdGenerada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jbtnModificar.setText("MODIFICAR");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jlTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setText("Datos de Proyecto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreProyecto)
                                    .addComponent(jlDescripcion)
                                    .addComponent(jlFechaInicio)
                                    .addComponent(jlEstado)
                                    .addComponent(jlIdProyecto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jrbEstadoActivo)
                                                .addGap(45, 45, 45)
                                                .addComponent(jrbEstadoInactivo))
                                            .addComponent(jlIdGenerada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtfNombreProyecto)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreProyecto)
                    .addComponent(jtfNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaInicio)
                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbEstadoActivo)
                        .addComponent(jrbEstadoInactivo))
                    .addComponent(jlEstado))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIdGenerada, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdProyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCrear)
                    .addComponent(btnNuevoProyecto)
                    .addComponent(jbtnModificar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                                                    
    
    public void habilitarBoton(){
        if (!jtfNombreProyecto.getText().trim().isEmpty() && !jtaDescripcion.getText().trim().isEmpty()){
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            jdcFechaInicio.setDate(currentDate);
            btnCrear.setEnabled(true);    
            jrbEstadoActivo.setSelected(true);
        }        
    } 
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        java.util.Date fecha = jdcFechaInicio.getDate();
        LocalDate fechaActual = LocalDate.now();
        Proyecto proyecto = new Proyecto();
        ProyectoData pd = new ProyectoData();

        if (!jtfNombreProyecto.getText().trim().isEmpty() && !jtaDescripcion.getText().trim().isEmpty()) {
            proyecto.setNombre(jtfNombreProyecto.getText());
            proyecto.setDescripcion(jtaDescripcion.getText());
            if (fecha != null) {
                LocalDate inicio = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (inicio.isBefore(fechaActual)) {
                    JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser anterior a la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }else{
                    proyecto.setFechaInicio(inicio);
                }               
            }
            if (!jrbEstadoActivo.isSelected() && !jrbEstadoInactivo.isSelected()) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un estado para el proyecto", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (jrbEstadoActivo.isSelected()) {
                proyecto.setEstado(true);
            } else {
                proyecto.setEstado(false);
            }
            pd.crearProyecto(proyecto);
        } else {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos.");
        }
        jlIdGenerada.setText(String.valueOf(proyecto.getIdProyecto()));

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProyectoActionPerformed
        jtfNombreProyecto.setText("");
        jtaDescripcion.setText("");
        jdcFechaInicio.setDate(null);
        btngEstadoProyecto.clearSelection();
        jlIdGenerada.setText("");
        btnCrear.setEnabled(false);
    }//GEN-LAST:event_btnNuevoProyectoActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
        ModificarProyectoVista vistaModificarProyecto = new ModificarProyectoVista();
        JDesktopPane escritorio = getDesktopPane();
        escritorio.add(vistaModificarProyecto);
        vistaModificarProyecto.setVisible(true);
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jtfNombreProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreProyectoKeyTyped
        if (jtfNombreProyecto.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreProyectoKeyTyped

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyTyped
        if (jtaDescripcion.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jtaDescripcionKeyTyped

    private void jtfNombreProyectoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreProyectoKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfNombreProyectoKeyReleased

    private void jtaDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtaDescripcionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnNuevoProyecto;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngEstadoProyecto;
    private javax.swing.JPanel jPanel1;
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
