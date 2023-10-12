package Q3_4;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ColorTester extends Frame implements ActionListener {

	private static final long serialVersionUID = 2811397835023300676L;

	JLabel label;
	RectangleIcon rect;
	JButton redButton;
	JButton yellowButton;
	JButton blueButton;
	JButton buttonColor;
	
	ColorTester(){
		
		label = new JLabel();  
	    label.setBounds(50,100, 250,20);
	        
		redButton = new JButton("Red");
		redButton.setBounds(30,50,80,45);
		redButton.addActionListener(this);
		
		yellowButton = new JButton("Yellow");
		yellowButton.setBounds(30,100,80,45);
		yellowButton.addActionListener(this);
		
		blueButton = new JButton("Blue");
		blueButton.setBounds(30,150,80,45);
		blueButton.addActionListener(this);
		
		rect = new RectangleIcon(10);
		
		redButton.addActionListener(this);
		
		buttonColor = new JButton();
		buttonColor.setBackground(Color.BLACK);
		buttonColor.setBounds(100, 200, 120, 55);
		
		add(buttonColor);
		add(redButton);
		add(yellowButton);
		add(blueButton);  
		add(label);
		
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
	}
	
	public void actionPerformed(ActionEvent e) {
		try {			
			if(e.getActionCommand().equals("Red"))
				buttonColor.setBackground(Color.RED);
			if(e.getActionCommand().equals("Blue"))
				buttonColor.setBackground(Color.BLUE);
			if(e.getActionCommand().equals("Yellow"))
				buttonColor.setBackground(Color.YELLOW);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	
	
	public static void main(String[] args)	 {
//		
		new ColorTester();
		
	
	}
	 
}
