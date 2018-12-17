package java_tutorial_09;
//https://www.udemy.com/java-tutorial/learn/v4/t/lecture/149501?start=0
//Polymorphism

public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		
		tree.shedLeaves();
		//plant2.shedLeaves();

		doGrow(tree);
	}
	
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
