package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import model.Product;
import service.impl.EmployeeServiceImpl;
import service.impl.ProductServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class AddProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField price;
	private JTextField stock;
	private JTextField google;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 716);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//===========================================================
		JLabel lblNewLabel = new JLabel("新增商品名稱");
		lblNewLabel.setBounds(99, 399, 103, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("新增商品價格");
		lblNewLabel_1.setBounds(282, 399, 103, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("新增商品庫存");
		lblNewLabel_2.setBounds(486, 399, 103, 53);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("新增商品評價");
		lblNewLabel_3.setBounds(699, 399, 103, 53);
		contentPane.add(lblNewLabel_3);
//==============================================================
		name = new JTextField();
		name.setText("風暴之劍");
		name.setBounds(86, 461, 134, 62);
		contentPane.add(name);
		name.setColumns(10);
		
		price = new JTextField();
		price.setText("1300");
		price.setColumns(10);
		price.setBounds(264, 462, 134, 62);
		contentPane.add(price);
		
		stock = new JTextField();
		stock.setText("6");
		stock.setColumns(10);
		stock.setBounds(465, 462, 134, 62);
		contentPane.add(stock);
		
		google = new JTextField();
		google.setText("很貴");
		google.setColumns(10);
		google.setBounds(668, 461, 134, 62);
		contentPane.add(google);
//===========================================================
//==============================================================
				JButton btnNewButton = new JButton("新增商品");
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						
						String Name=name.getText();
						Integer Price = Integer.parseInt(price.getText());
						Integer Stock = Integer.parseInt(stock.getText());
						String Google=google.getText();
						
						Product  product =new Product(Name,Price,Stock,Google,true);
						
						new ProductServiceImpl().addProduct(product );
					}
				});
				btnNewButton.setBounds(467, 575, 122, 69);
				contentPane.add(btnNewButton);
//==============================================================
				JButton btnNewButton_1 = new JButton("上一頁");
				btnNewButton_1.setBounds(83, 575, 122, 69);
				contentPane.add(btnNewButton_1);
//==============================================================
				JButton btnNewButton_2 = new JButton("重整頁面");
				btnNewButton_2.setBounds(662, 575, 122, 69);
				contentPane.add(btnNewButton_2);
				
				
				
				
		
//===========================================================
	}
}
