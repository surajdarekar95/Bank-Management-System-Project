package bankManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	JButton login, clear, signup;
	JTextField cardText;
	JPasswordField Pintext;

	Login() {
		setTitle("AUTOMATED TELLER MACHIN");
		setLayout(null);

		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("./icons/logo.jpg"));
		Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);

		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);

		JLabel CardNo = new JLabel("Card No:");
		CardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		CardNo.setBounds(120, 150, 400, 30);
		add(CardNo);

		cardText = new JTextField();
		cardText.setBounds(300, 150, 230, 30);
		cardText.setFont(new Font("Arial", Font.BOLD, 18));
		add(cardText);

		JLabel Pin = new JLabel("PIN:");
		Pin.setFont(new Font("Raleway", Font.BOLD, 28));
		Pin.setBounds(120, 220, 250, 30);
		add(Pin);

		Pintext = new JPasswordField();
		Pintext.setBounds(300, 220, 230, 30);
		Pintext.setFont(new Font("Arial", Font.BOLD, 18));
		add(Pintext);

		login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.black);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);

		clear = new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);

		signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);

		getContentPane().setBackground(Color.white);

		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == clear) {
			cardText.setText("");
			Pintext.setText("");
		} else if (e.getSource() == login) {

		} else if (e.getSource() == signup) {
			setVisible(false);
			new SignupOne().setVisible(true);

		}

	}

	public static void main(String[] args) {

		new Login();
	}

}
