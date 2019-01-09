package java_tutorial_20;

public abstract class Machine {

	private int id = 0;

	public int getId() {
		System.out.println(id);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	public void run() {
		start();
		doStuff();
		shutdown();
	}
}
