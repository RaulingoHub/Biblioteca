/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.ImagenFondo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import configuracion.DBHelper;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public static long codigoEmpleado;
    public static int idEmpleado;
    DBHelper bd = new DBHelper();

    public Principal() {
        initComponents();
        contenido.setBorder(new ImagenFondo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        contenido = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEditarEmpleado = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnEliminarProductos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnInventario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenuItemInventario1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        contenido.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 8));

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/Venta.png"))); // NOI18N
        jMenu1.setText("Venta   ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem4.setText("Registrar venta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/icons8_shirt_30px.png"))); // NOI18N
        jMenu2.setText("Productos   ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem1.setText("Registrar Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator2);

        jMenuItemEditarEmpleado.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItemEditarEmpleado.setText("Editar Producto");
        jMenuItemEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarEmpleadoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEditarEmpleado);
        jMenu2.add(jSeparator1);

        btnEliminarProductos.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btnEliminarProductos.setText("Eliminar Productos");
        btnEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductosActionPerformed(evt);
            }
        });
        jMenu2.add(btnEliminarProductos);
        jMenu2.add(jSeparator3);

        btnInventario.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        btnInventario.setText("Codigo Producto");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jMenu2.add(btnInventario);
        jMenu2.add(jSeparator4);

        jMenuBar1.add(jMenu2);

        jMenu8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/report.png"))); // NOI18N
        jMenu8.setText("Reportes   ");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItemInventario.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItemInventario.setText("Inventario");
        jMenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventarioActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemInventario);

        jMenuItemInventario1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItemInventario1.setText("Ventas por cajero");
        jMenuItemInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventario1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemInventario1);

        jMenuBar1.add(jMenu8);

        jMenu9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono2/icons8_user_30px.png"))); // NOI18N
        jMenu9.setText("Empleados   ");
        jMenu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem2.setText("Registrar Empleado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);
        jMenu9.add(jSeparator5);

        jMenuItem6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem6.setText("Editar Empleado");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6);

        jMenuItem5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem5.setText("Eliminar Empleado");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenuItem3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem3);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {

            long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

            long codigoA = autorizacion(codigo);
            if (codigoA > 0) {

                RegistrarProductos registrar = new RegistrarProductos();
                registrar.setVisible(true);
                contenido.add(registrar);
            } else {

                JOptionPane.showMessageDialog(null, "codigo no valido",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        try {

            long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

            long codigoA = autorizacion(codigo);
            if (codigoA > 0) {

                RegistrarEmpleado registrar = new RegistrarEmpleado();
                registrar.setVisible(true);
                contenido.add(registrar);
            } else {

                JOptionPane.showMessageDialog(null, "codigo no valido",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarEmpleadoActionPerformed
        try {

            long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

            long codigoA = autorizacion(codigo);
            if (codigoA > 0) {

                EditarProductos Editar = new EditarProductos();
                Editar.setVisible(true);
                contenido.add(Editar);
            } else {

                JOptionPane.showMessageDialog(null, "codigo no valido",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItemEditarEmpleadoActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        try {

            Inventario inventario = new Inventario();
            inventario.setVisible(true);
            contenido.add(inventario);

        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RealizarVenta mostrar = new RealizarVenta();
        mostrar.setVisible(true);
        contenido.add(mostrar);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductosActionPerformed
        try {

            long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

            long codigoA = autorizacion(codigo);
            if (codigoA > 0) {

                EliminarProductos editar = new EliminarProductos();
                editar.setVisible(true);
                contenido.add(editar);
            } else {

                JOptionPane.showMessageDialog(null, "codigo no valido",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Login mostrar = new Login();
        mostrar.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked

        Login login = new Login();
        login.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {

            long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

            long codigoA = autorizacion(codigo);
            if (codigoA > 0) {

                EditarEmpleado editar = new EditarEmpleado();
                editar.setVisible(true);
                contenido.add(editar);
            } else {

                JOptionPane.showMessageDialog(null, "codigo no valido",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        try {

            EliminarEmpleado ep = new EliminarEmpleado();
            ep.setVisible(true);
            contenido.add(ep);

        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed

        try {

            if (bd.connect()) {

                File reporte = new File("src/reportes/Inventario.jasper");

                JasperPrint print = JasperFillManager.fillReport(reporte.getPath(), null, bd.getConnection());
                JasperViewer viewer = new JasperViewer(print, false);

                viewer.setName("INVENTARIO");
                viewer.setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuItemInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventario1ActionPerformed
        try {

            long codigo = Long.valueOf(JOptionPane.showInputDialog("Ingrese codigo de autorización"));

            long codigoA = autorizacion(codigo);
            if (codigoA > 0) {

                String fecha = String.valueOf(JOptionPane.showInputDialog("Ingrese la fecha, 2021-05-26"));
                bd.connect();
                File reporte = new File("src/reportes/ventaPorCajero.jasper");
                Map parametros = new HashMap();
                parametros.put("fecha", fecha);
                JasperPrint print = JasperFillManager.fillReport(reporte.getPath(), parametros, bd.getConnection());
                JasperViewer viewer = new JasperViewer(print, true);

                viewer.setName("ventas por cajero");
                viewer.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "codigo no valido",
                        "Hey!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }finally{
            bd.disconnect();
        }


    }//GEN-LAST:event_jMenuItemInventario1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEliminarProductos;
    private javax.swing.JMenuItem btnInventario;
    private javax.swing.JDesktopPane contenido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemEditarEmpleado;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenuItem jMenuItemInventario1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables

    private static Long autorizacion(long codigo) {
        EmpleadoWS.EmpleadoWS_Service service = new EmpleadoWS.EmpleadoWS_Service();
        EmpleadoWS.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.autorizacion(codigo);
    }
}
