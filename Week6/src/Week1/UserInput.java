package Week1;

import java.util.Scanner;
import java.util.Random;


public class UserInput {
	public static void sumArray(int value[]){
		for(int i = 0; i < value.length; i++){
			System.out.println(value[i]);
		}
		
		Random rand = new Random();
		int r = rand.nextInt(50) + 1;
		System.out.print("The random number is " + r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number: ");
		//read.nextInt();
		int sum = 0;
		while(true){
			sum += read.nextInt();
			if(sum > 100)
				break;
		}
		read.close();
		System.out.println(sum);
		
		int allValues[] = new int[10];
		
		for(int i = 0; i < allValues.length; i++){
			allValues[i] = i * 10;
		}
		
		sumArray(allValues);
	}

}
