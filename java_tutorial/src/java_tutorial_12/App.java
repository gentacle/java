package java_tutorial_12;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/152300?start=15
//Up/Down casting


class Machine{
	public void start() {
		System.out.println("Machine start.");
		
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting �ڽ��� �θ��� ���·� ������.
		//��� ���ڸ� �������� ���¿��� ���º�ȯ�ϱ⶧���� ����
		Machine machine2 = camera1;
		machine2.start();		
		//machine2.snap();	error

		
		//Downcasting ���������� ���������ʴ�.
		//�ڽ�Ŭ������ �θ�Ŭ������ ���·� �������̽��� �޾� ��üȭ��.
		//�θ��� ���ڸ� ��� ������ �ִ� �ڽ�(�θ��� ��� ������ �������̽��� �޾� ����)
		Machine machine3 = new Camera();
//		Machine machine3 = (Machine)new Camera();
//		(�θ���)�� ����. ��������� ������������� ���������ʴ�. JVM���� ���߰����� ���·� ��ȯ�ϱ⶧��.
		
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		
//		Doesn't work --- runtime error.
		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
		//ī�޶��� ���� �ȿ� �ӽ��� ��� ���ڰ� ������� �ʴ�.
//		camera3.start();
//		camera3.snap();
	}
}
