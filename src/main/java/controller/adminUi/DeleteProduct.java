package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import model.Product;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import service.impl.EmployeeServiceImpl;
import service.impl.ProductServiceImpl;

public class DeleteProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField productId;
	
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteProduct frame = new DeleteProduct();
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
	public DeleteProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 683);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//======================================================
		JTextArea textArea = new JTextArea();
		textArea.setBounds(141, 34, 717, 404);
		contentPane.add(textArea);
		//======================================================
		JLabel lblNewLabel = new JLabel("消滅壞掉的產品ID");
		lblNewLabel.setBounds(54, 465, 122, 83);
		contentPane.add(lblNewLabel);
		//======================================================
		productId = new JTextField();
		productId.setBounds(271, 496, 347, 60);
		contentPane.add(productId);
		productId.setColumns(10);
		//======================================================
		JButton btnNewButton = new JButton("消滅產品");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int DeleteId=Integer.parseInt(productId.getText());
				
				Product p=new Product();  
				p.setProductId(DeleteId);
				
				productServiceImpl.deleteProduct(p);
			}
		});
		btnNewButton.setBounds(703, 495, 193, 83);
		contentPane.add(btnNewButton);
		
		
		//======================================================
	}
}
