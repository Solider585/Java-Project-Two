import javax.swing.*;

import Q3_4.RectangleIcon;

import java.awt.*;
import java.awt.event.*;

public class LabelExample extends Frame implements ActionListener {
	JTextField tf;
	JLabel l;
	JButton b;
	JButton buttonColor;

	LabelExample() {
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(this);
		
		buttonColor = new JButton();
		buttonColor.setBackground(Color.BLACK);
		buttonColor.setBounds(70, 175, 120, 55);
		
		add(buttonColor);		
		add(b);
		add(tf);
		add(l);
		

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
			if(e.getActionCommand().equals("Find IP"))
					buttonColor.setBackground(Color.YELLOW);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new LabelExample();
	}
}
