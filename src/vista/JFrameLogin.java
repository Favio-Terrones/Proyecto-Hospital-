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
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin2
     */
    public JFrameLogin() {
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
        IniciaSesion_label = new javax.swing.JLabel();
        usuario_label = new javax.swing.JLabel();
        contraseña_label = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        nombreEmpresa_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuarioTXF = new javax.swing.JTextField();
        contraseñaTXF = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IniciaSesion_label.setFont(new java.awt.Font("Roboto Black", 3, 36)); // NOI18N
        IniciaSesion_label.setText("Iniciar Sesión");
        jPanel1.add(IniciaSesion_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        usuario_label.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        usuario_label.setText("Usuario");
        jPanel1.add(usuario_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, -1));

        contraseña_label.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        contraseña_label.setText("Contraseña");
        jPanel1.add(contraseña_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 134, 190));
        btnIngresar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 130, 40));

        nombreEmpresa_label.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        nombreEmpresa_label.setForeground(new java.awt.Color(102, 153, 255));
        nombreEmpresa_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa_label.setText("Hospital Turing");
        jPanel1.add(nombreEmpresa_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 290));

        usuarioTXF.setBorder(null);
        jPanel1.add(usuarioTXF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 30));

        contraseñaTXF.setBorder(null);
        jPanel1.add(contraseñaTXF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 240, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 323, 240, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 243, 240, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IniciaSesion_label;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JPasswordField contraseñaTXF;
    private javax.swing.JLabel contraseña_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nombreEmpresa_label;
    public javax.swing.JTextField usuarioTXF;
    private javax.swing.JLabel usuario_label;
    // End of variables declaration//GEN-END:variables
}