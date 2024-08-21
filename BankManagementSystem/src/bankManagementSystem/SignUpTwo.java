package bankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignUpTwo extends JFrame implements ActionListener {

	long random;
	JTextField  PANText, AdharText;
	JRadioButton AccountYES, AccountNO, SYes, SNo;
	JButton next;
	JComboBox religion,cat,income,Qualification,Occupation1;
	String formo;
	

	SignUpTwo(String formNo) {
		this.formo = formNo;
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		setLayout(null);

		// we don't required random numbers on signup two page that's why we have
		// commented this code
		/*
		 * Random ran = new Random(); random = (Math.abs(ran.nextLong() % 9000L +
		 * 1000L));
		 */

		JLabel AdditionalDetails = new JLabel("Page 2: Additional Details ");
		AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		AdditionalDetails.setBounds(290, 80, 400, 30);
		add(AdditionalDetails);

		JLabel name = new JLabel("Religion");
		name.setFont(new Font("Raleway", Font.BOLD, 22));
		name.setBounds(100, 140, 100, 30);
		add(name);

		String[] Religions = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
		religion = new JComboBox(Religions);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		

		
		JLabel fname = new JLabel("Category");
		fname.setFont(new Font("Raleway", Font.BOLD, 22));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		
		String Catvalue[]= {"Open","SC","ST","Other"};
		cat = new JComboBox(Catvalue);
		cat.setBackground(Color.WHITE);
		cat.setBounds(300, 190, 400, 30);
		add(cat);

		

		JLabel dob = new JLabel("Income");
		dob.setFont(new Font("Raleway", Font.BOLD, 22));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		String Income[]= {"Null","<1,50,000","<3,50,000","<5,50,000","Upto 10,00,000"};
		income = new JComboBox(Income);
		income.setBackground(Color.WHITE);
		income.setBounds(300, 240, 400, 30);
		add(income);




		JLabel Qualification1 = new JLabel("Qualification ");
		Qualification1.setFont(new Font("Raleway", Font.BOLD, 22));
		Qualification1.setBounds(100, 340, 200, 30);
		add(Qualification1);
		
		String Education[]= {"Non-Graduation","Graduation","post-Graduation","Doctarate","Others"};
		Qualification = new JComboBox(Education);
		Qualification.setBackground(Color.WHITE);
		Qualification.setBounds(300, 340, 400, 30);
		add(Qualification);

		
	
		/*JLabel email = new JLabel("Qualification");
		email.setFont(new Font("Raleway", Font.BOLD, 22));
		email.setBounds(100, 340, 200, 30);
		add(email)*/

		

		JLabel yourOcc = new JLabel("Occupation");
		yourOcc.setFont(new Font("Raleway", Font.BOLD, 22));
		yourOcc.setBounds(100, 390, 200, 30);
		add(yourOcc);
		
		String OCC[]= {"Salaried","Self-Emplyoed","Bussiness","Student","Retired","Others"};
		Occupation1 = new JComboBox(OCC);
		Occupation1.setBackground(Color.WHITE);
		Occupation1.setBounds(300, 390, 400, 30);
		add(Occupation1);



		JLabel PAN = new JLabel("PAN Num:");
		PAN.setFont(new Font("Raleway", Font.BOLD, 22));
		PAN.setBounds(100, 440, 200, 30);
		add(PAN);

		PANText = new JTextField();
		PANText.setFont(new Font("Raleway", Font.BOLD, 14));
		PANText.setBounds(300, 440, 400, 30);
		add(PANText);

		JLabel Adhar = new JLabel("Adhar Num:");
		Adhar.setFont(new Font("Raleway", Font.BOLD, 22));
		Adhar.setBounds(100, 490, 200, 30);
		add(Adhar);

		AdharText = new JTextField();
		AdharText.setFont(new Font("Raleway", Font.BOLD, 14));
		AdharText.setBounds(300, 490, 400, 30);
		add(AdharText);

		JLabel state = new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway", Font.BOLD, 22));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		SYes = new JRadioButton("Yes");
		SYes.setBounds(300, 540, 100, 30);
		SYes.setBackground(Color.WHITE);
		add(SYes);
		
		SNo = new JRadioButton("No");
		SNo.setBounds(500, 540, 100, 30);
		SNo.setBackground(Color.WHITE);
		add(SNo);
		
		ButtonGroup CitisonGroup =new ButtonGroup();
		CitisonGroup.add(SYes);
		CitisonGroup.add(SNo);

		

		JLabel EXaccount = new JLabel("Existing Account:");
		EXaccount.setFont(new Font("Raleway", Font.BOLD, 22));
		EXaccount.setBounds(100, 590, 200, 30);
		add(EXaccount);
		
		AccountYES = new JRadioButton("Yes");
		AccountYES.setBounds(300, 590, 100, 30);
		AccountYES.setBackground(Color.WHITE);
		add(AccountYES);
		
		AccountNO = new JRadioButton("No");
		AccountNO.setBounds(500, 590, 100, 30);
		AccountNO.setBackground(Color.WHITE);
		add(AccountNO);
		
		ButtonGroup AccontGroup =new ButtonGroup();
		AccontGroup.add(AccountYES);
		AccontGroup.add(AccountNO);

		

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
		
		String UserReligion = (String) religion.getSelectedItem();
		String UserCategory = (String)cat.getSelectedItem();
		String UserIncome = (String)income.getSelectedItem();
		String UserQualification = (String) Qualification.getSelectedItem();
		String UserOccupation = (String) Occupation1.getSelectedItem();

		
		String CCitizan = null;
		if (SYes.isSelected()) {
			CCitizan = "YES";
		} else if (SNo.isSelected()) {
			CCitizan = "NO";
		}


		String ACCont = "";
		if (AccountYES.isSelected()) {
			ACCont = "Yes";
		} else if (AccountNO.isSelected()) {
			ACCont = "NO";
		} 
		// PANText, CityText
		String Pan = PANText.getText();
		String Adhar = AdharText.getText();


		try {
			
				Conn c = new Conn();
				String query = "insert into signuoTwo values('" + formo + "','" + UserReligion + "','" + UserCategory + "','" + UserIncome + "','" + UserQualification
						+ "'," + "'" + UserOccupation + "','" + Pan + "','" + Adhar + "','" + CCitizan + "','" + ACCont + "')";
				c.squery.executeUpdate(query);
				
				setVisible(false);
				new SignUpThree(formo).setVisible(true);
				
				
			
		} catch (Exception we) {

			System.out.println(we);
		}

	}

	public static void main(String[] args) {

		new SignUpTwo("");
	}
}
