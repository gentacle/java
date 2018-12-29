package java_tutorial_10;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/149507?start=570
//Encapsulation

//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#CASE_INSENSITIVE_ORDER

class Plant{

	public static final int ID = 7;
	private String name;
	
	public String getDate() {
		String data = "some stuff" + calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}

	
	//RMB >> source >> Generate Getter and Setter
	//make get set method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
	}
}
