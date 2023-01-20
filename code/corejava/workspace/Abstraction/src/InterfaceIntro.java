public class InterfaceIntro {
	public static void main(String[] args) {
		Vehicle v = new Ertiga(); // Polymorphic Object
		v.brand();
		v.type();
		v.fuel();
		v.noOfWheels();
	}
}

interface Vehicle {
	String name = "Vehicle Interface";
	public void type();
	public void fuel();
	public abstract void brand();
	void noOfWheels();
}
// Car1 IS-A Vehicle
abstract class Car1 implements Vehicle {
	public void type() {
		System.out.println("Vehicle Type : Car");
	}
	public void noOfWheels() {
		System.out.println("There are 4 Wheels in car");
	}
}

abstract class Bike implements Vehicle {
	public void type() {
		System.out.println("Vehicle Type : Bike");
	}
	public void noOfWheels() {
		System.out.println("There are 2 Wheels in bike");
	}
}

//Ertiga IS-A Car1
class Ertiga extends Car1 {
	public void fuel() {
		System.out.println("Fuel Type : Petrol/Disel/CNG");
	}
	public void brand() {
		System.out.println("Brand : Maruti");
	}
}

