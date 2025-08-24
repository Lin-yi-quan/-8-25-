package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.employeeloginUi.LoginByEmployee;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain frame = new AdminMain();
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
	public AdminMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 613);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//==========================================================
		JButton btnNewButton = new JButton("增加訂單");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				AddProduct addProduct=new AddProduct();
				addProduct.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton.setBounds(0, 167, 173, 52);
		contentPane.add(btnNewButton);
		//==========================================================
		JButton btnNewButton_1 = new JButton("修改顧客");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				UpdateConsumer updateConsumer=new UpdateConsumer();
				updateConsumer.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_1.setBounds(220, 92, 173, 52);
		contentPane.add(btnNewButton_1);
		//==========================================================
		JButton btnNewButton_2 = new JButton("修改員工");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				UpdateEmployee updateEmployee=new UpdateEmployee();
				updateEmployee.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_2.setBounds(220, 190, 173, 52);
		contentPane.add(btnNewButton_2);
		//==========================================================
		JButton btnNewButton_3 = new JButton("修改訂單");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				UpdateProduct updateProduct=new UpdateProduct();
				updateProduct.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_3.setBounds(220, 285, 173, 52);
		contentPane.add(btnNewButton_3);
		//==========================================================
		JButton btnNewButton_4 = new JButton("消滅顧客");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				DeleteConsumer deleteConsumer=new DeleteConsumer();
				deleteConsumer.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_4.setBounds(480, 92, 173, 52);
		contentPane.add(btnNewButton_4);
		//==========================================================
		JButton btnNewButton_5 = new JButton("消滅員工");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				DeleteEmployee deleteEmployee=new DeleteEmployee();
				deleteEmployee.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_5.setBounds(480, 190, 173, 52);
		contentPane.add(btnNewButton_5);
		//==========================================================
		JButton btnNewButton_6 = new JButton("消滅訂單");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				DeleteProduct deleteProduct=new DeleteProduct();
				deleteProduct.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_6.setBounds(480, 285, 173, 52);
		contentPane.add(btnNewButton_6);
		//==========================================================
		JButton btnNewButton_7 = new JButton("回員工登入");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				LoginByEmployee loginByEmployee=new LoginByEmployee();
				loginByEmployee.setVisible(true);
				dispose();
			}
		});
		btnNewButton_7.setFont(new Font("新細明體", Font.PLAIN, 16));
		btnNewButton_7.setBounds(241, 482, 173, 52);
		contentPane.add(btnNewButton_7);
		//==========================================================
	}

}
