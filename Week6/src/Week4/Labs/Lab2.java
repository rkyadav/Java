package Week4.Labs;

/**
 * Unless specified otherwise, you must not change the declaration of any method. 
 * For example, you will get zero points if you change the line
 * <pre>
 *     public static int [] findOdds (int[] list)
 * </pre>
 * to something like
 * <pre>
 *     public static void findOdds (double[] list)
 * </pre>
 * 
 * Each of the methods below is meant to be SELF CONTAINED. This means that
 * you should use no other functions or classes.  You should not use any HashSets
 */
public class Lab2 {

	/**
	 * findOdds returns an array of odd number found in the list array  
	 * Precondition: the array is nonempty. 
	 * Your solution must go through the array exactly once.  
	 *
	 */
	public static int [] findOdds (int[] list) { 
		//Add your code here
		int odds[] = new int [list.length];  //Replace this line. 
		int count = 0;
		for(int i = 0; i < list.length; i++){
			if(list[i] % 2 != 0){
				odds[count] = list[i];
				count++;
			}
			
		}
		//Some values in the odd array may be 0.  resize odd or return odd and filter out 0s
		/*int temp [] = new int [count];
		for(int i = 0; i < odds.length; i++)
			temp[i] = odds[i];
		return temp;
		*/
		return odds;
	}

	/**
	 * findMaxValue searches through the array and returns the maximum value in the array
	 *
	 * Precondition:  the array is nonempty and all elements are unique.
	 * Your solution must go through the array exactly once.  
	 * 
	 */
	public static double findMaxValue (double [] list) {
		
		
		//Add your code here
		double max = 0.0;
		for(int i = 0; i < list.length; i++){
			if(list[i] > max)
				max = list[i];
		}
		return max; 

	}

	/**
	 * <pre>
	 * imperfectNumber determines  (true or false) if a given number is a 'imperfect Number '
	 * 
	 * An imperfect number is a number that is not equal to the sum of its divisors.
	 * Example 1:   6;   the proper divisors are  1, 2, 3 ;  1+ 2 + 3  is 6, so  6 IS a perfect number; function returns false
	 * Example 2:   15; the proper divisors are  1, 3, 5 ; 1 + 3 + 5  is 9, so 15 IS NOT a perfect number; function returns true
	 * Example 3:   28; the proper divisors are  1, 2, 4, 7, 14; 1 + 2 + 4 + 7 + 14 is 28, so  28 IS a perfect number; function returns false
	 */
	public static boolean imperfectNumber( int number) {
		
		
		int sum = 1;
		int count = 2;
		boolean imPerfect = false;
		while(count < number){
			if(number % count == 0){
				sum += count;
			}
			count++;
			
		}
		if(sum != number)
			imPerfect = true;
		return imPerfect; 
	}
	/*
	 * A test program, using private helper functions.  See below.
	 */
	public static void main (String[] args) {
		/*
		 * 1. Define an integer array
		 * 2. Call findOdds method and pass your array as argument
		 * 3. Capture and print the result of the method call
		 */
		int scores [] = new int []{2,30, 14, 51, 33, 55, 40, 75};
		int oddValues[] = findOdds(scores);
		
		System.out.println("The odd values in the array are:");
		for(int i = 0; i < oddValues.length; i++)
			if(oddValues[i] != 0)
				System.out.println(oddValues[i]);
		
		/*
		 * Define a double array and pass it as a parameter to the findMaxValue method
		 * Capture and print the value returned by findMaxValue method
		 */
		
		double prices [] = new double[]{66.10, 99.1,23.2, 17.9, 21.54};
		System.out.println("The max value is: " + findMaxValue(prices));
		System.out.println();
		/*
		 * Define an integer
		 * Call imperfectNumber method and pass the integer as an argument
		 * Capture the result of the method and display a message
		 */
		//A loop is not required.  I am using a loop to generate multiple values
		for(int i = 0; i < 5; i++){
			int num = (int)(Math.random() * 50 + 1);
			if(imperfectNumber(num))
				System.out.println(num + " is imperfect");
			else
				System.out.println(num + " is not imperfect");
			
		}
		

	
	}
	
}