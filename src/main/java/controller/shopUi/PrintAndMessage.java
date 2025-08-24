package controller.shopUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Main;
import controller.consumerloginUi.LoginSuccess;
import util.CreateExcel;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

public class PrintAndMessage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea; // 宣告為成員變數
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	
	// 新增帶參數的建構子
    public PrintAndMessage(String message) 
    {
        this(); // 呼叫無參數建構子
        textArea.setText(message); // 設定文字
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintAndMessage frame = new PrintAndMessage();
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
	public PrintAndMessage() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 681);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 //================================================
        textArea = new JTextArea(); // **正確地初始化成員變數**
        textArea.setBounds(59, 10, 971, 437);
        contentPane.add(textArea);
        //================================================
        JButton excel = new JButton("excel");
        excel.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) 
        	{
        		// 建立 CreateExcel 物件
                CreateExcel ce = new CreateExcel();

                // 設定檔名、工作表名、表頭
                String fileName = "order.xls"; 
                String sheetName = "訂單";
                String[] titleName = {"訂單編號", "數量", "總金額"};

                // 呼叫建立檔案
                ce.create(fileName, sheetName, titleName);

                // 在畫面顯示訊息
                textArea.setText("Excel 檔案已建立：" + fileName);
        		
        	}
        	
        });
        excel.setBounds(99, 510, 184, 79);
        contentPane.add(excel);
        
        JButton btnNewButton = new JButton("一般列印");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) 
        	{
        		try 
        		{
        			textArea.print();
				} 
        		
        		catch (PrinterException e1)
        		{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		
        	}
        });
        btnNewButton.setBounds(376, 510, 160, 79);
        contentPane.add(btnNewButton);
        
        btnNewButton_1 = new JButton("關閉");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) 
        	{
        		dispose();
        	}
        });
        btnNewButton_1.setBounds(607, 510, 160, 79);
        contentPane.add(btnNewButton_1);
        
        btnNewButton_2 = new JButton("回主頁");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) 
        	{
        		Main main=new Main();
				main.setVisible(true);
				dispose();
        	}
        });
        btnNewButton_2.setBounds(813, 512, 167, 77);
        contentPane.add(btnNewButton_2);
        //================================================

	}
}
