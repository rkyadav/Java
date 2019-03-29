package week4;

public class InterfaceClient {
	
	public static void main(String...args) {
		
		Animals aDog = new Dog();
		
		aDog.move();
		
		Cat aCat = new Cat();
		aCat.move();
	}

}
