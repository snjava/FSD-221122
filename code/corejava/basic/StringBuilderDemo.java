public class StringBuilderDemo
{
	public static void main(String ar[])
	{
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder); // Hello
		builder.append(" Java");
		System.out.println(builder); // Hello Java
		builder.insert(5, " Welcome");
		System.out.println(builder); // Hello Welcome Java		
		builder.delete(0,6);
		System.out.println(builder); // Welcome Java		
		builder.reverse();
		System.out.println(builder); // avaJ emocleW
	}
}