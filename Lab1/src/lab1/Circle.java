package lab1;
import java.lang.Math.*;

public class Circle {
	
	public Circle (){
	}
	
	public double radius(double value) {
		double r = value / 2;
		return r;
	}
	
	public int circumference(int value) {
		int c = (int) (2 * Math.PI * this.radius(value));
		return c;
	}
	
	public static void area(double value) {
		double A = Math.PI * (value * value);
		
		System.out.println("The area is " + A + ".");
	}
}
