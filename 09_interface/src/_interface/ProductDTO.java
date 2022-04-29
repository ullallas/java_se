package _interface;

public class ProductDTO {
	private String item; //scanner로 입력
	private int price;
	private int qty;
	private int total;
	
	public void calc() {
		total = qty*price;
	}
	//--------------------------
	public void setItem(String i){ //구현
		item = i;
	}
	public void setPrice(int p){ //구현
		price = p;
	}
	public void setQty(int q){ //구현
		qty = q;
	}
	//--------------------------
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public int getTotal() {
		return total;
	}
	

}
