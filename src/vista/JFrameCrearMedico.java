/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Favio
 */
public class JFrameCrearMedico extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCrearMedico
     */
    public JFrameCrearMedico() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtf_CodigoMedico = new javax.swing.JTextField();
        txtf_nombres = new javax.swing.JTextField();
        txtf_Apellidos = new javax.swing.JTextField();
        txtf_aniosServicio = new javax.swing.JTextField();
        txtf_numDoc = new javax.swing.JTextField();
        txtf_nomCuenta = new javax.swing.JTextField();
        txtf_contraseña = new javax.swing.JTextField();
        txtf_especialidad = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtf_NumEsp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 18), new java.awt.Color(0, 134, 190))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Código Médico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setText("Años de Servicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setText("Número de documento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setText("Nombre de cuenta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña de cuenta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel8.setText("Especialidad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtf_CodigoMedico.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtf_CodigoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 170, -1));

        txtf_nombres.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 170, -1));

        txtf_Apellidos.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtf_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 170, -1));

        txtf_aniosServicio.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtf_aniosServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 170, -1));

        txtf_numDoc.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtf_numDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 170, -1));

        txtf_nomCuenta.setBackground(new java.awt.Color(204, 204, 204));
        txtf_nomCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_nomCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_nomCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 170, -1));

        txtf_contraseña.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 170, -1));

        txtf_especialidad.setBackground(new java.awt.Color(204, 204, 204));
        txtf_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_especialidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 170, -1));

        btn_regresar.setBackground(new java.awt.Color(0, 134, 190));
        btn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_regresar.setText("Regresar");
        btn_regresar.setBorder(null);
        btn_regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 90, 30));

        btn_crear.setBackground(new java.awt.Color(0, 134, 190));
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Crear");
        btn_crear.setBorder(null);
        btn_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 100, 30));

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setText("N° de especialidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txtf_NumEsp.setBackground(new java.awt.Color(204, 204, 204));
        txtf_NumEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtf_NumEspActionPerformed(evt);
            }
        });
        jPanel1.add(txtf_NumEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtf_nomCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_nomCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_nomCuentaActionPerformed

    private void txtf_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_especialidadActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_crearActionPerformed

    private void txtf_NumEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf_NumEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtf_NumEspActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCrearMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_crear;
    public javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtf_Apellidos;
    public javax.swing.JTextField txtf_CodigoMedico;
    public javax.swing.JTextField txtf_NumEsp;
    public javax.swing.JTextField txtf_aniosServicio;
    public javax.swing.JTextField txtf_contraseña;
    public javax.swing.JTextField txtf_especialidad;
    public javax.swing.JTextField txtf_nomCuenta;
    public javax.swing.JTextField txtf_nombres;
    public javax.swing.JTextField txtf_numDoc;
    // End of variables declaration//GEN-END:variables
}