package Week3;

public class LinkedListStack<T> {
	private Node first;
	private int count;
	
	private class Node{
		T item;
		Node next;
	}
	
	public void push(T item){
		Node currentFirst = first;
		first = new Node();
		first.item = item;
		first.next = currentFirst;
		count++;
	}
	
	public T pop(){
		T item = first.item;
		first = first.next;
		count--;
		return item;
	}
	
	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return first == null;
	}

}
