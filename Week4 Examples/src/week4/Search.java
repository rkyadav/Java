package week4;
import java.util.Arrays;

public class Search {
	
	
	private int [] values;
	public int findValue(int target, int [] values){
		populateValues(values);
		int result = binarySearch(target, values);
		return result;
	}
	private void populateValues(int [] values){
		this.values = new int[values.length];
		for(int i = 0; i < values.length; i++){
			this.values[i] = values[i];
		}
	}
	private int binarySearch(int target, int [] values) {
		
//		Employee anEmployee = new Employee();
		Arrays.sort(values);
		
		int min = 0;
		int max = values.length - 1;
		
		while(min <= max) {
			
			int mid = min + (max - min)/2;
			if(target < values[mid])
				max = mid - 1;
			else if(target > values[mid])
				min = mid + 1;
			else
				return mid;
		}
		return -1;
		
		
	}
	/*private int linearSearch(int target, int [] values) {
		for(int i = 0; i < values.length; i++) {
			if(values[i] == target)
				return values[i];
		}
		
		
		return -1;
	}*/
	

}
