public class MultilevelInhertiance extends Object {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.name = "Abc";
		dev.contactNumber = "9988098767";
		dev.id = 123;
		dev.languages = "java, Spring, Hml, Css, SQL";
		
		System.out.println(dev); // Classname@HashCode
		
		dev.printDetails();
		
	}
}

class Person extends Object {
	String name;
	String contactNumber;
}

// Employee IS-A Person
class Employee extends Person {
	int id;
}

// Developer IS-A Employee
class Developer extends Employee {
	String languages;
	
	public void printDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Languages Known : " + languages);
	}
}
