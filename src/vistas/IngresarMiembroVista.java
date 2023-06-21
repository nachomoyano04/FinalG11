package vistas;

import controladoras.MiembroData;
import entidades.Miembro;
import static java.lang.Integer.parseInt;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOVENTAS
 */
public class IngresarMiembroVista extends javax.swing.JInternalFrame {


    public IngresarMiembroVista() {
        initComponents();
        btngEstadoMiembro.add(jrbEstadoActivo);
        btngEstadoMiembro.add(jrbEstadoInactivo);
        jbtnGuardar.setEnabled(false);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngEstadoMiembro = new javax.swing.ButtonGroup();
        jlNombreMiembro = new javax.swing.JLabel();
        jtfNombreMiembro = new javax.swing.JTextField();
        jlApellidoMiembro = new javax.swing.JLabel();
        jtfApellidoMiembro = new javax.swing.JTextField();
        jlDni = new javax.swing.JLabel();
        jtfDniMiembro = new javax.swing.JTextField();
        jlEstadoMiembro = new javax.swing.JLabel();
        jrbEstadoActivo = new javax.swing.JRadioButton();
        jrbEstadoInactivo = new javax.swing.JRadioButton();
        jlIdMiembro = new javax.swing.JLabel();
        jlIdGenerada = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();

        jlNombreMiembro.setText("NOMBRE:");

        jtfNombreMiembro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreMiembroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreMiembroKeyTyped(evt);
            }
        });

        jlApellidoMiembro.setText("APELLIDO:");

        jtfApellidoMiembro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfApellidoMiembroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoMiembroKeyTyped(evt);
            }
        });

        jlDni.setText("DNI:");

        jtfDniMiembro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDniMiembroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniMiembroKeyTyped(evt);
            }
        });

        jlEstadoMiembro.setText("ESTADO:");

        jrbEstadoActivo.setText("Miembro Activo");

        jrbEstadoInactivo.setText("Miembro Inactivo");

        jlIdMiembro.setText("NUMERO DE LEGAJO:");

        jlIdGenerada.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jlIdGenerada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnModificar.setText("MODIFICAR");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jlTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setText("Ingresar Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jlTitulo)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlTitulo)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jlIdMiembro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jlIdGenerada, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreMiembro)
                            .addComponent(jlApellidoMiembro)
                            .addComponent(jlDni)
                            .addComponent(jlEstadoMiembro))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbEstadoActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                .addComponent(jrbEstadoInactivo))
                            .addComponent(jtfNombreMiembro)
                            .addComponent(jtfApellidoMiembro)
                            .addComponent(jtfDniMiembro)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreMiembro)
                    .addComponent(jtfNombreMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoMiembro)
                    .addComponent(jtfApellidoMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtfDniMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstadoMiembro)
                    .addComponent(jrbEstadoActivo)
                    .addComponent(jrbEstadoInactivo))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdMiembro)
                    .addComponent(jlIdGenerada, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSalir)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnModificar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed


    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        Miembro miembro = new Miembro();
        MiembroData md = new MiembroData();
        
        miembro.setNombre(jtfNombreMiembro.getText());
        miembro.setApellido(jtfApellidoMiembro.getText());
        miembro.setDni(parseInt(jtfDniMiembro.getText()));
        
        if(jrbEstadoActivo.isSelected()){
                       miembro.setEstado(true);        
                   }else{
                          miembro.setEstado(false);
                       }
        if (!jtfNombreMiembro.getText().isEmpty()&& !jtfApellidoMiembro.getText().isEmpty() && !jtfDniMiembro.getText().isEmpty()){
            md.ingresarMiembro(miembro);
            jlIdGenerada.setText(String.valueOf(miembro.getIdMiembro()));
        }else{
            JOptionPane.showMessageDialog(this, "Los campos deben estar completos");
        }
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
        jtfNombreMiembro.setText("");
        jtfApellidoMiembro.setText("");
        btngEstadoMiembro.clearSelection();
        jlIdGenerada.setText("");
        jtfDniMiembro.setText("");
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
        ModificarMiembroVista vistaModificarMiembro = new ModificarMiembroVista();
        JDesktopPane escritorio = getDesktopPane();
        escritorio.add(vistaModificarMiembro);
        vistaModificarMiembro.setVisible(true);
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jtfNombreMiembroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreMiembroKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfNombreMiembroKeyReleased

    private void jtfApellidoMiembroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoMiembroKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfApellidoMiembroKeyReleased

    private void jtfDniMiembroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniMiembroKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfDniMiembroKeyReleased

    private void jtfDniMiembroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniMiembroKeyTyped
        //Validación cantidad de caracteres ingresados. Max 8 y que sean números
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros){
            evt.consume();
            }
        if (jtfDniMiembro.getText().trim().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfDniMiembroKeyTyped
 
    
    private void jtfNombreMiembroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreMiembroKeyTyped
        //Validación cantidad de caracteres ingresados. Max 30
        if (jtfNombreMiembro.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreMiembroKeyTyped

    private void jtfApellidoMiembroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoMiembroKeyTyped
        //Validación cantidad de caracteres ingresados. Max 30
        if (jtfApellidoMiembro.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfApellidoMiembroKeyTyped
    public void habilitarBoton(){
       //El boton Guardar se habilita cuando los campos nombre, Aopellido y DNi están con datos
        if (!jtfNombreMiembro.getText().trim().isEmpty() && !jtfApellidoMiembro.getText().trim().isEmpty() && !jtfDniMiembro.getText().trim().isEmpty()){
            jbtnGuardar.setEnabled(true);    
            jrbEstadoActivo.setSelected(true);
        }        
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngEstadoMiembro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlApellidoMiembro;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlEstadoMiembro;
    private javax.swing.JLabel jlIdGenerada;
    private javax.swing.JLabel jlIdMiembro;
    private javax.swing.JLabel jlNombreMiembro;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbEstadoActivo;
    private javax.swing.JRadioButton jrbEstadoInactivo;
    private javax.swing.JTextField jtfApellidoMiembro;
    private javax.swing.JTextField jtfDniMiembro;
    private javax.swing.JTextField jtfNombreMiembro;
    // End of variables declaration//GEN-END:variables
}
