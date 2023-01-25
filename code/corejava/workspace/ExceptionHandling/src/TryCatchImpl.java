import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchImpl {
	public static void main(String[] args) {
		int arr[] = { 22, 45, 21, 5, 67, 12, 0, 34 };
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter 1st Index : ");
			int index1 = scan.nextInt();
			
			System.out.println("Enter 2nd Index : ");
			int index2 = scan.nextInt();
			
			int value1 = arr[index1];
			int value2 = arr[index2];
			
			System.out.println("The Addition is : " + (value1 + value2));
			try {
				System.out.println("The Division is : " + (value1 / value2));
			}
			catch(ArithmeticException ex) {
				System.out.println("Cannot Divide number by 0..");
			}
			System.out.println("The Multiplication is : " + (value1 * value2));
			System.out.println("The Substraction is : " + (value1 - value2));
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("The index you provided is invalid...");
		}
		catch(InputMismatchException ex) {
			System.out.println("Please provide numeric values only...");
		}
		finally {
			scan.close();
		}
	}
}
