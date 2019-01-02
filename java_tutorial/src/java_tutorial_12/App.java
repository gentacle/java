package java_tutorial_12;

class Machine{
	public void start() {
		System.out.println("Machine start.");
		
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		Machine machine2 = camera1;
		machine2.start();
		
	}
}
