package java_tutorial_23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/256668?start=0
//Creating and Writing Text Files

public class App {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
