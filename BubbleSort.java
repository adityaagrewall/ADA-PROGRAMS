package Programs;

import java.util.*;

public class BubbleSort {
	int c=0;
	int d=0;
	void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
   
    void bubbleSort(int[] arr, int n)
    {c=c+1;
        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
 
        if (n - 1 > 1) {
            bubbleSort(arr, n - 1);
        }
    }
    
    void bubbleSortd(int[] arr, int n)
    {d=d+1;
        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
 
        if (n - 1 > 1) {
            bubbleSortd(arr, n - 1);
        }
    }
 
    public static void main(String[] args)
    {   
    Random rand = new Random();
    int x = 10;
    int arr[] = new int[x];
    for(int i = 0; i<x; i++)
    {
   	 arr[i] = rand.nextInt(1000);
    }
    BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr,arr.length);
        long startT = System.nanoTime();
	     long endT = System.nanoTime();
	     double time = (endT - startT);
	     System.out.println("Time taken by quick sort(ascending) is " +time+ " ns.");
	     
	     for(int i = 0; i<x; i++) {
	    	 System.out.print(arr[i] + " ");
	     }
	     System.out.println("\nFunction has been called " +bs.c+ " times");
	     
	     bs.bubbleSortd(arr,arr.length);
	        long startTd = System.nanoTime();
		     long endTd = System.nanoTime();
		     double timed = (endTd - startTd);
		     System.out.println("\nTime taken by quick sort(descending) is " +timed+ " ns.");
		     
		     for(int i = 0; i<x; i++) {
		    	 System.out.print(arr[i] + " ");
		     }
		     System.out.println("\nFunction has been called " +bs.d+ " times");
	     
	     
	     
    }

}
