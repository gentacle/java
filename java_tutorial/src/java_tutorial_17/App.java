package java_tutorial_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/196137?start=160
//Handling Exceptions

public class App {

	public static void main(String[] args) {

//		File file = new File("example_java_tutorial_17.txt");
//
////		FileReader fileReader = new FileReader(file);
////		error >> Surround with try/catch
////		���ܸ� �����°� �ƴ϶� �ȿ��� try/catch�� ��ü����ó����.
//
//		try {
//			FileReader fileReader = new FileReader(file); 
//
//			//This will not be executed if an exception is thrown.
//			System.out.println("Continuing . . .");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("error information >> File not found: '" + file.toString()+"'\n");
//		}
//		

		try {
			openFile();
		} catch (FileNotFoundException e) {
			// �̷� �ܼ�����ǥ�ô� �� �������.
			System.out.println("Could not open file");
		}

		System.out.println("Finished.");
	}

	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");

		FileReader fileReader = new FileReader(file);

	}

}
