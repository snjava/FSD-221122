public class VaraibleType
{
	int b = 20;    // Instance Variable
	static int c; // static/class variable
	public static void main(String args[])
	{
		int a = 10; // local Variable
		System.out.println(a);
		System.out.println(c);
		VaraibleType obj = new VaraibleType();
		System.out.println(obj.b);
	}
}