package java_tutorial_15;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/156484?start=45

//Anonymous Classes
//�͸�Ŭ���� �����.
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
				System.out.println("�ܺο��� �ҷ�����....");
			}
		};

		machine1.start(); // :> Camera snapping ......
		// ���� ��üȭ�� �����ʰ� �ٷ� �������̵� �� �� �����ϴ� �ٲ�ü�� �����.
		// ���� ������ �Ͻ��ϴ� ������?

//		machine1.overCalling();
		// �����Ͽ���. ��ӹ��� �θ�Ŭ���� �ȿ� overCalling()�� ������� �ʾ���.
		// �͸�Ŭ������ �����ص� �̸� �ۿ��� ���� �� ����.
		// �ݴ�� �̹� ����Ǿ��ִ°��� �������̵� �ؼ� ���� ��밡��.

		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant growing....!");
			}
		};

		plant1.grow();

//�θ�Ŭ������ ��ӹ޴� �ڽ�Ŭ������ �ܺο� �����Ͽ� ����ϰ� �ȴ�.
//�Ź� �ڽ�Ŭ������ �߰��Ͽ� ����ϸ� �ѹ� ����ϰ� �Ⱦ��� Ŭ������ �ʹ� �������� �ȴ�.
//
	}
}
