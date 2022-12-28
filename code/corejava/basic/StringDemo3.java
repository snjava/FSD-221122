public class StringDemo3
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		System.out.println(s1);
		String s2 = " Program";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
	
		String num = "500";
		char ch[] = num.toCharArray();
		for(char val : ch) {
			System.out.println(val);
		}

		String s3 = "String in Java";
		System.out.println(s3.substring(10));
		System.out.println(s3.substring(7,11));

		String s4 = "Abc-12/02/1998-Pune";
		String strs[] = s4.split("-");
		System.out.println(s4);
		for(String val : strs) {
			System.out.println(val);
		}
	
		String s5 = "";
		System.out.println(s5.length());
		System.out.println(s5.isEmpty());
		

	}
}