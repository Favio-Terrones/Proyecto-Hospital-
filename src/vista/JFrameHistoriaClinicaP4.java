/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class JFrameHistoriaClinicaP4 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameHistoriaClinicap1
     */
    public JFrameHistoriaClinicaP4() {
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
        btn_Sig = new javax.swing.JButton();
        btn_Atras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtf_ImpDiag = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtf_Apreciacion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtf_Plan = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Sig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NextIcon30X31.png"))); // NOI18N
        btn_Sig.setBorder(null);
        btn_Sig.setContentAreaFilled(false);
        btn_Sig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, -1, -1));

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NextIcon30X31Alaizq.png"))); // NOI18N
        btn_Atras.setBorder(null);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Apreciación");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        txtf_ImpDiag.setColumns(5);
        txtf_ImpDiag.setRows(1);
        txtf_ImpDiag.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane8.setViewportView(txtf_ImpDiag);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 570, 70));

        txtf_Apreciacion.setColumns(5);
        txtf_Apreciacion.setRows(1);
        txtf_Apreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane23.setViewportView(txtf_Apreciacion);

        jPanel1.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 570, 70));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Impresión diagnóstica ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        txtf_Plan.setColumns(5);
        txtf_Plan.setRows(1);
        txtf_Plan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane25.setViewportView(txtf_Plan);

        jPanel1.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 570, 70));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Plan");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        btn_guardar.setBackground(new java.awt.Color(0, 134, 190));
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 630, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 685));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHistoriaClinicaP4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Atras;
    public javax.swing.JButton btn_Sig;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JTextArea txtf_Apreciacion;
    public javax.swing.JTextArea txtf_ImpDiag;
    public javax.swing.JTextArea txtf_Plan;
    // End of variables declaration//GEN-END:variables
}
