public class ConstructureDemo {
	public static void main(String[] args) {
		System.out.println("======Product1=====");
		Product p1 = new Product();
		p1.printProductDetails();

		System.out.println("======Product2=====");
		Product p2 = new Product(123, "Smart Watch", 12222.23);
		p2.printProductDetails();
		
		
		System.out.println("======Product3=====");
		Product p3 = new Product("Smart TV", 112222.23);
		p3.printProductDetails();
	}
}

class Product {
	private int id;
	private String name;
	private double price;
	
	// No Parameter Costructure 
	public Product() {
		// this(-1, "NA", 0.0);
		id = -1;
		name = "NA";
	}
	
	public Product(int id, String name, double price) {
		// this(name, price);
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void printProductDetails( ) {
		System.out.println("Id : "+ id); // -1
		System.out.println("Name : "+ name); // NA
		System.out.println("Price : "+ price); // 0.0
	}
}


