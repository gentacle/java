package java_tutorial_11;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/152283?start=4
//Casting Numerical Values

public class App {
	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//허용범위 초과시 오버플로되서 보수로 입력됨
		//The following won't work as we expect it to!!!
		byteValue = (byte)127;
		System.out.println(byteValue);
		byteValue = (byte)128;
		System.out.println(byteValue);
		byteValue = (byte)129;
		System.out.println(byteValue);
		
	}

}
