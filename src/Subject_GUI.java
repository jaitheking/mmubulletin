
import java.awt.*;
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azfaralsukor
 */
public class Subject_GUI extends javax.swing.JFrame {
    DefaultListModel subjectlist_model = new DefaultListModel();
    private  Connection conn = null;
    private  PreparedStatement pst = null;
    private ResultSet rs = null;
    private String user_name;
    /**
     * Creates new form Title_GUI
     */
    public Subject_GUI() {
        initComponents();
       
        viewSubject();
        user_name = String.valueOf(User.new_user.getUser_id());
        username.setText(user_name);
        subjectlist.setModel(subjectlist_model);
        
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
        listScroll = new javax.swing.JScrollPane();
        subjectlist = new javax.swing.JList();
        select = new javax.swing.JButton();
        test = new javax.swing.JLabel();
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

        subjectlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                subjectlistValueChanged(evt);
            }
        });
        listScroll.setViewportView(subjectlist);

        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        test.setText("jLabel1");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(listScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(subjectList)))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(test)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(subjectList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(test)
                .addGap(7, 7, 7))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
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
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void viewSubject(){
        conn=DB_Controller.ConnectDB();
        String Sql = "SELECT DISTINCT subject_name FROM subject,user_subject WHERE subject.subject_id = user_subject.subject_id AND subject.subject_id IN ( SELECT subject_id FROM user_subject WHERE user_id = ?) ";
        
        try{
            pst=conn.prepareStatement(Sql);
            
            pst.setString(1,user_name);
            rs = pst.executeQuery();
            while(rs.next()){
                    String subjectlist2 = rs.getString("subject_name");
                    subjectlist_model.addElement(subjectlist2);
                    
               
            }
            if (subjectlist_model.getSize() < 1) {
                subjectlist_model.addElement("No Subject has been registered yet.");
                select.setEnabled(false);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Board_GUI mmu = new Board_GUI();
        mmu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Logging out... \nGoodbye "+user_name);
        Login_GUI logout = new Login_GUI();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void subjectlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_subjectlistValueChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_subjectlistValueChanged

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        Title_GUI title_board = new Title_GUI();
        title_board.setVisible(true);
        Subject discuss_subject = new Subject(this.subjectlist.getSelectedValue().toString());  
        this.setVisible(false);
    }//GEN-LAST:event_selectActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JScrollPane listScroll;
    private javax.swing.JButton logout;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton select;
    private javax.swing.JLabel subjectList;
    private javax.swing.JList subjectlist;
    private javax.swing.JLabel test;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
