package vistas;

import com.toedter.calendar.JTextFieldDateEditor;
import controladoras.EquipoData;
import controladoras.ProyectoData;
import entidades.Equipo;
import entidades.Proyecto;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class EquiposListasVista extends javax.swing.JInternalFrame {

    private EquipoData ed = new EquipoData();
    private DefaultTableModel table; //---DTM PARA PODER MODIFICAR EL INTERIOR DE LA TABLA---

    public EquiposListasVista() {
        initComponents();
        initTablaDeEquipos();
        initJComboProyectos();
        btnDarDeBajaEquipo.setEnabled(false);
        btnDarDeAltaEquipo.setEnabled(false);
        btnModificarEquipo.setEnabled(false);
        tableDeEquipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //---SE CONFIGURA LA TABLA PARA QUE SOLO SE SELECCIONE UNA FILA POR VEZ---
        //---SE DESHABILITA LA EDICIION DEL TEXT FIELD DE FECHA DE CREACION Y SE OCULTA EL BTN GUARDAR MODIFICACION---
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdcFechaCreacion.getDateEditor();
        editor.setEditable(false);
        jdcFechaCreacion.getCalendarButton().setEnabled(false);
        btnGuardarModificaciones.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        btnDarDeBajaEquipo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDeEquipos = new javax.swing.JTable();
        jcboxPorProyectos = new javax.swing.JComboBox<>();
        btnTodosLosProyectos = new javax.swing.JButton();
        jcboxPorEstado = new javax.swing.JComboBox<>();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        btnModificarEquipo = new javax.swing.JButton();
        btnDarDeAltaEquipo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardarModificaciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Creacion:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");

        jtfNombre.setEditable(false);
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jtfEstado.setEditable(false);

        btnDarDeBajaEquipo.setText("Dar de baja");
        btnDarDeBajaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeBajaEquipoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Equipos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        tableDeEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Equipo", "ID Proyecto", "nombre", "fecha creacion", "estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDeEquipos.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableDeEquipos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableDeEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDeEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDeEquipos);
        if (tableDeEquipos.getColumnModel().getColumnCount() > 0) {
            tableDeEquipos.getColumnModel().getColumn(0).setMinWidth(80);
            tableDeEquipos.getColumnModel().getColumn(0).setMaxWidth(80);
            tableDeEquipos.getColumnModel().getColumn(1).setMinWidth(80);
            tableDeEquipos.getColumnModel().getColumn(1).setMaxWidth(80);
            tableDeEquipos.getColumnModel().getColumn(2).setResizable(false);
            tableDeEquipos.getColumnModel().getColumn(3).setMinWidth(90);
            tableDeEquipos.getColumnModel().getColumn(3).setMaxWidth(90);
            tableDeEquipos.getColumnModel().getColumn(4).setMinWidth(60);
            tableDeEquipos.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jcboxPorProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxPorProyectosActionPerformed(evt);
            }
        });

        btnTodosLosProyectos.setText("TODOS");
        btnTodosLosProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosLosProyectosActionPerformed(evt);
            }
        });

        jcboxPorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inactivo", "Activo" }));
        jcboxPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxPorEstadoActionPerformed(evt);
            }
        });

        btnModificarEquipo.setText("Modificar");
        btnModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEquipoActionPerformed(evt);
            }
        });

        btnDarDeAltaEquipo.setText("Dar de alta");
        btnDarDeAltaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeAltaEquipoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Buscar solo por estado");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Buscar solo por proyectos");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Todos los equipos");

        btnGuardarModificaciones.setText("Guardar");
        btnGuardarModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Seleccionar una fila de la tabla");

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnModificarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDarDeAltaEquipo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDarDeBajaEquipo))
                                            .addComponent(btnGuardarModificaciones))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnTodosLosProyectos)))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcboxPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(243, 243, 243))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel9)
                                        .addGap(10, 10, 10))))
                            .addComponent(jcboxPorProyectos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcboxPorProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcboxPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTodosLosProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(252, 252, 252))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarEquipo)
                            .addComponent(btnDarDeAltaEquipo)
                            .addComponent(btnDarDeBajaEquipo)
                            .addComponent(btnLimpiar))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //---SE LIMPIAN IMPUTS, SELECCION DE TABLA, Y DESHABILITAN BOTONES HASTA QUE NO SELECCIONEN UNA FILA DE LA TABLA---
        jtfEstado.setText("");
