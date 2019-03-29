package Week3;

public class GenericStack<T> {
	private T [] values;
	private int count;
	
	@SuppressWarnings("unchecked")
	public GenericStack(int size){
		values = (T[]) new Object [size];
		count = 0;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public void push(T aValue){
		values[count++] = aValue;
	}
	
	public T pop(){
		return values[--count];
	}
	public int size(){
		return count;
	}

}
