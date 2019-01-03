package java_tutorial_15;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/156484?start=45
//Anonymous Classes

class Machine {
	public void start() {
		System.out.println("Starting machine...");
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Camera snapping ......");
			}
		};
		
		machine1.start();

		
	}
}
