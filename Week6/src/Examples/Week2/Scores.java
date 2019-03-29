package week2;

public class Scores {
	//private double values [] = new double[] {66.5, 77.2, 90.1, 100.7}; 
	private double values [];
	
	
	public Scores(double [] values) {
		int size = values.length;
		this.values = new double[size];
		for(int i = 0; i < values.length; i++) {
			this.values[i] = values[i];
		}
		
	}
	
	public Scores() {
		values = new double[] {66.5, 77.2, 90.1, 100.7};
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
