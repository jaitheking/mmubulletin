//Class file for Subject

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Subject extends JFrame implements ActionListener{
	public String subj_name;
	public String subj_id;
	private JLabel subj_title;
	private JLabel subj_msglbl;
	private JPanel subjectPanel;
	String[] topic_list = {"TSN3111 - Operating System","TCP1001 - Programming Fundamental","TCP2101 - OOAD"};
	JComboBox topicListbox = new JComboBox(topic_list);
	JButton cnfrmbtn = new JButton("Confirm");
	Subject(){
		
		subjectPanel = new JPanel(); 

		subjectPanel.setLayout(new FlowLayout());
		this.add(subjectPanel);
		//subjectPanel.setTitle("Subject");
		this.setSize(400,500);
		subjectPanel.setSize(400,500);
		//subjectPanel.setResizable(false);
		this.setVisible(true);
		subj_title = new JLabel("Subjects");
		subjectPanel.add(subj_title);
		subj_msglbl = new JLabel("Pick One Topic");
		subjectPanel.add(subj_msglbl);
		subj_title.setFont(new Font("Arial", Font.BOLD, 32));
		subjectPanel.add(topicListbox);
		subjectPanel.add(cnfrmbtn);

	}

	


	public static void main(String[] args){
	Subject test = new Subject();


	}	

	public void actionPerformed(ActionEvent e){
		String btntxt=e.getActionCommand();
		if (btntxt.equals("Confirm")){
			
			Topic test = new Topic("Next Page","Description");
		}
	}

}

