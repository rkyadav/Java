package Week3;

import java.util.Scanner;

public class StackClient {
	
	public static void main(String...args){
		
		//Scanner entry = new Scanner(System.in);
		System.out.print("Enter integer values on one line: ");
		Scanner entry = new Scanner(new java.io.BufferedInputStream(System.in), "UTF-8");
		int size = 0;
		int values [] = new int [10];
		IterableStack<Integer> aStack = new IterableStack<Integer>(10);
		while(entry.hasNextInt()){
			int value = entry.nextInt();
			aStack.push(value);
			
		}
		//for(int i = 0; i < aStack.size(); i++){
		//	System.out.println("Popping: " + aStack.pop());
	    //}
		
		/*while(!aStack.isEmpty()){
			System.out.println("Popping: " + aStack.pop());
		}*/
		
		
		/*for(int x: values){
			System.out.println(x);
		}*/
		for(int item: aStack){
			System.out.print(item);
			
		}
		entry.close();
	}

}
