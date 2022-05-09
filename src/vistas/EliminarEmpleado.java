/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raíl Lizáraga
 */
public class EliminarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form EliminarEmpleados
     */
   public EliminarEmpleado() {
        initComponents();
        LlenarTabla();
    }
 private void LlenarTabla() {
        txtID.setVisible(false);

        

       
            List<EmpleadoWS.Empleado> list = buscarTodos();
            String Info[][] = new String[list.size()][4];
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Codigo"); 
            model.addColumn("Puesto");

            for (int i = 0; i < list.size(); i++) {

                model.addRow(
                        new Object[]{list.get(i)
                                    .getIdEmpleado(),list.get(i)
                                    .getNombre(), list.get(i).getCodigoEmpleado(), list.get(i)
                            .getPuesto()}
                );

                jtableEmpleados.setModel(model);
            }
        

    }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableEmpleados = new javax.swing.JTable();
        btnElimarEmpleados = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jtableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Codigo", "Peesto"
            }
        ));
        jtableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableEmpleados);

        btnElimarEmpleados.setBackground(new java.awt.Color(0, 51, 51));
        btnElimarEmpleados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnElimarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_norm.png"))); // NOI18N
        btnElimarEmpleados.setBorder(null);
        btnElimarEmpleados.setContentAreaFilled(false);
        btnElimarEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElimarEmpleados.setFocusPainted(false);
        btnElimarEmpleados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_roll.png"))); // NOI18N
        btnElimarEmpleados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_press.png"))); // NOI18N
        btnElimarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimarEmpleadosMouseClicked(evt);
            }
        });
        btnElimarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimarEmpleadosActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel2.setText("Ingrese el id a eliminar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(635, 635, 635))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnElimarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(btnElimarEmpleados, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableEmpleadosMouseClicked

        int id = (int) jtableEmpleados.getValueAt(jtableEmpleados.getSelectedRow(), 0);

        txtID.setText(id + "");

        // TODO add your handling code here:
    }//GEN-LAST:event_jtableEmpleadosMouseClicked

    private void btnElimarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimarEmpleadosMouseClicked
        int idEmpleado = Integer.valueOf(txtID.getText());
        eliminar(idEmpleado);

        LlenarTabla();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimarEmpleadosMouseClicked

    private void btnElimarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimarEmpleadosActionPerformed
        // TODO add your handling code here:
        int idEmpleado = Integer.valueOf(txtID.getText());
        boolean resultado = eliminar(idEmpleado);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa", "Mensaje",
                JOptionPane.DEFAULT_OPTION);

        }
        LlenarTabla();
    }//GEN-LAST:event_btnElimarEmpleadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElimarEmpleados;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableEmpleados;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private static boolean eliminar(int id) {
        EmpleadoWS.EmpleadoWS_Service service = new EmpleadoWS.EmpleadoWS_Service();
        EmpleadoWS.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.eliminar(id);
    }

    private static java.util.List<EmpleadoWS.Empleado> buscarTodos() {
        EmpleadoWS.EmpleadoWS_Service service = new EmpleadoWS.EmpleadoWS_Service();
        EmpleadoWS.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.buscarTodos();
    }
}
