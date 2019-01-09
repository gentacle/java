package java_tutorial_20;

public class Camera extends Machine{
	//error >> Add unimplemented methods
	@Override
	public void start() {
		System.out.println("starting Camera.");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in Camera.");
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown Camera.");
	}
}