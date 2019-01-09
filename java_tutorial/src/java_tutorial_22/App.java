package java_tutorial_22;

//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/255769?start=0
//Try-With-Resources

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("oh No!");
	}
}


public class App {

	public static void main(String[] args) {

//		Temp temp = new Temp();
//		try {
//			temp.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
