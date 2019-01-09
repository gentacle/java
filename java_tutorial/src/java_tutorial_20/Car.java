package java_tutorial_20;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("starting Car.");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in Car.");
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown Car.");
	}
}