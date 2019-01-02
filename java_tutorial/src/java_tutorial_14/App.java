package java_tutorial_14;

import java.util.ArrayList;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/152317?start=0
//Generics and Wildcards

//기본 값 형식들은 정적 클래스의 toString 정적 메서드를 통해 해당 값을 문자열로 변환할 수 있게 제공하고 있음.
//만약 개발자가 정의한 형식에 toString 메서드를 재정의하지 않으면 디폴트 문자열 값은 ”클래스 이름@해쉬 코드값”.

class Machine {
	// RMB >> Source >>Generate toString() >> check "toString"

	@Override
	public String toString() {
		return "I am a Machine";
	}

	public void start() {
		System.out.println("Machine starting.");
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}

	public void snap() {
		System.out.println("Snap!!");
	}

}

public class App {

	public static void main(String[] args) {

		///////// ArrayList list /////////
		ArrayList<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("4");
		list.add("fineapple");
		list.add("sex");

		showList(list);

		///////// ArrayList MachineList /////////
		ArrayList<Machine> MachineList1 = new ArrayList<Machine>();

		MachineList1.add(new Machine());
		MachineList1.add(new Machine());

//		ArrayList<Machine> MachineList2 = new ArrayList<Machine>();
		ArrayList<Camera> MachineList2 = new ArrayList<Camera>();

		MachineList2.add(new Camera());
		MachineList2.add(new Camera());

		showMachineList(MachineList1);
		showMachineList2(MachineList2);

	}

	//Generic[제네릭] : 인자 내용을 타입체크하는것.
	//인자로 받은 타입으로 컴파일러 자동변환되기때문에 list.get(idx) 할 때 원하는 타입으로 캐스팅하지않아도됨.
	// 모든 타입을 받아들일 때 간편하게 className<T> 혹은 <T> int getScore와 같이 해놓으면 편함.
	public static void showList(ArrayList<String> ListnameOfFor) {
		for (String value : ListnameOfFor) {
			System.out.println(value);
		}
	}

	// Camera가 Machine을 받아와도 그 타입을 그대로 다른 메소드에서 받아들이지 않음.
	// 이미 해당 메소드에서 받아들이는 리스트의 타입을 Machine으로 정의했기때문.
	// ArrayList<Machine> -> ArrayList<?> -> ArrayList<? extends Machine>
	// Machine value -> Object value -> Machine value
	public static void showMachineList(ArrayList<? extends Machine> InputForValue) {
		for (Machine value : InputForValue) {
			System.out.println(value);
			value.start();
			// Machine 타입을 가지는 것들을 인자로 받으며 그 안의 .start()를 작동함.
			// Machine을 부모로 두기때문에 당연히 그안의 요소인 start() 메소드가 필수적으로 들어있음.
		}
	}

	//가장 끝단인 Camera를 수퍼클래스로 가지는 인자들에 대해 실행한다.
	//다르게 말하면 업케이스를 발생시키는것.
	public static void showMachineList2(ArrayList<? super Camera> InputForValue) {
		for (Object value : InputForValue) {
			System.out.println(value);
		}
	}
	
}