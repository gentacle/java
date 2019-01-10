package java_tutorial_27;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/320992?start=0
//Recursion: A Useful Trick Up Your Sleeve

public class App {

	public static void main(String[] args) {

		int value = 4;
		calculate(value);

		System.out.println(value);
	}
	
	private static void calculate(int value) {
		
		value = value -1;
		System.out.println(value);
		
	}
}
