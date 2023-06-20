/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import com.toedter.calendar.JTextFieldDateEditor;
import controladoras.ProyectoData;
import entidades.Proyecto;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOVENTAS
 */
public class ModificarProyectoVista extends javax.swing.JInternalFrame {
    private DefaultTableModel table;

    /**
     * Creates new form ModificarProyecto
     */
    public ModificarProyectoVista() {
        initComponents();
        inicializarTabla();
        btngEstadoProyecto.add(jrbEstadoActivo);
        btngEstadoProyecto.add(jrbEstadoInactivo);
        //Se inicializan el boton Actualizar en desactivado hasta que se ingresen valores en los campos 
        btnActualizar.setEnabled(false);
        //Se descativa la edición de los campos Nombre, Descripción y Fecha. Los adots se seleccionan desde la tabla
        jtfNombreProyecto.setEditable(false);
        jtaDescripcion.setEditable(false);
        jdcFechaInicio.setEnabled(false);
        JTextFieldDateEditor textFInicio = (JTextFieldDateEditor) jdcFechaInicio.getDateEditor();
        textFInicio.setEditable(false);
        
    }
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
        jlEstadoProyecto = new javax.swing.JLabel();
        jrbEstadoActivo = new javax.swing.JRadioButton();
        jrbEstadoInactivo = new javax.swing.JRadioButton();
        jlFechaInicio = new javax.swing.JLabel();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListaProyectos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcboxEstadoProyecto = new javax.swing.JComboBox<>();

        jlTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jlTitulo.setText("Modificar datos del Proyecto");

        jlNombreProyecto.setText("NOMBRE PROYECTO:");

        jtfNombreProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreProyectoKeyTyped(evt);
            }
        });

        jlDescripcion.setText("DESCRIPCION:");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jlEstadoProyecto.setText("ESTADO DE PROYECTO:");

        jrbEstadoActivo.setText("ACTIVO");

        jrbEstadoInactivo.setText("INACTIVO");

        jlFechaInicio.setText("FECHA DE INICIO:");

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

        tableListaProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Proyecto", "Nombre", "Descripcion", "Fecha de Inicio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListaProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaProyectosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableListaProyectos);

        jLabel1.setText("BUSCAR PROYECTOS:");

        jcboxEstadoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Inactivos" }));
        jcboxEstadoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxEstadoProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlEstadoProyecto)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbEstadoActivo)
                                .addGap(75, 75, 75)
                                .addComponent(jrbEstadoInactivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDescripcion)
                            .addComponent(jlFechaInicio))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombreProyecto)
                            .addComponent(jScrollPane1)
                            .addComponent(jdcFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jlTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcboxEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlTitulo)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcboxEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombreProyecto)
                            .addComponent(jtfNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFechaInicio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbEstadoActivo)
                            .addComponent(jrbEstadoInactivo)
                            .addComponent(jlEstadoProyecto))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnSalir)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        java.util.Date fecha = jdcFechaInicio.getDate();
        LocalDate inicio = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Proyecto proyecto = new Proyecto();
        ProyectoData pd = new ProyectoData();
        proyecto.setIdProyecto(Integer.parseInt(table.getValueAt(tableListaProyectos.getSelectedRow(), 0) + ""));

        if (jtfNombreProyecto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo Nombre debe estar completo");
            jtfNombreProyecto.requestFocus();
        } else if (jtaDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo Descripcion debe estar completo");
            jtaDescripcion.requestFocus();
        } else if (fecha != null) {
            LocalDate fechaActual = LocalDate.now();
            if (inicio.isBefore(fechaActual)) {
                JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser anterior a la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            proyecto.setFechaInicio(inicio);
            jdcFechaInicio.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de inicio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jrbEstadoActivo.isSelected()) {
            proyecto.setEstado(true);
        } else {
            proyecto.setEstado(false);
        }

        pd.modificarDatosProyecto(proyecto);
        inicializarTabla();
        jtfNombreProyecto.setText("");
        jtaDescripcion.setText("");
        jdcFechaInicio.setDate(null);
        btngEstadoProyecto.clearSelection();
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tableListaProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaProyectosMouseClicked
        // TODO add your handling code here:
        int fila = tableListaProyectos.getSelectedRow();         
        jtfNombreProyecto.setText(table.getValueAt(fila, 1).toString());
        jtaDescripcion.setText(table.getValueAt(fila, 2).toString());
        jdcFechaInicio.setDate(Date.valueOf(table.getValueAt(fila, 3).toString()));
        String estado = table.getValueAt(fila, 4)+"";
        if (estado.equalsIgnoreCase("Activo")){
            jrbEstadoActivo.setSelected(true);
        }else{
            jrbEstadoInactivo.setSelected(true);
        }
        btnActualizar.setEnabled(true);
        jtfNombreProyecto.setEditable(true);
        jtaDescripcion.setEditable(true);
        jdcFechaInicio.setEnabled(true);
    }//GEN-LAST:event_tableListaProyectosMouseClicked

    private void jcboxEstadoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxEstadoProyectoActionPerformed
        // TODO add your handling code here:
        int estados = jcboxEstadoProyecto.getSelectedIndex();
        int state;
        table.setRowCount(0);
        ProyectoData pd = new ProyectoData();
        if(estados == 0){
            inicializarTabla();
        }else{            
            if (estados == 1){
                state = 1;
            }else{
                state = 0;
            }
            for (Proyecto proyecto : pd.listarProyectosPorEstado(state)) {
                boolean estadoProyecto = proyecto.isEstado();
                String estado;
                if (estadoProyecto) {
                    estado = "Activo";
                } else {
                estado = "Inactivo";
                }
                table.addRow(new Object[]{proyecto.getIdProyecto(), proyecto.getNombre(), proyecto.getDescripcion(), proyecto.getFechaInicio(), estado});
            }
        }
        jtfNombreProyecto.setText("");
        jtaDescripcion.setText("");
        jdcFechaInicio.setDate(null);
        btngEstadoProyecto.clearSelection();
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_jcboxEstadoProyectoActionPerformed

    private void jtfNombreProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreProyectoKeyTyped
        // Validadción de ingreso de cantidad de caracteres en campo Nombre
        if (jtfNombreProyecto.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreProyectoKeyTyped

    private void jtaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyTyped
        // Validadción de ingreso de cantidad de caracteres en campo Descripción
        if (jtaDescripcion.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jtaDescripcionKeyTyped
       
    private void inicializarTabla() {
        table = (DefaultTableModel) tableListaProyectos.getModel(); 
        table.setRowCount(0);
        ProyectoData pd = new ProyectoData();
        for (Proyecto pr : pd.listarProyectos()) {
            boolean estadoProyecto = pr.isEstado();
            String estado;
            if (estadoProyecto) {
                estado = "Activo";
            } else {
            estado = "Inactivo";
            }
            table.addRow(new Object[]{pr.getIdProyecto(), pr.getNombre(), pr.getDescripcion(), pr.getFechaInicio(),estado});
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngEstadoProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcboxEstadoProyecto;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlEstadoProyecto;
    private javax.swing.JLabel jlFechaInicio;
    private javax.swing.JLabel jlNombreProyecto;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JRadioButton jrbEstadoActivo;
    private javax.swing.JRadioButton jrbEstadoInactivo;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfNombreProyecto;
    private javax.swing.JTable tableListaProyectos;
    // End of variables declaration//GEN-END:variables
}
