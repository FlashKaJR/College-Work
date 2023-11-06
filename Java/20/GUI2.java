import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI2 extends JFrame implements ActionListener {

	private JButton Button1 = new JButton("");
	private JButton Button2 = new JButton("");
	private JButton Button3 = new JButton("");
	private JCheckBox checkBox = new JCheckBox("give colours");

	public GUI2() {
		
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
		
        constraints.gridx = 1;
        constraints.gridy = 1;
        getContentPane().add(Button1, constraints);
        
		constraints.gridx = 2;
        constraints.gridy = 2;
        getContentPane().add(Button2, constraints);

        constraints.gridx = 3;
        constraints.gridy = 1;
        getContentPane().add(Button3, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 1;
        constraints.gridwidth = 3; // Span multiple columns
        getContentPane().add(checkBox, constraints);
        checkBox.addActionListener(this);
        
		setSize(250,100);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if (checkBox.isSelected())
		{
			Button1.setBackground(Color.GREEN);
            Button2.setBackground(Color.BLUE);
            Button3.setBackground(Color.RED);
		}
		else {
            Button1.setBackground(Color.LIGHT_GRAY);
            Button2.setBackground(Color.LIGHT_GRAY);
            Button3.setBackground(Color.LIGHT_GRAY);
		}
		
	}
}
