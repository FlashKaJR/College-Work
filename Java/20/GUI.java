import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

	private JButton Button1 = new JButton("");
	private JButton Button2 = new JButton("");
	private JButton Button3 = new JButton("");

	public GUI() {
		
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

		setSize(250,100);
		setVisible(true);
	}
}
