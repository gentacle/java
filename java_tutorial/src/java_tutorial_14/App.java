package java_tutorial_14;

import java.util.ArrayList;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/152317?start=0
//Generics and Wildcards

//�⺻ �� ���ĵ��� ���� Ŭ������ toString ���� �޼��带 ���� �ش� ���� ���ڿ��� ��ȯ�� �� �ְ� �����ϰ� ����.
//���� �����ڰ� ������ ���Ŀ� toString �޼��带 ���������� ������ ����Ʈ ���ڿ� ���� ��Ŭ���� �̸�@�ؽ� �ڵ尪��.

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

	//Generic[���׸�] : ���� ������ Ÿ��üũ�ϴ°�.
	//���ڷ� ���� Ÿ������ �����Ϸ� �ڵ���ȯ�Ǳ⶧���� list.get(idx) �� �� ���ϴ� Ÿ������ ĳ���������ʾƵ���.
	// ��� Ÿ���� �޾Ƶ��� �� �����ϰ� className<T> Ȥ�� <T> int getScore�� ���� �س����� ����.
	public static void showList(ArrayList<String> ListnameOfFor) {
		for (String value : ListnameOfFor) {
			System.out.println(value);
		}
	}

	// Camera�� Machine�� �޾ƿ͵� �� Ÿ���� �״�� �ٸ� �޼ҵ忡�� �޾Ƶ����� ����.
	// �̹� �ش� �޼ҵ忡�� �޾Ƶ��̴� ����Ʈ�� Ÿ���� Machine���� �����߱⶧��.
	// ArrayList<Machine> -> ArrayList<?> -> ArrayList<? extends Machine>
	// Machine value -> Object value -> Machine value
	public static void showMachineList(ArrayList<? extends Machine> InputForValue) {
		for (Machine value : InputForValue) {
			System.out.println(value);
			value.start();
			// Machine Ÿ���� ������ �͵��� ���ڷ� ������ �� ���� .start()�� �۵���.
			// Machine�� �θ�� �α⶧���� �翬�� �׾��� ����� start() �޼ҵ尡 �ʼ������� �������.
		}
	}

	//���� ������ Camera�� ����Ŭ������ ������ ���ڵ鿡 ���� �����Ѵ�.
	//�ٸ��� ���ϸ� �����̽��� �߻���Ű�°�.
	public static void showMachineList2(ArrayList<? super Camera> InputForValue) {
		for (Object value : InputForValue) {
			System.out.println(value);
		}
	}
	
}