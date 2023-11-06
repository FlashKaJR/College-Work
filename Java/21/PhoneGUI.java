import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class PhoneGUI {
    private JFrame frame;
    private JTable table;
    private JButton displayButton;
    private JButton clearButton;

    private List<Phone> phones;

    public PhoneGUI(List<Phone> phones) {
        this.phones = phones;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Phone List");
        frame.setBounds(100, 100, 1000, 400);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Make");
        model.addColumn("Model");
        model.addColumn("Memory (GB)");
        model.addColumn("Camera (MP)");
        model.addColumn("Screen Size (Inches)");
        model.addColumn("Smart");
        model.addColumn("Price (€)");

        table = new JTable(model);
        JScrollPane pane = new JScrollPane(table);
        
        displayButton = new JButton("Display Phones");
        clearButton = new JButton("Clear");

       JPanel buttonPanel = new JPanel();
        buttonPanel.add(displayButton);
        buttonPanel.add(clearButton);

        frame.add(pane);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPhones();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTable();
            }
        });
    }

    private void displayPhones() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        for (Phone phone : phones) {
            model.addRow(new Object[] {
                phone.getMake(),
                phone.getModel(),
                phone.getMemory(),
                phone.getCamera(),
                phone.getScreenSize(),
                phone.isSmart(),
                phone.getPrice()
            });
        }
    }

    private void clearTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    public void show() {
        frame.setVisible(true);
    }
}