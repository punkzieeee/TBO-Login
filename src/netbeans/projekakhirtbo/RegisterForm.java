package netbeans.projekakhirtbo;

import netbeans.projekakhirtbo.LoginForm;
import netbeans.projekakhirtbo.PassGen;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;


public class RegisterForm extends javax.swing.JFrame {
    
    private Connect kdb = new Connect();
    public RegisterForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonGenerate = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jTextField_LN = new javax.swing.JTextField();
        jButton_Register_ = new javax.swing.JButton();
        jTextField_Passwd = new javax.swing.JTextField();
        jLabel_ngumpet = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name :");

        jTextField3.setBackground(new java.awt.Color(232, 236, 241));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(36, 37, 42));
        jTextField3.setName(""); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        jLabel3.setText("Register");

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
                .addContainerGap(588, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email          : ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 130, 110, 29);

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password   :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 187, 105, 29);

        jTextField_Email.setBackground(new java.awt.Color(232, 236, 241));
        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Email.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_Email.setName(""); // NOI18N
        jTextField_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_EmailFocusLost(evt);
            }
        });
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Email);
        jTextField_Email.setBounds(135, 125, 190, 30);

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
        jButton1.setBounds(225, 296, 86, 33);

        jButtonGenerate.setBackground(new java.awt.Color(38, 194, 129));
        jButtonGenerate.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButtonGenerate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGenerate.setText("Generate");
        jButtonGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerateMouseClicked(evt);
            }
        });
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGenerate);
        jButtonGenerate.setBounds(330, 190, 85, 27);

        jLabelRegister.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("Klik di sini untuk login");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelRegister);
        jLabelRegister.setBounds(241, 340, 144, 24);

        jLabel2.setBackground(new java.awt.Color(236, 240, 241));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name : ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 35, 107, 29);

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name : ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 74, 107, 29);

        jTextField_FN.setBackground(new java.awt.Color(232, 236, 241));
        jTextField_FN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FN.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_FN.setName(""); // NOI18N
        jTextField_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_FN);
        jTextField_FN.setBounds(135, 27, 189, 30);

        jTextField_LN.setBackground(new java.awt.Color(232, 236, 241));
        jTextField_LN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_LN.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_LN.setName(""); // NOI18N
        jTextField_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_LN);
        jTextField_LN.setBounds(135, 73, 189, 30);

        jButton_Register_.setBackground(new java.awt.Color(38, 194, 129));
        jButton_Register_.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton_Register_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register_.setText("REGISTER");
        jButton_Register_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Register_MouseClicked(evt);
            }
        });
        jButton_Register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register_ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Register_);
        jButton_Register_.setBounds(321, 296, 86, 33);

        jTextField_Passwd.setBackground(new java.awt.Color(232, 236, 241));
        jTextField_Passwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Passwd.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_Passwd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_Passwd.setEnabled(false);
        jTextField_Passwd.setName(""); // NOI18N
        jTextField_Passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PasswdActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Passwd);
        jTextField_Passwd.setBounds(132, 186, 190, 30);

        jLabel_ngumpet.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel_ngumpet.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ngumpet.setText(" ");
        jPanel2.add(jLabel_ngumpet);
        jLabel_ngumpet.setBounds(14, 164, 460, 14);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netbeans/projekakhirtbo/backgroundimage.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(-660, -170, 1700, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField_PasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PasswdActionPerformed
        jTextField_Passwd.setVisible(true);
    }//GEN-LAST:event_jTextField_PasswdActionPerformed

    private void jButton_Register_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Register_ActionPerformed
        if(jTextField_FN.getText().equalsIgnoreCase("") || jTextField_LN.getText().equalsIgnoreCase("") || jTextField_Email.getText().equalsIgnoreCase("") || jTextField_Passwd.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Maaf, Data Belum Lengkap");
        }else if(!jTextField_FN.getText().matches("^[a-zA-Z]+$") || !jTextField_LN.getText().matches("^[a-zA-Z]+$")){
            JOptionPane.showMessageDialog(null, "Maaf, Nama Invalid");
        }else if(!jTextField_Email.getText().matches("^(.+)@(.+)$")){
            JOptionPane.showMessageDialog(null, "Maaf, Email Invalid");
        }else if(!jTextField_Passwd.getText().matches("((?=.*[a-zA-Z0-9]).{8,12})")){
            JOptionPane.showMessageDialog(null, "Maaf, Panjang Password Harus 8-12 Karakter");
        }else {
            kdb.koneksiDatabase();

            try {

                Statement state = kdb.getKoneksi().createStatement();
                state.execute("INSERT INTO data values ("
                    + "'" + jTextField_FN.getText() + "',"
                    + "'" + jTextField_LN.getText() + "',"
                    + "'" + jTextField_Email.getText() + "',"
                    + "'" + jTextField_Passwd.getText() + "')");

                JOptionPane.showMessageDialog(null, "Registrasi Berhasil");

                this.dispose();
                LoginForm lgn = new LoginForm();
                lgn.setVisible(true);
                lgn.pack();
                lgn.setLocationRelativeTo(null);
                lgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_jButton_Register_ActionPerformed

    private void jButton_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Register_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Register_MouseClicked

    private void jTextField_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNActionPerformed

    private void jTextField_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNActionPerformed

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        LoginForm lgn = new LoginForm();
        lgn.setVisible(true);
        lgn.pack();
        lgn.setLocationRelativeTo(null);
        lgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
        int length = new Random().nextInt(15) + 5;

        String password = new PassGen(length).generator(length);
        jTextField_Passwd.setText(password);
    }//GEN-LAST:event_jButtonGenerateActionPerformed

    private void jButtonGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerateMouseClicked

    }//GEN-LAST:event_jButtonGenerateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jTextField_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_EmailFocusLost
        kdb.koneksiDatabase();
        try {
            String sql = "SELECT * FROM data WHERE EMAIL = '" + jTextField_Email.getText() + "'";
            Statement st = kdb.getKoneksi().createStatement();
            ResultSet rsLogin = st.executeQuery(sql);

            rsLogin.next();
            if (rsLogin.getRow()==1){
                JOptionPane.showMessageDialog(null, "Maaf, email sudah terdaftar");

                Random r = new Random();

                jLabel_ngumpet.setText("Email disarankan: " + jTextField_Email.getText().substring(0,jTextField_Email.getText().indexOf("@")) + r.nextInt(999) + jTextField_Email.getText().substring(jTextField_Email.getText().indexOf("@")) + " " 
                        + jTextField_Email.getText().substring(0,jTextField_Email.getText().indexOf("@")) + r.nextInt(999) + jTextField_Email.getText().substring(jTextField_Email.getText().indexOf("@")) + " " + jTextField_Email.getText().substring(0,jTextField_Email.getText().indexOf("@")) + r.nextInt(999) + jTextField_Email.getText().substring(jTextField_Email.getText().indexOf("@")));
                jTextField_Email.requestFocus();
            }else{
                jLabel_ngumpet.setText("");
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jTextField_EmailFocusLost

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JButton jButton_Register_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabel_ngumpet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_Passwd;
    // End of variables declaration//GEN-END:variables
}