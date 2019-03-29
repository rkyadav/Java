package lab1;

import java.util.Scanner;

public class CircleClient {

	public static void main(String[] args) {
		
		System.out.println("What is the diameter of the circle");
		Scanner entry = new Scanner(System.in);
		int key = entry.nextInt();
		Circle circle = new Circle();
		double radius = circle.radius(key);
		double circumference = circle.circumference(key);

		System.out.println("The radius is " + radius + ".");
		System.out.println("The circumference is " + circumference + ".");
		circle.area(radius);
	}
	
}
