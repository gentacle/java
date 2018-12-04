package java_tutorial_05;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/146346?start=0
//Inheritance

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		machine1.start();
		machine1.stop();
		
		Car car1 = new Car();
		
		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
		car1.stop();
		
	}

}
