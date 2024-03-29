/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.shop;

/**
 *
 * @author RAUSHAN
 */
public class Availability extends javax.swing.JFrame {

    /**
     * Creates new form Availability
     */
    public Availability() {
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

        bg_availability = new javax.swing.ButtonGroup();
        rb_searchmodel = new javax.swing.JRadioButton();
        rb_searchprice = new javax.swing.JRadioButton();
        rb_searchfeature = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        b_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 200, 500, 500));

        bg_availability.add(rb_searchmodel);
        rb_searchmodel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        rb_searchmodel.setText("Search By Model");
        rb_searchmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_searchmodelActionPerformed(evt);
            }
        });

        bg_availability.add(rb_searchprice);
        rb_searchprice.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        rb_searchprice.setText("Search By Price");
        rb_searchprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_searchpriceActionPerformed(evt);
            }
        });

        bg_availability.add(rb_searchfeature);
        rb_searchfeature.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        rb_searchfeature.setText("Search By Features");
        rb_searchfeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_searchfeatureActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH AVAILABILITY");

        b_back.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        b_back.setText("BACK");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(rb_searchmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(rb_searchprice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(rb_searchfeature)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(b_back)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(rb_searchmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rb_searchprice, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rb_searchfeature, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_searchpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_searchpriceActionPerformed
        new SearchPrice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rb_searchpriceActionPerformed

    private void rb_searchfeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_searchfeatureActionPerformed
       new featuresearch().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_rb_searchfeatureActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
       Mainmenu obj=new Mainmenu();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_b_backActionPerformed

    private void rb_searchmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_searchmodelActionPerformed
        new ModelSearch().setVisible(true);
        dispose();
    }//GEN-LAST:event_rb_searchmodelActionPerformed

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
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Availability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Availability().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.ButtonGroup bg_availability;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rb_searchfeature;
    private javax.swing.JRadioButton rb_searchmodel;
    private javax.swing.JRadioButton rb_searchprice;
    // End of variables declaration//GEN-END:variables
}
