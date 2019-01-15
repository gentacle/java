package java_tutorial_30;

import java.io.Serializable;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/424118?start=509
//Serializing Arrays

public class Person implements Serializable{
	
	private static final long serialVersionUID = 887769536657506509L;
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
