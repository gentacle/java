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
		
		
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is ThreeMan.")
		.append(" ")
		.append("I am a tree safer.");
		
		System.out.println(s.toString());
		
		
		//// Formatting //////////////////////////////////////////////////
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was newLine.");
		System.out.println("More text.");
		
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%2d: some text here\n", i);
			
		}
		
	}
	

}
