/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarthak
 */
public class CurrencyConvert extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyConvert
     */
    public CurrencyConvert() {
        initComponents();
        this.setLocationRelativeTo(null);
        //CurDateTime();
    }
    /*public void CurDateTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        //jTextArea1.setText("\t"+dtf.format(now));
                
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jConvertButton = new javax.swing.JButton();
        ResetButtom = new javax.swing.JButton();
        ExitButtom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCurrencyLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 204)));

        jComboBox1.setBackground(new java.awt.Color(255, 153, 51));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "Nepal", "USA", "India", "Australia", "UK", "", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jConvertButton.setBackground(new java.awt.Color(204, 255, 102));
        jConvertButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jConvertButton.setText("CONVERT");
        jConvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConvertButtonActionPerformed(evt);
            }
        });

        ResetButtom.setBackground(new java.awt.Color(51, 102, 255));
        ResetButtom.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ResetButtom.setText("RESET");
        ResetButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtomActionPerformed(evt);
            }
        });

        ExitButtom.setBackground(new java.awt.Color(255, 0, 51));
        ExitButtom.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ExitButtom.setText("EXIT");
        ExitButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtomActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCurrencyLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCurrencyLabel.setText("CURRENCY RATE");

        jTextField1.setBackground(new java.awt.Color(204, 153, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter  Currency :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jConvertButton)
                        .addGap(110, 110, 110)
                        .addComponent(ResetButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jCurrencyLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCurrencyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConvertButton)
                    .addComponent(ResetButtom)
                    .addComponent(ExitButtom))
                .addGap(31, 31, 31))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("CURRENCY CONVERTER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtomActionPerformed
      System.exit(0);
    }//GEN-LAST:event_ExitButtomActionPerformed

    private void jConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConvertButtonActionPerformed
       if(jTextField1.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "Please Enter Currency !","DST System",JOptionPane.INFORMATION_MESSAGE);
       }
       double currency  = Double.parseDouble(jTextField1.getText());
       double cur;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
       if(jComboBox1.getSelectedItem().equals("Nepal"))
       {   
           double jcur,acur,ucur,icur,dcur,rcur,Ccur,ecurr;
           cur = currency*117.18;
           jcur = currency*1.10;
           acur = currency*85.23;
           ucur = currency*155.59;
           icur = currency*1.60;
           dcur = currency*33.32;
           rcur = currency*1.56;
           Ccur = currency*89.27;
           ecurr = currency*138.82;
           String Evalue =  String.format("%.4f",ecurr);
           String Cvalue =  String.format("%.4f",Ccur);
           String Rvalue =  String.format("%.4f",rcur);
           String Dvalue =  String.format("%.4f",dcur);
           String Ivalue =  String.format("%.4f",icur);
           String Uvalue =  String.format("%.4f",ucur);
           String jvalue =  String.format("%.4f",jcur);
           String Avalue =  String.format("%.4f",acur);
           String value = String.format("%.5f", cur);
           jTextArea1.append("\n   CURRENCY RATE IN NEPAL "+"\n"+"=====================================\n"+jTextField1.getText()+" US Dollar : "+value+"\n"+jTextField1.getText()
           +" Japanese Yen : "+jvalue+"\n"+jTextField1.getText()+" Australian Dollar : "+Avalue+
                   "\n"+jTextField1.getText()+" UK Pound : "+Uvalue+"\n"
           +jTextField1.getText()+" Indian Rupees : "+Ivalue+"\n"+jTextField1.getText()+""
                   + " Dirham (Dubai) : "+Dvalue+"\n"+jTextField1.getText()+" Russian Ruble : "+Rvalue+"\n"
           +jTextField1.getText()+" Canadian Dollar : "+Cvalue+"\n"+jTextField1.getText()+" Euro :"+Evalue);
           jTextArea1.append("\nDate and Time :"+dtf.format(now));
       }
       
        if(jComboBox1.getSelectedItem().equals("USA"))
       {   
           double  ncur,jcur,acur,ucur,icur,dcur,rcur,Ccur,ecur;
           ncur = currency*0.0085;
           jcur = currency*0.0094;
           acur = currency*0.73;
           ucur = currency*1.33;
           icur = currency*0.014;
           dcur = currency*0.27;
           rcur = currency*0.013;
           Ccur = currency*0.76;
           ecur = currency*1.18;
           String Evalue =  String.format("%.2f",ecur);
           String Cvalue =  String.format("%.2f",Ccur);
           String Rvalue =  String.format("%.2f",rcur);
           String Dvalue =  String.format("%.2f",dcur);
           String Ivalue =  String.format("%.2f",icur);
           String Uvalue =  String.format("%.2f",ucur);
           String jvalue =  String.format("%.2f",jcur);
           String Avalue =  String.format("%.2f",acur);
           String value = String.format("%.2f", ncur);
           jTextArea1.append("\n    CURRENCY RATE IN US "+"\n"+"=====================================\n"+jTextField1.getText()+" Nepalease Rupees : "+value+"\n"+jTextField1.getText()
           +" Japanese Yen : "+jvalue+"\n"+jTextField1.getText()+" Australian Dollar : "+Avalue+
                   "\n"+jTextField1.getText()+" UK Pound : "+Uvalue+"\n"
           +jTextField1.getText()+" Indian Rupees : "+Ivalue+"\n"+jTextField1.getText()+""
                   + " Dirham (Dubai) : "+Dvalue+"\n"+jTextField1.getText()+" Russian Ruble : "+Rvalue+"\n"
           +jTextField1.getText()+" Canadian Dollar : "+Cvalue+"\n"+jTextField1.getText()+" Euro :"+Evalue);
           jTextArea1.append("\nDate and Time :"+dtf.format(now));
       }
         if(jComboBox1.getSelectedItem().equals("India"))
       {   
           double  ncur,jcur,acur,ucur,icur,dcur,rcur,Ccur,ecur;
           ncur = currency*0.63;
           jcur = currency*0.69;
           acur = currency*53.33;
           ucur = currency*97.49;
           icur = currency*74.550;
           dcur = currency*20.00;
           rcur = currency*0.98;
           Ccur = currency*55.89;
           ecur = currency*86.99;
           String Evalue =  String.format("%.2f",ecur);
           String Cvalue =  String.format("%.2f",Ccur);
           String Rvalue =  String.format("%.2f",rcur);
           String Dvalue =  String.format("%.2f",dcur);
           String Ivalue =  String.format("%.2f",icur);
           String Uvalue =  String.format("%.2f",ucur);
           String jvalue =  String.format("%.2f",jcur);
           String Avalue =  String.format("%.2f",acur);
           String value = String.format("%.2f", ncur);
           jTextArea1.append("\n    CURRENCY RATE IN India "+"\n"+"=====================================\n"+jTextField1.getText()+" Nepalease Rupees : "+value+"\n"+jTextField1.getText()
           +" Japanese Yen : "+jvalue+"\n"+jTextField1.getText()+" Australian Dollar : "+Avalue+
                   "\n"+jTextField1.getText()+" UK Pound : "+Uvalue+"\n"
           +jTextField1.getText()+" US Dollar : "+Ivalue+"\n"+jTextField1.getText()+""
                   + " Dirham (Dubai) : "+Dvalue+"\n"+jTextField1.getText()+" Russian Ruble : "+Rvalue+"\n"
           +jTextField1.getText()+" Canadian Dollar : "+Cvalue+"\n"+jTextField1.getText()+" Euro :"+Evalue);
           jTextArea1.append("\nDate and Time :"+dtf.format(now));
       }
           if(jComboBox1.getSelectedItem().equals("USA"))
       {   
           double  ncur,jcur,acur,ucur,icur,dcur,rcur,Ccur,ecur;
           ncur = currency*0.0085;
           jcur = currency*0.0094;
           acur = currency*0.73;
           ucur = currency*1.33;
           icur = currency*0.014;
           dcur = currency*0.27;
           rcur = currency*0.013;
           Ccur = currency*0.76;
           ecur = currency*1.18;
           String Evalue =  String.format("%.2f",ecur);
           String Cvalue =  String.format("%.2f",Ccur);
           String Rvalue =  String.format("%.2f",rcur);
           String Dvalue =  String.format("%.2f",dcur);
           String Ivalue =  String.format("%.2f",icur);
           String Uvalue =  String.format("%.2f",ucur);
           String jvalue =  String.format("%.2f",jcur);
           String Avalue =  String.format("%.2f",acur);
           String value = String.format("%.2f", ncur);
           jTextArea1.append("\n    CURRENCY RATE IN US "+"\n"+"=====================================\n"+jTextField1.getText()+" Nepalease Rupees : "+value+"\n"+jTextField1.getText()
           +" Japanese Yen : "+jvalue+"\n"+jTextField1.getText()+" Australian Dollar : "+Avalue+
                   "\n"+jTextField1.getText()+" UK Pound : "+Uvalue+"\n"
           +jTextField1.getText()+" Indian Rupees : "+Ivalue+"\n"+jTextField1.getText()+""
                   + " Dirham (Dubai) : "+Dvalue+"\n"+jTextField1.getText()+" Russian Ruble : "+Rvalue+"\n"
           +jTextField1.getText()+" Canadian Dollar : "+Cvalue+"\n"+jTextField1.getText()+" Euro :"+Evalue);
           jTextArea1.append("\nDate and Time :"+dtf.format(now));
       }
         if(jComboBox1.getSelectedItem().equals("Australia"))
       {   
           double  nepcur,japcur,puncur,uScur,indcur,dubcur,ruscur,Cancur,eurocur;
           nepcur = currency*0.012;
           japcur = currency*0.013;
           puncur = currency*1.83;
           uScur = currency*1.38;
           indcur = currency*0.0187210;
           dubcur = currency*0.37;
           ruscur = currency*0.018;
           Cancur = currency*1.05;
           eurocur = currency*1.63;
           String Evalue =  String.format("%.2f",eurocur);
           String Cvalue =  String.format("%.2f",Cancur);
           String Rvalue =  String.format("%.3f",ruscur);
           String Dvalue =  String.format("%.2f",dubcur);
           String Ivalue =  String.format("%.5f",indcur);
           String Uvalue =  String.format("%.2f",uScur);
           String jvalue =  String.format("%.3f",japcur);
           String Avalue =  String.format("%.2f",puncur);
           String value = String.format("%.3f", nepcur);
           jTextArea1.append("\n    CURRENCY RATE IN Australia "+"\n"+"=====================================\n"+jTextField1.getText()+" Nepalease Rupees : "+value+"\n"+jTextField1.getText()
           +" Japanese Yen : "+jvalue+"\n"+jTextField1.getText()+" UK Pound : "+Avalue+"\n"
           +jTextField1.getText()+" US Dollar : "+Uvalue+"\n"+jTextField1.getText()+""
                   + " Dirham (Dubai) : "+Dvalue+"\n"+jTextField1.getText()+" Russian Ruble : "+Rvalue+"\n"
           +jTextField1.getText()+" Canadian Dollar : "+Cvalue+"\n"+jTextField1.getText()+" Euro :"+Evalue+"\n"+jTextField1.getText()+" Indian Rupees :"+Ivalue);
           jTextArea1.append("\nDate and Time :"+dtf.format(now));
       }
           if(jComboBox1.getSelectedItem().equals("UK"))
       {   
           double  nepcur,japcur,Auscur,uScur,indcur,dubcur,ruscur,Cancur,eurocur;
           nepcur = currency*0.0064;
           japcur = currency*0.0071;
           Auscur = currency*0.55;
           uScur = currency*0.75;
           indcur = currency*0.010;
           dubcur = currency*0.21;
           ruscur = currency*0.010;
           Cancur = currency*0.57;
           eurocur = currency*0.89;
           String Evalue =  String.format("%.2f",eurocur);
           String Cvalue =  String.format("%.2f",Cancur);
           String Rvalue =  String.format("%.4f",ruscur);
           String Dvalue =  String.format("%.2f",dubcur);
           String Ivalue =  String.format("%.5f",indcur);
           String Uvalue =  String.format("%.2f",uScur);
           String jvalue =  String.format("%.4f",japcur);
           String Avalue =  String.format("%.2f",Auscur);
           String value = String.format("%.4f", nepcur);
           jTextArea1.append("\n    CURRENCY RATE IN UNITED KINGDOM "+"\n"+"=====================================\n"+jTextField1.getText()+" Nepalease Rupees : "+value+"\n"+jTextField1.getText()
           +" Japanese Yen : "+jvalue+"\n"+jTextField1.getText()+" Australian Dollar : "+Avalue+"\n"
           +jTextField1.getText()+" US Dollar : "+Uvalue+"\n"+jTextField1.getText()+""
                   + " Dirham (Dubai) : "+Dvalue+"\n"+jTextField1.getText()+" Russian Ruble : "+Rvalue+"\n"
           +jTextField1.getText()+" Canadian Dollar : "+Cvalue+"\n"+jTextField1.getText()+" Euro :"+Evalue+"\n"+jTextField1.getText()+" Indian Rupees :"+Ivalue);
           jTextArea1.append("\nDate and Time :"+dtf.format(now));
       }
    }//GEN-LAST:event_jConvertButtonActionPerformed

    private void ResetButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtomActionPerformed

        clearFiled();
    }//GEN-LAST:event_ResetButtomActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(CurrencyConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConvert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConvert().setVisible(true);
                  new CurrencyConvert().setResizable(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButtom;
    private javax.swing.JButton ResetButtom;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jConvertButton;
    private javax.swing.JLabel jCurrencyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void clearFiled() {
      jTextArea1.setText("");
      jTextField1.setText(" ");
      jComboBox1.setSelectedIndex(0);
    }
}
