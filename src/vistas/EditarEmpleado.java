/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Empleado;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEBASTIAN
 */
public class EditarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarEmpleado
     */
    public EditarEmpleado() {
        initComponents();
        LlenarTabla();
    }

    private void LlenarTabla() {
        txtID.setVisible(false);
        List<EmpleadoWS.Empleado> list = buscarTodos();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Codigo");
        model.addColumn("Rol");
        model.addColumn("Puesto");

        for (int i = 0; i < list.size(); i++) {

            model.addRow(
                    new Object[]{list.get(i).getIdEmpleado(), list.get(i).getNombre(),
                        list.get(i).getCodigoEmpleado(), list.get(i).getRol(), list.get(i).getPuesto()
                    }
            );

            tablaE.setModel(model);
        }

    }

    private void EditarPmpleado() {
        Empleado empleado = new Empleado();
        try {

            String nombreEmpleado = txtNombre.getText();
            long codigoEmpleado = Long.parseLong(txtCodigo.getText());
            int idEmpleado = Integer.valueOf(txtID.getText());
            String rolEmpleado = txtRol.getText();
            String puestoEmpleado = txtPuesto.getText();
            

            if (!nombreEmpleado.equals("")) {
             
               boolean result = editar(nombreEmpleado, codigoEmpleado, rolEmpleado, puestoEmpleado, idEmpleado);

                if (result) {
                    JOptionPane.showMessageDialog(null, "Empleado editado correctamente", "Mensaje",
                            JOptionPane.DEFAULT_OPTION);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al editar", "Alerta",
                            JOptionPane.WARNING_MESSAGE);
                }

            } 

        } catch (Exception e) {
            
            e.printStackTrace();

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        btnGuardarEditarProductos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rol:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puesto:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel7.setText("Editar Empleado");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("ID");

        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Codigo", "Rol", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaE);
        if (tablaE.getColumnModel().getColumnCount() > 0) {
            tablaE.getColumnModel().getColumn(0).setResizable(false);
            tablaE.getColumnModel().getColumn(1).setResizable(false);
            tablaE.getColumnModel().getColumn(2).setResizable(false);
            tablaE.getColumnModel().getColumn(3).setResizable(false);
            tablaE.getColumnModel().getColumn(4).setResizable(false);
        }

        btnGuardarEditarProductos.setBackground(new java.awt.Color(0, 51, 51));
        btnGuardarEditarProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarEditarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_norm.png"))); // NOI18N
        btnGuardarEditarProductos.setBorder(null);
        btnGuardarEditarProductos.setContentAreaFilled(false);
        btnGuardarEditarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEditarProductos.setFocusPainted(false);
        btnGuardarEditarProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_roll.png"))); // NOI18N
        btnGuardarEditarProductos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar_press.png"))); // NOI18N
        btnGuardarEditarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarEditarProductosMouseClicked(evt);
            }
        });
        btnGuardarEditarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardarEditarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarEditarProductos)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tablaEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEMouseClicked
        // TODO add your handling code here:
        int id = (int) tablaE.getValueAt(tablaE.getSelectedRow(), 0);
        String nombre = (String) tablaE.getValueAt(tablaE.getSelectedRow(), 1).toString();
        String codigo = (String) tablaE.getValueAt(tablaE.getSelectedRow(), 2).toString();
        String rol = (String) tablaE.getValueAt(tablaE.getSelectedRow(), 3).toString();
        String puesto = (String) tablaE.getValueAt(tablaE.getSelectedRow(), 4).toString();

        txtID.setText(id + "");
        txtNombre.setText(nombre);
        txtCodigo.setText(codigo + "");
        txtRol.setText(rol);
        txtPuesto.setText(puesto);
    }//GEN-LAST:event_tablaEMouseClicked

    private void btnGuardarEditarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEditarProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEditarProductosMouseClicked

    private void btnGuardarEditarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditarProductosActionPerformed
        int selec = tablaE.getSelectedRow();
        if (selec > -1) {

            EditarPmpleado();
            LlenarTabla();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEditarProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarEditarProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaE;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<EmpleadoWS.Empleado> buscarTodos() {
        EmpleadoWS.EmpleadoWS_Service service = new EmpleadoWS.EmpleadoWS_Service();
        EmpleadoWS.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.buscarTodos();
    }

    private static Boolean editar(java.lang.String nombre, long codigo, java.lang.String rol, java.lang.String puesto, int id) {
        EmpleadoWS.EmpleadoWS_Service service = new EmpleadoWS.EmpleadoWS_Service();
        EmpleadoWS.EmpleadoWS port = service.getEmpleadoWSPort();
        return port.editar(nombre, codigo, rol, puesto, id);
    }



  

   

   

  
  

   



}
