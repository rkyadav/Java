package Lab6;

import java.util.Arrays;
import java.util.Random;
//import Week3.*;
public class Lab6 {
	/**
	 * Overview: Write a program that tests the performance of the insertion sort algorithm for an array of primitive int versus Reference Integers. 
	 * Add two methods to this class to generate the values that will be sorted by Insertion sort:
	 *   generateIntValues -- This method will generate int values and store them into an int array
	 *   generateIntegerValues -- This method will generate int values and store them into an Integer array
	 * The values generated from each method will be passed to the sort method of the Insertion class. 
	 * Your program will use the StopWatch class to keep track of the running time
	 */
	/**
	 * Unless specified otherwise, you must not change the declaration of any method. 
	 * For example, you will get zero points if you change the line
	 * <pre>
	 *     public static int generateIntegerValues()
	 * </pre>
	 * to something like
	 * <pre>
	 *     public static int generateIntegerValues (int value)
	 * </pre>
	 * 
	 */
	
	/**
	 * genereateIntValues creates and returns an array of unique 1000 int values 
	
	 *
	 */
	
	private static boolean check(int[] array, int num) {
		for(int i : array) {
			if(i == num) {
//				System.out.println(num + " is already in array");
				return false;
			}
		}
		return true;
	}
	
	
	public static int [] generateIntValues(){
		
		/*Add code that randomly generates int values and stores them in an array of int.  1000 unique values should be stored in the array
		 * return the array
		*/
		
		int number = 1000;
		int indexNum = 0;
		int[] intArray = new int[number];
		
		while(indexNum <= 999) {
					
			Random rand = new Random();
			int randnum1 = rand.nextInt(number+number);

			if(check(intArray,randnum1)) {
//				System.out.println("Adding " + randnum1 + " to index " + indexNum);
				intArray[indexNum] = randnum1;
				
				indexNum++;
			}
			
		}

		return intArray; //replace this line with the array containing the int values
	}
	
	
	/**
	 * genereateIntegerValues creates and returns an array of 1000 Integer values  
	 *
	 */
	public static Integer [] generateIntegerValues(){
		
		//Add code that randomly generates int values and stores 1000 unique values in an array of Integer values
		//return the array
		
		int number = 1000;
		int indexNum = 0;
		Integer[] integerArray = new Integer[number];
		int[] randnumbers = new int[number];
		while(indexNum <= 999) {
			
			Random rand = new Random();
			int randnum1 = rand.nextInt(number+number);
			
			if(check(randnumbers,randnum1)) {
				randnumbers[indexNum] = randnum1;
//				System.out.println("Adding " + randnum1 + " to index " + indexNum);
				integerArray[indexNum] = randnum1;
				indexNum++;
			}
		}
	
		return integerArray; //replace this line with the array containing the Integer values
	}
	
	
	public static void main(String...strings){
		//Call generateIntValues method and store the result
		int [] intvalues = generateIntValues();
		//Create a new instance of StopWatch class
		Stopwatch timer1 = new Stopwatch();
		//Call Insert sort method and pass the array containing the int values
		Insertion.sort(intvalues);
		//Call the elapse time method on your StopWatch instance
		double timer1Total = timer1.elapsedTime();
		//Display how long the sort took
		System.out.println("It took IntValues " + timer1Total + " seconds to complete");
		
		//Call generateIntegerValues method and store the result
		Integer [] integervalues = generateIntegerValues();
		//Create a new instance StopWatch class
		Stopwatch timer2 = new Stopwatch();
		//Call Insert sort method and pass the array containing the Integer values
		Insertion.sort(integervalues);
		//Call the elapse time method on your StopWatch instance
		double timer2Total = timer2.elapsedTime();
		//Display how long the sort took
		System.out.println("It took IntegerValues " + timer2Total + " seconds to complete");
	
	}

}
