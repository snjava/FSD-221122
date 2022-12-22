public class EmployeeDetails {
	public static void main(String a[]) {	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setDetails(121, 456456.54);
		emp2.setDetails(111, 223344.54);
		System.out.println(emp2.id);
		System.out.println(emp2.salary);
	}
}
class Employee{
	int id;
	double salary;
	public void setDetails(int i, double salary) {
			this.id=id;
			this.salary=salary;
	}
}