package java_tutorial_20;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/214770?start=0
//Abstract class

public class App {

	public static void main(String[] args) {

		Camera cam1 = new Camera();
		cam1.getId();
		
		Car car1 = new Car();
		car1.getId();
		car1.setId(4);
		car1.getId();
		car1.run();
		
//		Machine machine = new Machine();
		
	}
}
