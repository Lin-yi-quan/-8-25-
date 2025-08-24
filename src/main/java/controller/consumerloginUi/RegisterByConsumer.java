package controller.consumerloginUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Consumer;
import service.impl.ConsumerServiceImpl;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterByConsumer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField nationality;
	private JTextField gender;
	private JTextField bloodType;
	private JTextField zodiacSign;
	private JTextField job;
	private JTextField age;
	private JTextField height;
	private JTextField weight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterByConsumer frame = new RegisterByConsumer();
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
	public RegisterByConsumer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//===========================================================文字
		JLabel lblNewLabel = new JLabel("姓名:");
		lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel.setBounds(59, 54, 71, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號:");
		lblNewLabel_1.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(59, 119, 71, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼:");
		lblNewLabel_2.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_2.setBounds(59, 178, 71, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("地址:");
		lblNewLabel_3.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_3.setBounds(59, 252, 71, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("電話:");
		lblNewLabel_4.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_4.setBounds(59, 326, 71, 41);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("信箱:");
		lblNewLabel_5.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_5.setBounds(278, 54, 71, 41);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("國籍:");
		lblNewLabel_6.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_6.setBounds(278, 119, 71, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("性別:");
		lblNewLabel_7.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_7.setBounds(278, 178, 71, 41);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("血型:");
		lblNewLabel_8.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_8.setBounds(278, 252, 71, 41);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("星座:");
		lblNewLabel_9.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_9.setBounds(278, 326, 71, 41);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("工作:");
		lblNewLabel_10.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_10.setBounds(474, 54, 71, 41);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("年齡:");
		lblNewLabel_11.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_11.setBounds(474, 119, 71, 41);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("身高:");
		lblNewLabel_12.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_12.setBounds(474, 178, 71, 41);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("體重:");
		lblNewLabel_13.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_13.setBounds(474, 252, 71, 41);
		contentPane.add(lblNewLabel_13);
		//===========================================================文字
		
		//=================================================填入文字
		name = new JTextField();
		name.setText("妹妹");
		name.setBounds(126, 61, 110, 30);
		contentPane.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setText("abc");
		username.setColumns(10);
		username.setBounds(126, 119, 110, 30);
		contentPane.add(username);
		
		password = new JTextField();
		password.setText("123");
		password.setColumns(10);
		password.setBounds(126, 189, 110, 30);
		contentPane.add(password);
		
		address = new JTextField();
		address.setText("台北");
		address.setColumns(10);
		address.setBounds(126, 263, 110, 30);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.setText("123");
		phone.setColumns(10);
		phone.setBounds(126, 337, 110, 30);
		contentPane.add(phone);
		
		email = new JTextField();
		email.setText("123456");
		email.setColumns(10);
		email.setBounds(336, 65, 110, 30);
		contentPane.add(email);
		
		nationality = new JTextField();
		nationality.setText("台灣");
		nationality.setColumns(10);
		nationality.setBounds(336, 119, 110, 30);
		contentPane.add(nationality);
		
		gender = new JTextField();
		gender.setText("妹妹");
		gender.setColumns(10);
		gender.setBounds(336, 189, 110, 30);
		contentPane.add(gender);
		
		bloodType = new JTextField();
		bloodType.setText("A");
		bloodType.setColumns(10);
		bloodType.setBounds(336, 263, 110, 30);
		contentPane.add(bloodType);
		
		zodiacSign = new JTextField();
		zodiacSign.setText("妹妹座");
		zodiacSign.setColumns(10);
		zodiacSign.setBounds(336, 337, 110, 30);
		contentPane.add(zodiacSign);
		
		job = new JTextField();
		job.setText("學生");
		job.setColumns(10);
		job.setBounds(553, 65, 110, 30);
		contentPane.add(job);
		
		age = new JTextField();
		age.setText("9");
		age.setColumns(10);
		age.setBounds(553, 119, 110, 30);
		contentPane.add(age);
		
		height = new JTextField();
		height.setText("150");
		height.setColumns(10);
		height.setBounds(553, 189, 110, 30);
		contentPane.add(height);
		
		weight = new JTextField();
		weight.setText("40");
		weight.setColumns(10);
		weight.setBounds(553, 259, 110, 30);
		contentPane.add(weight);
		//=================================================填入文字
		JLabel errorMessage = new JLabel("New label");
		errorMessage.setBounds(171, 404, 319, 48);
		contentPane.add(errorMessage);
		//=================================================按鈕
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				String Name=name.getText();
				String UserName=username.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Phone=phone.getText();
				String Email=email.getText();
				String Nationality=nationality.getText();
				String Gender=gender.getText();
				String BloodType=bloodType.getText();
				String ZodiacSign=zodiacSign.getText();
				String Job=job.getText();
				Integer Age=Integer.parseInt(age.getText());
				Integer Height=Integer.parseInt(height.getText());
				Integer Weight=Integer.parseInt(weight.getText());
				
			
				
				Consumer  consumer =new Consumer(
						Name,UserName,Password,Address,Phone,Email,
						Nationality,Gender,BloodType,ZodiacSign,Job,
						Age,Height,Weight,"",false,false);
				//~~~~~~~~~~~~~~~~~~~~~
				if(new ConsumerServiceImpl().addConsumer(consumer ))
				{
					AddSuccess addConsumerSuccess=new AddSuccess();
					addConsumerSuccess.setVisible(true);
					dispose();
				}
				else
				{
					errorMessage.setText("帳號已經被註冊了");
				}
				
			}
		});
		btnNewButton.setBounds(553, 336, 149, 85);
		contentPane.add(btnNewButton);
		
		
		//====================================================按鈕
	
	}
}
