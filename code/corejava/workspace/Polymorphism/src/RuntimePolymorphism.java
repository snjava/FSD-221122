public class RuntimePolymorphism {
	public static void main(String[] args) {
		/*
		Product prod = new SoniSmartTV(); // Polymorphic Object
		prod.productDetails();
		prod.productRatings();
		*/
		//SoniSmartTV obj = new SoniSmartTV();
		MiSmartMobile obj = new MiSmartMobile();
		//Product obj = new Product();
		printProduct(obj);
	}
	public static void printProduct(Product prod) {
		prod.productDetails();
		prod.productRatings();
	}
}
class Product {
	public void productDetails() {
		System.out.println("Product Details....");
	}
	public void productRatings() {
		System.out.println("Product Ratings....");
	}
}
class SoniSmartTV extends Product {
	public void productDetails() {
		System.out.println("Soni Smart TV has Andriod 9v with WIFI, bluetooth connectivity");
	}
	public void productRatings() {
		System.out.println("Product  Rating : 4.3");
	}
}
class MiSmartMobile extends Product {
	public void productDetails() {
		System.out.println("MI Smart Mobile has Andriod 10v with WIFI, bluetooth connectivity");
	}
	public void productRatings() {
		System.out.println("Product  Rating : 4.2");
	}
}









