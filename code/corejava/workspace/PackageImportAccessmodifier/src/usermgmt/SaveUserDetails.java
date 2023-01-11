package usermgmt;

public class SaveUserDetails extends UserDetails {

	public void printUserDetailsByObject() {
		UserDetails obj = new UserDetails();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.age);
		//System.out.println(obj.address);	
	}
	
	
	
	public void printUserDetailsByInheritance() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		//System.out.println(address);	
	}
	
}
