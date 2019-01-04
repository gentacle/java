package java_tutorial_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/196137?start=160
//Handling Exceptions

public class App {

	public static void main(String[] args) {

		File file = new File("example_java_tutorial_17.txt");

//		FileReader fileReader = new FileReader(file);
//		error >> Surround with try/catch
//		예외를 날리는게 아니라 안에서 try/catch로 자체예외처리함.

		try {
			FileReader fileReader = new FileReader(file);
			
			fileReader
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
