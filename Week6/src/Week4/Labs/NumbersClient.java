package Week4.Labs;

public class NumbersClient {

	public static void main(String[] args) {
		
		Numbers a = new Numbers(5, 6);
		Numbers b = new Numbers(4, 7);
		
		System.out.println("Sum: " + a.plus(b));
		System.out.println("Subtract: " + a.minus(b));
		System.out.println("Divide: " + a.divideBy(b));
		System.out.println("Equal: "+ a.equals(b));

	}

}
