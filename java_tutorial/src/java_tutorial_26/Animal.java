package java_tutorial_26;

public enum Animal {
	CAT("tom"), DOG("fred"), MOUSE("jerry");

	private String name;

	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This animal is called " +name;
	}

}