import java.util.Scanner;

public class ExceptionHandlingIntro {
	public static void main(String[] args) {
		System.out.println("===== Exception Intro Started....");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Division : " + (num1/num2));
		
		scan.close();
		
		System.out.println("===== Exception Intro Ends....");
	}
}
