
//Class file for  Topic Creation
import java.awt.*;
import javax.swing.*;


public class Topic extends JFrame {
	public String title;
	public String description;
	private JLabel topic_description;
	private JLabel topic_title;
	private JPanel topicPanel;
	Topic(String title, String description){
		
		topicPanel = new JPanel();
		this.setLayout(new FlowLayout());
		topicPanel.setLayout(new BorderLayout());
		this.add(topicPanel);
		//topicPanel.setTitle("Topic");
		this.setSize(400,500);
		topicPanel.setSize(400,500);
		//topicPanel.setResizable(false);
		this.setVisible(true);
		topic_title = new JLabel(title);
		topicPanel.add(topic_title,BorderLayout.NORTH);
		topic_description = new JLabel(description);
		topicPanel.add(topic_description,BorderLayout.SOUTH);
		topic_description.setText(description);
		topic_title.setFont(new Font("Arial", Font.BOLD, 32));


	}

	


	public static void main(String[] args){
	Topic test = new Topic("Potato Theory","Description");


	}		
}

