package week2_assingment;

public class Product {
    private String name;
    private double price;
    private int rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Product(String name, double price, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
    
}
