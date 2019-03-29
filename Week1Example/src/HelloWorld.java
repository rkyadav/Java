
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		int age = 10;
		double price = 10.99;
		char letter = 'A';
		int newAge = age + 10;
		int intPrice = (int)price;
		double data = 100.99;
		System.out.print(intPrice + data);
//		put the rest of print statement on new line
		System.out.println("");
		String name = "John";
		System.out.println(name + " is " + 10);
		
		int [] grades = {20,30,50,100};
		
//		int result = ArrayExample.sumValues(grades);
		ArrayExample AE = new ArrayExample();
		int result = AE.sumValues(grades);
		
		System.out.println(result);
		
	}

}
