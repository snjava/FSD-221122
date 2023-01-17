
public class OverloadingExample {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(34.2, 11.2);
		cal.add(34, 11, 2);
	}
}

class Calculation {
	public void add(int a, int b) {
		int ans = a+ b;
		System.out.println("Addition of 2 int : " + ans);
	}
	
	protected void add(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println("Addition of 3 int : " + ans);
	}
	
	public void add(double a, double b) {
		double ans = a + b;
		System.out.println("Addition of 2 double : " + ans);
	}
	
	String add(String a, String b) {
		String ans = a + b;
		return ans;
	}
}
