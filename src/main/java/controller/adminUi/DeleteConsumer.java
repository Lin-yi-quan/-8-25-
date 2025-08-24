package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Consumer;
import model.Porder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import service.impl.ConsumerServiceImpl;

public class DeleteConsumer extends JFrame {
	
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField consumerId;
	private ConsumerServiceImpl consumerServiceImpl = new ConsumerServiceImpl();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteConsumer frame = new DeleteConsumer();
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
	public DeleteConsumer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1124, 655);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//============================================================
		JTextArea textArea = new JTextArea();
		textArea.setBounds(130, 50, 674, 418);
		contentPane.add(textArea);
		//============================================================
		JLabel lblNewLabel = new JLabel("刪除不乖的會員ID");
		lblNewLabel.setBounds(174, 504, 154, 82);
		contentPane.add(lblNewLabel);
		//============================================================
		consumerId = new JTextField();
		consumerId.setBounds(386, 501, 138, 90);
		contentPane.add(consumerId);
		consumerId.setColumns(10);
		//============================================================
		JButton btnNewButton = new JButton("刪除");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int DeleteId=Integer.parseInt(consumerId.getText());
				
				Consumer c=new Consumer();
				c.setConsumerId(DeleteId);
				
				consumerServiceImpl.deleteConsumer(c);
				
				
			}
		});
		btnNewButton.setBounds(628, 500, 138, 90);
		contentPane.add(btnNewButton);
		
		
		//============================================================
	}
}
