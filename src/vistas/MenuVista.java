/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

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
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProyecto = new javax.swing.JMenu();
        jmiCrearProyecto = new javax.swing.JMenuItem();
        jmiModificarProyecto = new javax.swing.JMenuItem();
        jmTarea = new javax.swing.JMenu();
        jmEquipos = new javax.swing.JMenu();
        jmMiembro = new javax.swing.JMenu();

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

        jmiModificarProyecto.setText("Modificar Datos");
        jmiModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarProyectoActionPerformed(evt);
            }
        });
        jmProyecto.add(jmiModificarProyecto);

        jMenuBar1.add(jmProyecto);

        jmTarea.setText("Tarea");
        jMenuBar1.add(jmTarea);

        jmEquipos.setText("Equipos");
        jMenuBar1.add(jmEquipos);

        jmMiembro.setText("Miembro");
        jMenuBar1.add(jmMiembro);

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
        ProyectoVista vistaProyecto = new ProyectoVista();
        vistaProyecto.setVisible(true);
        escritorio.add(vistaProyecto);
        escritorio.moveToFront(vistaProyecto);
    }//GEN-LAST:event_jmiCrearProyectoActionPerformed

    private void jmiModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarProyectoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ModificarProyecto vistaProyecto = new ModificarProyecto();
        vistaProyecto.setVisible(true);
        escritorio.add(vistaProyecto);
        escritorio.moveToFront(vistaProyecto);
    }//GEN-LAST:event_jmiModificarProyectoActionPerformed

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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmEquipos;
    private javax.swing.JMenu jmMiembro;
    private javax.swing.JMenu jmProyecto;
    private javax.swing.JMenu jmTarea;
    private javax.swing.JMenuItem jmiCrearProyecto;
    private javax.swing.JMenuItem jmiModificarProyecto;
    // End of variables declaration//GEN-END:variables
}
