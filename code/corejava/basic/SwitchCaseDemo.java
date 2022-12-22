/*
	'M' - Monday
	'T' - Tuesday or Thursday
	'W' - Wednesday
	'F' - Friday
	'S' - Saturday or Sunday
	Other char - Invalid Value
*/
public class SwitchCaseDemo {
	public static void main(String ar[]) {
		char ch='M';
		switch(ch)
		{
			case 'M':
			case 'm':	
				System.out.println("Monday");
				break;
			case 'T':
				System.out.println("Tuesday or Thurdsay");
				break;
			case 'W':
				System.out.println("Wednesday");
				break;
			case 'F':
				System.out.println("Friday");
				break;
			case 'S':
				System.out.println("Saturday or Sunday");
				break;
			default:
				System.out.println("Invalid Value");
		}
	}
}







