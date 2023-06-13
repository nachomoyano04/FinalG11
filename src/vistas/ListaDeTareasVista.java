/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladoras.TareaData;
import javax.swing.table.DefaultTableModel;
import entidades.Tarea;
/**
 *
 * @author nacho
 */
public class ListaDeTareasVista extends javax.swing.JInternalFrame {
    private DefaultTableModel table;
    /**
     * Creates new form ListaDeTareasVista
     */
    public ListaDeTareasVista() {
        initComponents();
        table = (DefaultTableModel) tableListaDeTareas.getModel();
        for (Tarea homeWork : new TareaData().listarTareas()) {
            String estado = null;
            switch(homeWork.getEstado()){
                case 0: estado = "Pendiente";break;
                case 1: estado = "En progreso";break;
                case 2: estado = "Inactiva";break;
                case 3: estado = "Completada";break;
            }
            table.addRow(new Object[]{homeWork.getIdTarea(),homeWork.getMiembroEq().getIdMiembroEq(),homeWork.getNombre(),homeWork.getFechaCreacion(),homeWork.getFechaCierre(),estado});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaDeTareas = new javax.swing.JTable();
        btnVolverListaDeTareas = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("---------------------------------------------------------- Lista de Tareas --------------------------------------------------------------");

        tableListaDeTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idTarea", "Codigo", "Nombre", "FechaCreacion", "FechaCierre", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaDeTareas);
        if (tableListaDeTareas.getColumnModel().getColumnCount() > 0) {
            tableListaDeTareas.getColumnModel().getColumn(0).setResizable(false);
            tableListaDeTareas.getColumnModel().getColumn(1).setResizable(false);
            tableListaDeTareas.getColumnModel().getColumn(2).setResizable(false);
            tableListaDeTareas.getColumnModel().getColumn(3).setResizable(false);
            tableListaDeTareas.getColumnModel().getColumn(4).setResizable(false);
            tableListaDeTareas.getColumnModel().getColumn(5).setResizable(false);
        }

        btnVolverListaDeTareas.setText("VOLVER");
        btnVolverListaDeTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverListaDeTareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolverListaDeTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverListaDeTareas)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverListaDeTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverListaDeTareasActionPerformed
        // TODO add your handling code here:
        MenuVista.escritorio.removeAll();
        MenuVista.escritorio.repaint();
        ModificarTareaVista mtv = new ModificarTareaVista();
        mtv.setVisible(true);
        MenuVista.escritorio.add(mtv);
        mtv.moveToFront();
    }//GEN-LAST:event_btnVolverListaDeTareasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverListaDeTareas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListaDeTareas;
    // End of variables declaration//GEN-END:variables
}