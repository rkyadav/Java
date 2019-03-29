package Week3;

import java.util.Scanner;

public class LinkedListStackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListStack<Integer> aStack = new LinkedListStack<Integer>();
		
		Scanner aScanner = new Scanner(System.in);
		
		while(aScanner.hasNext()){
			
			int value = aScanner.nextInt();
			aStack.push(value);
		}
		
		Integer item = 0;
		while(!aStack.isEmpty()){
			
			item = aStack.pop();
			System.out.println(item);
		}
		aScanner.close();
	}

}
