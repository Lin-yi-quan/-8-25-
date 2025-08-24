package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Consumer;
import service.impl.ConsumerServiceImpl;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateConsumer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel 平台;
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
	
	private ConsumerServiceImpl consumerService = new ConsumerServiceImpl();
	private JTextField consumerId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateConsumer frame = new UpdateConsumer();
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
	public UpdateConsumer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 551);
		平台 = new JPanel();
		平台.setBackground(new Color(128, 255, 255));
		平台.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(平台);
		平台.setLayout(null);
		//===========================================顯示顧客訊息
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 10, 789, 304);
		平台.add(textArea);
		//==============================================文字
		
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setBounds(10, 323, 67, 28);
		平台.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setBounds(10, 362, 67, 28);
		平台.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setBounds(10, 404, 67, 28);
		平台.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("地址");
		lblNewLabel_3.setBounds(10, 443, 67, 28);
		平台.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("電話");
		lblNewLabel_4.setBounds(184, 323, 67, 28);
		平台.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("信箱");
		lblNewLabel_5.setBounds(184, 365, 67, 28);
		平台.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("國籍");
		lblNewLabel_6.setBounds(184, 404, 67, 28);
		平台.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("性別");
		lblNewLabel_7.setBounds(184, 443, 67, 28);
		平台.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("血型");
		lblNewLabel_8.setBounds(357, 324, 67, 28);
		平台.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("星座");
		lblNewLabel_9.setBounds(357, 365, 67, 28);
		平台.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("工作");
		lblNewLabel_10.setBounds(357, 404, 67, 28);
		平台.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("年齡");
		lblNewLabel_11.setBounds(357, 443, 67, 28);
		平台.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("身高");
		lblNewLabel_12.setBounds(517, 324, 67, 28);
		平台.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("體重");
		lblNewLabel_13.setBounds(517, 355, 67, 28);
		平台.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("客人ID");
		lblNewLabel_14.setBounds(517, 404, 46, 15);
		平台.add(lblNewLabel_14);
		//==========================================格子
		name = new JTextField();
		name.setText("測試人員");
		name.setBounds(56, 327, 96, 21);
		平台.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setText("修改功能測試");
		username.setColumns(10);
		username.setBounds(56, 366, 96, 21);
		平台.add(username);
		
		password = new JTextField();
		password.setText("修改功能測試");
		password.setColumns(10);
		password.setBounds(56, 408, 96, 21);
		平台.add(password);
		
		address = new JTextField();
		address.setText("修改功能測試");
		address.setColumns(10);
		address.setBounds(56, 447, 96, 21);
		平台.add(address);
		
		phone = new JTextField();
		phone.setText("修改功能測試");
		phone.setColumns(10);
		phone.setBounds(227, 327, 96, 21);
		平台.add(phone);
		
		email = new JTextField();
		email.setText("修改功能測試");
		email.setColumns(10);
		email.setBounds(227, 372, 96, 21);
		平台.add(email);
		
		nationality = new JTextField();
		nationality.setText("修改功能測試");
		nationality.setColumns(10);
		nationality.setBounds(227, 408, 96, 21);
		平台.add(nationality);
		
		gender = new JTextField();
		gender.setText("修改功能測試");
		gender.setColumns(10);
		gender.setBounds(227, 447, 96, 21);
		平台.add(gender);
		
		bloodType = new JTextField();
		bloodType.setText("測試");
		bloodType.setColumns(10);
		bloodType.setBounds(392, 324, 96, 21);
		平台.add(bloodType);
		
		zodiacSign = new JTextField();
		zodiacSign.setText("測試");
		zodiacSign.setColumns(10);
		zodiacSign.setBounds(392, 372, 96, 21);
		平台.add(zodiacSign);
		
		job = new JTextField();
		job.setText("測試");
		job.setColumns(10);
		job.setBounds(392, 408, 96, 21);
		平台.add(job);
		
		age = new JTextField();
		age.setText("9");
		age.setColumns(10);
		age.setBounds(392, 447, 96, 21);
		平台.add(age);
		
		height = new JTextField();
		height.setText("150");
		height.setColumns(10);
		height.setBounds(555, 324, 96, 21);
		平台.add(height);
		
		weight = new JTextField();
		weight.setText("40");
		weight.setColumns(10);
		weight.setBounds(555, 359, 96, 21);
		平台.add(weight);
		
		consumerId = new JTextField();
		consumerId.setText("1");
		consumerId.setColumns(10);
		consumerId.setBounds(555, 401, 96, 21);
		平台.add(consumerId);
		//===========================================
		JButton btnNewButton = new JButton("修改");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Consumer consumer = new Consumer();
				
				consumer.setName(name.getText());
				consumer.setUsername(username.getText());
				consumer.setPassword(password.getText());
				consumer.setAddress(address.getText());
				consumer.setPhone(phone.getText());
				consumer.setEmail(email.getText());
				consumer.setNationality(nationality.getText());
				consumer.setGender(gender.getText());
				consumer.setBloodType(bloodType.getText()); // 血型
				consumer.setZodiacSign(zodiacSign.getText());
				consumer.setJob(job.getText());
				
				// 數字轉換
				consumer.setAge(Integer.parseInt(age.getText()));
				consumer.setHeight(Integer.parseInt(height.getText()));
				consumer.setWeight(Integer.parseInt(weight.getText()));
				
				// 設定 ID
				consumer.setConsumerId(Integer.parseInt(consumerId.getText()));

				boolean success = consumerService.updateConsumer(consumer);
				
				if (success) {
					System.out.println("更新成功！");
				} else {
					System.out.println("找不到該筆資料，無法更新！");
				}
			}
		});
		btnNewButton.setBounds(701, 346, 113, 47);
		平台.add(btnNewButton);
		
		
		
		
		//============================================
	}
}
