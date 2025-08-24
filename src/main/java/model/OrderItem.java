package model;

//java大師要我創造新的靜態class處理購物車UI的問題

public class OrderItem {
    private Product product; // 儲存商品物件
    private int quantity;    // 儲存商品數量

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    // 計算單一商品的總價格
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
}