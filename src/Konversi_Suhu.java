/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Icha
 */
public class Konversi_Suhu extends javax.swing.JFrame {

    /**
     * Creates new form Konversi_Suhu
     */
    public Konversi_Suhu() {
        initComponents();
    }
    public void Reamur(){
        int Derajat_Celcius, Hasil_Konversi;
        Derajat_Celcius = Integer.parseInt(Txt_InputC.getText());
        
        Hasil_Konversi = (Derajat_Celcius * 4) /5 ;
        
        Lbl_Hasil.setText(String.valueOf(Hasil_Konversi));
    }
    public void Kelvin(){
        int Derajat_Celcius, Hasil_Konversi;
        Derajat_Celcius = Integer.parseInt(Txt_InputC.getText());
        
        Hasil_Konversi = (Derajat_Celcius * 5) /5 + 273 ;
        
        Lbl_Hasil.setText(String.valueOf(Hasil_Konversi));
    }
    public void Fahrenheit(){
        int Derajat_Celcius, Hasil_Konversi;
        Derajat_Celcius = Integer.parseInt(Txt_InputC.getText());
        
        Hasil_Konversi = (Derajat_Celcius * 9) /5 +32;
        
        Lbl_Hasil.setText(String.valueOf(Hasil_Konversi));
    }
    public void Reamur_(){
        int Derajat_Fahrenheit, Hasil_Konversi;
        Derajat_Fahrenheit = Integer.parseInt(Txt_InputF.getText());
        
        Hasil_Konversi = (Derajat_Fahrenheit - 32) * 4 /9 ;
        
        Lbl_Hasil1.setText(String.valueOf(Hasil_Konversi));
    }
     public void Kelvin_(){
        int Derajat_Fahrenheit, Hasil_Konversi;
        Derajat_Fahrenheit = Integer.parseInt(Txt_InputF.getText());
        
        Hasil_Konversi = (Derajat_Fahrenheit - 32) * 5 /9 + 273 ;
        
        Lbl_Hasil1.setText(String.valueOf(Hasil_Konversi));
    }
     public void Celcius_(){
        int Derajat_Fahrenheit, Hasil_Konversi;
        Derajat_Fahrenheit = Integer.parseInt(Txt_InputF.getText());
        
        Hasil_Konversi = (Derajat_Fahrenheit - 32) * 5 /9 ;
        
        Lbl_Hasil1.setText(String.valueOf(Hasil_Konversi));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Lbl_Hasil = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Btn_CF = new javax.swing.JButton();
        Btn_CK = new javax.swing.JButton();
        Btn_CR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Txt_InputC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Lbl_Hasil1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Btn_FC = new javax.swing.JButton();
        Btn_FK = new javax.swing.JButton();
        Btn_FR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Txt_InputF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Hapus1 = new javax.swing.JButton();
        Btn_Close = new javax.swing.JButton();
        Btn_Hapus3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("KONVERSI SUHU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        Lbl_Hasil.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Lbl_Hasil.setForeground(new java.awt.Color(0, 0, 51));
        Lbl_Hasil.setText("........");

        Btn_CF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_CF.setText("°F");
        Btn_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CFActionPerformed(evt);
            }
        });

        Btn_CK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_CK.setText("°K");
        Btn_CK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CKActionPerformed(evt);
            }
        });

        Btn_CR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_CR.setText("°R");
        Btn_CR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CRActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Input");

        Txt_InputC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_InputCActionPerformed(evt);
            }
        });
        Txt_InputC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_InputCKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("°C");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_InputC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Lbl_Hasil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_CK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CR, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_CF)
                    .addComponent(jLabel6)
                    .addComponent(Txt_InputC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_CK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_CR)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lbl_Hasil)
                        .addGap(26, 26, 26))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        Lbl_Hasil1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Lbl_Hasil1.setForeground(new java.awt.Color(0, 0, 51));
        Lbl_Hasil1.setText("........");

        Btn_FC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_FC.setText("°C");
        Btn_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FCActionPerformed(evt);
            }
        });

        Btn_FK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_FK.setText("°K");
        Btn_FK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FKActionPerformed(evt);
            }
        });

        Btn_FR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_FR.setText("°R");
        Btn_FR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FRActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Input");

        Txt_InputF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_InputFActionPerformed(evt);
            }
        });
        Txt_InputF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_InputFKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("°F");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_InputF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Lbl_Hasil1)))
                .addGap(18, 73, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_FK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_FC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_FR, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addComponent(jSeparator5)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_FC)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(Txt_InputF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_FK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(Btn_FR)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lbl_Hasil1)
                        .addGap(27, 27, 27))))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Input");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        Btn_Hapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Hapus.setForeground(new java.awt.Color(255, 51, 0));
        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 90, 30));

        Btn_Hapus1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Hapus1.setForeground(new java.awt.Color(255, 51, 0));
        Btn_Hapus1.setText("HAPUS");
        Btn_Hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Hapus1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Hapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 90, 30));

        Btn_Close.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Close.setForeground(new java.awt.Color(255, 102, 102));
        Btn_Close.setText("CLOSE");
        Btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, 20));

        Btn_Hapus3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Hapus3.setForeground(new java.awt.Color(255, 102, 102));
        Btn_Hapus3.setText("HAPUS");
        Btn_Hapus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Hapus3ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Hapus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_InputCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_InputCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_InputCActionPerformed

    private void Txt_InputCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_InputCKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Txt_InputCKeyReleased

    private void Btn_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CFActionPerformed
        // TODO add your handling code here:
        Fahrenheit();
    }//GEN-LAST:event_Btn_CFActionPerformed

    private void Btn_CKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CKActionPerformed
        // TODO add your handling code here:
        Kelvin();
    }//GEN-LAST:event_Btn_CKActionPerformed

    private void Btn_CRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CRActionPerformed
        // TODO add your handling code here:
        Reamur();
    }//GEN-LAST:event_Btn_CRActionPerformed

    private void Btn_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FCActionPerformed
        // TODO add your handling code here:
        Celcius_();
    }//GEN-LAST:event_Btn_FCActionPerformed

    private void Btn_FKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FKActionPerformed
        // TODO add your handling code here:
        Kelvin_();
    }//GEN-LAST:event_Btn_FKActionPerformed

    private void Btn_FRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FRActionPerformed
        // TODO add your handling code here:
        Reamur_();
    }//GEN-LAST:event_Btn_FRActionPerformed

    private void Txt_InputFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_InputFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_InputFActionPerformed

    private void Txt_InputFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_InputFKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_InputFKeyReleased

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_Hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Hapus1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Btn_Hapus1ActionPerformed

    private void Btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CloseActionPerformed
        // TODO add your handling code here:
        int Jawab = javax.swing.JOptionPane.showConfirmDialog(null, "Yakin akan keluar?", "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
        if (Jawab==0)this.dispose();
    }//GEN-LAST:event_Btn_CloseActionPerformed

    private void Btn_Hapus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Hapus3ActionPerformed
        // TODO add your handling code here:
        Txt_InputC.setText("");
        Txt_InputF.setText("");
        Lbl_Hasil.setText("..........");
        Lbl_Hasil1.setText("..........");
        Txt_InputC.requestFocus();
    }//GEN-LAST:event_Btn_Hapus3ActionPerformed

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
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konversi_Suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CF;
    private javax.swing.JButton Btn_CK;
    private javax.swing.JButton Btn_CR;
    private javax.swing.JButton Btn_Close;
    private javax.swing.JButton Btn_FC;
    private javax.swing.JButton Btn_FK;
    private javax.swing.JButton Btn_FR;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Hapus1;
    private javax.swing.JButton Btn_Hapus3;
    private javax.swing.JLabel Lbl_Hasil;
    private javax.swing.JLabel Lbl_Hasil1;
    private javax.swing.JTextField Txt_InputC;
    private javax.swing.JTextField Txt_InputF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
