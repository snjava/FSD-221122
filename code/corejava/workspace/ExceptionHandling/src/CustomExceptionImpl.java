import java.util.Scanner;

public class CustomExceptionImpl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.next();
		scan.close();
		
		try {
			if(name.length() >= 3) {
				System.out.println("Name : " + name);
			} else {
				throw new ValidationException("Name is Invalid....");
			}
		}
		catch(ValidationException ex) {
			ex.printErrorMessage();
		}
		
	}
}