//        jdcFechaCreacion.setDate(null);
        jtfNombre.setText("");
        tableDeEquipos.clearSelection();
        btnDarDeBajaEquipo.setEnabled(false);
        btnDarDeAltaEquipo.setEnabled(false);
        btnModificarEquipo.setEnabled(false);
        btnGuardarModificaciones.setVisible(false);
//        jdcFechaCreacion.getCalendarButton().setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDarDeBajaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaEquipoActionPerformed
        //---SE DA DE BAJA AL EQUIPO SETEANDOLE EL ESTADO A FALSE---
        EquipoData ed = new EquipoData();
        int fila = tableDeEquipos.getSelectedRow();
        int idEquipo = Integer.parseInt(table.getValueAt(fila, 0) + "");
        ed.darDeBajaEquipo(idEquipo);
        Equipo equi = ed.buscarEquipoPorId(idEquipo);
        String estado;
        if (equi.isEstado()) {
            estado = "Activo";
        } else {
            estado = "Inactivo";
        }
        jtfEstado.setText(estado);
        table.setValueAt(estado, fila, 4);
    }//GEN-LAST:event_btnDarDeBajaEquipoActionPerformed

    private void jcboxPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxPorEstadoActionPerformed
        //---SE LLENA LA TABLA DE EQUIPOS POR ESTADO(ACTIVO O INACTIVOS)---
        table.setRowCount(0);
        int estado = jcboxPorEstado.getSelectedIndex();
        for (Equipo team : ed.listarEquiposPorEstado(estado)) {
            String estau = null;
            if (estado == 1) {
                estau = "Activo";
            } else {
                estau = "Inactivo";
            }
            table.addRow(new Object[]{team.getIdEquipo(), team.getProyecto().getIdProyecto(), team.getNombre(), team.getFechaCreacion(), estau});
        }
    }//GEN-LAST:event_jcboxPorEstadoActionPerformed

    private void btnTodosLosProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosLosProyectosActionPerformed
        //---SE MUESTRAN TODOS LOS EQUIPOS---
        table.setRowCount(0);
        initTablaDeEquipos();
    }//GEN-LAST:event_btnTodosLosProyectosActionPerformed

    private void jcboxPorProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxPorProyectosActionPerformed
        //---SE LLENA LA TABLA CON EQUIPOS A PARTIR DE UN PROYECTO---
        table.setRowCount(0);
        Proyecto proyecto = (Proyecto) jcboxPorProyectos.getSelectedItem();
        int idProyecto = proyecto.getIdProyecto();
        for (Equipo team : ed.listarEquiposPorProyectos(idProyecto)) {
            String estado = null;
            if (team.isEstado()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            table.addRow(new Object[]{team.getIdEquipo(), team.getProyecto().getIdProyecto(), team.getNombre(), team.getFechaCreacion(), estado});
        }
    }//GEN-LAST:event_jcboxPorProyectosActionPerformed

    private void tableDeEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDeEquiposMouseClicked
        //---SE TOMAN LOS VALORES DE LA FILA SELECCIONADA Y SE SETEAN LOS CAMPOS NOMBRE, FECHADECREACION Y ESTADO---
        int fila = tableDeEquipos.getSelectedRow();
        String nombre = table.getValueAt(fila, 2) + "";
        LocalDate fechaCreacion = Date.valueOf(table.getValueAt(fila, 3) + "").toLocalDate();
        String estado = table.getValueAt(fila, 4) + "";
        jtfNombre.setText(nombre);
        jdcFechaCreacion.setDate(Date.valueOf(fechaCreacion));
        jtfEstado.setText(estado);
        btnModificarEquipo.setEnabled(true);
        btnDarDeAltaEquipo.setEnabled(true);
        btnDarDeBajaEquipo.setEnabled(true);
    }//GEN-LAST:event_tableDeEquiposMouseClicked

    private void btnModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEquipoActionPerformed
        //---SE HABILITAN BOTON PARA GUARDAR MODIFICACION Y CAMPO NOMBRE. SE DESHABILITAN BOTONES DE DAR DE ALTA, BAJA Y MODIFICAR EQUIPO---
        btnGuardarModificaciones.setVisible(true);
        btnModificarEquipo.setEnabled(false);
        btnDarDeAltaEquipo.setEnabled(false);
        btnDarDeBajaEquipo.setEnabled(false);
        jtfNombre.setEditable(true);
        jtfNombre.requestFocus();
