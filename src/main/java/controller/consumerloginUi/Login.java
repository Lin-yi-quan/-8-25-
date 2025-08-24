package controller.consumerloginUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Main;
import controller.employeeloginUi.LoginByEmployee;
import model.Consumer;
import service.impl.ConsumerServiceImpl;
import util.Tool;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//=================================================
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setBounds(72, 89, 125, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setBounds(72, 203, 125, 61);
		contentPane.add(lblNewLabel_1);
		//=================================================
		username = new JTextField();
		username.setBounds(272, 98, 293, 73);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(272, 192, 293, 73);
		contentPane.add(password);
		//======================================================
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				RegisterByConsumer registerByConsumer=new RegisterByConsumer();
				registerByConsumer.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(188, 371, 125, 73);
		contentPane.add(btnNewButton);
		//======================================================
		JButton btnNewButton_1 = new JButton("一般登入");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				String Username=username.getText();
				String Password=password.getText();
				
				Consumer c=new ConsumerServiceImpl().login(Username, Password);
				//~~~~~~~~~~~~~~~~~~~~~~~
				if(c!=null)
				{
					Tool.saveFile(c,"consumer .txt" );
					
					//~~~~~~~~~
					LoginSuccess loginSuccess=new LoginSuccess();
					loginSuccess.setVisible(true);
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
		btnNewButton_1.setBounds(365, 371, 125, 73);
		contentPane.add(btnNewButton_1);
		//======================================================
		JButton btnNewButton_1_1 = new JButton("切換員工登入");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				LoginByEmployee loginByEmployee=new LoginByEmployee();
				loginByEmployee.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
			}
		});
		btnNewButton_1_1.setBounds(692, 371, 125, 73);
		contentPane.add(btnNewButton_1_1);
		//=================================================
		
	}
}
