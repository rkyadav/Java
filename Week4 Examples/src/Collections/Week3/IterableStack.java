package Week3;

import java.util.Iterator;
public class IterableStack<T> implements Iterable<T>{
	private T [] values;
	private int count;
	
	@SuppressWarnings("unchecked")
	public IterableStack(int size){
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
	public Iterator<T> iterator(){
		
		return new StackIterator();
	}

	private class StackIterator implements Iterator<T>{
		
		//private int i = count;
		public boolean hasNext(){ 
			return count > 0;
		}
		
		public T next(){
			return values[--count];
		}
		
		public void remove(){}
	}
}
