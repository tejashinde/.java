import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.event.*;
import javax.swing.ImageIcon.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.image.BufferedImage.*;


public class action
{
	JFrame frame;
	JPanel p;
	JButton b;
	action()
	{
		frame = new JFrame("Action Perform");
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		frame.add(p);
		b = new JButton("Click Here");
		p.add(b);
		b.addActionListener(new doaction());
	}
	static class doaction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			new inputalert();
		}
	}

	public static void main(String[] args)
	{
		new action();
	}
}