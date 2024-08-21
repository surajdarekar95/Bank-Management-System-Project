package bankManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener {

	JRadioButton R1, R2, R3, R4;
	JCheckBox C1, C2, C3, C4, C5, C6, C7;
	JButton Submit, Cancle;
	String formno;

	SignUpThree(String formNo) {
		this.formno = formNo;

		setLayout(null);
		JLabel l3 = new JLabel("Page 3:Account Details");
		l3.setFont(new Font("Raleway", Font.BOLD, 22));
		l3.setBounds(280, 40, 400, 40);
		add(l3);

		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway", Font.BOLD, 22));
		type.setBounds(100, 140, 200, 30);
		add(type);

		R1 = new JRadioButton("Saving Account");
		R1.setFont(new Font("Raleway", Font.BOLD, 16));
		R1.setBackground(Color.WHITE);
		R1.setBounds(100, 180, 150, 20);
		add(R1);

		R2 = new JRadioButton("Fixed Deposite Account");
		R2.setFont(new Font("Raleway", Font.BOLD, 16));
		R2.setBackground(Color.WHITE);
		R2.setBounds(350, 180, 250, 20);
		add(R2);

		R3 = new JRadioButton("Current Account");
		R3.setFont(new Font("Raleway", Font.BOLD, 16));
		R3.setBackground(Color.WHITE);
		R3.setBounds(100, 220, 250, 20);
		add(R3);

		R4 = new JRadioButton("Recurring Deposite Account");
		R4.setFont(new Font("Raleway", Font.BOLD, 16));
		R4.setBackground(Color.WHITE);
		R4.setBounds(350, 220, 250, 20);
		add(R4);

		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(R1);
		groupaccount.add(R2);
		groupaccount.add(R3);
		groupaccount.add(R4);

		JLabel card = new JLabel("Card Number");
		card.setFont(new Font("Raleway", Font.BOLD, 22));
		card.setBounds(100, 300, 200, 30);
		add(card);

		JLabel Number = new JLabel("XXXX-XXXX-XXXX-4184");
		Number.setFont(new Font("Raleway", Font.BOLD, 22));
		Number.setBounds(350, 300, 300, 30);
		add(Number);

		JLabel Details = new JLabel("Your 16 Digits Card Number");
		Details.setFont(new Font("Raleway", Font.BOLD, 12));
		Details.setBounds(100, 330, 300, 20);
		add(Details);

		JLabel pin = new JLabel("Pin Number");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(100, 370, 200, 30);
		add(pin);

		JLabel PinDetails = new JLabel("Your 4 Digits Password");
		PinDetails.setFont(new Font("Raleway", Font.BOLD, 12));
		PinDetails.setBounds(100, 400, 300, 20);
		add(PinDetails);

		JLabel PinNumber = new JLabel("XXXX");
		PinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
		PinNumber.setBounds(350, 370, 300, 30);
		add(PinNumber);

		JLabel ServicesRequired = new JLabel("Services Required");
		ServicesRequired.setFont(new Font("Raleway", Font.BOLD, 22));
		ServicesRequired.setBounds(100, 450, 200, 20);
		add(ServicesRequired);

		C1 = new JCheckBox("ATM CARD");
		C1.setBackground(Color.WHITE);
		C1.setFont(new Font("Raleway", Font.BOLD, 16));
		C1.setBounds(100, 500, 200, 30);
		add(C1);

		C2 = new JCheckBox("Internet Banking");
		C2.setBackground(Color.WHITE);
		C2.setFont(new Font("Raleway", Font.BOLD, 16));
		C2.setBounds(350, 500, 200, 30);
		add(C2);

		C3 = new JCheckBox("Mobile Banking");
		C3.setBackground(Color.WHITE);
		C3.setFont(new Font("Raleway", Font.BOLD, 16));
		C3.setBounds(100, 550, 200, 30);
		add(C3);

		C4 = new JCheckBox("Email & SMS Alerts");
		C4.setBackground(Color.WHITE);
		C4.setFont(new Font("Raleway", Font.BOLD, 16));
		C4.setBounds(350, 550, 200, 30);
		add(C4);

		C5 = new JCheckBox("Cheque Book");
		C5.setBackground(Color.WHITE);
		C5.setFont(new Font("Raleway", Font.BOLD, 16));
		C5.setBounds(100, 600, 200, 30);
		add(C5);

		C6 = new JCheckBox("E Statement");
		C6.setBackground(Color.WHITE);
		C6.setFont(new Font("Raleway", Font.BOLD, 16));
		C6.setBounds(350, 600, 200, 30);
		add(C6);

		C7 = new JCheckBox(
				"I hereby declairs that the above entered details are correct to the best of my knowledge  ");
		C7.setBackground(Color.WHITE);
		C7.setFont(new Font("Raleway", Font.BOLD, 12));
		C7.setBounds(100, 680, 600, 30);
		add(C7);

		Submit = new JButton("Submit");
		Submit.setBackground(Color.BLACK);
		Submit.setForeground(Color.WHITE);
		Submit.setFont(new Font("Raleway", Font.BOLD, 14));
		Submit.setBounds(250, 720, 100, 30);
		Submit.addActionListener(this);
		add(Submit);

		Cancle = new JButton("Cancle");
		Cancle.setBackground(Color.BLACK);
		Cancle.setForeground(Color.WHITE);
		Cancle.setFont(new Font("Raleway", Font.BOLD, 14));
		Cancle.setBounds(420, 720, 100, 30);
		Cancle.addActionListener(this);
		add(Cancle);

		getContentPane().setBackground(Color.WHITE);
		setSize(850, 820);
		setLocation(350, 0);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == Submit) {
			String accountType = null;
			if (R1.isSelected()) {
				accountType = "Saving Account";
			} else if (R2.isSelected()) {
				accountType = "Fixed Deposite Account";
			} else if (R3.isSelected()) {
				accountType = "Current Account";
			} else if (R4.isSelected()) {
				accountType = "Recurring Deposite Account";
			}

			Random ran = new Random();
			String cardnumer = " " + Math.abs(ran.nextLong() % 90000000L) + 504093600L;

			String pinNumber = "" + Math.abs(ran.nextLong() % 90000L) + 1000L;

			String facility = "";

			if (C1.isSelected()) {
				facility = facility + "ATM Card";
			} else if (C2.isSelected()) {
				facility = facility + " Internet banking";
			} else if (C3.isSelected()) {
				facility = facility + " Mobile Banking";
			} else if (C4.isSelected()) {
				facility = facility + " Email & SMS Alerts";
			} else if (C5.isSelected()) {
				facility = facility + " Cheque Book";
			} else if (C6.isSelected()) {
				facility = facility + " E-Statement";
			}

			try {
				if (accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is  required");
				} else {
					Conn conn = new Conn();
					String query1 = "insert into Signupfour values('" + formno + "','" + accountType + "','"
							+ cardnumer + "','" + pinNumber + "','" + facility + "')";
					String query2 = "insert into login values('" + formno + "','"+ cardnumer + "','" + pinNumber + "')";
					conn.squery.executeUpdate(query1);
					conn.squery.executeLargeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: "+cardnumer+ "\n Pin: "+pinNumber);
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		} else if (ae.getSource() == Cancle) {

		}

	}

	public static void main(String[] args) {

		new SignUpThree("");
	}

}
