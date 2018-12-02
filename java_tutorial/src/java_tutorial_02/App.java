package java_tutorial_02;

class Thing{
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		
		count++;
		
	}
	
	public void showName() {
		System.out.println("Object id : " + id + "," + description + ": " + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
//		System.out.println(name); not static field. cant use?
	}
}

public class App {
	public static void main(String[] args) {
		Thing.description = "I am a thing";
		
		Thing.showInfo();
		
		System.out.println("Before creating object, count is : " +Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating object, count is : " +Thing.count);

		
		thing1.name = "groy";
		thing2.name = "roze";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println("lucky number is " + Thing.LUCKY_NUMBER);
	}

}

