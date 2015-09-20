

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


public class Title_GUI extends javax.swing.JFrame {
    DefaultListModel titlelist_model = new DefaultListModel();
    DefaultListModel titledesclist_model = new DefaultListModel();
    DefaultListModel subjectlist = new DefaultListModel();
    private  Connection conn = null;
    private  PreparedStatement pst = null;
    private ResultSet rs = null;
    private String user_name;
    private String subject_name1_title;
    
    private String  title_name;
    private String title_desc;
    private int title_id;
    /**
     * Creates new form OOAD
     */
    public Title_GUI() {
        initComponents();
        user_name = String.valueOf(User.new_user.getUser_id());
        username.setText(user_name);
        subject_name1_title = Subject.discuss_subject.getSubjTitle();
        topictitle.setText(subject_name1_title);
        viewTitle();
        titlelist.setModel(titlelist_model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        titlelist = new javax.swing.JList();
        jList1 = new javax.swing.JList();
        Refresh = new javax.swing.JButton();
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

        titlelist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                titlelistValueChanged(evt);
            }
        });
        listScroll.setViewportView(titlelist);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topicPanelLayout = new javax.swing.GroupLayout(topicPanel);
        topicPanel.setLayout(topicPanelLayout);
        topicPanelLayout.setHorizontalGroup(
            topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topicPanelLayout.createSequentialGroup()
                .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topicPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(topictitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh))
                    .addGroup(topicPanelLayout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(topicPanelLayout.createSequentialGroup()
                                .addComponent(listTopics)
                                .addGap(137, 137, 137)
                                .addComponent(addTopic))
                            .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                            .addComponent(listScroll))))
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
                .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topicPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(topictitle)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topicPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Refresh)
                        .addGap(5, 5, 5)))
                .addGroup(topicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listTopics)
                    .addComponent(addTopic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
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
        LeftPanel.setLayout(new java.awt.GridBagLayout());

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(391, 12, 12, 0);
        LeftPanel.add(logout, gridBagConstraints);

        subject.setText("Subjects");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(14, 46, 0, 4);
        LeftPanel.add(subject, gridBagConstraints);

        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        LeftPanel.add(home, gridBagConstraints);

        username.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 250, 250));
        username.setText("<username>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 14, 0, 0);
        LeftPanel.add(username, gridBagConstraints);

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
            .addComponent(topicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
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
        
        title_name = topicName.getText();
        title_desc = topicDescription.getText();
        addTitle(title_name,title_desc);
        addTopicFrame.setVisible(false);
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Logging out... \nGoodbye "+username.getText());
        Login_GUI logout = new Login_GUI();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
        Subject_GUI board_subject = new Subject_GUI();
        board_subject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subjectActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        
        title_name = this.titlelist.getSelectedValue().toString();
        fetchTitleID(title_name);
        Title title_chosen = new Title(title_id,title_name,title_desc);
        Comment_GUI comment_section = new Comment_GUI();
        comment_section.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_selectActionPerformed

    private void titlelistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_titlelistValueChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_titlelistValueChanged

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Board_GUI mmu = new Board_GUI();
        mmu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        titlelist_model.removeAllElements();
        viewTitle();
    }//GEN-LAST:event_RefreshActionPerformed
    
   private void addTitle(String title_name, String title_desc){
       conn=DB_Controller.ConnectDB();
        String Sql = "INSERT INTO subject_title(subject_name, title_name, title_desc) VALUES (?,?,?)";
        
        try{
            pst=conn.prepareStatement(Sql);
            
            pst.setString(1,subject_name1_title);
            pst.setString(2,title_name);
            pst.setString(3,title_desc);
            pst.executeUpdate();
            
        }    
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
   private void viewTitle(){
        conn=DB_Controller.ConnectDB();
        String Sql = "SELECT title_name FROM subject_title WHERE subject_name = ?";
        
        try{
            pst=conn.prepareStatement(Sql);
            
            pst.setString(1,subject_name1_title);
            rs = pst.executeQuery();
            while(rs.next()){
                    String subjectlist2 = rs.getString("title_name");
                    titlelist_model.addElement(subjectlist2);
                    
               
            }
            if (titlelist_model.getSize() < 1) {
                titlelist_model.addElement("No Topic has been created yet.");
                select.setEnabled(false);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
   public void fetchTitleID(String title_name){
        conn=DB_Controller.ConnectDB();
        String Sql = "SELECT  id FROM subject_title WHERE subject_name = ? AND title_name = ? ";
        
        try{
            pst=conn.prepareStatement(Sql);
            
            pst.setString(1,subject_name1_title);
            pst.setString(2,title_name);
            rs = pst.executeQuery();
            if(rs.next()){
                   title_id = Integer.parseInt(rs.getString("id"));
                    
               
            }
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton Refresh;
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
    private javax.swing.JList titlelist;
    private javax.swing.JTextArea topicDescription;
    private javax.swing.JTextField topicName;
    private javax.swing.JPanel topicPanel;
    private javax.swing.JLabel topicTitle;
    public javax.swing.JLabel topictitle;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
