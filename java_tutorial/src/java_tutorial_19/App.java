package java_tutorial_19;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/212825?start=0
//Runtime vs. Checked Exceptions

public class App {
	
	public static void main(String[] args) {
	
//		String text = null;
//		
//		System.out.println(text.length());

		String[] textsArray = {"one","two","three"};
		
		try {
		System.out.println(textsArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	

}
