package java_tutorial_30;

import java.io.Serializable;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/807408?start=0
//The Transient Keyword and More Serialization

public class Person implements Serializable {

	private static final long serialVersionUID = 887769536657506509L;
	private transient int id;
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
