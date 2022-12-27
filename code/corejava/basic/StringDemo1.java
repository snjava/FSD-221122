public class StringDemo1
{
	public static void main(String args[])
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = "HELLO";
	
		System.out.println(str1); // Hello
		System.out.println(str2); // Hello
		System.out.println(str3); // Hello
		System.out.println(str4); // Hello

		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // false
		System.out.println(str3 == str4); // true 	

		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		System.out.println(str3.equals(str4)); // true 	

		System.out.println(str4 == str5); // false
		System.out.println(str4.equalsIgnoreCase(str5)); // 	true			

	}
}