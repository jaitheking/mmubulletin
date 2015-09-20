
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import sun.util.calendar.BaseCalendar.Date;
import javax.swing.event.*;
import java.awt.*;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Imad
 */
public class Comment_GUI extends javax.swing.JFrame {
    private final static String newline ="\n";
    private String user_name;
    private int comment_title_id;
    private String comment_title_name;
    private String comment_title_desc;
    private String subject_name1;
    private  Connection conn = null;
    private  PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public Comment_GUI() {
        initComponents();
        user_name = String.valueOf(User.new_user.getUser_id());
        username.setText(user_name);
        subject_name1 = Subject.discuss_subject.getSubjTitle();
        comment_title_id = Title.title_chosen.getTitle_id();
        comment_title_name = Title.title_chosen.getTitle_name();
        comment_title_desc = Title.title_chosen.getTitle_desc();
        DescriptionSection.setText(comment_title_desc);
        loadComments();
        CommentInput.getDocument().addDocumentListener(new DocumentListener() {
                public void changedUpdate(DocumentEvent e) {
                  changed();
                }
                public void removeUpdate(DocumentEvent e) {
                  changed();
                }
                public void insertUpdate(DocumentEvent e) {
                  changed();
                }

                public void changed() {
                   if (CommentInput.getText().equals("")){
                     PostButton.setEnabled(false);
                   }
                   else {
                     PostButton.setEnabled(true);
                  }

                }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LeftPanel = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        subject = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        RightPanel = new javax.swing.JPanel();
        TopicName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionSection = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        CommentArea = new javax.swing.JTextArea();
        CommentTitle = new javax.swing.JLabel();
        CommentInput = new javax.swing.JTextField();
        PostButton = new javax.swing.JButton();
        message_status = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Discussion Board");
        setResizable(false);

        LeftPanel.setBackground(new java.awt.Color(0, 51, 204));
        LeftPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        subject.setText("Subjects");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
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
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        RightPanel.setPreferredSize(new java.awt.Dimension(650, 600));

        TopicName.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
        TopicName.setText("Topic Title");

        DescriptionSection.setEditable(false);
        DescriptionSection.setColumns(20);
        DescriptionSection.setRows(5);
        jScrollPane2.setViewportView(DescriptionSection);

        CommentArea.setEditable(false);
        CommentArea.setColumns(20);
        CommentArea.setRows(5);
        jScrollPane3.setViewportView(CommentArea);

        CommentTitle.setFont(new java.awt.Font("Droid Sans", 0, 18)); // NOI18N
        CommentTitle.setText("Comments");

        CommentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentInputActionPerformed(evt);
            }
        });

        PostButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PostButton.setText("Post!");
        PostButton.setEnabled(false);
        PostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addComponent(CommentInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PostButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TopicName)
                            .addGroup(RightPanelLayout.createSequentialGroup()
                                .addComponent(CommentTitle)
                                .addGap(29, 29, 29)
                                .addComponent(message_status)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopicName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommentTitle)
                    .addComponent(message_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void sendComment(String comment){
         conn=DB_Controller.ConnectDB();
        String Sql = "INSERT INTO title_comment (title_id, comment, user_name, timestamp) VALUES (?, ?, ?, NOW());";
        
        try{
            pst=conn.prepareStatement(Sql);
            
            pst.setString(1,String.valueOf(comment_title_id));
            pst.setString(2,comment);
            pst.setString(3,user_name);
            pst.executeUpdate();
            
        }
        catch(Exception e){
            this.message_status.setText("Your comment was not posted.");
            JOptionPane.showMessageDialog(null, e);
        }
        this.message_status.setText("Your comment was posted.");
     }
    public void loadComments(){
        conn=DB_Controller.ConnectDB();
        String Sql = "SELECT comment,user_name,timestamp FROM title_comment,subject_title WHERE title_comment.title_id = subject_title.id AND subject_title.id = ?  ";
        
        try{
            pst=conn.prepareStatement(Sql);
            
            pst.setString(1,String.valueOf(comment_title_id));
            rs = pst.executeQuery();
            while(rs.next()){
                    String text = rs.getString("comment");
                    String poster = rs.getString("user_name");
                    String timestamp = rs.getString("timestamp");
                    CommentArea.append(text + newline);
                    CommentArea.append(poster+" posted on " + timestamp + newline);
                    CommentInput.selectAll();
        
                    CommentArea.setCaretPosition(CommentArea.getDocument().getLength());
        
                    CommentInput.requestFocusInWindow();
               
            }
            if (CommentArea.getText() == null) {
                CommentArea.setText("Be The First To Comment...");
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    private void PostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostButtonActionPerformed
        // TODO add your handling code here:
           String timeStamp = new SimpleDateFormat("HH:mm:ss yyyy:MM:dd").format(Calendar.getInstance().getTime());
        String text = CommentInput.getText();
        sendComment(text);
        CommentArea.append(text + newline);
        CommentArea.append(user_name+" posted on " + timeStamp + newline);
        CommentInput.selectAll();
        
        CommentArea.setCaretPosition(CommentArea.getDocument().getLength());
        
        CommentInput.requestFocusInWindow();
        
        CommentInput.setText("");
    }//GEN-LAST:event_PostButtonActionPerformed

    private void CommentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentInputActionPerformed
        // TODO add your handling code here:
        String timeStamp = new SimpleDateFormat("HH:mm:ss yyyy:MM:dd").format(Calendar.getInstance().getTime());
        String text = CommentInput.getText();
        sendComment(text);
        if(CommentInput.getText().length() > 0){
            PostButton.setEnabled(true);
        }
        
        CommentArea.append(text + newline);
        CommentArea.append(user_name+" posted on " + timeStamp + newline);
        CommentInput.selectAll();
        
        
        
        
        CommentArea.setCaretPosition(CommentArea.getDocument().getLength());
        
        CommentInput.requestFocusInWindow();
        CommentInput.setText("");
        
        
        
        
       
        
    }//GEN-LAST:event_CommentInputActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Board_GUI mmu = new Board_GUI();
        mmu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
        Subject_GUI board_subject = new Subject_GUI();
        board_subject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subjectActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Logging out... \nGoodbye "+user_name);
        Login_GUI logout = new Login_GUI();
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentArea;
    private javax.swing.JTextField CommentInput;
    private javax.swing.JLabel CommentTitle;
    public javax.swing.JTextArea DescriptionSection;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton PostButton;
    private javax.swing.JPanel RightPanel;
    public javax.swing.JLabel TopicName;
    private javax.swing.JButton home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel message_status;
    private javax.swing.JButton subject;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
