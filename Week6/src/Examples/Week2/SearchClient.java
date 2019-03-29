package Examples.Week2;

import java.util.Scanner;

public class SearchClient {
	
	public static void main(String [] args) {
		
		int [] scores = new int[] {60, 70, 40, 90, 75, 99};
		
		System.out.println("Please enter the search value:");
		Scanner entry = new Scanner(System.in);
		int key = entry.nextInt();
		
		Search mySearch = new Search();
		int result = mySearch.findValue(key, scores);
		
		if(result == -1) {
			System.out.println(key + " was not found!");
		}
		else {
			System.out.println(key + " was found");
		}
		
		entry.close();
		
		
		
		
		
		
	}

}
