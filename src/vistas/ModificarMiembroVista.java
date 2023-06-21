package vistas;

import controladoras.MiembroData;
import entidades.Miembro;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOVENTAS
 */
public class ModificarMiembroVista extends javax.swing.JInternalFrame {
    
    private DefaultTableModel table;


    public ModificarMiembroVista() {
        initComponents();
        inicializarTabla();
        btngRadioB.add(jrbEstadoActivo);
        btngRadioB.add(jrbEstadoInactivo);
        btnActualizar.setEnabled(false);
        jtfDniMiembro.setEditable(false);
        jtfNombreMiembro.setEditable(false);
        jtfApellidoMiembro.setEditable(false);
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngRadioB = new javax.swing.ButtonGroup();
        jlDni = new javax.swing.JLabel();
        jtfDniMiembro = new javax.swing.JTextField();
        jlNombreMiembro = new javax.swing.JLabel();
        jtfNombreMiembro = new javax.swing.JTextField();
        jlApellidoMiembro = new javax.swing.JLabel();
        jtfApellidoMiembro = new javax.swing.JTextField();
        jlEstadoMiembro = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaMiembro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcboxEstadoMiembros = new javax.swing.JComboBox<>();
        jrbEstadoActivo = new javax.swing.JRadioButton();
        jrbEstadoInactivo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jlDni.setText("DNI:");

        jtfDniMiembro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDniMiembroKeyReleased(evt);
            }
        });

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

        jlEstadoMiembro.setText("ESTADO:");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tableListaMiembro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Legajo", "DNI", "Nombre", "Apellido", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListaMiembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaMiembroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaMiembro);
        if (tableListaMiembro.getColumnModel().getColumnCount() > 0) {
            tableListaMiembro.getColumnModel().getColumn(0).setResizable(false);
            tableListaMiembro.getColumnModel().getColumn(1).setResizable(false);
            tableListaMiembro.getColumnModel().getColumn(2).setResizable(false);
            tableListaMiembro.getColumnModel().getColumn(3).setResizable(false);
            tableListaMiembro.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setText("BUSCAR MIEMBROS:");

        jcboxEstadoMiembros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Inactivos" }));
        jcboxEstadoMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxEstadoMiembrosActionPerformed(evt);
            }
        });

        jrbEstadoActivo.setText("Activo");

        jrbEstadoInactivo.setText("Inactivo");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Modificar Datos de un Miembro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDni)
                            .addComponent(jlNombreMiembro)
                            .addComponent(jlApellidoMiembro)
                            .addComponent(jlEstadoMiembro))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfApellidoMiembro)
                            .addComponent(jtfNombreMiembro)
                            .addComponent(jtfDniMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbEstadoActivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jrbEstadoInactivo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(536, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcboxEstadoMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboxEstadoMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDniMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombreMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombreMiembro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlEstadoMiembro)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfApellidoMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlApellidoMiembro))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrbEstadoInactivo)
                                    .addComponent(jrbEstadoActivo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnActualizar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Miembro miembro = new Miembro();
        MiembroData md = new MiembroData();       
        miembro.setIdMiembro(Integer.parseInt(table.getValueAt(tableListaMiembro.getSelectedRow(), 0)+""));
        if(jtfNombreMiembro.getText().equals("")){
            JOptionPane.showMessageDialog(this,"El campo Nombre debe estar completo");
            jtfNombreMiembro.requestFocus();
        }else if(jtfNombreMiembro.getText().length() > 30){
            JOptionPane.showMessageDialog(this,"El nombre no debe superar los 30 caracteres...");
            jtfNombreMiembro.requestFocus();
        }else if(jtfApellidoMiembro.getText().equals("")){
            JOptionPane.showMessageDialog(this,"El campo Apellido debe estar completo");
            jtfApellidoMiembro.requestFocus();
        }else if(jtfApellidoMiembro.getText().length() > 30){
            JOptionPane.showMessageDialog(this,"El nombre no debe superar los 30 caracteres...");
            jtfApellidoMiembro.requestFocus();
        }else{  
            miembro.setNombre(jtfNombreMiembro.getText());
            miembro.setApellido(jtfApellidoMiembro.getText());
            miembro.setDni(parseInt(jtfDniMiembro.getText()));            
            if(jrbEstadoActivo.isSelected()){
                miembro.setEstado(true);
            }else{
                miembro.setEstado(false);
            }
            md.modificarDatosMiembro(miembro); 
            inicializarTabla();
            jtfDniMiembro.setText("");
            jtfNombreMiembro.setText("");
            jtfApellidoMiembro.setText("");
            btngRadioB.clearSelection();
            btnActualizar.setEnabled(false); 
        }        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tableListaMiembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaMiembroMouseClicked
        // TODO add your handling code here:
        int fila = tableListaMiembro.getSelectedRow();         
        jtfDniMiembro.setText(table.getValueAt(fila, 1).toString());
        jtfNombreMiembro.setText(table.getValueAt(fila, 2).toString());
        jtfApellidoMiembro.setText(table.getValueAt(fila,3).toString());
        String estado = table.getValueAt(fila, 4)+"";
        if (estado.equalsIgnoreCase("Activo")){
            jrbEstadoActivo.setSelected(true);
        }else{
            jrbEstadoInactivo.setSelected(true);
        }
        btnActualizar.setEnabled(true);
        jtfDniMiembro.setEditable(false);
        jtfNombreMiembro.setEditable(true);
        jtfApellidoMiembro.setEditable(true);

    }//GEN-LAST:event_tableListaMiembroMouseClicked
    
    public void habilitarBoton(){
        if (!jtfDniMiembro.getText().isEmpty() && !jtfNombreMiembro.getText().isEmpty() && !jtfApellidoMiembro.getText().isEmpty()){
            btnActualizar.setEnabled(true);    
        }        
    } 
    
    private void jtfDniMiembroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniMiembroKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfDniMiembroKeyReleased

    private void jtfNombreMiembroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreMiembroKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfNombreMiembroKeyReleased

    private void jtfApellidoMiembroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoMiembroKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfApellidoMiembroKeyReleased

    private void jcboxEstadoMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxEstadoMiembrosActionPerformed
        // TODO add your handling code here:
        int estados = jcboxEstadoMiembros.getSelectedIndex();
        int state;
        table.setRowCount(0);
        MiembroData md = new MiembroData();
        if(estados == 0){
            inicializarTabla();
        }else{            
            if (estados == 1){
                state = 1;
            }else{
                state = 0;
            }
            for (Miembro miembro : md.listarMiembrosPorEstado(state)) {
                boolean estadoMiembro = miembro.isEstado();
                String estado;
                if (estadoMiembro) {
                    estado = "Activo";
                } else {
                estado = "Inactivo";
                }
                table.addRow(new Object[]{miembro.getIdMiembro(), miembro.getDni(), miembro.getNombre(), miembro.getApellido(),estado});
            }
        }
        jtfDniMiembro.setText("");
        jtfNombreMiembro.setText("");
        jtfApellidoMiembro.setText("");
        btngRadioB.clearSelection();
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_jcboxEstadoMiembrosActionPerformed

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

    private void inicializarTabla() {
        table = (DefaultTableModel) tableListaMiembro.getModel(); 
        table.setRowCount(0);
        MiembroData md = new MiembroData();
        for (Miembro me : md.listarMiembros()) {
            boolean estadoMiembro = me.isEstado();
            String estado;
            if (estadoMiembro) {
                estado = "Activo";
            } else {
            estado = "Inactivo";
            }
            table.addRow(new Object[]{me.getIdMiembro(), me.getDni(), me.getNombre(), me.getApellido(),estado});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngRadioB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcboxEstadoMiembros;
    private javax.swing.JLabel jlApellidoMiembro;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlEstadoMiembro;
    private javax.swing.JLabel jlNombreMiembro;
    private javax.swing.JRadioButton jrbEstadoActivo;
    private javax.swing.JRadioButton jrbEstadoInactivo;
    private javax.swing.JTextField jtfApellidoMiembro;
    private javax.swing.JTextField jtfDniMiembro;
    private javax.swing.JTextField jtfNombreMiembro;
    private javax.swing.JTable tableListaMiembro;
    // End of variables declaration//GEN-END:variables

    
}
