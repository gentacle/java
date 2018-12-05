package java_tutorial_07;

public class Person {

	private String name;
		
	public void greet() {
		System.out.println("Hello there.");
	}

	//>> source > Generate Construct using Fields..
	public Person(String name) {
		this.name = name;
	}
}
