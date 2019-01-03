package java_tutorial_15;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/156484?start=45

//Anonymous Classes
//익명클래스 사용방법.
//https://yookeun.github.io/java/2017/01/24/java-anonymousclass/

class Machine {
	public void start() {
		System.out.println("class Machine : 'Starting machine...'");
	}
}

interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera snapping ......");
			}

			public void overCalling() {
				System.out.println("외부에서 불러보면....");
			}
		};

		machine1.start(); // :> Camera snapping ......
		// 따로 객체화를 하지않고 바로 오버라이드 한 뒤 실행하니 바뀐체로 실행됨.
		// 뭐지 무엇을 암시하는 것이지?

//		machine1.overCalling();
		// 컴파일에러. 상속받은 부모클래스 안에 overCalling()가 선언되지 않았음.
		// 익명클래스로 선언해도 이를 밖에서 꺼낼 수 없다.
		// 반대로 이미 선언되어있는것을 오버라이드 해서 쓰면 사용가능.

		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant growing....!");
			}
		};

		plant1.grow();

//부모클래스를 상속받는 자식클래스를 외부에 선언하여 사용하게 된다.
//매번 자식클래스를 추가하여 사용하면 한번 사용하고 안쓰는 클래스가 너무 많아지게 된다.
//
	}
}
