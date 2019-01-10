package java_tutorial_27;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/320992?start=0
//Recursion: A Useful Trick Up Your Sleeve

public class App {

	public static void main(String[] args) {

		System.out.println("Factorial 5 is '"+calculate(5)+"'");
		
	}

	private static int calculate(int value) {
//		System.out.println(value);
		if (value == 1) {
			return 1;
		}

		return calculate(value - 1)*value;
	}
}
