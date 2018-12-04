package java_tutorial_03;

public class App {
	
	public static void main(String[] args) {

		//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/141537?start=0
		
		String info = "";
		
		info += "My name is gentacle.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is second.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		
		System.out.println(sb.toString());
	}
	

}
