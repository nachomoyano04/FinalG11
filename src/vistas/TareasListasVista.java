package vistas;

import com.toedter.calendar.JTextFieldDateEditor;
import controladoras.ComentariosData;
import controladoras.MiembrosEquipoData;
import controladoras.ProyectoData;
import controladoras.TareaData;
import entidades.MiembrosEquipo;
import entidades.Proyecto;
import entidades.Comentarios;
import entidades.Tarea;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class TareasListasVista extends javax.swing.JInternalFrame {

    private DefaultTableModel table; //---DFT PARA PODER MODIFICAR EL INTERIOR DE LA TABLA DE TAREAS---
    private DefaultTableModel tableComentarios; //---DFT PARA PODER MODIFICAR EL INTERIOR DE LA TABLA DE COMENTARIOS---

    public TareasListasVista() {
        initComponents();
        initTable(); //---SE INICIALIZA LA TABLA DE TAREAS CON TODOS LOS PROYECTOS---
        initComboProyectos(); //---SE INICIALIZA EL COMBOBOX DE TODOS LOS PROYECTOS---
        //---CONFIGURAMOS LA TABLA DE LISTA DE TAREAS PARA QUE SE PUEDAN SELECCIONAR SOLO UNA FILA POR VEZ---
        tableListaDeTareas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //---SE CONFIGURAN LOS TEXT FIELD DE LAS FECHAS PARA Q NO SE PUEDAN EDITAR---
        JTextFieldDateEditor textFCreacion = (JTextFieldDateEditor) jdcFechaCreacion.getDateEditor();
        textFCreacion.setEditable(false);
        JTextFieldDateEditor textFCierre = (JTextFieldDateEditor) jdcFechaCierre.getDateEditor();
        textFCierre.setEditable(false);
        JTextFieldDateEditor textFieldFechaAvance = (JTextFieldDateEditor) jdcFechaAvanceComentarios.getDateEditor();
        textFieldFechaAvance.setEditable(false);
        //---SE INHABILITAN LOS CALENDAR BUTTON AL INICIALIZARSE EL PROGRAMA---
        jdcFechaCreacion.getCalendarButton().setEnabled(false);
        jdcFechaCierre.getCalendarButton().setEnabled(false);
        jdcFechaAvanceComentarios.getCalendarButton().setEnabled(false);
        //---OTRAS ACCIONES QUE SE INHABILITAN HASTA QUE SE SELECCIONE UNA FILA DE LA TABLA DE TAREAS---
        jcboxEstado.setEnabled(false);
        txtAreaComentario.setEditable(false);
        btnModificar.setEnabled(false);
        btnGuardarModificaciones.setVisible(false);
        btnModificarComentario.setEnabled(false);
        btnAgregarComentario.setEnabled(false);
        btnGuardarNuevoComentario.setEnabled(false);
        btnGuardarNuevoComentario.setVisible(false);
        btnGuardarModificacionDeComentario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaDeTareas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcboxPorEstado = new javax.swing.JComboBox<>();
        jcboxPorEquipos = new javax.swing.JComboBox<>();
        jcboxPorProyectos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarComentario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaComentario = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableComentariosSobreTareas = new javax.swing.JTable();
        jdcFechaAvanceComentarios = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnModificarComentario = new javax.swing.JButton();
        btnGuardarNuevoComentario = new javax.swing.JButton();
        btnGuardarModificacionDeComentario = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtfNombre = new javax.swing.JTextField();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jdcFechaCierre = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jcboxEstado = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnGuardarModificaciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        tableListaDeTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tarea", "empleado", "nombre", "fecha creacion", "fecha cierre", "estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListaDeTareas.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableListaDeTareas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableListaDeTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListaDeTareasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListaDeTareas);
        if (tableListaDeTareas.getColumnModel().getColumnCount() > 0) {
            tableListaDeTareas.getColumnModel().getColumn(0).setMinWidth(70);
            tableListaDeTareas.getColumnModel().getColumn(0).setMaxWidth(70);
            tableListaDeTareas.getColumnModel().getColumn(1).setMinWidth(70);
            tableListaDeTareas.getColumnModel().getColumn(1).setMaxWidth(70);
            tableListaDeTareas.getColumnModel().getColumn(2).setResizable(false);
            tableListaDeTareas.getColumnModel().getColumn(3).setMinWidth(100);
            tableListaDeTareas.getColumnModel().getColumn(3).setMaxWidth(100);
            tableListaDeTareas.getColumnModel().getColumn(4).setMinWidth(100);
            tableListaDeTareas.getColumnModel().getColumn(4).setMaxWidth(100);
            tableListaDeTareas.getColumnModel().getColumn(5).setMinWidth(100);
            tableListaDeTareas.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("LISTA DE TAREAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(543, 543, 543))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jcboxPorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En progreso", "Inactiva", "Completada" }));
        jcboxPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxPorEstadoActionPerformed(evt);
            }
        });

        jcboxPorEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxPorEquiposActionPerformed(evt);
            }
        });

        jcboxPorProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxPorProyectosActionPerformed(evt);
            }
        });

        jLabel9.setText("Por estado");

        jLabel10.setText("Por Miembro en Equipo");

        jLabel11.setText("Por proyectos");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        btnAgregarComentario.setText("Agregar comentario");
        btnAgregarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComentarioActionPerformed(evt);
            }
        });

        txtAreaComentario.setColumns(20);
        txtAreaComentario.setRows(5);
        jScrollPane2.setViewportView(txtAreaComentario);

        tableComentariosSobreTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "numero", "tarea", "comentario", "fechaAvance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableComentariosSobreTareas);
        if (tableComentariosSobreTareas.getColumnModel().getColumnCount() > 0) {
            tableComentariosSobreTareas.getColumnModel().getColumn(0).setMinWidth(60);
            tableComentariosSobreTareas.getColumnModel().getColumn(0).setMaxWidth(60);
            tableComentariosSobreTareas.getColumnModel().getColumn(1).setMinWidth(60);
            tableComentariosSobreTareas.getColumnModel().getColumn(1).setMaxWidth(60);
            tableComentariosSobreTareas.getColumnModel().getColumn(2).setResizable(false);
            tableComentariosSobreTareas.getColumnModel().getColumn(3).setMinWidth(100);
            tableComentariosSobreTareas.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jdcFechaAvanceComentarios.setDateFormatString("yyyy/MM/dd");

        jLabel7.setText("Fecha avance");

        btnModificarComentario.setText("Modificar Comentario");
        btnModificarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarComentarioActionPerformed(evt);
            }
        });

        btnGuardarNuevoComentario.setText("Guardar");
        btnGuardarNuevoComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoComentarioActionPerformed(evt);
            }
        });

        btnGuardarModificacionDeComentario.setText("Guardar");
        btnGuardarModificacionDeComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionDeComentarioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("SECCIÓN DE COMENTARIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAgregarComentario)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcFechaAvanceComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnGuardarNuevoComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarComentario)
                        .addGap(187, 187, 187)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarModificacionDeComentario)
                .addGap(229, 229, 229))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnAgregarComentario)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcFechaAvanceComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarNuevoComentario)
                    .addComponent(btnModificarComentario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarModificacionDeComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jtfNombre.setEditable(false);

        jdcFechaCreacion.setDateFormatString("yyyy/MM/dd");

        jdcFechaCierre.setDateFormatString("yyyy/MM/dd");

        jLabel6.setText("ESTADO");

        jcboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En progreso", "Inactiva", "Completada" }));

        btnModificar.setText("Modificar Tarea");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardarModificaciones.setText("Guardar");
        btnGuardarModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionesActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("FECHA CREACION");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("MODIFICACIONES DE TAREAS");

        jLabel4.setText("FECHA CIERRE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(126, 126, 126)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jdcFechaCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addComponent(jtfNombre)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaCierre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarModificaciones)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("doble click en las filas para habilitar acciones");

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcboxPorProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(61, 61, 61)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jcboxPorEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(122, 122, 122)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9))
                            .addComponent(jcboxPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jcboxPorProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel11)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcboxPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcboxPorEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // ---CERRAR VISTA---
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tableListaDeTareas.getSelectedRow();
        if(fila == -1){ //---CHEQUEAMOS SI HAY UNA FILA SELECCIONADA---
            JOptionPane.showMessageDialog(this,"Seleccione una fila a modificar");
        }else{ //SI HAY FILA SELECCIONADA SE HABILITAN CAMPO NOMBRE, FECHA CIERRE, COMBO ESTADO, BTN GUARDAR. Y BTN MODIFICAR SE DESHABILITA
            jtfNombre.setEditable(true);
            jdcFechaCierre.getCalendarButton().setEnabled(true);
            jcboxEstado.setEnabled(true);
            btnGuardarModificaciones.setVisible(true);
            btnModificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jcboxPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxPorEstadoActionPerformed
        TareaData td = new TareaData();
        int estado = jcboxPorEstado.getSelectedIndex(); //---SE GUARDA EL ESTADO EN UN ENTERO PARA DESPUES USAR UN SWITCH---
        table.setRowCount(0); //---LIMPIAMOS LO ANTERIOR DE LA TABLA SETEANDO A CERO EL CONTADOR DE FILAS---
        limpiarTablaComentarios();
        //---SE RECORRE LA LISTA DE TAREAS POR IDMIEMBROEQ Y ESTADO SELECCIONADO---
        for (Tarea tar : td.tareasPorMiembroEquipoyEstado(((MiembrosEquipo)jcboxPorEquipos.getSelectedItem()).getIdMiembroEq(), estado)) {
            String estado1 = null;
            switch(tar.getEstado()){
                case 0: estado1 = "Pendiente";break;
                case 1: estado1 = "En Progreso";break;
                case 2: estado1 = "Inactiva";break;
                case 3: estado1 = "Completada";break;
            }
            table.addRow(new Object[]{tar.getIdTarea(), tar.getMiembroEq().getIdMiembroEq(), tar.getNombre(), tar.getFechaCreacion(), tar.getFechaCierre(), estado1});
        }
        // ---SE LIMPIA TXTFIELD NOMBRE Y FECHAS---
        jtfNombre.setText("");
        jdcFechaCreacion.setDate(null);
        jdcFechaCierre.setDate(null);
        jdcFechaCierre.getCalendarButton().setEnabled(false);
        //---DESHABILITAMOS LOS BOTONES DE MODIFICAR TAREA, MODIFICAR COMENTARIO Y AGREGAR COMENTARIO---
        btnAgregarComentario.setEnabled(false);
        btnModificar.setEnabled(false);
        btnModificarComentario.setEnabled(false);
    }//GEN-LAST:event_jcboxPorEstadoActionPerformed

    private void jcboxPorEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxPorEquiposActionPerformed
        table.setRowCount(0);
        limpiarTablaComentarios();
        TareaData td = new TareaData();
        MiembrosEquipo me = (MiembrosEquipo) jcboxPorEquipos.getSelectedItem();
        if(me != null){ //---CHEQUEAMOS QUE NO ESTE NULO EL INDEX DEL JCOMBOBOX POR EQUIPOS---
            for (Tarea tar : td.listarTareasPorIdMiembroEquipo(me.getIdMiembroEq())) {
               String estado = null;
               switch(tar.getEstado()){
                   case 0: estado = "Pendiente";break;
                   case 1: estado = "En Progreso";break;
                   case 2: estado = "Inactiva";break;
                   case 3: estado = "Completada";break;
               }
               table.addRow(new Object[]{tar.getIdTarea(), tar.getMiembroEq().getIdMiembroEq(), tar.getNombre(), tar.getFechaCreacion(), tar.getFechaCierre(),estado});
           }
            //---LIMPIAMOS EL JTFIELD NOMBRE Y FECHAS---
           jtfNombre.setText("");
           jdcFechaCreacion.setDate(null);
           jdcFechaCierre.setDate(null);
           jdcFechaCierre.getCalendarButton().setEnabled(false);
            //---DESHABILITAMOS LOS BOTONES DE MODIFICAR TAREA, MODIFICAR COMENTARIO Y AGREGAR COMENTARIO---
           btnAgregarComentario.setEnabled(false);
           btnModificar.setEnabled(false);
           btnModificarComentario.setEnabled(false);           
        }
    }//GEN-LAST:event_jcboxPorEquiposActionPerformed

    private void jcboxPorProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxPorProyectosActionPerformed
        table.setRowCount(0);
        TareaData td = new TareaData();
        Proyecto pr = (Proyecto) jcboxPorProyectos.getSelectedItem(); 
        // ---SE RECORRE LA LISTA DE TAREAS POR ID PROYECTOS PARA LLENARSE LA TABLA---
        for (Tarea tar : td.listaTareasPorIdProyectos(pr.getIdProyecto())) {
            String estado = null;
            switch(tar.getEstado()){
                case 0: estado = "Pendiente";break;
                case 1: estado = "En Progreso";break;
                case 2: estado = "Inactiva";break;
                case 3: estado = "Completada";break;
            }
            table.addRow(new Object[]{tar.getIdTarea(), tar.getMiembroEq().getIdMiembroEq(), tar.getNombre(), tar.getFechaCreacion(), tar.getFechaCierre(), estado});
        }
        jcboxPorEquipos.removeAllItems(); //---REMOVEMOS LOS ITEMS PARA QUE NO SE VAYAN ACUMULANDO---
        initComboEquipos(pr.getIdProyecto()); //---LLENAMOS EL COMBO MIEMBROS EQUIPO CON EL ID PROYECTO QUE SE SELECCIONA---
        jtfNombre.setText("");
        jdcFechaCreacion.setDate(null);
        jdcFechaCierre.setDate(null);
        jdcFechaCierre.getCalendarButton().setEnabled(false);
        //---DESHABILITAMOS LOS BOTONES DE MODIFICAR TAREA, MODIFICAR COMENTARIO Y AGREGAR COMENTARIO---
        btnAgregarComentario.setEnabled(false);
        btnModificar.setEnabled(false);
        btnModificarComentario.setEnabled(false);
        limpiarTablaComentarios();
    }//GEN-LAST:event_jcboxPorProyectosActionPerformed

    private void tableListaDeTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListaDeTareasMouseClicked
        int fila = tableListaDeTareas.getSelectedRow(); //---SE GUARDA EL NUMERO DE FILA SELECCIONADA---
        // ---SE SETEAN LOS CAMPOS DE "MODIFICACIONES DE TAREAS" A PARTIR DEL CONTENIDO DE LA FILA SELECCIONADA---
        jtfNombre.setText(table.getValueAt(fila, 2).toString()); 
        jdcFechaCreacion.setDate(Date.valueOf(table.getValueAt(fila, 3).toString()));
        jdcFechaCierre.setDate(Date.valueOf(table.getValueAt(fila,4).toString()));
        //---SE CAPTA EL INDEX A PARTIR DEL ESTADO EN LA FILA SELECCIONADA---
        int indice;
        if(table.getValueAt(fila, 5).toString().equalsIgnoreCase("pendiente")){
            indice = 0;
        }else if(table.getValueAt(fila, 5).toString().equalsIgnoreCase("en progreso")){
            indice = 1;
        }else if(table.getValueAt(fila, 5).toString().equalsIgnoreCase("Inactiva")){
            indice = 2;
        }else{
            indice = 3;
        }
        //---SE SETEA EL INDEX DEL COMBO ESTADO---
        jcboxEstado.setSelectedIndex(indice);
        //---SE DESHABILITAN LOS JCALENDAR BUTTON DE LAS FECHAS---
        jdcFechaCierre.getCalendarButton().setEnabled(false);
        jdcFechaAvanceComentarios.getCalendarButton().setEnabled(false);
        //SE DESHABILITAN TODOS LOS BOTONES MENOS MODIFICAR Y AGREGAR COMENTARIO
        btnModificar.setEnabled(true);
        btnAgregarComentario.setEnabled(true);
        jcboxEstado.setEnabled(false);
        btnGuardarModificaciones.setVisible(false);
        jtfNombre.setEditable(false);
        txtAreaComentario.setEditable(false);
        txtAreaComentario.setText("");
        btnGuardarNuevoComentario.setVisible(false);
        btnGuardarModificacionDeComentario.setVisible(false);
        //---SE LLENA LA TABLA DE COMENTARIOS---
        llenarTablaComentarios();
    }//GEN-LAST:event_tableListaDeTareasMouseClicked

    private void btnGuardarModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionesActionPerformed
        TareaData td = new TareaData();
        //---SE CAPTA LA FILA SELECCIONADA Y EL IDTAREA E IDMIEMBROEQUIPO DE ESA FILA---
        int fila = tableListaDeTareas.getSelectedRow();
        String idTarea = (table.getValueAt(fila, 0)+"");
        String idMiembroEquipo = (table.getValueAt(fila, 1)+"");
        //---SE CHEQUEA QUE EL CAMPO NOMBRE NO ESTE VACÍO---
        if(jtfNombre.getText().equals("")){
            JOptionPane.showMessageDialog(this,"El campo nombre debe estar completo");
            jtfNombre.requestFocus();
        }else if(jtfNombre.getText().length() > 30){ //---SE CHEQUEA QUE EL CAMPO NOMBRE NO SUPERE LOS 30 CARACTERES---
            JOptionPane.showMessageDialog(this,"El nombre no debe superar los 30 caracteres...");
            jtfNombre.requestFocus();
        }else if(jdcFechaCierre.getDate() == null){ //---SE CHEQUEA QUE SE HAYA SELECCIONADO UNA FECHA DE CIERRE---
            JOptionPane.showMessageDialog(this,"El campo fecha cierre no debe estar nulo");
            jdcFechaCierre.requestFocus();
        }else{
            //---SI SE PASAN LAS ANTERIORES VALIDACIONES SE TOMAN LOS DATOS A MODIFICAR---
            String nombre = jtfNombre.getText();
            LocalDate fechaCreacion = jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaCierre = jdcFechaCierre.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if(fechaCierre.isBefore(fechaCreacion)){ //---SE CHEQUEA QUE LA FECHA DE CIERRE NO SE ANTERIOR A LA FECHA DE CREACION---
                JOptionPane.showMessageDialog(this, "La fecha de cierre no puede ser anterior a la fecha de creación...");
            }else{ 
                int estado = jcboxEstado.getSelectedIndex();
                MiembrosEquipo miembroequipo =  new MiembrosEquipoData().buscarMiembrosEquipoPorId(Integer.parseInt(idMiembroEquipo));
                Tarea tarea = new Tarea(Integer.parseInt(idTarea), miembroequipo, nombre, fechaCreacion, fechaCierre, estado);
                td.modificarTarea(tarea);
                String estau = null;
                switch(estado){
                    case 0: estau = "Pendiente";break;
                    case 1: estau = "En Progreso";break;
                    case 2: estau = "Inactiva";break;
                    case 3: estau = "Completada";break;
                }
                //---SE SETEAN LOS VALORES MODIFICADOS A LA FILA SELECCIONADA---
                table.setValueAt(nombre, fila, 2);
                table.setValueAt(fechaCreacion, fila, 3);
                table.setValueAt(fechaCierre, fila, 4);
                table.setValueAt(estau, fila, 5);
                //---SE VUELVE A ESCONDER EL BTN GUARDAR MOFICICACIONES---
                btnGuardarModificaciones.setVisible(false);
            }   
        }
    }//GEN-LAST:event_btnGuardarModificacionesActionPerformed

    private void btnAgregarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComentarioActionPerformed
        //---SE HABILITA EL TXTAREA COMENTARIO, FECHA DE AVANCE Y EL BOTON DE GUARDAR NUEVO COMENTARIO---
        txtAreaComentario.setEditable(true);
        txtAreaComentario.requestFocus();
        jdcFechaAvanceComentarios.getCalendarButton().setEnabled(true);
        btnModificarComentario.setEnabled(false); //---SE DEHABILITA EL BOTON MODIFICAR COMENTARIO---
        btnGuardarNuevoComentario.setEnabled(true);
        btnGuardarNuevoComentario.setVisible(true);
    }//GEN-LAST:event_btnAgregarComentarioActionPerformed

    private void btnModificarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarComentarioActionPerformed
        btnGuardarModificacionDeComentario.setVisible(true);//---SE MUESTRA EL BOTON GUARDAR MODIFICACION DE COMENTARIO---
        //---SE HABILITA EL TEXTAREA COMENTARIO Y JDCHOOSER DE FECHA AVANCE---
        txtAreaComentario.setEditable(true); 
        txtAreaComentario.requestFocus();
        jdcFechaAvanceComentarios.getCalendarButton().setEnabled(true);
        //---SE DESHABILITAN BOTONES MODIFICAR Y AGREGAR COMENTARIO, Y SE ESCONDE EL BOTON NUEVO COMENTARIO---
        btnModificarComentario.setEnabled(false);
        btnAgregarComentario.setEnabled(false);
        btnGuardarNuevoComentario.setEnabled(false);
        btnGuardarNuevoComentario.setVisible(false);
    }//GEN-LAST:event_btnModificarComentarioActionPerformed

    private void btnGuardarNuevoComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoComentarioActionPerformed
        ComentariosData cd = new ComentariosData();
        int fila = tableListaDeTareas.getSelectedRow();
        int idTarea = Integer.parseInt(table.getValueAt(fila, 0)+""); //---SE TOMA EL IDTAREA DE LA FILA SELECCIONADA---
        String comentario = txtAreaComentario.getText(); 
        if(comentario.equalsIgnoreCase("")){//---CHEQUEO DE COMENTARIO CON CONTENIDO---
            JOptionPane.showMessageDialog(this, "Tiene que ingresar un comentario...");
        }else if(comentario.length()>50){////---SE CHEQUEA QUE EL COMENTARIO NO PASE LOS 50 CARACTERES---
            JOptionPane.showMessageDialog(this, "El comentario no debe superar los 50 caracteres...");
            txtAreaComentario.requestFocus();
            }else{
            if(jdcFechaAvanceComentarios.getDate() == null){ //SE CHEQUEA DE QUE HAYA ELEGIDO UNA FECHA DE AVANCE
                JOptionPane.showMessageDialog(this, "Debe elegir una fecha de avance...");
            }else{
                LocalDate fechaAvance = jdcFechaAvanceComentarios.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if(fechaAvance.equals(LocalDate.now())||fechaAvance.isAfter(LocalDate.now())){ //SE CHEQUEA QUE LA FECHA DE AVANCE SEA DE HOY O DESPUES DE LA FECHA DE HOY
                    Comentarios comen = new Comentarios(new TareaData().buscarTareaXiD(idTarea), comentario, fechaAvance);
                    cd.crearComentarios(comen);
                    btnModificarComentario.setEnabled(false);
                    txtAreaComentario.setText("");
                    txtAreaComentario.setEditable(false);
                    jdcFechaAvanceComentarios.setDate(null);
                    jdcFechaAvanceComentarios.setEnabled(true);
                    btnModificarComentario.setEnabled(true);
                    btnGuardarNuevoComentario.setVisible(false);
                    tableComentarios.addRow(new Object[]{comen.getIdComentario(), comen.getTarea().getIdTarea(), comen.getComentario(), comen.getFechaAvance()});                    
                }else{
                    JOptionPane.showMessageDialog(this, "La fecha de avance no puede ser anterior a la fecha actual...");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarNuevoComentarioActionPerformed

    private void btnGuardarModificacionDeComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionDeComentarioActionPerformed
        int fila = tableComentariosSobreTareas.getSelectedRow();
        if(fila == -1){ //---SE CHEQUEA QUE HAYA UNA FILA SELECCIONADA---
            JOptionPane.showMessageDialog(this,"Seleccione un comentario a modificar");
        }else{
            ComentariosData cd = new ComentariosData();
            Comentarios comentario = new Comentarios();
            comentario.setIdComentario(Integer.parseInt(tableComentarios.getValueAt(fila, 0)+"")); //SE TOMA EL ID COMENTARIO DE LA FILA SELECCIONADA
            comentario.setTarea(new TareaData().buscarTareaXiD(Integer.parseInt(tableComentarios.getValueAt(fila, 1)+""))); //SE BUSCA LA TAREA POR ID
            if(txtAreaComentario.getText().equalsIgnoreCase("")){ //---SE CHEQUEA QUE EL COMENTARIO TENGA CONTENIDO---
                JOptionPane.showMessageDialog(this,"Ingrese un comentario");
            }else{
                comentario.setComentario(txtAreaComentario.getText());
                if(jdcFechaAvanceComentarios.getDate() == null){ //---SE CHEQUEA DE QUE HAYA ELEGIDO UNA FECHA DE AVANCE---
                    JOptionPane.showMessageDialog(this,"Ingrese una fecha de avance...");
                }else{
                    comentario.setFechaAvance(jdcFechaAvanceComentarios.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    cd.modificarComentarios(comentario);
                    tableComentarios.setValueAt(comentario.getComentario(), fila, 2);
                    tableComentarios.setValueAt(comentario.getFechaAvance(), fila, 3);
                    btnGuardarModificacionDeComentario.setVisible(false);
                    txtAreaComentario.setText("");
                    jdcFechaAvanceComentarios.setDate(null);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarModificacionDeComentarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComentario;
    private javax.swing.JButton btnGuardarModificacionDeComentario;
    private javax.swing.JButton btnGuardarModificaciones;
    private javax.swing.JButton btnGuardarNuevoComentario;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarComentario;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcboxEstado;
    private javax.swing.JComboBox<MiembrosEquipo> jcboxPorEquipos;
    private javax.swing.JComboBox<String> jcboxPorEstado;
    private javax.swing.JComboBox<Proyecto> jcboxPorProyectos;
    private com.toedter.calendar.JDateChooser jdcFechaAvanceComentarios;
    private com.toedter.calendar.JDateChooser jdcFechaCierre;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTable tableComentariosSobreTareas;
    private javax.swing.JTable tableListaDeTareas;
    private javax.swing.JTextArea txtAreaComentario;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        TareaData td = new TareaData();
        table = (DefaultTableModel) tableListaDeTareas.getModel(); //---SE LE ASIGNA LA TABLA AL TABLEMODEL---
        for (Tarea tar : td.listarTareas()) {
            String estado = null;
            switch(tar.getEstado()){
                case 0: estado = "Pendiente";break;
                case 1: estado = "En Progreso";break;
                case 2: estado = "Inactiva";break;
                case 3: estado = "Completada";break;
            }
            table.addRow(new Object[]{tar.getIdTarea(), tar.getMiembroEq().getIdMiembroEq(), tar.getNombre(), tar.getFechaCreacion(), tar.getFechaCierre(),estado});
        }
    }

    private void initComboEquipos(int idProyecto) {
        //---SE INICIALIZA EL COMBO DE MIEMBROS EQUIPOS A PARTIR DE UN PROYECTO---
        MiembrosEquipoData med = new MiembrosEquipoData();
        ArrayList<MiembrosEquipo> miembrosEq = med.listarMiembrosEquipoPorIdProyecto(idProyecto); 
        if(miembrosEq.isEmpty()){
            jcboxPorEquipos.setEnabled(false);
            jcboxPorEstado.setEnabled(false);
        }else{
            for (MiembrosEquipo me :  miembrosEq){
                jcboxPorEquipos.addItem(me);
            }
            jcboxPorEquipos.setEnabled(true);
            jcboxPorEstado.setEnabled(true);
        }

    }

    private void initComboProyectos() {
        //---SE INICIALIZA EL COMBO BOX CON LOS PROYECTOS---
        ProyectoData pd = new ProyectoData();
        for (Proyecto proyect : pd.listarProyectos()) {
            jcboxPorProyectos.addItem(proyect);
        }
    }

    private void limpiarTablaComentarios(){
        tableComentarios = (DefaultTableModel) tableComentariosSobreTareas.getModel();
        tableComentarios.setRowCount(0);
    }
    
    private void llenarTablaComentarios() {
        //---SE LLENA LA TABLA DE COMENTARIOS---
        tableComentarios = (DefaultTableModel) tableComentariosSobreTareas.getModel();
        tableComentarios.setRowCount(0);
        TareaData td = new TareaData();
        ComentariosData cd = new ComentariosData();
        int fila = tableListaDeTareas.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(fila, 0)+"");
        Tarea tarea = td.buscarTareaXiD(id);
        ArrayList<Comentarios>comentarios = cd.listarComentariosXTarea(tarea);
        for(Comentarios com : comentarios){
            tableComentarios.addRow(new Object[]{com.getIdComentario(), com.getTarea().getIdTarea(), com.getComentario(), com.getFechaAvance()});
        }
        btnModificarComentario.setEnabled(true);
    }
}
