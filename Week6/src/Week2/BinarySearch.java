package Week2;
import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.*;

public class BinarySearch
{
	
	
	public static int rank(int key, int[] a, int lo, int hi)
	{  // Index of key in a[], if present, is not smaller than lo
	   //                                  and not larger than hi.
	   if (lo > hi) 
		   return -1;
	   int mid= lo + (hi - lo) / 2;
	   if(key < a[mid]) 
		   return rank(key, a, lo, mid - 1);
	   else if (key > a[mid]) 
		   return rank(key, a, mid + 1, hi);
	   else                   
		   return mid;
	}
   public static int rank(int key, int[] a)
   {  // Array must be sorted.
      int lo  = 0;
      int hi = a.length - 1;
      while (lo <= hi)
      {  // Key is in a[lo..hi] or not present.
         int mid= lo + (hi - lo) / 2;
         if      (key < a[mid]) 
        	 hi = mid - 1;
         else if (key > a[mid]) 
        	 lo = mid + 1;
         else                   
        	 return mid;
      }
      return -1;
   }

   public static void main(String[] args)

   {
      int [] whitelist = new int[]{1,2,3,11,4,7,0,12};

      Arrays.sort(whitelist);
      Scanner entry = new Scanner(System.in);
      while (entry.hasNextInt())
      {  // Read key, print if not in whitelist.
         int key = entry.nextInt();
         if (rank(key, whitelist) == -1)
            StdOut.println(key);
      }
   }
}