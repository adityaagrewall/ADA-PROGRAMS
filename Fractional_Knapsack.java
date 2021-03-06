package Programs;

import java.util.*;

public class Fractional_Knapsack {
	
	public static void main(String[] args) {
		Random rand = new Random();
        int i, max_qty , m, n, j=0;  
        float sum = 0, max;  
        Scanner sc = new Scanner(System.in);
        int weight[]=new int[100];
        int profit[]=new int[100]; 
        System.out.println("Enter no of items: ");  
        n=sc.nextInt(); 
        
        System.out.println("Enter capacity of knapsack: ");  
        max_qty=sc.nextInt();  
 
        System.out.print("Weights of each item are entered using RANDOM FUNCTION.");
        System.out.println();
        for(i = 0; i < n; i++){
           weight[i] = (int)(Math.random() * 100);
        }
        for( j = 0; j < n; j++)
        System.out.println(" " +weight[j]);
        System.out.println();
 
        System.out.print("Values of each item are entered using RANDOM FUNCTION.");
        System.out.println();
        for(i = 0; i < n; i++){
           profit[i] = (int)(Math.random() * 1000)+100;
        }
        for(j = 0; j < n; j++)
        System.out.println(" "+profit[j]);
        System.out.println();
 
        m=max_qty;  
        
        while(m>=0)  
        {  
              max=0;
            for(i=0;i<n;i++)  
            {  
                if(((float)profit[i])/((float)weight[i])>max)  
                {  
                    max=((float)profit[i])/((float)weight[i]);  
                    j=i;  
                }  
            }  
            if(weight[j]>m)  
            {  
                System.out.println("\nQuantity of item number: " +  (j+1) + " added is " +m);  
                sum+=m*max;  
                m=-1;  
            }  
            else  
            {  
                System.out.println("Quantity of item number: " + (j+1) + " added is " + weight[j]);  
                m-=weight[j];  
                sum+=(float)profit[j];  
                profit[j]=0;  
            }  
        }  
        System.out.println();
        System.out.println("The total profit is " + sum);
        sc.close();

	}

}