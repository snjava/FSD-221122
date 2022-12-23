import java.util.Scanner;
public class ScannerInput
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int num1 = scan.nextInt();

		System.out.println("Enter 2nd number: ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + num2);
	}
}