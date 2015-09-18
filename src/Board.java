
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azfaralsukor
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Subject
     */
    public Board() {
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

        rightPanel = new javax.swing.JPanel();
        subjectList = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        sub2 = new javax.swing.JLabel();
        sub3 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        home = new javax.swing.JButton();
        username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subject List");
        setResizable(false);

        rightPanel.setMaximumSize(new java.awt.Dimension(650, 600));
        rightPanel.setPreferredSize(new java.awt.Dimension(650, 600));

        subjectList.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subjectList.setText("Subject List");

        sub1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sub1.setText("TCP2201 Object Oriented Analysis Design");
        sub1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sub1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sub1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sub1MouseEntered(evt);
            }
        });

        sub2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sub2.setText("TSN2101 Operating Systems");
        sub2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sub2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sub2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sub2MouseExited(evt);
            }
        });

        sub3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sub3.setText("TSN2201 Computer Networks");
        sub3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sub3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sub3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sub3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectList)
                    .addComponent(sub1)
                    .addComponent(sub2)
                    .addComponent(sub3))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(subjectList)
                .addGap(18, 18, 18)
                .addComponent(sub1)
                .addGap(18, 18, 18)
                .addComponent(sub2)
                .addGap(18, 18, 18)
                .addComponent(sub3)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        leftPanel.setBackground(new java.awt.Color(0, 51, 204));
        leftPanel.setMaximumSize(new java.awt.Dimension(150, 600));
        leftPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 250, 250));
        username.setText("<username>");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        MMUBoard mmu = new MMUBoard();
        mmu.setVisible(true);
        mmu.username.setText(this.username.getText());
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Logging out... \nGoodbye "+username.getText());
        User logout = new User();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void sub1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub1MouseExited
        // TODO add your handling code here:
        sub1.setForeground(Color.BLACK);
    }//GEN-LAST:event_sub1MouseExited

    private void sub1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub1MouseEntered
        // TODO add your handling code here:
        sub1.setForeground(Color.BLUE);
    }//GEN-LAST:event_sub1MouseEntered

    private void sub1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub1MouseClicked
        // TODO add your handling code here:
        Subject form = new Subject();
        form.setVisible(true);
        this.setVisible(false);
        form.username.setText(this.username.getText());
        form.topictitle.setText(this.sub1.getText());
        form.setTitle(this.sub1.getText());
        
    }//GEN-LAST:event_sub1MouseClicked

    private void sub2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub2MouseClicked
        // TODO add your handling code here:
        Subject form = new Subject();
        form.setVisible(true);
        this.setVisible(false);
        form.username.setText(this.username.getText());
        form.topictitle.setText(this.sub2.getText());
        form.setTitle(this.sub1.getText());
    }//GEN-LAST:event_sub2MouseClicked

    private void sub2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub2MouseEntered
        // TODO add your handling code here:
        sub2.setForeground(Color.BLUE);
    }//GEN-LAST:event_sub2MouseEntered

    private void sub2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub2MouseExited
        // TODO add your handling code here:
        sub2.setForeground(Color.BLACK);
    }//GEN-LAST:event_sub2MouseExited

    private void sub3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub3MouseEntered
        // TODO add your handling code here:
        sub3.setForeground(Color.BLUE);
    }//GEN-LAST:event_sub3MouseEntered

    private void sub3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub3MouseExited
        // TODO add your handling code here:
        sub3.setForeground(Color.BLACK);
    }//GEN-LAST:event_sub3MouseExited

    private void sub3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub3MouseClicked
        // TODO add your handling code here:
        Subject form = new Subject();
        form.setVisible(true);
        this.setVisible(false);
        form.username.setText(this.username.getText());
        form.topictitle.setText(this.sub3.getText());
        form.setTitle(this.sub1.getText());
    }//GEN-LAST:event_sub3MouseClicked

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton logout;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel sub3;
    private javax.swing.JLabel subjectList;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
