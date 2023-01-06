public class SuperConstructoreDemo {
	public static void main(String[] args) {
		C2 obj = new C2(10);
	}
}

class C1 {
	public C1() {
		super();
		System.out.println("C1 class constrcutor");
	}
	public C1(int a) {
		System.out.println("C1 1 int param constructor");
	}
}

class C2 extends C1 {
	public C2() {
		super(); // calling a super class constructor
		System.out.println("C2 class constrcutor");
	}
	
	public C2(int a) {
		super(12); // calling a super class constructor 
		System.out.println("C2 1 int param constructor");
	}
}
