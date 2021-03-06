package Week6.Lab;

import java.util.Random;
import Week3.*;
public class Lab4 {
	/**
	 * Overview: Write a program that prints the prime numbers in the list of factors of a randomly generated even or odd number in reverse order
	 * For example: If the random number is 12, the factors are 1,2,3,4, and 6.  The prime numbers are 2,3.  The program will print 3, 2
	 */
	/**
	 * Unless specified otherwise, you must not change the declaration of any method. 
	 * For example, you will get zero points if you change the line
	 * <pre>
	 *     public static int generateEvenInt ()
	 * </pre>
	 * to something like
	 * <pre>
	 *     public static int generateEvenInt (int value)
	 * </pre>
	 * 
	 */
	
	/**
	 * genereateEvenInt generates and returns an even integer between 50 and 100  
	 * Use the m
	 * Your solution must go through the array exactly once.  
	 *
	 */
	public static int generateEvenInt(){
		
		int min = 50;
		int max = 100;
		Random randNum = new Random();
		int randInt = 0; //The value of this variable will be replaced by your code
		/*
		 * The statement below generates a random number between 50 and 100
		 * int randInt = randNum.nextInt((max - min) + 1) + min; 
		 * Write code that only returns even or odd numbers between 50 and 100
		 */
	
		return randInt;
	}
	
	/* Write the code for method findFactors
	 * This method will be called in the main method and passed the randomly generated integer
	 * The method will find the factors of the number and store them in a queue
	 * The method will return the queue
	 * Use the LinkedListQueue example from class to store the factors
	 */
	public static LinkedListQueue<Integer> findFactors(int num){
		
		LinkedListQueue<Integer> factors = new LinkedListQueue<Integer>();
		//Add your code
		return factors;
	}
	
	/*Write a method findPrimeNumbers
	 * This method determines the prime numbers in the list of factors, stores them in a stack, and returns the stack
	 * 
	 */
	public static LinkedListStack<Integer> findPrimeNumbers(LinkedListQueue<Integer> aQeueue){
		
		LinkedListStack<Integer> primeNums = new LinkedListStack<Integer>();
		//Add your code
		return primeNums;
	}
	
	/* Write a method printPrimeNumbers
	 * This method takes the stack of printPrimeNumbers as parameter
	 * This method displays all prime factors
	 * Method does not return any value
	 * 
	 */

	
	public static void main(String...strings){
		//Call generateEvenInt
		//Call findFactors method and pass the randomly generate integer as argument
		//Call findPrimeNumbers method and pass the queue containing the factors as argument
		//Call printPrimeNumbers and pass the stack of prime numbers as arguments
	
	
	}

}
