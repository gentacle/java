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

//		Info info2 = new person1; �̹� ��üȭ�Ǿ��־, �׸��� ���¸� ���������� ����̶� ��üȭ �Ұ���.
		Info info2 = person1;
		info2.showInfo();
	}

}
