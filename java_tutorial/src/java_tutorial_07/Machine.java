package java_tutorial_07;

public class Machine implements Info,IStartable{
//class Machine error >> error check > "Add unimplemented methods"
//@ annotation ������̼�. ���� �����ӿ�ũ ���� ����.
	
	private int id = 7;
	
	
	@Override
	public void start() {
		System.out.println("Machine start.");		
	}
	
	@Override
	public void stop() {
		System.out.println("Machine stop.");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is :" + id);
	}

}
