package java_tutorial_01;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/139767?start=75


class Machine {
	private String name;
	private int code;
	
	
	public Machine() {
		this("Arnie");
		System.out.println("Constructor running!");
		
	}
	
	public Machine(String name) {
		this(name,0);
		
		System.out.println("second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		
		System.out.println("Third constructor runnig!");
		
		this.name = name;
		this.code = code;
	}
}


public class App{
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
//		Machine machine2 = new Machine("Beatliks");
//
//		Machine machine3 = new Machine("Cherry", 10);
	}
}