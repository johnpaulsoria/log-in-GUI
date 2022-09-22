import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;

public class GUIIII extends JFrame implements ActionListener{

//Username and Password
private static String pass = "qwerty12345";
private static String userN = "johnpaulsoria35@yahoo.com";

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(450, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Log-In System GUI");
		frame.add(panel);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(panel);
		
		JLabel label4 = new JLabel("Password: ");
		label4.setBounds(45, 120, 150, 25);
		panel.add(label4);
		//This is the title of the project
		JLabel label = new JLabel("Welcome to Log-In System");
		label.setBounds(150, 40, 200, 15);
		panel.add(label);
		
		//The label of username
		JLabel lbl1 = new JLabel ("Username: ");
		lbl1.setBounds(45, 100, 150, 25);
		panel.add(lbl1);
		
		//Create text field for first number label.
		JTextField txt1 = new JTextField();
		txt1.setBounds(130, 100, 220, 25);
	panel.add(txt1, BorderLayout.WEST);
		
		//The label of password
		JPasswordField PassField = new JPasswordField(10);
		PassField.setEchoChar('*');
		PassField.setBounds(130, 130, 220, 25);
		PassField.addActionListener(new Jp());
	panel.add(PassField, BorderLayout.WEST);
	
	    JButton button1 = new JButton("Log-in");
	    button1.setBounds(130, 160, 100, 25);
	    panel.add(button1);
	    
	    JButton button2 = new JButton("Exit");
	    button2.setBounds(248, 160, 100, 25);
	    panel.add(button2);
	}
	static class Jp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			JPasswordField input = (JPasswordField) e.getSource();
			char[] boboAko = input.getPassword();
			String newP = new String(boboAko);
			
			if(newP.equals(pass)) {
				
					JOptionPane.showMessageDialog(null, "Welcome John Paul Soria");
					JOptionPane.showMessageDialog(null, "Nakapasok ka sa aking bohai");
					JOptionPane.showMessageDialog(null, "muah <3");
				
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect Password");
			}
		}
	}
		
		
		
	public void actionPerformed(ActionEvent e) {
}
}
