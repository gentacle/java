package java_tutorial_25;

public class Robot {

	private int id;
	
	private class Brain{
		public void think() {
			System.out.println("Robot "+id+" is thinking.");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	

	public void start() {
		System.out.println("Starting Robot for id '"+id+"'");

		Brain brain = new Brain();
		brain.think();
	}
	
}
