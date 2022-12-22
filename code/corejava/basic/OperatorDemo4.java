public class OperatorDemo4
{
	public static void main(String ar[])
	{
		int x = 10;
		int y = 7;
		int z = 10;

		System.out.println(x > y); // true
		System.out.println(x > z); // false
		System.out.println(x >= z); // true

		System.out.println(x < y); // false
		System.out.println(x <= y); // false
		System.out.println(x == z); // true
		System.out.println(x != z); // false
	}
}
