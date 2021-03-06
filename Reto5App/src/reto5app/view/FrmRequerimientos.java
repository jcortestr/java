/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5app.view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import reto5app.Controller.ControllerRequerimientos;
import reto5app.model.vo.Requerimiento_1;
import reto5app.model.vo.Requerimiento_2;
import reto5app.model.vo.Requerimiento_3;

/**
 *
 * @author ubl
 */
public class FrmRequerimientos extends javax.swing.JFrame {

    /**
     * Creates new form FrmRequerimientos
     */
    public FrmRequerimientos() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));

        miTabla1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        miTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        miTabla1.setGridColor(new java.awt.Color(255, 0, 102));
        jScrollPane1.setViewportView(miTabla1);

        btnVolver.setBackground(new java.awt.Color(51, 0, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRequerimiento3.setBackground(new java.awt.Color(255, 255, 0));
        btnRequerimiento3.setText("Requerimiento3");
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });

        btnRequerimiento2.setBackground(new java.awt.Color(255, 255, 0));
        btnRequerimiento2.setText("Requirimiento2");
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });

        btnRequerimiento1.setBackground(new java.awt.Color(255, 255, 0));
        btnRequerimiento1.setText("Requerimiento1");
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnRequerimiento1)
                        .addGap(39, 39, 39)
                        .addComponent(btnRequerimiento2)
                        .addGap(45, 45, 45)
                        .addComponent(btnRequerimiento3)
                        .addGap(52, 52, 52)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(497, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnRequerimiento3)
                    .addComponent(btnRequerimiento2)
                    .addComponent(btnRequerimiento1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "Constructora", "Messanje", JOptionPane.INFORMATION_MESSAGE);
        String[] columnNombre = {"Fecha","Id Codigo","Nombre Proveedor","Pagado"};

        ControllerRequerimientos controlador = new ControllerRequerimientos();

        ArrayList<Requerimiento_1> listaR;

        try {
            listaR = controlador.consultaRequerimiento1();

            Object[][] datos = new Object[listaR.size()][4];

            int index = 0;
            for(Requerimiento_1 r: listaR){
                datos[index][0] = r.getFechaCompra();
                datos[index][1] = r.getCodCompra();
                datos[index][2] = r.getNombreProveedor();
                datos[index][3] = r.getPagado();
                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);

            miTabla1.setModel(model);
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        String[] columnNombre = {"Fec. Inicio","Ciudad","Constructora","Nom. Lider","Cod. Tipo","Estrato"};

        ControllerRequerimientos controlador = new ControllerRequerimientos();

        ArrayList<Requerimiento_2> listaR;

        try {
            listaR = controlador.consultaRequerimiento2();

            Object[][] datos = new Object[listaR.size()][6];

            int index = 0;
            for(Requerimiento_2 r: listaR){
                datos[index][0] = r.getFecIni();
                datos[index][1] = r.getNombreCiudad();
                datos[index][2] = r.getNomConstructora();
                datos[index][3] = r.getNombreLider();
                datos[index][4] = r.getCodigoTipo();
                datos[index][5] = r.getEstrato();

                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);

            miTabla1.setModel(model);
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento3ActionPerformed
        String[] columnNombre = {"Abrev"};

        ControllerRequerimientos controlador = new ControllerRequerimientos();

        ArrayList<Requerimiento_3> listaR;

        try {
            listaR = controlador.consultaRequerimiento3();

            Object[][] datos = new Object[listaR.size()][1];

            int index = 0;
            for(Requerimiento_3 r: listaR){
                datos[index][0] = r.getAbrev();

                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);

            miTabla1.setModel(model);
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento3ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //FrmMenu();

        new FrmMenu().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla1;
    // End of variables declaration//GEN-END:variables

    public static class setVisible {

        public setVisible(boolean b) {
            
        }
    }
}
