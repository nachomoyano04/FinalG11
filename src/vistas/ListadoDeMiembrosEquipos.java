package vistas;

import controladoras.EquipoData;
import controladoras.MiembroData;
import controladoras.MiembrosEquipoData;
import controladoras.TareaData;
import entidades.Equipo;
import entidades.Miembro;
import entidades.MiembrosEquipo;
import entidades.Tarea;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class ListadoDeMiembrosEquipos extends javax.swing.JInternalFrame {
    private MiembrosEquipoData med = new MiembrosEquipoData();
    private TareaData td = new TareaData();
    private DefaultTableModel table;

    public ListadoDeMiembrosEquipos() {
        initComponents();
        initTable();
        initComboBoxEquipos();
        txtRol.setEditable(false);
        btnModificar.setEnabled(false);
        btnGuardarModificacion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIncor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRol = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jtfMiembroSeleccionado = new javax.swing.JTextField();
        jcboxEquipos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnGuardarModificacion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jTableIncor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Miembro", "Nombre", "Apellido", "DNI", "Equipo", "Nombre", "Fecha creacion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableIncor.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTableIncor.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableIncor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIncorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableIncor);
        if (jTableIncor.getColumnModel().getColumnCount() > 0) {
            jTableIncor.getColumnModel().getColumn(4).setMinWidth(80);
            jTableIncor.getColumnModel().getColumn(4).setMaxWidth(80);
            jTableIncor.getColumnModel().getColumn(8).setMinWidth(60);
            jTableIncor.getColumnModel().getColumn(8).setMaxWidth(60);
        }

        txtRol.setColumns(20);
        txtRol.setRows(5);
        jScrollPane2.setViewportView(txtRol);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ROL / TAREA");

        jLabel3.setText("MIEMBRO");

        jLabel4.setText("A EQUIPO");

        btnModificar.setText("MODIFICAR INCORPORACION");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardarModificacion.setText("GUARDAR");
        btnGuardarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INCORPORACIONES DE MIEMBROS A EQUIPOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(115, 115, 115)
                .addComponent(jLabel4)
                .addGap(283, 283, 283))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(598, 598, 598)
                                .addComponent(btnSalir)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(btnGuardarModificacion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfMiembroSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcboxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMiembroSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcboxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar))
                        .addGap(29, 29, 29)
                        .addComponent(btnGuardarModificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableIncorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIncorMouseClicked
        txtRol.setText("");
        int fila = jTableIncor.getSelectedRow();
        int idMiembroEq = Integer.parseInt(table.getValueAt(fila, 0)+"");
        ArrayList<Tarea> tars = td.listarTareasPorIdMiembroEquipo(idMiembroEq);
        if(tars.isEmpty()){
            txtRol.setText("---No existen tareas aún---");
        }else{
            for (Tarea tarea : tars) {            
                txtRol.append("- "+tarea.getNombre()+"\n");
            }
        }
        jtfMiembroSeleccionado.setText(table.getValueAt(fila, 2)+"");
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_jTableIncorMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        btnGuardarModificacion.setVisible(true);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionActionPerformed
        // TODO add your handling code here:
        int fila = jTableIncor.getSelectedRow();
        MiembroData md = new MiembroData();
        Equipo eq = (Equipo) jcboxEquipos.getSelectedItem();
        Miembro me = md.buscarMiembroPorDni(Integer.parseInt(table.getValueAt(fila, 4)+""));
        med.cambiarDeEquipo(Integer.parseInt(table.getValueAt(fila, 0)+""), eq.getIdEquipo(), me.getIdMiembro());
        initTable();
        btnGuardarModificacion.setVisible(false);
        btnModificar.setEnabled(false);
        txtRol.setText("");
        jtfMiembroSeleccionado.setText("");
        jTableIncor.clearSelection();
    }//GEN-LAST:event_btnGuardarModificacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarModificacion;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableIncor;
    private javax.swing.JComboBox<Equipo> jcboxEquipos;
    private javax.swing.JTextField jtfMiembroSeleccionado;
    private javax.swing.JTextArea txtRol;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        table = (DefaultTableModel) jTableIncor.getModel();
        table.setRowCount(0);
        jTableIncor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ArrayList<MiembrosEquipo> members = med.listarTodosMiembrosEquipos();
        for (MiembrosEquipo me : members) {
            String estado;
            if(me.getEquipo().isEstado()){
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            table.addRow(new Object[]{me.getIdMiembroEq(),me.getMiembro().getIdMiembro(), me.getMiembro().getNombre(), me.getMiembro().getApellido(), me.getMiembro().getDni(),me.getEquipo().getIdEquipo(), me.getEquipo().getNombre(), me.getEquipo().getFechaCreacion(),estado});
        }
    }

    private void initComboBoxEquipos() {
        EquipoData ed = new EquipoData();
        jtfMiembroSeleccionado.setEditable(false);
        for (Equipo eq : ed.listarEquipos()) {
            jcboxEquipos.addItem(eq);
        }
    }
}
