public class InheritanceIntro {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		ch.m2();
		
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}


class Parent
{
	int a = 10;
	public void m1() {
		System.out.println("Inside Parent class method m1()");
	}
}
// Single Inheritance
class Child extends Parent
{
	int b = 10;
	public void m2() {
		System.out.println("Inside Parent class method m2()");
	}
}