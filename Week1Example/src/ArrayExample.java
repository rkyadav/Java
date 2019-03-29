import java.util.Random;

public class ArrayExample {
	
	public static int sumValues(int [] score2) {
		
		int count = 0;
		int sum = 0;
		while(count < score2.length) {
			sum += score2[count];
			count++;
		}
		return sum;
	}
	
	public static void main(String [] args) {
		
		int [] scores;
		scores = new int[10];
		Random rand = new Random();
		
		for(int i = 0; i < scores.length; i++) {
			int value = rand.nextInt(30) + 1;
			scores[i] = value;
			System.out.println(scores[i]);
		}
		int result = ArrayExample.sumValues(scores);
		System.out.println("Total is " + result);
		
	}
}
