package controller.shopUi;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.consumerloginUi.LoginError;
import dao.impl.EmployeeDaoImpl;
import dao.impl.PorderDaoImpl;
import dao.impl.ProductDaoImpl;
import model.Employee;
import model.OrderItem;

import model.Product;

import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shop extends JFrame {
	private List<JTextField> qtyFieldList = new ArrayList<>();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextArea textArea; // 將 JTextArea 宣告為成員變數，以便在其他方法中存取<===========java專家說的
	private List<Product> productList; // 將 productList 宣告為成員變數<===========java專家說的
	private List<OrderItem> orderItems = new ArrayList<>(); // 用於存放購物車中的商品<===========java專家說的


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop frame = new Shop();
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
	public Shop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 718);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//==================================
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // 垂直排列<===========java專家說的
		panel.setBounds(10, 10, 498, 562);
		contentPane.add(panel);
		//===============================================
		productList = new ProductDaoImpl().readAll(); // 初始化 productList<===========java專家說的
		

		for(Product p : productList) 
		{
			//~~~~~~~~~~~~~~~~~~~~~~~~
		    JPanel productPanel = new JPanel();
		    productPanel.setPreferredSize(new Dimension(780, 60));
		    productPanel.setLayout(null);

		    JLabel nameLabel = new JLabel(p.getName());
		    nameLabel.setBounds(10, 10, 200, 25);
		    productPanel.add(nameLabel);


		    JLabel priceLabel = new JLabel("價格：" + p.getPrice());
		    priceLabel.setBounds(220, 10, 100, 25);
		    productPanel.add(priceLabel);

		    JTextField qtyField = new JTextField("0");
		    qtyField.setBounds(330, 10, 50, 25);
		    
		    //~~~~~~~~~~~~~~~~~~~~~~~~~
		    
		    
		    productPanel.add(qtyField);
		    qtyFieldList.add(qtyField);
		    
		    panel.add(productPanel);
		    
		}  
		    
		//===============================================
		//========================================================
		
		//=====================================================
		JComboBox <Employee>comboBox = new JComboBox();
		comboBox.setBounds(462, 608, 159, 47);
		
		List<Employee> employeeList = new EmployeeDaoImpl().selectAll();
		for (Employee emp : employeeList) 
		{
		    comboBox.addItem(emp);
		}
		contentPane.setLayout(null);
		
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("服務的員工");
		lblNewLabel.setBounds(336, 611, 87, 41);
		contentPane.add(lblNewLabel);
		//===============================================
		
				JButton btnNewButton = new JButton("送入購物車");
				btnNewButton.setBounds(83, 603, 188, 57);
				btnNewButton.addMouseListener
				(new MouseAdapter() 
				 {
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						 orderItems.clear();
			                double total = 0.0;
			                StringBuilder orderSummary = new StringBuilder();
			                orderSummary.append("===== 購物車內容 =====\n");
			                
			                for (int i = 0; i < productList.size(); i++) {
			                    Product p = productList.get(i);
			                    JTextField qtyField = qtyFieldList.get(i);
			                    
			                    try {
			                        int qty = Integer.parseInt(qtyField.getText().trim());
			                        if (qty > 0) {
			                            OrderItem item = new OrderItem(p, qty);
			                            orderItems.add(item);
			                            
			                            double subTotal = p.getPrice() * qty;
			                            total += subTotal;
			                            
			                            
			                            orderSummary.append(String.format("商品: %s | 單價: %d | 數量: %d | 小計: %.0f\n", 
			                                    p.getName(), p.getPrice(), qty, subTotal));
			                        }
			                    } catch (NumberFormatException ex) {
			                        System.out.println("Invalid quantity entered for product: " + p.getName());
			                    }
			                }
			                
			                orderSummary.append("=====================\n");
			                orderSummary.append(String.format("總計: %.0f\n", total));
			                
			                textArea.setText(orderSummary.toString());
					
						
						
						
					}
				 }
				);
				contentPane.add(btnNewButton);
				//=================================================
				//右邊的訊息平台
				textArea = new JTextArea(); // 在這裡初始化 JTextArea
				textArea.setBounds(518, 10, 494, 562);
				textArea.setEditable(false); // 讓使用者無法編輯這個文字區域
				contentPane.add(textArea);
				
				//~~~~~~~~~~~~~~~~~~~~~~~~~~~
				JButton btnNewButton_1 = new JButton("最後的確認");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_1.setBounds(748, 585, 188, 70);
				btnNewButton_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) 
					{
						
						// 1. 取得顧客ID（假設你已經有登入的顧客）
						// 這裡你需要根據你的應用程式邏輯取得顧客ID。
						// 假設顧客ID為 1
						int consumerId = 1; // <=== 這裡需要修改成實際登入的顧客ID

						// 2. 取得員工ID
						Employee selectedEmployee = (Employee) comboBox.getSelectedItem();
						int employeeId = selectedEmployee.getEmployeeId();

						// 3. 檢查購物車是否為空
						if (orderItems.isEmpty()) {
							textArea.setText("購物車是空的，請先加入商品。");
							return;
						}

						// 4. 呼叫 PorderDaoImpl 來新增訂單
						PorderDaoImpl porderDao = new PorderDaoImpl();
						porderDao.addPorder(orderItems, consumerId, employeeId);

						// 5. 提示訂單已送出並清空購物車
						String finalMessage = "✅ 訂單已成功送出！\n\n" + textArea.getText();
				        textArea.setText(finalMessage);
				        
						// 清空購物車
						orderItems.clear();

						// 將左邊所有商品的數量欄位設回 0
						for (JTextField qtyField : qtyFieldList) {
							qtyField.setText("0");
						}
						//==================================================
						String orderSummaryText = textArea.getText();
						//==================================================
						PrintAndMessage printAndMessage = new PrintAndMessage(orderSummaryText);
						printAndMessage.setVisible(true);
						dispose();
						
						
					}
				});
				contentPane.add(btnNewButton_1);
	
		//===============================================
				
				
	}
	
	
	
	
	
	
}
