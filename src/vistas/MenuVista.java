/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import javax.swing.JFrame;

/**
 *
 * @author TECNOVENTAS
 */
public class MenuVista extends javax.swing.JFrame {

    /**
     * Creates new form MenuVista
     */
    public MenuVista() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProyecto = new javax.swing.JMenu();
        jmiCrearProyecto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiModificarProyecto = new javax.swing.JMenuItem();
        jmTarea = new javax.swing.JMenu();
        modificarTareaVista = new javax.swing.JMenuItem();
        jmiAñadirTarea = new javax.swing.JMenuItem();
        jmEquipos = new javax.swing.JMenu();
        jmiCrearEquipo = new javax.swing.JMenuItem();
        jmiBuscarEquipo = new javax.swing.JMenuItem();
        jmMiembro = new javax.swing.JMenu();
        jmiIngresarMiembro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiModificarMiembro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );

        jmProyecto.setText("Proyecto");

        jmiCrearProyecto.setText("Crear proyecto");
        jmiCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearProyectoActionPerformed(evt);
            }
        });
        jmProyecto.add(jmiCrearProyecto);
        jmProyecto.add(jSeparator1);

        jmiModificarProyecto.setText("Modificar Datos");
        jmiModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarProyectoActionPerformed(evt);
            }
        });
        jmProyecto.add(jmiModificarProyecto);

        jMenuBar1.add(jmProyecto);

        jmTarea.setText("Tarea");

        modificarTareaVista.setText("Listas/Modificaciones");
        modificarTareaVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTareaVistaActionPerformed(evt);
            }
        });
        jmTarea.add(modificarTareaVista);

        jmiAñadirTarea.setText("Añadir");
        jmiAñadirTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAñadirTareaActionPerformed(evt);
            }
        });
        jmTarea.add(jmiAñadirTarea);

        jMenuBar1.add(jmTarea);

        jmEquipos.setText("Equipos");

        jmiCrearEquipo.setText("Crear Equipo");
        jmiCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearEquipoActionPerformed(evt);
            }
        });
        jmEquipos.add(jmiCrearEquipo);

        jmiBuscarEquipo.setText("Listas/Modificaciones");
        jmiBuscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarEquipoActionPerformed(evt);
            }
        });
        jmEquipos.add(jmiBuscarEquipo);

        jMenuBar1.add(jmEquipos);

        jmMiembro.setText("Miembro");

        jmiIngresarMiembro.setText("Ingresar Miembro");
        jmiIngresarMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIngresarMiembroActionPerformed(evt);
            }
        });
        jmMiembro.add(jmiIngresarMiembro);
        jmMiembro.add(jSeparator2);

        jmiModificarMiembro.setText("Modificar Datos");
        jmiModificarMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarMiembroActionPerformed(evt);
            }
        });
        jmMiembro.add(jmiModificarMiembro);

        jMenuBar1.add(jmMiembro);

        jMenu6.setText("Salir");

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuSalir);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearProyectoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CrearProyectoVista vistaProyecto = new CrearProyectoVista();
        vistaProyecto.setVisible(true);
        escritorio.add(vistaProyecto);
        escritorio.moveToFront(vistaProyecto);
    }//GEN-LAST:event_jmiCrearProyectoActionPerformed

    private void jmiModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarProyectoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ModificarProyectoVista vistaModificarProyecto = new ModificarProyectoVista();
        vistaModificarProyecto.setVisible(true);
        escritorio.add(vistaModificarProyecto);
        escritorio.moveToFront(vistaModificarProyecto);
    }//GEN-LAST:event_jmiModificarProyectoActionPerformed

    private void jmiModificarMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarMiembroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ModificarMiembroVista vistaModificarMiembro = new ModificarMiembroVista();
        vistaModificarMiembro.setVisible(true);
        escritorio.add(vistaModificarMiembro);
        escritorio.moveToFront(vistaModificarMiembro);
    }//GEN-LAST:event_jmiModificarMiembroActionPerformed

    private void jmiIngresarMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIngresarMiembroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        IngresarMiembroVista vistaIngresarMiembro = new IngresarMiembroVista();
        vistaIngresarMiembro.setVisible(true);
        escritorio.add(vistaIngresarMiembro);
        escritorio.moveToFront(vistaIngresarMiembro);
    }//GEN-LAST:event_jmiIngresarMiembroActionPerformed

    private void jmiAñadirTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAñadirTareaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AñadirTareaVista atv = new AñadirTareaVista();
        atv.setVisible(true);
        escritorio.add(atv);
        escritorio.moveToFront(atv);
    }//GEN-LAST:event_jmiAñadirTareaActionPerformed

    private void jmiCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearEquipoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CrearEquipoVista cev = new CrearEquipoVista();
        cev.setVisible(true);
        escritorio.add(cev);
        escritorio.moveToFront(cev);
    }//GEN-LAST:event_jmiCrearEquipoActionPerformed

    private void modificarTareaVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTareaVistaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        TareasListasVista mtv = new TareasListasVista();
        mtv.setVisible(true);
        escritorio.add(mtv);
        mtv.moveToFront();
    }//GEN-LAST:event_modificarTareaVistaActionPerformed

    private void jmiBuscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarEquipoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        EquiposListasVista bev = new EquiposListasVista();
        bev.setVisible(true);
        escritorio.add(bev);
        bev.moveToFront();
    }//GEN-LAST:event_jmiBuscarEquipoActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmEquipos;
    private javax.swing.JMenu jmMiembro;
    private javax.swing.JMenu jmProyecto;
    private javax.swing.JMenu jmTarea;
    public javax.swing.JMenuItem jmiAñadirTarea;
    private javax.swing.JMenuItem jmiBuscarEquipo;
    private javax.swing.JMenuItem jmiCrearEquipo;
    private javax.swing.JMenuItem jmiCrearProyecto;
    private javax.swing.JMenuItem jmiIngresarMiembro;
    private javax.swing.JMenuItem jmiModificarMiembro;
    private javax.swing.JMenuItem jmiModificarProyecto;
    private javax.swing.JMenuItem modificarTareaVista;
    // End of variables declaration//GEN-END:variables
}
