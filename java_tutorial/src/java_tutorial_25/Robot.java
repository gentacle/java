package java_tutorial_25;

public class Robot {

	private int id;

	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	static class Battery {
		public void charge() {
			System.out.println("Battery charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting Robot for id '" + id + "'");

		Brain brain = new Brain();
		brain.think();

		String name = "gentacle";

		class Temp {
			public void doSometing() {
				System.out.println("ID is " + id);
				System.out.println("My name is " + name);
			}
		}
		
		 Temp temp = new Temp();
		 temp.doSometing();
	}

}
