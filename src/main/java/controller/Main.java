package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import controller.consumerloginUi.Login;
import controller.employeeloginUi.LoginByEmployee;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import java.awt.Font;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//===================================================
		JLabel lblNewLabel = new JLabel("時間");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel.setBounds(139, 49, 196, 55);
		contentPane.add(lblNewLabel);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
		    @Override
		    public void run() {
		        String now = LocalDateTime.now().format(formatter);
		        // 更新 JLabel，要透過 SwingUtilities 確保在 UI 執行緒
		        SwingUtilities.invokeLater(() -> lblNewLabel.setText(now));
		    }
		}, 0, 1000); // 每秒更新一次
		
		//===================================================
		JButton btnNewButton = new JButton("進一般登入");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Login login=new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(46, 222, 189, 77);
		contentPane.add(btnNewButton);
		//===================================================
		JButton btnNewButton_1 = new JButton("進員工登入");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				LoginByEmployee loginByEmployee=new LoginByEmployee();
				loginByEmployee.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(307, 222, 189, 77);
		contentPane.add(btnNewButton_1);
		
		
		
		
		//===================================================

	}

}
