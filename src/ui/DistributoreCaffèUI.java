/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import distribcaffè18.CaffèEvent;
import distribcaffè18.CaffèProntoEvent;
import distribcaffè18.DistributoreCaffèAutoma;
import distribcaffè18.RestoEvent;
import distribcaffè18.RitiroEvent;
import distribcaffè18.SoldiEvent;

/**
 *
 * @author Luca Lezzerini
 */
public class DistributoreCaffèUI extends javax.swing.JFrame {

    // Associo alla UI un automa che gestisce lo stato del distributore di caffè
    DistributoreCaffèAutoma automa = new DistributoreCaffèAutoma();

    /**
     * Creates new form DistributoreCaffèUI
     */
    public DistributoreCaffèUI() {
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

        jButton10Cent = new javax.swing.JButton();
        jButton20Cent = new javax.swing.JButton();
        jButton50Cent = new javax.swing.JButton();
        jButton1Euro = new javax.swing.JButton();
        jButton2Euro = new javax.swing.JButton();
        jButtonResto = new javax.swing.JButton();
        jButtonCaffè = new javax.swing.JButton();
        jButtonCaffèPronto = new javax.swing.JButton();
        jButtonCaffèRitirato = new javax.swing.JButton();
        jLabelMessaggi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton10Cent.setText("0.10€");
        jButton10Cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10CentActionPerformed(evt);
            }
        });

        jButton20Cent.setText("0.20€");
        jButton20Cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20CentActionPerformed(evt);
            }
        });

        jButton50Cent.setText("0.50€");
        jButton50Cent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50CentActionPerformed(evt);
            }
        });

        jButton1Euro.setText("1.00€");
        jButton1Euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EuroActionPerformed(evt);
            }
        });

        jButton2Euro.setText("2.00€");
        jButton2Euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2EuroActionPerformed(evt);
            }
        });

        jButtonResto.setText("Resto");
        jButtonResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestoActionPerformed(evt);
            }
        });

        jButtonCaffè.setText("Caffè");
        jButtonCaffè.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaffèActionPerformed(evt);
            }
        });

        jButtonCaffèPronto.setText("Caffè Pronto");
        jButtonCaffèPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaffèProntoActionPerformed(evt);
            }
        });

        jButtonCaffèRitirato.setText("Caffè Ritirato");
        jButtonCaffèRitirato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCaffèRitiratoActionPerformed(evt);
            }
        });

        jLabelMessaggi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMessaggi.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10Cent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20Cent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50Cent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1Euro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2Euro))
                    .addComponent(jButtonResto)
                    .addComponent(jButtonCaffè)
                    .addComponent(jButtonCaffèPronto)
                    .addComponent(jButtonCaffèRitirato)
                    .addComponent(jLabelMessaggi, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10Cent)
                    .addComponent(jButton20Cent)
                    .addComponent(jButton50Cent)
                    .addComponent(jButton1Euro)
                    .addComponent(jButton2Euro))
                .addGap(18, 18, 18)
                .addComponent(jButtonResto)
                .addGap(18, 18, 18)
                .addComponent(jButtonCaffè)
                .addGap(18, 18, 18)
                .addComponent(jButtonCaffèPronto)
                .addGap(18, 18, 18)
                .addComponent(jButtonCaffèRitirato)
                .addGap(18, 18, 18)
                .addComponent(jLabelMessaggi)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10CentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10CentActionPerformed
        automa.next(new SoldiEvent(0.10));
    }//GEN-LAST:event_jButton10CentActionPerformed

    private void jButton20CentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20CentActionPerformed
        automa.next(new SoldiEvent(0.20));
    }//GEN-LAST:event_jButton20CentActionPerformed

    private void jButton50CentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50CentActionPerformed
        automa.next(new SoldiEvent(0.50));
    }//GEN-LAST:event_jButton50CentActionPerformed

    private void jButton1EuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EuroActionPerformed
        automa.next(new SoldiEvent(1));
    }//GEN-LAST:event_jButton1EuroActionPerformed

    private void jButton2EuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2EuroActionPerformed
        automa.next(new SoldiEvent(2));
    }//GEN-LAST:event_jButton2EuroActionPerformed

    private void jButtonRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestoActionPerformed
        automa.next(new RestoEvent());
    }//GEN-LAST:event_jButtonRestoActionPerformed

    private void jButtonCaffèActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaffèActionPerformed
        automa.next(new CaffèEvent());
    }//GEN-LAST:event_jButtonCaffèActionPerformed

    private void jButtonCaffèProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaffèProntoActionPerformed
        automa.next(new CaffèProntoEvent());
    }//GEN-LAST:event_jButtonCaffèProntoActionPerformed

    private void jButtonCaffèRitiratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCaffèRitiratoActionPerformed
        automa.next(new RitiroEvent());
    }//GEN-LAST:event_jButtonCaffèRitiratoActionPerformed

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
            java.util.logging.Logger.getLogger(DistributoreCaffèUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistributoreCaffèUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistributoreCaffèUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistributoreCaffèUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistributoreCaffèUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10Cent;
    private javax.swing.JButton jButton1Euro;
    private javax.swing.JButton jButton20Cent;
    private javax.swing.JButton jButton2Euro;
    private javax.swing.JButton jButton50Cent;
    private javax.swing.JButton jButtonCaffè;
    private javax.swing.JButton jButtonCaffèPronto;
    private javax.swing.JButton jButtonCaffèRitirato;
    private javax.swing.JButton jButtonResto;
    private javax.swing.JLabel jLabelMessaggi;
    // End of variables declaration//GEN-END:variables
}
