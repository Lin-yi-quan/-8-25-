package model;

import java.sql.Timestamp;

public class Product
{
	private int productId; // 商品ID，資料庫主鍵
	private String name; // 商品名稱
	private Integer price; // 商品價格
	private Integer stock; // 商品庫存
	private String google; // google評價
	private Timestamp buildTime; // 商品上架時間
	private Boolean active; // 商品是否上架
//===========================================
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
//===========================================	
public Product(String name, Integer price, Integer stock, String google, Boolean active) {
	super();
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.google = google;
	this.active = active;
}
//=========================================
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Integer getStock() {
	return stock;
}
public void setStock(Integer stock) {
	this.stock = stock;
}
public String getGoogle() {
	return google;
}
public void setGoogle(String google) {
	this.google = google;
}
public Timestamp getBuildTime() {
	return buildTime;
}
public void setBuildTime(Timestamp buildTime) {
	this.buildTime = buildTime;
}
public Boolean getActive() {
	return active;
}
public void setActive(Boolean active) {
	this.active = active;
}
	


//================================================

}
