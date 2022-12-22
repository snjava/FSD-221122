public class ProductDetails
{
	public static void main(String args[])
	{
		Product p1 = new Product();
		System.out.println(p1);
		p1.setProduct(11, 234.23, 10);
		System.out.println(p1.id);
		System.out.println(p1.price);
		System.out.println(p1.quantity);
	}
}

class Product
{
	int id;
	double price;
	int quantity;

	public void setProduct(int i, double p, int q) {
		id = i;
		price = p;
		quantity = q;
	}
}