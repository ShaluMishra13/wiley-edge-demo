package week3_assingment;

public class Product {
	private int id;
	private double price;
	 private String name;
	 private int count=0;
	 
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//public static void main(String[]args) {
	//System.out.println("Hello");}
}
	

	