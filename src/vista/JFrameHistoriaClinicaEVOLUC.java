/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class JFrameHistoriaClinicaEVOLUC extends javax.swing.JFrame {

    /**
     * Creates new form JFrameHistoriaClinicap1
     */
    public JFrameHistoriaClinicaEVOLUC() {
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
        btn_Atras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtf_fecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtf_Hora = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtf_Subjet = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtf_Obj = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtf_Apreciacion = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtf_Plan = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtf_CodigoHistoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NextIcon30X31Alaizq.png"))); // NOI18N
        btn_Atras.setBorder(null);
        btn_Atras.setContentAreaFilled(false);
        btn_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EVOLUCIÓN ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Fecha: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        txtf_fecha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtf_fecha.setToolTipText("");
        jPanel1.add(txtf_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Hora: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        txtf_Hora.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtf_Hora.setToolTipText("");
        jPanel1.add(txtf_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 20));

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(191, 191, 191));
        jTextArea7.setColumns(5);
        jTextArea7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextArea7.setRows(1);
        jTextArea7.setText("           \n\n           Subjetivo");
        jTextArea7.setToolTipText("");
        jTextArea7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane7.setViewportView(jTextArea7);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 90));

        txtf_Subjet.setColumns(5);
        txtf_Subjet.setRows(1);
        txtf_Subjet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane8.setViewportView(txtf_Subjet);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 450, 90));

        txtf_Obj.setColumns(5);
        txtf_Obj.setRows(1);
        txtf_Obj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane10.setViewportView(txtf_Obj);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 450, 90));

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(191, 191, 191));
        jTextArea8.setColumns(5);
        jTextArea8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextArea8.setRows(1);
        jTextArea8.setText("           \n            \n            Objetivo");
        jTextArea8.setToolTipText("");
        jTextArea8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane9.setViewportView(jTextArea8);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 90));

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(191, 191, 191));
        jTextArea9.setColumns(5);
        jTextArea9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextArea9.setRows(1);
        jTextArea9.setText("      \n          \n           Apreciación\n");
        jTextArea9.setToolTipText("");
        jTextArea9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane11.setViewportView(jTextArea9);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 100));

        txtf_Apreciacion.setColumns(5);
        txtf_Apreciacion.setRows(1);
        txtf_Apreciacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane12.setViewportView(txtf_Apreciacion);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 450, 100));

        txtf_Plan.setColumns(5);
        txtf_Plan.setRows(1);
        txtf_Plan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane14.setViewportView(txtf_Plan);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 450, 100));

        jTextArea10.setEditable(false);
        jTextArea10.setBackground(new java.awt.Color(191, 191, 191));
        jTextArea10.setColumns(5);
        jTextArea10.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextArea10.setRows(1);
        jTextArea10.setText("           \n         \n                 Plan \n");
        jTextArea10.setToolTipText("");
        jTextArea10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane13.setViewportView(jTextArea10);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, 100));

        btn_guardar.setBackground(new java.awt.Color(0, 134, 190));
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 90, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Código de la historia: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        txtf_CodigoHistoria.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtf_CodigoHistoria.setToolTipText("");
        jPanel1.add(txtf_CodigoHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, 20));

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
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaEVOLUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaEVOLUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaEVOLUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHistoriaClinicaEVOLUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFrameHistoriaClinicaEVOLUC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Atras;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    public javax.swing.JTextArea txtf_Apreciacion;
    public javax.swing.JTextField txtf_CodigoHistoria;
    public javax.swing.JTextField txtf_Hora;
    public javax.swing.JTextArea txtf_Obj;
    public javax.swing.JTextArea txtf_Plan;
    public javax.swing.JTextArea txtf_Subjet;
    public javax.swing.JTextField txtf_fecha;
    // End of variables declaration//GEN-END:variables
}