//        jdcFechaCreacion.getCalendarButton().setEnabled(true);
    }//GEN-LAST:event_btnModificarEquipoActionPerformed

    private void btnDarDeAltaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeAltaEquipoActionPerformed
        //---SE DA DE ALTA EL EQUIPO SETEANDOLE EL ESTADO A TRUE---
        EquipoData ed = new EquipoData();
        int fila = tableDeEquipos.getSelectedRow();
        int idEquipo = Integer.parseInt(table.getValueAt(fila, 0) + "");
        ed.darDeAltaEquipo(idEquipo);
        Equipo equi = ed.buscarEquipoPorId(idEquipo);
        String estado = null;
        if (equi.isEstado()) {
            estado = "Activo";
        } else {
            estado = "Inactivo";
        }
        jtfEstado.setText(estado);
        table.setValueAt(estado, fila, 4);
    }//GEN-LAST:event_btnDarDeAltaEquipoActionPerformed

    private void btnGuardarModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionesActionPerformed
        int fila = tableDeEquipos.getSelectedRow(); //---SE GUARDA LA FILA SELECCIONADA---
        //---SE CAPTAN LOS ID'S, NOMBRE Y ESTADO A MODIFICAR---
        int idEquipo = Integer.parseInt(table.getValueAt(fila, 0) + "");
        int idProyecto = Integer.parseInt(table.getValueAt(fila, 1) + "");
        String nombre = jtfNombre.getText();
        boolean estado = jtfEstado.getText().equalsIgnoreCase("activo");
        if (nombre.equalsIgnoreCase("")) {//---SE CHEQUEA QUE EL NOMBRE NO ESTE VACIO---
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre...");
            jtfNombre.requestFocus();
        } else if (nombre.length() > 50) {//---SE CHEQUEA QUE EL NOMBRE NO SUPERE LOS 50 CARACTERES---
            JOptionPane.showMessageDialog(this, "El nombre no puede ser mayor a 50 caracteres...");
            jtfNombre.requestFocus();
//        }else if(jdcFechaCreacion.getDate() == null){
//            JOptionPane.showMessageDialog(this, "Debe ingresar una fecha de creación...");
//            jdcFechaCreacion.requestFocus();
        } else {
            //---SE MODIFICA EL EQUIPO Y SE SETEAN LOS CAMPOS DE LA FILA---
            LocalDate fechaCreacion = jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            EquipoData ed = new EquipoData();
            Equipo equipo = new Equipo(idEquipo, new ProyectoData().buscarProyecto(idProyecto), nombre, fechaCreacion, estado);
            ed.modificarEquipo(equipo);
            Equipo res = ed.buscarEquipoPorId(idEquipo);
            table.setValueAt(res.getNombre(), fila, 2);
            table.setValueAt(res.getFechaCreacion(), fila, 3);
            btnGuardarModificaciones.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarModificacionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //---SE CIERRA LA VENTANA---
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // TODO add your handling code here:
        if (jtfNombre.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarDeAltaEquipo;
    private javax.swing.JButton btnDarDeBajaEquipo;
    private javax.swing.JButton btnGuardarModificaciones;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarEquipo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodosLosProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcboxPorEstado;
    private javax.swing.JComboBox<Proyecto> jcboxPorProyectos;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTable tableDeEquipos;
    // End of variables declaration//GEN-END:variables

    private void initTablaDeEquipos() {
        //---SE INICIALIZA LA TABLA CON TODOS LOS EQUIPOS---
        table = (DefaultTableModel) tableDeEquipos.getModel();
        for (Equipo team : ed.listarEquipos()) {
            String estado = null;
            if (team.isEstado()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            table.addRow(new Object[]{team.getIdEquipo(), team.getProyecto().getIdProyecto(), team.getNombre(), team.getFechaCreacion(), estado});
        }
    }

    private void initJComboProyectos() {
        //---SE INICIALIZA EL COMBO BOX DE PROYECTOS---
        ProyectoData pd = new ProyectoData();
        for (Proyecto pro : pd.listarProyectos()) {
            jcboxPorProyectos.addItem(pro);
        }
    }
}
