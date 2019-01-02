package java_tutorial_13;

import java.util.ArrayList;
import java.util.HashMap;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/152306?start=0
//Using Generics

public class App {

	public static void main(String[] args) {
		
		//////////////////// Before java 5 ///////////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		
		//////////////////// Modern style ///////////////////
		//배열의 타입을 지정하는 차이? 

		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		//////////////////// There can be more than one type argument ///////////////////

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		
		//////////////////// Java 7 style ///////////////////
		//https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.htm
		
		ArrayList<String> someList = new ArrayList<>();
		someList.add("CCAATT");
		someList.add("DDOOGG");
		someList.add("BBOOBB");
		
		String Animal = someList.get(1);
		System.out.println(Animal);
		

		ArrayList<Integer> someList2 = new ArrayList<>();
		someList2.add(1);
		someList2.add(671);
		someList2.add((int)1241552);
		
		Integer Number = someList2.get(2);
		System.out.println(Number);
		
		
		
		
	}
}
 