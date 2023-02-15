import java.util.ArrayList;

public class EmployeeCollection {
	public static void main(String[] args) {
		Employee e1 = new Employee("A", "a@gmail.com", "9988776677");
		Employee e2 = new Employee("B", "b@gmail.com", "7788776677");
		Employee e3 = new Employee("C", "c@gmail.com", "9898776677");
		Employee e4 = new Employee("D", "d@gmail.com", "9111776677");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee emp : list) {
			System.out.println("Name : " + emp.getName());
			System.out.println("Email : " + emp.getEmail());
			System.out.println("Contact : " + emp.getContact());
		}
		
	}
}
class Employee {
	private String name;
	private String email;
	private String contact;
	public Employee(String name, String email, String contact) {
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContact() {
		return contact;
	}
}