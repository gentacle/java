package java_tutorial_07;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/147402?start=0
//interface.

public class App {

	public static void main(String[] args) {
	
		Machine machine1 = new Machine();
		machine1.start();
		
		Person person1 = new Person("gentacle");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();

		//Info info2 = new person1; 이미 객체화되어있어서, 그리고 형태를 가지지못한 대상이라 객체화 불가능.
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println("\noutputInfo(Info info)는 info.showInfo()를 작동시킨다.\n"
				+ "[받은 인자].showInfo()는 위의 객체화한 후 작동한 것과 동일.\n");
		
		//outputInfo(Info info)는 info.showInfo()를 작동시킨다.
		//[받은 인자].showInfo()는 위의 객체화한 후 작동한 것과 동일.
		outputInfo(machine1);
		outputInfo(person1);
	
		
		System.out.println("인터페이스를 만들면 그 안에 있는 메소드를 모두 오버라이드해서 만들어야한다.\n"
				+"내부요소를 최적화 해야할때 인터페이스를 선언,'implements'를 이용해 사용하는듯.");
	}
	
	//Info class 베이스로 한 info 객체를 참조해 outputInfo()를 생성.
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
