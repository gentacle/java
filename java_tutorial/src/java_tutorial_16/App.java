package java_tutorial_16;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/156510?start=0
//Reading Files Using Scanner

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:/Users/gentacle/Documents/workspace/java/java_tutorial/example.txt";

		File textFile = new File(fileName);

		// ERROR CODE >> Add throws declaration. 예외던지기. 안에 try catch 안쓰고 던짐.
		Scanner in = new Scanner(textFile);

		while (in.hasNextLine()) {
			String line = (String) in.nextLine();

			System.out.println(line);
		}

		in.close();
	}
}
