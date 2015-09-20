

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azfaralsukor
 */


public class Title_GUI extends javax.swing.JFrame {
    DefaultListModel listoftopics = new DefaultListModel();
    DefaultListModel desclist = new DefaultListModel();
    DefaultListModel subjectlist = new DefaultListModel();
    private  Connection conn = null;
    private  PreparedStatement pst = null;
    private ResultSet rs = null; 
    /**
     * Creates new form OOAD
     */
    public Title_GUI() {
        initComponents();
        listoftopics.addElement("Class Announcement");
        listoftopics.addElement("Assignment Deadline");
        topicList.setModel(listoftopics);
        desclist.addElement("No classes for the whole semester.");
        desclist.addElement("Assignment Deadline is tomorrow.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addTopicFrame = new javax.swing.JFrame();
        topicName = new javax.swing.JTextField();
        topicTitle = new javax.swing.JLabel();
        addNewTopic = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        descriptionScroll = new javax.swing.JScrollPane();
        topicDescription = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        topicPanel = new javax.swing.JPanel();
        topictitle = new javax.swing.JLabel();
        listTopics = new javax.swing.JLabel();
        addTopic = new javax.swing.JButton();
        select = new javax.swing.JButton();
        listScroll = new javax.swing.JScrollPane();
        topicList = new javax.swing.JList();
        jList1 = new javax.swing.JList();
        LeftPanel = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        subject = new javax.swing.JButton();
        home = new javax.swing.JButton();
        username = new javax.swing.JLabel();

        addTopicFrame.setResizable(false);

        topicName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicNameActionPerformed(evt);
            }
        });

        topicTitle.setText("Topic Title");

        addNewTopic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addNewTopic.setText("New Topic Form");

        description.setText("Topic Description");

        topicDescription.setColumns(20);
        topicDescription.setRows(5);
        descriptionScroll.setViewportView(topicDescription);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addTopicFrameLayout = new javax.swing.GroupLayout(addTopicFrame.getContentPane());
        addTopicFrame.getContentPane().setLayout(addTopicFrameLayout);
        addTopicFrameLayout.setHorizontalGroup(
            addTopicFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTopicFrameLayout.createSequentialGroup()
                .addGroup(addTopicFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTopicFrameLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(addTopicFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submit)
                            .addGroup(addTopicFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(description)
                                .addComponent(topicTitle)
                                .addComponent(topicName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addTopicFrameLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(addNewTopic)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        addTopicFrameLayout.setVerticalGroup(
            addTopicFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTopicFrameLayout.createSequentialGroup()
                .addComponent(addNewTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topicTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit)
                .addContainerGap())
        );

        description.getAccessibleContext().setAccessibleName("TopicDes1");

        addTopicFrame.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        topicPanel.setPreferredSize(new java.awt.Dimension(650, 600));

        topictitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        topictitle.setText("<SUBJECT_NAME>");

        listTopics.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listTopics.setText("List of Topics");

        addTopic.setText("Add Topic");
        addTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTopicActionPerformed(evt);
            }
        });

        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        topicList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                topicListValueChanged(evt);
            }
        });
        listScroll.setViewportView(topicList);

        javax.swing.GroupLayout topicPanelLayout = new javax.swing.GroupLayout(topicPanel);
        topicPanel.setLayout(topicPanelLayout);
        topicPanelLayout.setHorizontalGroup(
            topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topicPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(topictitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(topicPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(topicPanelLayout.createSequentialGroup()
                        .addComponent(listTopics)
                        .addGap(137, 137, 137)
                        .addComponent(addTopic))
                    .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addComponent(listScroll))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(topicPanelLayout.createSequentialGroup()
                    .addGap(0, 203, Short.MAX_VALUE)
                    .addComponent(jList1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 203, Short.MAX_VALUE)))
        );
        topicPanelLayout.setVerticalGroup(
            topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topicPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(topictitle)
                .addGap(18, 18, 18)
                .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listTopics)
                    .addComponent(addTopic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select)
                .addContainerGap())
            .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(topicPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jList1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        LeftPanel.setBackground(new java.awt.Color(0, 51, 204));
        LeftPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        subject.setText("Subjects");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
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

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subject)
                            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void topicNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicNameActionPerformed

    }//GEN-LAST:event_topicNameActionPerformed

    private void addTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTopicActionPerformed
        // TODO add your handling code here:
        addTopicFrame.setSize(400,300);
        addTopicFrame.setLocationRelativeTo(null);
        addTopicFrame.setVisible(true);
        addTopicFrame.setTitle("Add Topic Form");
        topicName.setText("");
        topicDescription.setText(null);
    }//GEN-LAST:event_addTopicActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        listoftopics.addElement(topicName.getText());
        topicList.setModel(listoftopics);
        desclist.addElement(topicDescription.getText());
        addTopicFrame.setVisible(false);
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Logging out... \nGoodbye "+username.getText());
        User_GUI logout = new User_GUI();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
        Subject_GUI board_subject = new Subject_GUI();
        board_subject.setVisible(true);
        board_subject.username.setText(this.username.getText());
        this.setVisible(false);
    }//GEN-LAST:event_subjectActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Board_GUI mmu = new Board_GUI();
        mmu.setVisible(true);
        mmu.username.setText(this.username.getText());
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        Comment_GUI newTopic = new Comment_GUI();
        newTopic.setVisible(true);
        String title = topicList.getSelectedValue().toString();
        newTopic.setTitle(title);
        newTopic.TopicName.setText(title);
        int pos = topicList.getSelectedIndex();
        String desc = desclist.getElementAt(pos).toString();
        newTopic.DescriptionSection.setText(desc);
        newTopic.username = this.username.getText();
        this.setVisible(false);
    }//GEN-LAST:event_selectActionPerformed

    private void topicListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_topicListValueChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_topicListValueChanged

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
            java.util.logging.Logger.getLogger(Title_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Title_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Title_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Title_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Title_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JLabel addNewTopic;
    private javax.swing.JButton addTopic;
    private javax.swing.JFrame addTopicFrame;
    private javax.swing.JLabel description;
    private javax.swing.JScrollPane descriptionScroll;
    private javax.swing.JButton home;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane listScroll;
    private javax.swing.JLabel listTopics;
    private javax.swing.JButton logout;
    private javax.swing.JButton select;
    private javax.swing.JButton subject;
    private javax.swing.JButton submit;
    private javax.swing.JTextArea topicDescription;
    private javax.swing.JList topicList;
    private javax.swing.JTextField topicName;
    private javax.swing.JPanel topicPanel;
    private javax.swing.JLabel topicTitle;
    public javax.swing.JLabel topictitle;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}