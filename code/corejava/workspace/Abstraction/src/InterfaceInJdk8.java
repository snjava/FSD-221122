public class InterfaceInJdk8 {
	public static void main(String[] args) {
	
	}
}

interface Inter {
	public void m1();
	public default void m2() {
		System.out.println("This is implemented method of Interface");
	}
	
	public static void m3() {
		System.out.println("This is static method from interface");
	}
}

@FunctionalInterface
interface FunctionalInterDemo {
	public void m();
	public default void m1() {
		
	}
}











