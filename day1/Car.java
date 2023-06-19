package week1.day1;

public class Car {
	public void driveCar() {
		System.out.println("I am driving");
	}
	public void applyBrake() {
		System.out.println("I am applying a Brake");
	}
	public void soundHorn() {
		System.out.println("I am clicking Horn");
	}
	public void isPuncture() {
		System.out.println("Puncture");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
		

	}

}
