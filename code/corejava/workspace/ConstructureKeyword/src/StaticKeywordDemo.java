public class StaticKeywordDemo {
	public static void main(String[] args) {
		System.out.println(Organization.orgName);
		Organization.policies();
	}
}

class Organization {
	static String orgName = "Abc pvt. ltd.";
	String location = "Pune";
	
	static public void policies() {
		System.out.println("Organization Policies...");
		System.out.println("Org Name : " + orgName);
	}
	
	
	static class Department {
		
	}
	
}



