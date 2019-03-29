package week2;

public class Scores {
	// private can only be used within the class
	private double values [] = new double[] {66.5, 77.2, 90.1, 100.7};
	
	public Scores(double [] values) {
		for(int i = 0 ; i < values.length; i++) {
			this.values[i] = values[i];
		}
	}
	
	public void printScores() {
		
		int count = 0;
		while(count < this.values.length) {
			System.out.println(this.values[count]);
			count += 1;
		}
	}
	
	public double [] getScores() {
		return values;
	}
}
