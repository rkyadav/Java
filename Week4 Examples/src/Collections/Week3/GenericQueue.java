package Week3;

public class GenericQueue<T> {
	private T [] values;
	private int tail;
	private int head;
	
	
	@SuppressWarnings("unchecked")
	public GenericQueue(int size){
		values = (T[]) new Object [size];
		tail = head = 0;
		
	}
	
	public boolean isEmpty(){
		return tail == 0;
	}
	
	public void enqueue(T aValue){
		values[tail++] = aValue;
	}
	
	public T dequeue(){
		T value = values[head];
		head++;
		return value;
		
	}
	public int size(){
		return head;
	}

}
