package java_tutorial_07;

public class Machine implements Info{
//class Machine error >> error check > "Add unimplemented methods"
//@ annotation ������̼�. ���� �����ӿ�ũ ���� ����.
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine start.");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is :" + id);
	}
}
