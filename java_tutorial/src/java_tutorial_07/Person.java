package java_tutorial_07;

public class Person implements Info{

	private String name;
	
	//>> source > Generate Construct using Fields..
	public Person(String name) {
		this.name = name;
	}
		
	public void greet() {
		System.out.println("Hello there.");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
	}
}
