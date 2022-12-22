public class OperatorDemo5
{
	public static void main(String ar[])
	{
		int a = 5;
		int b = 15;
		
		System.out.println(a & b); // 0101 & 1111 => 5
		System.out.println(a | b); // 0101 | 1111 => 15

		boolean flag = (a>=1 & a<=10); // T & T => T
		System.out.println(flag);
		System.out.println((a>=1 | a<=10)); // T | T => T

		System.out.println(!flag);

	}
}