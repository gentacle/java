package java_tutorial_25;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/309536?start=0
//Inner Classes

public class App {

	public static void main(String[] args) {
		
		Robot robot = new Robot(5);
		robot.start();
		
//		Robot.Brain brain = robot.new Brain();
//		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
