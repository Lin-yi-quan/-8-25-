package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import model.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField stock;
	private JTextField google;
	private JTextField productId;
	private JTextField price;
	private ProductService productService;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProduct frame = new UpdateProduct();
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
	public UpdateProduct() {
		//~~~~~~~~~~~~~~~~~~
		productService = new ProductServiceImpl();
		//~~~~~~~~~~~~~~~~~~~
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1129, 704);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//=====================================================
		JLabel lblNewLabel = new JLabel("商品名稱");
		lblNewLabel.setBounds(75, 379, 111, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" 商品價格");
		lblNewLabel_1.setBounds(75, 478, 111, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" 商品庫存");
		lblNewLabel_2.setBounds(452, 379, 111, 49);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblGoogle = new JLabel("google評價");
		lblGoogle.setBounds(452, 478, 111, 49);
		contentPane.add(lblGoogle);
		
		JLabel lblid = new JLabel("商品ID");
		lblid.setBounds(75, 562, 111, 49);
		contentPane.add(lblid);
		//==================================
		name = new JTextField();
		name.setBounds(197, 393, 159, 35);
		contentPane.add(name);
		name.setColumns(10);
		
		price = new JTextField();
		price.setColumns(10);
		price.setBounds(196, 478, 159, 35);
		contentPane.add(price);
		
		stock = new JTextField();
		stock.setColumns(10);
		stock.setBounds(579, 393, 159, 35);
		contentPane.add(stock);
		
		google = new JTextField();
		google.setColumns(10);
		google.setBounds(579, 492, 159, 35);
		contentPane.add(google);
		
		productId = new JTextField();
		productId.setColumns(10);
		productId.setBounds(197, 576, 159, 35);
		contentPane.add(productId);
		//==================================
		JButton btnNewButton = new JButton("修改");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				
				
				Product product = new Product();
				product.setName(name.getText());
				product.setPrice(Integer.parseInt(price.getText()));
				product.setStock(Integer.parseInt(stock.getText()));
				product.setGoogle(google.getText());
				
				product.setProductId(Integer.parseInt(productId.getText()));
				
				boolean success = productService.updateProduct(product);
				
				if (success) {
				    System.out.println("更新成功！");
				} else {
				    System.out.println("找不到該筆資料，無法更新！");
				}
				
			}
		});
		btnNewButton.setBounds(567, 575, 167, 59);
		contentPane.add(btnNewButton);
		//=====================================================
		
		
	}
}
