package java_tutorial_07;

public class Machine implements Info,IStartable{
//class Machine error >> error check > "Add unimplemented methods"
//@ annotation 어노테이션. 별도 프레임워크 관련 있음.
	
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
