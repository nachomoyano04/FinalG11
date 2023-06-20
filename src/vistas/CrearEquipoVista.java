package vistas;

import controladoras.EquipoData;
import controladoras.ProyectoData;
import entidades.Equipo;
import entidades.Proyecto;
import java.sql.Date;
import javax.swing.JTextField;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class CrearEquipoVista extends javax.swing.JInternalFrame {
    
    private DefaultTableModel table;

    public CrearEquipoVista() {
        initComponents();
        initTableDeProyectos();
        tableDeProyectos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //---SE CONFIGURA LA TABLA PARA QUE NO SE PUEDAN SELECCIONAR MAS DE UNA FILA A LA VEZ---
        //---SE SETEA LA FECHA DE CREACION CON LA FECHA DE HOY Y SE DESHABILITA EL JDCHOOSER DE FECHA DE CREACION---
        jdcFechaCreacion.setDate(Date.valueOf(LocalDate.now()));
        jdcFechaCreacion.getCalendarButton().setEnabled(false);
        btnCrear.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jcboxEstado = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDeProyectos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("NOMBRE");

        jLabel4.setText("FECHA CREACION");

        jLabel5.setText("ESTADO");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        JTextField texto = (JTextField) jdcFechaCreacion.getComponent(1);
        texto.setEditable(false);
        jdcFechaCreacion.setDateFormatString("yyyy/MM/dd");

        jcboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear Equipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tableDeProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id proyecto", "nombre", "descripcion", "fecha inicio", "estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDeProyectos.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tableDeProyectos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tableDeProyectos);
        if (tableDeProyectos.getColumnModel().getColumnCount() > 0) {
            tableDeProyectos.getColumnModel().getColumn(0).setMinWidth(70);
            tableDeProyectos.getColumnModel().getColumn(0).setMaxWidth(70);
            tableDeProyectos.getColumnModel().getColumn(1).setResizable(false);
            tableDeProyectos.getColumnModel().getColumn(2).setResizable(false);
            tableDeProyectos.getColumnModel().getColumn(3).setMinWidth(80);
            tableDeProyectos.getColumnModel().getColumn(3).setMaxWidth(80);
            tableDeProyectos.getColumnModel().getColumn(4).setMinWidth(70);
            tableDeProyectos.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Seleccione un proyecto para asignarle al nuevo equipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnCrear)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnLimpiar)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jcboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addComponent(btnSalir)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(btnLimpiar)
                            .addComponent(btnSalir))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        int fila = tableDeProyectos.getSelectedRow();
        if(fila == -1){ //---SE CHEQUEA  QUE HAYA UN PROYECTO SELECCIONADO PARA CREAR EL EQUIPO---
            JOptionPane.showMessageDialog(this, "Seleccione un proyecto de la tabla.");
        }else{
            String id = table.getValueAt(fila, 0)+"";
            String nombre = jtfNombre.getText();
            if(!jtfNombre.getText().trim().isEmpty()){ //---SE CHEQUEA QUE EL NOMBRE DEL EQUIPO NO ESTE VACIO---
                EquipoData ed = new EquipoData();
                LocalDate fechaCreacion = jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean estado;
                estado = jcboxEstado.getSelectedIndex() == 0;
                Equipo equipo = new Equipo(new ProyectoData().buscarProyecto(Integer.parseInt(id)), nombre, fechaCreacion, estado);
                ed.crearEquipo(equipo);             
             }else{
                jtfNombre.requestFocus();
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre para el equipo.");
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //---SE CIERRA LA VENTANA---
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
            jtfNombre.setText("");
//            jdcFechaCreacion.setDate(null);
            tableDeProyectos.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        //Validación cantidad de caracteres ingresados. Max 50
        if (jtfNombre.getText().trim().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyReleased
        // TODO add your handling code here:
        habilitarBoton();
    }//GEN-LAST:event_jtfNombreKeyReleased
   public void habilitarBoton(){
        if (!jtfNombre.getText().trim().isEmpty()){
            /*Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            jdcFechaInicio.setDate(currentDate);*/
            btnCrear.setEnabled(true);    
            //jrbEstadoActivo.setSelected(true);
        }        
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcboxEstado;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTable tableDeProyectos;
    // End of variables declaration//GEN-END:variables

    private void initTableDeProyectos() {
        //---SE LLENA LA TABLA CON LOS PROYECTOS ACTIVOS---
        table = (DefaultTableModel) tableDeProyectos.getModel();
        ProyectoData pd = new ProyectoData();
        for (Proyecto pro : pd.listarProyectos()) {
            String estado = "Activo";
            table.addRow(new Object[]{pro.getIdProyecto(), pro.getNombre(), pro.getDescripcion(), pro.getFechaInicio(), estado});
        }
    }
}