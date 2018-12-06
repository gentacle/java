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

		//Info info2 = new person1; �̹� ��üȭ�Ǿ��־, �׸��� ���¸� ���������� ����̶� ��üȭ �Ұ���.
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println("\noutputInfo(Info info)�� info.showInfo()�� �۵���Ų��.\n"
				+ "[���� ����].showInfo()�� ���� ��üȭ�� �� �۵��� �Ͱ� ����.\n");
		
		//outputInfo(Info info)�� info.showInfo()�� �۵���Ų��.
		//[���� ����].showInfo()�� ���� ��üȭ�� �� �۵��� �Ͱ� ����.
		outputInfo(machine1);
		outputInfo(person1);
	
		
		System.out.println("�������̽��� ����� �� �ȿ� �ִ� �޼ҵ带 ��� �������̵��ؼ� �������Ѵ�.\n"
				+"���ο�Ҹ� ����ȭ �ؾ��Ҷ� �������̽��� ����,'implements'�� �̿��� ����ϴµ�.");
	}
	
	//Info class ���̽��� �� info ��ü�� ������ outputInfo()�� ����.
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
