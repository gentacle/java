package java_tutorial_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		File file = new File("example_java_tutorial_22.txt");

		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file '" + file.toString()+"'");
		} catch (IOException e) {
			System.out.println("unable to read file "+ file.toString());
		}
		
		
	}
}
