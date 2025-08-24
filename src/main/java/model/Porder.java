package model;

public class Porder 
{
	private int porderId; //產品ID
	private int amount;//商品數量
	private int sum;//總價格
	private int consumerId;       // 客戶ID（外鍵）
	private int employeeId;   // 員工ID（外鍵）
	private int productId; // 商品ID（外鍵）
	//=============================================
	public Porder() {
		super();
		// TODO Auto-generated constructor stub
	}
	//=============================================
	public Porder(int amount, int sum, int consumerId, int employeeId, int productId) {
		super();
		this.amount = amount;
		this.sum = sum;
		this.consumerId = consumerId;
		this.employeeId = employeeId;
		this.productId = productId;
	}
	//=============================================
	public int getPorderId() {
		return porderId;
	}
	public void setPorderId(int porderId) {
		this.porderId = porderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	

	
	//=============================================
}
