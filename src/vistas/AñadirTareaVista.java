package vistas;

    import controladoras.EquipoData;
    import controladoras.MiembrosEquipoData;
    import controladoras.TareaData;
    import entidades.Equipo;
    import javax.swing.JTextField;
    import entidades.Tarea;
    import entidades.MiembrosEquipo;
    import java.sql.Date;
    import java.time.LocalDate;
    import java.time.ZoneId;
    import javax.swing.JOptionPane;
    import javax.swing.ListSelectionModel;
    import javax.swing.table.DefaultTableModel;

 /*
 *
 * @author nacho
 */
public class AñadirTareaVista extends javax.swing.JInternalFrame {

    private DefaultTableModel table;
    private TareaData td = new TareaData();
    private MiembrosEquipoData med = new MiembrosEquipoData();

    public AñadirTareaVista() {
        initComponents();
        initComboBoxEquipo();
        //---ESTO ES PARA QUE LA FECHA DE CREACION NO SE PUEDA MODIFICAR---
        jdcFechaCreacion.setDate(Date.valueOf(LocalDate.now()));
        jdcFechaCreacion.getCalendarButton().setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jdcFechaCierre = new com.toedter.calendar.JDateChooser();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jcboxEstado = new javax.swing.JComboBox<>();
        btnAñadirTarea = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMiembrosEquipos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jcboxEquipos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("NOMBRE");

        jLabel4.setText("Fecha de creacion");

        jLabel5.setText("Fecha de cierre");

        jLabel6.setText("Estado");

        JTextField texto1 = (JTextField) jdcFechaCierre.getComponent(1);
        texto1.setEditable(false);
        jdcFechaCierre.setDateFormatString("yyyy/MM/dd");

        JTextField texto = (JTextField) jdcFechaCreacion.getComponent(1);
        texto.setEditable(false);
        jdcFechaCreacion.setDateFormatString("yyyy/MM/dd");

        jcboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En progreso", "Inactiva", "Completada" }));

        btnAñadirTarea.setText("Añadir");
        btnAñadirTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirTareaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tableMiembrosEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Empleado", "Equipo", "Fecha Incorporacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMiembrosEquipos.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableMiembrosEquipos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tableMiembrosEquipos);
        if (tableMiembrosEquipos.getColumnModel().getColumnCount() > 0) {
            tableMiembrosEquipos.getColumnModel().getColumn(0).setResizable(false);
            tableMiembrosEquipos.getColumnModel().getColumn(1).setResizable(false);
            tableMiembrosEquipos.getColumnModel().getColumn(2).setResizable(false);
            tableMiembrosEquipos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Elegir miembro de algún equipo");

        jcboxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxEquiposActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("AÑADIR TAREAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(444, 444, 444))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAñadirTarea)
                        .addGap(33, 33, 33)
                        .addComponent(btnSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46))))
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(77, 77, 77)
                        .addComponent(jcboxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcboxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombre)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFechaCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAñadirTarea)
                            .addComponent(btnSalir))))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirTareaActionPerformed
        int filaSeleccionada = tableMiembrosEquipos.getSelectedRow();
        //---SE CHEQUEA QUE HAYA UNA FILA SELECIONADA---
        if(filaSeleccionada >= 0){
            String codigo = table.getValueAt(tableMiembrosEquipos.getSelectedRow(), 0)+"";
            int estado = jcboxEstado.getSelectedIndex();
            String nombre = jtfNombre.getText();
            MiembrosEquipo miembroEquipo = med.buscarMiembrosEquipoPorId(Integer.parseInt(codigo));
            if(nombre.equals("")){ //---SE CHEQUEA QUE EL NOMBRE DE LA TAREA NO ESTE VACIO---
                JOptionPane.showMessageDialog(this, "Campo nombre obligatorio");
                jtfNombre.requestFocus();
            }else if(nombre.length()>30){ //---SE CHEQUEA QUE EL NOMBRE DE LA TAREA NO PASE LOS 30 CARACTERES---
                JOptionPane.showMessageDialog(this, "El nombre no puede superar los 30 caracteres...");
                jtfNombre.requestFocus();
            }else if(jdcFechaCierre.getDate() == null){ //---SE CHEQUEA QUE SE HAYA ELEGIDO UNA FECHA DE CIERRE DE LA TAREA---
                JOptionPane.showMessageDialog(this,"Ingrese fecha de cierre");
                jdcFechaCierre.requestFocus();
            }else{
                LocalDate fechaCierre = jdcFechaCierre.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if((fechaCierre.isBefore(LocalDate.now()))){ //---SE CHEQUEA QUE LA FECHA DE CIERRE NO SEA ANTERIOR A LA FECHA DE HOY---
                    JOptionPane.showMessageDialog(this,"La fecha de cierre no puede ser anterior a la fecha de hoy: "+LocalDate.now());
                    jdcFechaCierre.requestFocus();
                }else{
                    Tarea tarea = new Tarea(miembroEquipo, nombre, LocalDate.now(), fechaCierre, estado);
                    td.asignarTareas(tarea); //---SE ASIGNA LA TAREA AL MIEMBRO DEL EQUIPO SELECCIONADO---
                    limpiar(); //---SE LIMPIAN LOS CAMPOS Y SELECCIONES---
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione una fila de la tabla...");
        }
    }//GEN-LAST:event_btnAñadirTareaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //---SE CIERRA LA VENTANA---
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jcboxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxEquiposActionPerformed
        //---A PARTIR DEL EQUIPO SELECCIONADO SE LLENA LA TABLA, PERO ANTES SE CONFIGURA PARA QUE NO SE PUEDA SELECCIONAR MAS DE UNA FILA A LA VEZ---
        tableMiembrosEquipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table = (DefaultTableModel) tableMiembrosEquipos.getModel();
        table.setRowCount(0);
        int idEquipo = ((Equipo) jcboxEquipos.getSelectedItem()).getIdEquipo();
        for (MiembrosEquipo me : med.listarMiembrosEquipos(idEquipo)) {
            table.addRow(new Object[]{me.getIdMiembroEq(),me.getMiembro().getNombre(),me.getEquipo().getNombre(),me.getFechaIncorporacion()});
        }
    }//GEN-LAST:event_jcboxEquiposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirTarea;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Equipo> jcboxEquipos;
    private javax.swing.JComboBox<String> jcboxEstado;
    private com.toedter.calendar.JDateChooser jdcFechaCierre;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTable tableMiembrosEquipos;
    // End of variables declaration//GEN-END:variables

    private void initComboBoxEquipo(){
        //---SE LLENA EL COMBO BOX DE EQUIPOS---
        EquipoData ed = new EquipoData();
        for (Equipo team : ed.listarEquipos()) {
            jcboxEquipos.addItem(team);
        }
    }
    private void limpiar(){
        //---SE LIMPIA LA TABLA Y CAMPOS NOMBRE Y FECHA DE CIERRE---
        table.setRowCount(0);
        jtfNombre.setText("");
        jdcFechaCierre.setDate(null);
    }
}
