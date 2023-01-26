import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.println("Enter Percentage : ");
			double percent = scan.nextDouble();
			
			if(percent>=0 && percent<=100) {
				if(percent>=40) {
					System.out.println("Congrates you are PASS");
				} else {
					System.out.println("Sorry you are FAIL");
				}
			}
			else {
				throw new IllegalArgumentException("Invalid Percentage....");
			}
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
			ex.printStackTrace();
		}
		catch(InputMismatchException ex) {
			System.out.println("Invalid Percent Value...");
		}
		
	}
}
