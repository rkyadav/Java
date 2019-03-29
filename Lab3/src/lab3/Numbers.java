package lab3;
import java.util.Arrays;

public class Numbers {
	
	final private int [] value = new int[2];
	public Numbers(int value1, int value2) {
		
		value[0] = value1;
		value[1] = value2;
	}
	
	public void plus(int[] b) {
		int val1 =  this.value[0] + this.value[1];
		int val2 = b[0] + b[1];
		int val3 = val1 + val2;
		System.out.println("(" + val1 +"," + val2 + ")");
		System.out.println(val3);

	}
	
	public void minus(int [] b) {
		int val1 =  this.value[0] - this.value[1];
		int val2 = b[0] - b[1];
		int val3 = val1 - val2;
		System.out.println("(" + val1 +"," + val2 + ")");
		System.out.println(val3);
	}
	
	public void times( int [] b) {
		int val1 =  this.value[0] * this.value[1];
		int val2 = b[0] * b[1];
		int val3 = val1 * val2;
		System.out.println("(" + val1 +"," + val2 + ")");
		System.out.println(val3);
	}
	
	public void divideBy(int [] b) {
		int val1 =  this.value[0] / this.value[1];
		int val2 = b[0] / b[1];
		System.out.println("(" + val1 +"," + val2 + ")");
		if (val1 == 0 || val2 == 0) {
			int val3 = 0;
			System.out.println(val3);
		}else {
			int val3 = val1 / val2;
			System.out.println(val3);
		}
	}
	
	public boolean equals(int [] b) {
		if(this.value[0] == b[0] && this.value[1] == b[1]) {
			System.out.println("They are equal.");
			return true;
		}
		System.out.println("They are not equal.");
		return false;
	}
	
	public void toString(int [] b) {
		System.out.println(Arrays.toString(this.value));
		System.out.println(Arrays.toString(b));
	}

}
