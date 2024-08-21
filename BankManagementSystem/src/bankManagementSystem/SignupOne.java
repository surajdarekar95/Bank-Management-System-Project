package bankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.*;

public class SignupOne extends JFrame implements ActionListener {

	long random;
	JTextField NameText, fnameText, emailText, AdressText, CityText, stateText, pinText;
	JRadioButton male, female, married, unmarried, other;
	JButton next;
	JDateChooser dateChooser;

	SignupOne() {
		setTitle("SIGN UP FORM");
		setLayout(null);
		Random ran = new Random();
		random = (Math.abs(ran.nextLong() % 90000L + 10000L));

		JLabel FormNo = new JLabel("APPLICATION FORM NO " + random);
		FormNo.setFont(new Font("Raleway", Font.BOLD, 38));
		FormNo.setBounds(140, 20, 600, 40);
		add(FormNo);

		JLabel PersnolDetails = new JLabel("Page 1:Personal Details ");
		PersnolDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		PersnolDetails.setBounds(290, 80, 400, 30);
		add(PersnolDetails);

		JLabel name = new JLabel("Name");
		name.setFont(new Font("Raleway", Font.BOLD, 22));
		name.setBounds(100, 140, 100, 30);
		add(name);

		NameText = new JTextField();
		NameText.setFont(new Font("Raleway", Font.BOLD, 14));
		NameText.setBounds(300, 140, 400, 30);
		add(NameText);

		JLabel fname = new JLabel("Father Name:");
		fname.setFont(new Font("Raleway", Font.BOLD, 22));
		fname.setBounds(100, 190, 200, 30);
		add(fname);

		fnameText = new JTextField();
		fnameText.setFont(new Font("Raleway", Font.BOLD, 14));
		fnameText.setBounds(300, 190, 400, 30);
		add(fnameText);

		JLabel dob = new JLabel("Date of Birth");
		dob.setFont(new Font("Raleway", Font.BOLD, 22));
		dob.setBounds(100, 240, 200, 30);
		add(dob);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setFont(new Font("Arial", Font.BOLD, 18));
		add(dateChooser);

		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Raleway", Font.BOLD, 22));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(300, 290, 120, 30);
		male.setBackground(Color.WHITE);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(Color.WHITE);
		add(female);

		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);

		JLabel email = new JLabel("Email Adress:");
		email.setFont(new Font("Raleway", Font.BOLD, 22));
		email.setBounds(100, 340, 200, 30);
		add(email);

		emailText = new JTextField();
		emailText.setFont(new Font("Raleway", Font.BOLD, 14));
		emailText.setBounds(300, 340, 400, 30);
		add(emailText);

		JLabel maritalstatus = new JLabel("Marital Status:");
		maritalstatus.setFont(new Font("Raleway", Font.BOLD, 22));
		maritalstatus.setBounds(100, 390, 200, 30);
		add(maritalstatus);

		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.WHITE);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);

		other = new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.WHITE);
		add(other);

		ButtonGroup marriedgroup = new ButtonGroup();
		marriedgroup.add(married);
		marriedgroup.add(unmarried);
		marriedgroup.add(other);

		JLabel adress = new JLabel("Adress:");
		adress.setFont(new Font("Raleway", Font.BOLD, 22));
		adress.setBounds(100, 440, 200, 30);
		add(adress);

		AdressText = new JTextField();
		AdressText.setFont(new Font("Raleway", Font.BOLD, 14));
		AdressText.setBounds(300, 440, 400, 30);
		add(AdressText);

		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 22));
		city.setBounds(100, 490, 200, 30);
		add(city);

		CityText = new JTextField();
		CityText.setFont(new Font("Raleway", Font.BOLD, 14));
		CityText.setBounds(300, 490, 400, 30);
		add(CityText);

		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 22));
		state.setBounds(100, 540, 200, 30);
		add(state);

		stateText = new JTextField();
		stateText.setFont(new Font("Raleway", Font.BOLD, 14));
		stateText.setBounds(300, 540, 400, 30);
		add(stateText);

		JLabel pincode = new JLabel("Pin Code:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 22));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);

		pinText = new JTextField();
		pinText.setFont(new Font("Raleway", Font.BOLD, 14));
		pinText.setBounds(300, 590, 400, 30);
		add(pinText);

		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Railway,", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);

		getContentPane().setBackground(Color.WHITE);
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String formNo = "" + random;
		String name = NameText.getText();
		String fname = fnameText.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		} else if (female.isSelected()) {
			gender = "Female";
		}

		String email = emailText.getText();

		String marital = "";
		if (married.isSelected()) {
			marital = "married";
		} else if (unmarried.isSelected()) {
			marital = "unmarried";
		} else if (other.isSelected()) {
			marital = "other";
		}
		// AdressText, CityText, stateText, pinText
		String address = AdressText.getText();
		String City = CityText.getText();
		String State = stateText.getText();
		String Pin = pinText.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}
			else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"',"
						+ "'"+gender+"','"+email+"','"+marital+"','"+address+"','"+City+"','"+State+"','"+Pin+"')";
				c.squery.executeUpdate(query);
				
				setVisible(false);
				new SignUpTwo(formNo).setVisible(true);
			}
		}catch(Exception we){
		
			System.out.println(we);
		}

	}

	public static void main(String[] args) {

		new SignupOne();
	}

}
