import java.awt.Dimension;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeButton implements ActionListener{
	JFrame window = new JFrame("Button");
	JLabel label = new JLabel("nothing pressed");
	JButton left = new JButton("left button");
	JButton middle = new JButton("middle button");
	JButton right = new JButton("right button");
	JPanel panel = new JPanel();

	public ChangeButton() 
	{
		left.setSize(new Dimension(300,30));
		middle.setSize(new Dimension(300,30));
		right.setSize(new Dimension(300,30));
		
		
		left.addActionListener(this);
		middle.addActionListener(this);
		right.addActionListener(this);
		
		panel.add(left);
		panel.add(middle);
		panel.add(right);
		
		window.getContentPane().add(panel);
		window.pack();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(left))
		{
			left.setBackground(Color.RED);
		}
		
		if (e.getSource().equals(middle))
		{
			middle.setBackground(Color.GREEN);
		}
		
		if (e.getSource().equals(right))
		{
			right.setBackground(Color.BLUE);
		}
	}
	
}
