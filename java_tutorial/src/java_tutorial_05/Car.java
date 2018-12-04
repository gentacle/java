package java_tutorial_05;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started.");
	}

	
	public void wipeWindShield() {
		System.out.println("wiping windowshield.");
	}
	
	public void showInfo() {
		System.out.println("car name: " + name);
	}
	
}
