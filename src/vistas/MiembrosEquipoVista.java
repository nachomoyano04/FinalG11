package vistas;

import com.toedter.calendar.JTextFieldDateEditor;
import controladoras.EquipoData;
import controladoras.MiembroData;
import controladoras.MiembrosEquipoData;
import controladoras.TareaData;
import entidades.Equipo;
import entidades.Miembro;
import entidades.MiembrosEquipo;
import entidades.Proyecto;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isma
 */
public class MiembrosEquipoVista extends javax.swing.JInternalFrame {

    private EquipoData ed = new EquipoData();
    private MiembroData md = new MiembroData();
    private MiembrosEquipoData med = new MiembrosEquipoData();
    private TareaData td = new TareaData();
    private DefaultTableModel miembrosTableModel;
    private DefaultTableModel equiposTableModel;
   

    public MiembrosEquipoVista() {
        initComponents();
        listarTablaEquipos();
        listarTablaMiembros();
        JTextFieldDateEditor tfFecha = (JTextFieldDateEditor) jdcFechaIncorporacion.getDateEditor();
        tfFecha.setEditable(false);
        btnAsignar.setEnabled(false);
        jdcFechaIncorporacion.setDate(Date.valueOf(LocalDate.now()));
    }

    private void listarTablaEquipos() {
        equiposTableModel = (DefaultTableModel) jtEquipos.getModel();
        equiposTableModel.setRowCount(0);
        for (Equipo eq : ed.listarEquipos()) {
            String estado;
            if(eq.isEstado()){
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            equiposTableModel.addRow(new Object[]{
                eq.getProyecto(), eq.getNombre(), eq.getFechaCreacion(), estado
            });
        }
    }

    private void listarTablaMiembros() {
        miembrosTableModel = (DefaultTableModel) jtMiembros.getModel();
        miembrosTableModel.setRowCount(0);

        List<Miembro> miembros = md.listarMiembros();

        for (Miembro miembro : miembros) {
            String estado;
            if(miembro.isEstado()){
                estado = "Activo";
            }else{
                estado = "Inactivo";
            }
            miembrosTableModel.addRow(new Object[]{
                miembro.getNombre(),
                miembro.getApellido(),
                miembro.getDni(),
                estado
            });
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEquipos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMiembros = new javax.swing.JTable();
        btnAsignar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaIncorporacion = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setPreferredSize(new java.awt.Dimension(1000, 550));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jtEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROYECTO", "NOMBRE", "FECHA CREACION", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEquipos);
        if (jtEquipos.getColumnModel().getColumnCount() > 0) {
            jtEquipos.getColumnModel().getColumn(0).setResizable(false);
            jtEquipos.getColumnModel().getColumn(1).setResizable(false);
            jtEquipos.getColumnModel().getColumn(2).setResizable(false);
            jtEquipos.getColumnModel().getColumn(3).setResizable(false);
        }

        jtMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "DNI", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMiembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMiembrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtMiembros);

        btnAsignar.setText("ASIGNAR");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("LISTA DE MIEMBROS");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("LISTA DE EQUIPOS");

        jdcFechaIncorporacion.setDateFormatString("yyyy/MM/dd");
        jdcFechaIncorporacion.setDoubleBuffered(false);

        jLabel4.setText("FECHA DE INCORPORACION");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INCORPORACION DE UN MIEMBRO A UN EQUIPO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(386, 386, 386))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jdcFechaIncorporacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(209, 209, 209))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAsignar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    private void activarBoton(){
            //Activar boton Asignar cuando se han seleccionado filas de Lista de Miembros y Lista de equipos
        if (jtMiembros.getSelectedRow()>=0 && jtEquipos.getSelectedRow()>=0){
            btnAsignar.setEnabled(true);
        }
    }
    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        int fila = jtMiembros.getSelectedRow();
        int filaEquipo = jtEquipos.getSelectedRow();
        LocalDate fechaIncorporacion = jdcFechaIncorporacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        MiembrosEquipo miembrosEquipo = new MiembrosEquipo();
        Proyecto pro  = (Proyecto) equiposTableModel.getValueAt(filaEquipo, 0);
        Miembro miembro = md.buscarMiembroPorDni(Integer.parseInt(miembrosTableModel.getValueAt(fila, 2)+""));
        Equipo equipo = ed.buscarEquipoPorProyecto(pro.getIdProyecto());
        miembrosEquipo.setMiembro(miembro);
        miembrosEquipo.setEquipo(equipo);
        miembrosEquipo.setFechaIncorporacion(fechaIncorporacion);
        med.crearMiembrosEquipo(miembrosEquipo);
        btnAsignar.setEnabled(false);
        jtEquipos.clearSelection();
        jtMiembros.clearSelection();
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void jtMiembrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMiembrosMouseClicked
        // TODO add your handling code here:
        activarBoton();
    }//GEN-LAST:event_jtMiembrosMouseClicked

    private void jtEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEquiposMouseClicked
        // TODO add your handling code here:
        activarBoton();
    }//GEN-LAST:event_jtEquiposMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcFechaIncorporacion;
    private javax.swing.JTable jtEquipos;
    private javax.swing.JTable jtMiembros;
    // End of variables declaration//GEN-END:variables
}
