//Class file for Subject

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Subject extends JFrame implements ItemListener{
	public String subj_name;
	public String subj_id;
	JLabel subj_title;
	JLabel subj_msglbl;
	JPanel cards;

	public String title;
	public String description;
	private JLabel topic_description;
	private JLabel topic_title;
	private JPanel topicPanel;
	
	public void addTopic(){
		
		

	}

	public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        String[] topic_list = {"TSN3111 - Operating System","TCP1001 - Programming Fundamental"};
		JComboBox topicListbox = new JComboBox(topic_list);
		topicListbox.setEditable(false);
        topicListbox.addItemListener(this);
        comboBoxPane.add(topicListbox);
        
        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(new JButton("Button 1"));
        card1.setSize(400,500);
		//topicPanel.setResizable(false);
		topic_title = new JLabel("TSN3111");
		card1.add(topic_title,BorderLayout.NORTH);
		topic_description = new JLabel("Boring Subject");
		card1.add(topic_description,BorderLayout.SOUTH);
		topic_title.setFont(new Font("Arial", Font.BOLD, 32));



        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
        //eTopic topic2 = new Topic("Troll","Master");
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1,"TSN3111 - Operating System");
        cards.add(card2,"TCP1001 - Programming Fundamental");
        
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Subject List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        Subject demo = new Subject();
        demo.addComponentToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

	public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

