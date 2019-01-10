package java_tutorial_23;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/256668?start=0
//Creating and Writing Text Files

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("this line one");
			br.newLine();
			br.write("this line two");
			br.newLine();
			br.write("last line");
			
		} catch (IOException e) {
			System.out.println("can't open file "+file.toString());
		}
	}
}
