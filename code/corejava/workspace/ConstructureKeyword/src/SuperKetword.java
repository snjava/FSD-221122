public class SuperKetword {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.print();
	}
}

class Employee {
	int id;
	String name;
	int a = 10;
	public void companyName() {
		System.out.println("Company is : Abc Pvt.Ltd");
	}
}

class Developer extends Employee {
	String skills;
	int a = 20;
	
	public void print() {
		int a = 30;
		System.out.println(super.a); // Super class variable 
		super.companyName(); // Super class method
	}
	
	public void companyName() {
		System.out.println("Company is : Xyz Pvt.Ltd");
	}
	
	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Skills : " + skills);
	}
}
