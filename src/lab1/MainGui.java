package lab1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGui extends JFrame {
    private JLabel lblPrompt, lblOutput;
    private JTextField txtInput;
    private JButton btnSubmit;
    private Container container;
    private JPanel panel;
    
    public MainGui() {
        lblPrompt = new JLabel("Enter name:");
        lblOutput = new JLabel("xxxxxxxxxxxxx");
        txtInput = new JTextField("                      ");
        btnSubmit = new JButton("Say Hello");
        btnSubmit.addActionListener(new MyButtonListener(this));
        container = this.getContentPane();
        panel = new JPanel();
        panel.add(lblPrompt);
        panel.add(txtInput);
        container.add(panel, BorderLayout.NORTH);
        container.add(lblOutput, BorderLayout.CENTER);
        container.add(btnSubmit, BorderLayout.SOUTH);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JLabel getLblOutput() {
        return lblOutput;
    }

    public void setLblOutput(JLabel lblOutput) {
        this.lblOutput = lblOutput;
    }

    public JTextField getTxtInput() {
        return txtInput;
    }

    public void setTxtInput(JTextField txtInput) {
        this.txtInput = txtInput;
    }

    
}
