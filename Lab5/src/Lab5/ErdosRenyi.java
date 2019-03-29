package Lab5;
import java.util.Scanner;
import java.util.Random;

public class ErdosRenyi {

	public static void main(String...strings) {
		// take in user input of integer
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		// call count method that should return the number of connections made
		int c = count(n);
		System.out.println("There were " + c + " connections generated.");
		
	}
	
	public static int count(int number) {
		int totaloop = number+1;
		int totalconnections = 0;
		WeightedQuickUnionUF uf = new WeightedQuickUnionUF(number);
		// take number and create random pair between 0 and number -1
		while (totaloop != 0) {
			Random rand = new Random();
			int randnum1 = rand.nextInt(number);
			int randnum2 = rand.nextInt(number);
			// should call connected method to check if numbers are connected
			if (uf.connected(randnum1, randnum2)) {
//				System.out.println(randnum1 + " " + randnum2 + " are connected");
				totaloop--;
			}else {
			// if numbers are not connected then call union method that should loop until all is connected
			uf.union(randnum1, randnum2);
//			System.out.println(randnum1 + " " + randnum2);
			totalconnections += 1;
			totaloop--;
			}
		}
		return totalconnections;
	}
	
}
