package Collections.Week3;

public class IntStack {
	private int [] values;
	private int count;
	
	public IntStack(int size){
		values = new int [size];
		count = 0;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public void push(int aValue){
		if(count == values.length){
			resize(2*values.length);
		}
		values[count++] = aValue;
	}
	
	public int pop(){
		int value = values[--count];
		values[count] = 0;
		
		if(count > 0 && count == values.length/4){
			resize(values.length/2);
			
		}
		return values[--count];
		
		
		
	}
	public int size(){
		return count;
	}
	
	private void resize(int max){
		
		int temp [] = new int[max];
		for(int i = 0; i < temp.length; i++){
			temp[i] = values[i];
		}
		values = temp;

	}

}
