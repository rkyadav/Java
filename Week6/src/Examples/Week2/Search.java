package Examples.Week2;
import java.util.Arrays;

public class Search {
	
	
	private int [] values;
	public int findValue(int target, int [] values){
		populateValues(values);
		int result = binarySearch(target);
		return result;
	}
	private void populateValues(int [] values){
		this.values = new int[values.length];
		for(int i = 0; i < values.length; i++){
			this.values[i] = values[i];
		}
	}
	private int binarySearch(int key) {
		
		Arrays.sort(values);
		
		int min = 0;
		int max = values.length - 1;
		
		while(min <= max) {
			
			int mid = min + (max - min)/2;
			if(key < values[mid])
				max = mid - 1;
			else if(key > values[mid])
				min = mid + 1;
			else
				return mid;
		}
		return -1;
		
		
	}
	
	@SuppressWarnings("unused")
	private int recursiveSearch(int key, int[] a, int lo, int hi)
	{  // Index of key in a[], if present, is not smaller than lo
	   //                                  and not larger than hi.
	   if (lo > hi) return -1;
	   int mid= lo + (hi - lo) / 2;
	   if      (key < a[mid]) return recursiveSearch(key, a, lo, mid - 1);
	   else if (key > a[mid]) return recursiveSearch(key, a, mid + 1, hi);
	   else                   return mid;
	}
	
	@SuppressWarnings("unused")
	private int linearSearch(int target, int [] values) {
		for(int i = 0; i < values.length; i++) {
			if(values[i] == target)
				return values[i];
		}
		
		
		return -1;
	}
	

}
