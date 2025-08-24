package controller.adminUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Consumer;
import model.Employee;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import service.impl.ConsumerServiceImpl;
import service.impl.EmployeeServiceImpl;


public class DeleteEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField employeeId;
	private EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteEmployee frame = new DeleteEmployee();
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
	public DeleteEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1139, 682);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//======================================================
		JLabel lblNewLabel = new JLabel("消滅不乖的員工ID");
		lblNewLabel.setBounds(85, 496, 126, 84);
		contentPane.add(lblNewLabel);
		//======================================================
		employeeId = new JTextField();
		employeeId.setBounds(319, 494, 366, 90);
		contentPane.add(employeeId);
		employeeId.setColumns(10);
		//======================================================
		JButton btnNewButton = new JButton("消滅員工");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int DeleteId=Integer.parseInt(employeeId.getText());
				
				Employee e1=new Employee();  //因為e被mouse用過了 所以改成e1
				e1.setEmployeeId(DeleteId);
				
				employeeServiceImpl.deleteEmployee(e1);
				
			}
		});
		btnNewButton.setBounds(801, 490, 168, 97);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(136, 40, 790, 388);
		contentPane.add(textArea);
		//======================================================
	}

}
