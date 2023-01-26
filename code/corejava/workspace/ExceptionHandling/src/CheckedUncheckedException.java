import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUncheckedException {
	public static void main(String[] args) {
		
		System.out.println(10/0); // unchecked Exception 
		
		try {
			FileInputStream fileIn = new FileInputStream("E:\\Batches\\IntuTech\\FSD-22Nov22\\README.md"); // checked Exception
		} 
		catch(FileNotFoundException ex) {
			System.out.println("Given File is not Exist.....");
		}
	}
}
