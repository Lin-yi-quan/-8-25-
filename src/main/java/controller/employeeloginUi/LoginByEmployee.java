package controller.employeeloginUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.consumerloginUi.Login;
import controller.consumerloginUi.LoginError;
import controller.consumerloginUi.LoginSuccess;
import controller.shopUi.Shop;
import model.Consumer;
import model.Employee;
import service.impl.ConsumerServiceImpl;
import service.impl.EmployeeServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginByEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginByEmployee frame = new LoginByEmployee();
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
	public LoginByEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//===========================================
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setBounds(62, 95, 125, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setBounds(62, 184, 125, 36);
		contentPane.add(lblNewLabel_1);
		//===========================================
		username = new JTextField();
		username.setBounds(306, 92, 214, 56);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(306, 178, 214, 56);
		contentPane.add(password);
		//===========================================
		JButton btnNewButton = new JButton("員工登入");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//employee
				
				String Username=username.getText();
				String Password=password.getText();
				
				Employee employee=new EmployeeServiceImpl().login(Username, Password);
				//~~~~~~~~~~~~~~~~~~~~~~~
				if(employee!=null)
				{
					Tool.saveFile(employee,"consumer .txt" );
					
					//~~~~~~~~~
					LoginSuccessByEmployee loginSuccessByEmployee=new LoginSuccessByEmployee();
					loginSuccessByEmployee.setVisible(true);
					dispose();
					
				}
				else
				{
					LoginError loginError=new LoginError();
					loginError.setVisible(true);
					dispose();
				}	
				
				
				
			}
		});
		btnNewButton.setBounds(325, 275, 158, 56);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("註冊成為員工");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				RegisterByEmployee registerByEmployee=new RegisterByEmployee();
				registerByEmployee.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(125, 275, 125, 56);
		contentPane.add(btnNewButton_1);
		//================================================
		btnNewButton_2 = new JButton("切換一般登入");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Login login=new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(166, 404, 119, 56);
		contentPane.add(btnNewButton_2);
		//===========================================
	}
}
