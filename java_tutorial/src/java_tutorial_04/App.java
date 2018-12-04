package java_tutorial_04;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/145741?start=0
//toStrng

class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
	
		return String.format("%-4d: %s", id, name);
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		
		return sb.toString();
		*/
	}
}



public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog(28,"gentacle");
		Frog frog2 = new Frog(14,"Roze");
		
		System.out.println(frog1);
		System.out.println(frog2);
		//java_tutorial_04.Frog@15db9742
	}
}
