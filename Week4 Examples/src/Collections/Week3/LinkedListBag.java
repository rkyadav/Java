package Week3;

import java.util.Iterator;

public class LinkedListBag<Item> implements Iterable<Item>
{
   private Node first;  // first node in list
   private int count;   //Keep track of the number of elements

   //Record 
   private  class Node
   {
       Item item;
       Node next;
   }

   public void add(Item item)
   {  // same as push() in Stack
      Node oldfirst = first;
      first = new Node();
      first.item = item;
      first.next = oldfirst;
      count++;
   }
   
   public boolean isEmpty(){
	   return first == null;
   }
   
   public int size(){
	   return count;
	   
   }

   public Iterator<Item> iterator()
   {  
	   return new ListIterator();  
   }
   
   private class ListIterator implements Iterator<Item>
   {
       private Node current = first;

       public boolean hasNext()
       {  return current != null;  }
       public void remove() { }
       public Item next()
       {
           Item item = current.item;
           current = current.next;
           return item;
       }
   }
}