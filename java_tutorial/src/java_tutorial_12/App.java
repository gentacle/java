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
		
		//Upcasting 자식을 부모의 형태로 재정의.
		//모든 인자를 물려받은 상태에서 형태변환하기때문에 가능
		Machine machine2 = camera1;
		machine2.start();		
		//machine2.snap();	error

		
		//Downcasting 본질적으로 안전하지않다.
		//자식클래스가 부모클래스의 형태로 인터페이스를 받아 객체화됨.
		//부모의 인자를 모두 가지고 있는 자식(부모의 모든 성질을 인터페이스로 받아 성립)
		Machine machine3 = new Camera();
//		Machine machine3 = (Machine)new Camera();
//		(부모형)은 생략. 명시적으로 적어두지않으면 안전하지않다. JVM에서 유추가능한 형태로 변환하기때문.
		
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		
//		Doesn't work --- runtime error.
		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
		//카메라라는 형식 안에 머신의 모든 인자가 들어있지 않다.
//		camera3.start();
//		camera3.snap();
	}
}
