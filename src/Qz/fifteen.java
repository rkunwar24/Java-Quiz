/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Qz;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class fifteen extends javax.swing.JFrame {
    String name,address,email,gender;
int num;

    /**
     * Creates new form fifteen
     */
    public fifteen(String nm,String ad,String em,String gen,int m) {
        initComponents();
      name=nm;
        gender=gen;
        address=ad;
        email=em;
       num=m;

    }

    private fifteen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        d = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Q15. Total numbers of function keys in a");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("computer keyboard ?");

        a.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        a.setText("10");
        a.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aItemStateChanged(evt);
            }
        });

        b.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        b.setText("12");
        b.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bItemStateChanged(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        c.setText("14");
        c.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cItemStateChanged(evt);
            }
        });
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        d.setText("8");
        d.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dItemStateChanged(evt);
            }
        });
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(d, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(a)
                .addGap(18, 18, 18)
                .addComponent(b)
                .addGap(18, 18, 18)
                .addComponent(c)
                .addGap(18, 18, 18)
                .addComponent(d)
                .addGap(100, 100, 100)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aItemStateChanged
        if(evt.getStateChange()==1){
            a.setForeground(Color.red);
            d.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_aItemStateChanged

    private void bItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bItemStateChanged
        if(evt.getStateChange()==1){
            b.setForeground(Color.green);
            d.setVisible(false);
            a.setVisible(false);
            c.setVisible(false);
            num=num+1;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bItemStateChanged

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void cItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cItemStateChanged
        if(evt.getStateChange()==1){
            c.setForeground(Color.red);
            d.setVisible(false);
            b.setVisible(false);
            a.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cItemStateChanged

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void dItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dItemStateChanged
        if(evt.getStateChange()==1){
            d.setForeground(Color.red);
            a.setVisible(false);
            b.setVisible(false);
            c.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dItemStateChanged

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sixteen p=new sixteen(name,address,email,gender,num);
        p.show();
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(fifteen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fifteen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fifteen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fifteen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fifteen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton d;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
