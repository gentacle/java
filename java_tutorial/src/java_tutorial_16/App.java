package java_tutorial_16;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/156510?start=0
//Reading Files Using Scanner

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		//root���丮 ������ ������ �ִٸ� ����� ��밡�� 
		//String fileName = "C:/Users/gentacle/Documents/workspace/java/java_tutorial/example.txt";
		String fileName = "example.txt";

		File textFile = new File(fileName);

		// ERROR CODE >> Add throws declaration. ���ܴ�����. �ȿ� try catch �Ⱦ��� ����.
		Scanner in = new Scanner(textFile);

		int value = in.nextInt();
		System.out.println("Read value: " + value);

		//nextInt() ����� Ŀ���� �Ѿ���ʾƼ� �������� ������.
		//�̸� �����ϱ� ���� nextLine()�� ����� �������� ȣ��
		in.nextLine();
		
		int count = 2;
		while (in.hasNextLine()) {
			String line = (String) in.nextLine();

			System.out.println(count + ": " +line);
			count++;
		}

		in.close();
	}
}
