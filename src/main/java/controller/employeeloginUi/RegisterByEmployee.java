package controller.employeeloginUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import service.impl.EmployeeServiceImpl;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class RegisterByEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField employeeName;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField nationality;
	private JTextField gender;
	private JTextField bloodType;
	private JTextField zodiacSign;
	private JTextField education;
	private JTextField certifications;
	private JTextField portfolio;
	private JTextField experience;
	private JLabel errorMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterByEmployee frame = new RegisterByEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterByEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 708);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//====================================================================
		
		JLabel lblNewLabel = new JLabel("員工名字");
		lblNewLabel.setBounds(36, 26, 99, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("員工帳號");
		lblNewLabel_1.setBounds(36, 106, 99, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("員工密碼");
		lblNewLabel_2.setBounds(36, 187, 99, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("地址");
		lblNewLabel_3.setBounds(36, 265, 99, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("電話");
		lblNewLabel_4.setBounds(36, 366, 99, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("信箱");
		lblNewLabel_5.setBounds(303, 26, 99, 50);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("國籍");
		lblNewLabel_6.setBounds(303, 106, 99, 50);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("性別");
		lblNewLabel_7.setBounds(303, 187, 99, 50);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("血型");
		lblNewLabel_8.setBounds(303, 265, 99, 50);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("星座");
		lblNewLabel_9.setBounds(303, 366, 99, 50);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("學歷");
		lblNewLabel_10.setBounds(591, 26, 99, 50);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("證照");
		lblNewLabel_11.setBounds(591, 106, 99, 50);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("作品");
		lblNewLabel_12.setBounds(591, 187, 99, 50);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("經歷");
		lblNewLabel_12_1.setBounds(591, 283, 99, 50);
		contentPane.add(lblNewLabel_12_1);
		//====================================================================
		
		
		employeeName = new JTextField();
		employeeName.setText("帕魯4號");
		employeeName.setBounds(130, 34, 112, 35);
		contentPane.add(employeeName);
		employeeName.setColumns(10);
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.LEFT);
		username.setText("aaabbb");
		username.setColumns(10);
		username.setBounds(130, 110, 112, 35);
		contentPane.add(username);
		
		password = new JTextField();
		password.setText("123456");
		password.setColumns(10);
		password.setBounds(130, 195, 112, 35);
		contentPane.add(password);
		
		address = new JTextField();
		address.setText("帕魯世界");
		address.setColumns(10);
		address.setBounds(130, 280, 112, 35);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.setText("123456789");
		phone.setColumns(10);
		phone.setBounds(130, 381, 112, 35);
		contentPane.add(phone);
		
		email = new JTextField();
		email.setText("111222");
		email.setColumns(10);
		email.setBounds(397, 41, 112, 35);
		contentPane.add(email);
		
		nationality = new JTextField();
		nationality.setText("帕魯國");
		nationality.setColumns(10);
		nationality.setBounds(397, 106, 112, 35);
		contentPane.add(nationality);
		
		gender = new JTextField();
		gender.setText("帕魯");
		gender.setColumns(10);
		gender.setBounds(397, 202, 112, 35);
		contentPane.add(gender);
		
		bloodType = new JTextField();
		bloodType.setText("A");
		bloodType.setColumns(10);
		bloodType.setBounds(397, 280, 112, 35);
		contentPane.add(bloodType);
		
		zodiacSign = new JTextField();
		zodiacSign.setText("帕魯座");
		zodiacSign.setColumns(10);
		zodiacSign.setBounds(397, 369, 112, 35);
		contentPane.add(zodiacSign);
		
		education = new JTextField();
		education.setText("帕魯大學");
		education.setColumns(10);
		education.setBounds(676, 41, 112, 35);
		contentPane.add(education);
		
		certifications = new JTextField();
		certifications.setText("1Z0-819");
		certifications.setColumns(10);
		certifications.setBounds(676, 106, 112, 35);
		contentPane.add(certifications);
		
		portfolio = new JTextField();
		portfolio.setText("帕魯");
		portfolio.setColumns(10);
		portfolio.setBounds(676, 202, 112, 35);
		contentPane.add(portfolio);
		
		experience = new JTextField();
		experience.setText("已經成為帕魯四年");
		experience.setColumns(10);
		experience.setBounds(676, 298, 112, 35);
		contentPane.add(experience);
		//=====================================================================
		errorMessage = new JLabel("New label");
		errorMessage.setBounds(196, 559, 224, 63);
		contentPane.add(errorMessage);
		
		
		//====================================================================
		JButton btnNewButton = new JButton("註冊成為員工");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				String EmployeeName=employeeName.getText();
				String UserName=username.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Phone=phone.getText();
				String Email=email.getText();
				String Nationality=nationality.getText();
				String Gender=gender.getText();
				String BloodType=bloodType.getText();
				String ZodiacSign=zodiacSign.getText();
				String Education=education.getText();
				String Certifications=certifications.getText();
				String Portfolio=portfolio.getText();
				String Experience=experience.getText();
				
				Employee  employee =new Employee(
						EmployeeName,UserName,Password,Address,Phone,Email,
						Nationality,Gender,BloodType,ZodiacSign,Education,Certifications,
						Portfolio,Experience,"","","","","","",null,null,null);
				
				
				if(new EmployeeServiceImpl().addEmployee(employee ))
				{
					AddSuccess addEmployeeSuccess=new AddSuccess();
					addEmployeeSuccess.setVisible(true);
					dispose();
				}
				else
				{
					errorMessage.setText("員工已經存在了");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(480, 544, 140, 93);
		contentPane.add(btnNewButton);
		//====================================================================
	}
}
