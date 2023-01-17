public class OverridingExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.introduction();
		
		Doctor d = new Doctor();
		d.introduction();
	}
}

class Person {
	void introduction() {
		System.out.println("Hello, I am a Person...");
	}
}

class Doctor extends Person {
	public void introduction() {
		System.out.println("Hi. I am a Doctor (MBBS, MD). ");
	}
}

