public class ProductDetails {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(-111);
		p1.setName("Smart TV");
		p1.setPrice(22222);
		
		p1.showProduct();
	}
}

// POJO (Plain Old Java Object), Model, DTO (Data Transfer Object), Bean, Entity
class Product
{
	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0) {
			this.id = id;
		} else {
			System.err.println("Invalid Product Id...");
		}
	}

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

	public void showProduct() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
	}
}