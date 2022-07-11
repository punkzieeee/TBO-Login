package netbeans.projekakhirtbo;
import java.sql.*;
import javax.swing.*;
import java.util.Random;


public class LoginForm extends javax.swing.JFrame {
    private Connect konek = new Connect();
    private String panggilnama;
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabelExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLabelPassChange = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabelExit.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setText("x");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("911 Porscha Laser", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        jLabelMin.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 519, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email         :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(23, 79, 97, 29);

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password  :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(23, 115, 97, 29);

        Email.setBackground(new java.awt.Color(232, 236, 241));
        Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(36, 37, 42));
        Email.setName(""); // NOI18N
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel2.add(Email);
        Email.setBounds(138, 71, 270, 30);

        jButton1.setBackground(new java.awt.Color(217, 30, 24));
        jButton1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CANCEL");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(309, 173, 86, 33);

        jButton2.setBackground(new java.awt.Color(38, 194, 129));
        jButton2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(191, 173, 86, 33);

        jLabelRegister.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("Klik di sini untuk membuat akun");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelRegister);
        jLabelRegister.setBounds(185, 224, 210, 20);

        jLabelPassChange.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabelPassChange.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassChange.setText("Klik di sini untuk mengubah password");
        jLabelPassChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPassChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPassChangeMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelPassChange);
        jLabelPassChange.setBounds(170, 250, 250, 18);

        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(Password);
        Password.setBounds(140, 110, 270, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netbeans/projekakhirtbo/backgroundimage.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-480, -140, 1180, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        konek.koneksiDatabase();
            try {
                String sql = "SELECT * FROM data WHERE EMAIL = '" + Email.getText() + "' AND PASSWORD = '" + Password.getText()+ "'";
                Statement st = konek.getKoneksi().createStatement();
                ResultSet rsLogin = st.executeQuery(sql);

                rsLogin.next();

                if (rsLogin.getRow()== 1){

                    JOptionPane.showMessageDialog(null, "Selamat Datang, " + rsLogin.getString("firstname"));

                    Inheritance operan = new Inheritance();
                    operan.setNama(panggilnama);
                    new LoginSuccess().setVisible(true);
                    this.dispose();

                } else {
                    Email.setText("");
                    Password.setText("");
                    Password.requestFocus();
                    JOptionPane.showMessageDialog(null, "Maaf, email/password salah!");
                }
            } catch (SQLException e) {
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        RegisterForm rgs = new RegisterForm();
        rgs.setVisible(true);
        rgs.pack();
        rgs.setLocationRelativeTo(null);
        rgs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabelPassChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPassChangeMouseClicked
        PasswordChange psc = new PasswordChange();
        psc.setVisible(true);
        psc.pack();
        psc.setLocationRelativeTo(null);
        psc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelPassChangeMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPassChange;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
