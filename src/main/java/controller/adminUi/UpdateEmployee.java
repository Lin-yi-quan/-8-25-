package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import model.Employee;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import service.impl.EmployeeServiceImpl;
import javax.swing.SwingConstants;

public class UpdateEmployee extends JFrame {

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
	private JTextField employeeId;
	private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmployee frame = new UpdateEmployee();
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
	public UpdateEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 703);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//====================================================文字區
		JLabel lblNewLabel = new JLabel("員工名稱");
		lblNewLabel.setBounds(27, 414, 89, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("員工帳號\t");
		lblNewLabel_1.setBounds(27, 474, 89, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("員工密碼");
		lblNewLabel_2.setBounds(27, 535, 89, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("地址");
		lblNewLabel_3.setBounds(27, 598, 89, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("電話");
		lblNewLabel_4.setBounds(263, 414, 89, 43);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("信箱");
		lblNewLabel_5.setBounds(263, 474, 89, 43);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("國籍");
		lblNewLabel_5_1.setBounds(263, 535, 89, 43);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("性別");
		lblNewLabel_5_2.setBounds(263, 598, 89, 43);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("血型");
		lblNewLabel_5_3.setBounds(491, 414, 89, 43);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("星座");
		lblNewLabel_5_4.setBounds(491, 474, 89, 43);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("學歷");
		lblNewLabel_5_5.setBounds(491, 535, 89, 43);
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_6 = new JLabel("證照");
		lblNewLabel_5_6.setBounds(491, 598, 89, 43);
		contentPane.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_5_7 = new JLabel("作品");
		lblNewLabel_5_7.setBounds(703, 428, 89, 43);
		contentPane.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_5_8 = new JLabel("經歷");
		lblNewLabel_5_8.setBounds(703, 488, 89, 43);
		contentPane.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_5_9 = new JLabel("員工ID");
		lblNewLabel_5_9.setBounds(703, 549, 89, 43);
		contentPane.add(lblNewLabel_5_9);
		//====================================================文字區
		
		//================================================格子區
		employeeName = new JTextField();
		employeeName.setBounds(81, 423, 126, 26);
		contentPane.add(employeeName);
		employeeName.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(81, 483, 126, 26);
		contentPane.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(81, 546, 126, 26);
		contentPane.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(81, 609, 126, 26);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(296, 425, 126, 26);
		contentPane.add(phone);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(296, 485, 126, 26);
		contentPane.add(email);
		
		nationality = new JTextField();
		nationality.setColumns(10);
		nationality.setBounds(296, 546, 126, 26);
		contentPane.add(nationality);
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(296, 609, 126, 26);
		contentPane.add(gender);
		
		bloodType = new JTextField();
		bloodType.setColumns(10);
		bloodType.setBounds(523, 425, 126, 26);
		contentPane.add(bloodType);
		
		zodiacSign = new JTextField();
		zodiacSign.setColumns(10);
		zodiacSign.setBounds(523, 485, 126, 26);
		contentPane.add(zodiacSign);
		
		education = new JTextField();
		education.setColumns(10);
		education.setBounds(523, 546, 126, 26);
		contentPane.add(education);
		
		certifications = new JTextField();
		certifications.setColumns(10);
		certifications.setBounds(523, 609, 126, 26);
		contentPane.add(certifications);
		
		portfolio = new JTextField();
		portfolio.setColumns(10);
		portfolio.setBounds(742, 439, 126, 26);
		contentPane.add(portfolio);
		
		experience = new JTextField();
		experience.setColumns(10);
		experience.setBounds(742, 491, 126, 26);
		contentPane.add(experience);
		
		employeeId = new JTextField();
		employeeId.setColumns(10);
		employeeId.setBounds(742, 552, 126, 26);
		contentPane.add(employeeId);
		//================================================格子區
		JButton btnNewButton = new JButton("修改");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Employee employee = new Employee();
				
				employee.setEmployeeName(employeeName.getText());
				employee.setUsername(username.getText());
				employee.setPassword(password.getText());
				employee.setAddress(address.getText());
				employee.setPhone(phone.getText());
				employee.setEmail(email.getText());
				employee.setNationality(nationality.getText());
				employee.setGender(gender.getText());
				employee.setBloodType(bloodType.getText()); 
				employee.setZodiacSign(zodiacSign.getText());
				employee.setEducation(education.getText());
				employee.setCertifications(certifications.getText());
				employee.setPortfolio(portfolio.getText()); 
				employee.setExperience(experience.getText());
				employee.setEmployeeId(Integer.parseInt(employeeId.getText()));
				
				
				boolean success = employeeService.updateEmployee(employee);
				
				if (success) {
				    System.out.println("更新成功！");
				} else {
				    System.out.println("找不到該筆資料，無法更新！");
				}
				
			}
		});
		btnNewButton.setBounds(929, 438, 126, 90);
		contentPane.add(btnNewButton);
		
	
		
		
	}
}
