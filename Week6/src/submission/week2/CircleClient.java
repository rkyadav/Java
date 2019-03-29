package submission.week2;

import java.util.Scanner;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("imput diameter");
		int i=scan.nextInt();
		Circle circle=new Circle();
		String s=circle.method(i);
		System.out.println(s);
		
	}
}

	
	
	
	
	
