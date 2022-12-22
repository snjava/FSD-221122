public class OperatorDemo3
{
	public static void main(String ar[])
	{
		int a = 10;
		a++; //(Post increment) // a = a + 1;  // 11
		++a; //(Pre increment) // a = a + 1;  // 12
		System.out.println(a); // 12

		a--; // a = a - 1; // post decrement // 11
		--a; // a = a - 1; // pre decrement  // 10
		System.out.println(a); // 10

		//int b = ++a; // b = (a = (a + 1))
		int b = a++; // (b = a) = (a + 1)
		System.out.println(b); // 10

		int x = 5;
		int y = --x;
		System.out.println(y);  // 4

		int p = 5;
		int q = p--;
		System.out.println(q);  // 5
	}
}