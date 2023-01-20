// concrete class
public class AbstractIntro {
	public static void main(String[] args) {
		Fortuner fortuner = new Fortuner();
		AudiA8_EV a8 = new AudiA8_EV();
		printCarDetails(a8);
		
	}
	
	public static void printCarDetails(Car car) {
		car.carName();
		car.brand();
		car.fual();
		car.noOfWheels();
	}
}

// abstract class
abstract class Car {
	public Car() {
		System.out.println("abstract class Car Constructor");
	}
	abstract protected void brand();
	abstract void fual();
	abstract public void carName();
	public static final void noOfWheels() {
		System.out.println("Car has 4 wheels and 1 Spear Wheel");
	}
}

abstract class Toyota extends Car {
	public void brand() {
		System.out.println("Brand : Toyota");
	}
}

class Fortuner extends Toyota {
	public void carName() {
		System.out.println("Name : Fortuner");
	}
	public void fual() {
		System.out.println("Fuel Type : Disel");
	}
}

class AudiA8_EV extends Car {
	public void carName() {
		System.out.println("name : A8");
	}
	public void brand() {
		System.out.println("Brand : Audi");
	}
	public void fual() {
		System.out.println("Fuel Type : Electric Vehical");
	}
}






