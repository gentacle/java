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

interface Plant{
	public void grow();
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			@Override public void start() {
				System.out.println("Camera snapping ......");
			}
		};
		
		machine1.start();  //:> Camera snapping ......
		//따로 객체화를 하지않고 바로 오버라이드 한 뒤 실행하니 바뀐체로 실행됨.
		//뭐지 무엇을 암시하는 것이지?


		Plant plant1 = new Plant() {
			
			@Override
			public void grow() {
				System.out.println("Plant growing....!");
			}
		};
		
		plant1.grow();
		
	}
}
