public class CommandLineArg
{
	public static void main(String args[])
	{
		System.out.println("Command Line Argument Example...");
		System.out.println(args[0]);
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);
		double num3 = Double.parseDouble(args[3]);

		System.out.println(num1 + num2 + num3); 

	}
}