public class ThisKeywordDemo {
	public static void main(String[] args) {
		ThisDemo demo = new ThisDemo();
		demo.print();
		
		Student s1 = new Student(112, "Abc", "99009987678", "Pune,MH");
		s1.printDetails();
		Student s2 = new Student(12, "Xyz");
		s2.printDetails();
	}
}


class Student {
	private int id;
	private String name;
	private String contact;
	private String address;
	public Student(int id, String name, String contact, String address) {
		this(id, name); // call the another constructor of same class
		this.contact = contact;
		this.address = address;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Student Details..");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("Address : " + address);
	}
}

class ThisDemo {
	int a = 10;
	public void print() {
		int a = 20;
		System.out.println("a : " + a);	// 20
		System.out.println("this.a : " + this.a); // 10 // to access the instance variable
		this.show(); // calling same class method using this keyword.
	}
	
	public void show() {
		System.out.println("This is show method from Class..");
	}
	
	
}