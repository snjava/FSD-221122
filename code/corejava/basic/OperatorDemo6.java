public class OperatorDemo6
{
	public static void main(String ar[])
	{
		int a = 5;
		int b = 15;
	
		System.out.println(b>=20 & b<=50); // F & T => F
		System.out.println(b>=20 && b<=50);// F	  => F

		System.out.println(a>=1 | a<=50); // T | T => T
		System.out.println(a>=1 || a<=50);// T	    => T


		int value = (a>=1) ? 1 : 0;
		System.out.println(value); // 1

	}
}