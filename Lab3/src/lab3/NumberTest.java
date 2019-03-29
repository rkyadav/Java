package lab3;

public class NumberTest {

	public static void main(String...args){
		
		final Numbers a = new Numbers(5, 6);
		final int [] b = {8, 11};
		
		a.plus(b);
		a.minus(b);
		a.times(b);
		a.divideBy(b);
		a.equals(b);
		a.toString(b);
	}
}
