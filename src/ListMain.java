import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.ArrayList;

/*
 * 
 * 
 * 
 * This program will accept events, dates and times and organize them by their date. It will write the data to a
 * text document that it will be able to reference on startup.
 * 
 * Author: Thomas Snyder
 * Date: 10/21/2017
 * 
 * 
 * 
 */
public class ListMain implements ActionListener
{
	JFrame mainFrame = new JFrame("To Do List");
	int frameWidth = 600;
	int frameHeight = 800;
	ListPanel canvas = new ListPanel();
	JScrollPane scrollPane = new JScrollPane(canvas);
	Container buttons = new Container();
	JButton addEvent = new JButton("Add");
	JButton delEvent = new JButton("Delete");
	JTextField name = new JTextField();
	JTextField date = new JTextField();
	
	
	
	public ListMain()
	{
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Left off trying to figure out why the heck everything gets smashed to the
		 * left side when the JScrollPane is used.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		buttons.setLayout(new GridLayout(1,2));
		addEvent.addActionListener(this);
		delEvent.addActionListener(this);
		buttons.add(addEvent);
		buttons.add(delEvent);
		mainFrame.add(buttons, BorderLayout.NORTH);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getViewport().setPreferredSize(new Dimension(600, 800));
		scrollPane.getViewport().setMinimumSize(new Dimension(600, 800));
		mainFrame.setVisible(true);
		mainFrame.setSize(frameWidth, frameHeight);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(scrollPane, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) 
	{
		new ListMain();

	}

	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(addEvent))
		{
			System.out.println("ADD");
		}
		else if(event.getSource().equals(delEvent))
		{
			System.out.println("DEL");
		}
		
	}


}
