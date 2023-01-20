public class InterfaceIntro2 {
	public static void main(String[] args) {

	}
}

interface Inter0 {
	public void m0();
}

interface Inter1 {
	public void m1();
}
// Multiple Inheritance using Interface
interface Inter2 extends Inter0, Inter1 {
	public void m2();
}

abstract class Demo implements Inter0, Inter1 {
	
}

abstract class Demo1 extends Demo implements Inter0,Inter1,Inter2 {
	
}
class Test implements Inter2 {
	public void m0() {
		
	}
	public void m1() {
			
		}
	public void m2() {
		
	}
}