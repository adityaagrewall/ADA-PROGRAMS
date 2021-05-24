package Programs;
import java.util.*;

public class SelectionSort {
     public static void main(String[] args) {
     Random rand = new Random();
     int x = 100;
     int arr[] = new int[x];
     for(int i = 0; i<x; i++)
     {
    	 arr[i] = rand.nextInt(1000);
     }
     
     for(int i = 0; i<x; i++) {
    	 System.out.println(arr[i] + " ");
     }
     
     long startT = System.nanoTime();
     selectionSort(arr);
     long endT = System.nanoTime();
     double time = (endT - startT);
     System.out.println("Time taken by selection sort is " +time+ " ns.");
     
}
     
     public static void selectionSort(int[] arr) {
    	 for(int i = 0; i < arr.length - 1; i++)
    	 {
    		 int index = i;
    		 for(int j = i + 1; j < arr.length; j++) {
    			 if(arr[j] < arr[index]) {
    				 index = j;
    			 }
    		 }
    		 int small = arr[index];
    		 arr[index] = arr[i];
    		 arr[i] = small;
    	 }
     }
}

