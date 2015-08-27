
//Class file for  Topic Creation
import java.awt.*;
import javax.swing.*;


public class Topic extends JPanel {
	public String title;
	public String description;
	private JLabel topic_description = new Jlabel;
	private JLabel topic_title = new Jlabel;
	Topic(String title, String description){
		this.setTitle("Topic");
		JPanel topicPanel = new JPanel(new BorderLayout());
		this.setSize(400,500);
		this.setResizable(false);
		this.setVisible(true)
		this.add(topic_title);
		topic_title.setText(title);
		this.add(topic_description);
		topic_description.setText(description);
		
}

public static void main(String []args){
	Topic test = new Topic("Potato Theory","Description");
}