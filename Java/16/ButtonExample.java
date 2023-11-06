import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample implements ActionListener{

		JFrame window = new JFrame("hi");
		JLabel label = new JLabel("nothing pressed");
		JButton left = new JButton("left button");
		JButton middle = new JButton("middle button");
		JButton right = new JButton("right button");
	
		JPanel panel = new JPanel();
		
		public ButtonExample() 
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
				label.setText("left button pressed");
			}
			
			if (e.getSource().equals(middle))
			{
				label.setText("middle button pressed");
			}
			
			if (e.getSource().equals(right))
			{
				label.setText("right button pressed");
			}
			
		}
	}


	