package week2;

import java.util.Scanner;
import java.util.Arrays;
public class SearchClient {
	
	public static int binarySearch(int target, int [] values) {
		
		Arrays.sort(values);
		
		int min = 0;
		int max = values.length - 1;
		
		while(min <= max) {
			int mid = min +(max - min)/2;
			if(target < values[mid])
				max = mid -1;
			else if(target > values[mid])
				min = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	
	public static int linearSearch(int target, int [] values) {
		for(int i = 0; i < values.length; i++) {
//			System.out.println("Current value is: " + values[i]);
			if(values[i] == target)
				return values[i];
		}
		
//		int value = 0;
		return -1;
	}
	
	public static void main(String [] args) {
		int [] scores = new int[] {60, 70, 40, 90, 75, 99};
		
		System.out.println("Please enter the search value:");
		Scanner entry = new Scanner(System.in);
		int key = entry.nextInt();
		
//		int result = linearSearch(key, scores);
		int result = binarySearch(key, scores);
		
		if(result == -1) {
			System.out.println(key + " was not found!");
		}
		else {
			System.out.println(key + " was found");
		}
	}
}
