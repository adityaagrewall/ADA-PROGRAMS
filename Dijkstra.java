package Programs;

import java.util.*;

public class Dijkstra{
	static final int X = 5;
	
	int Distance(int dist[], Boolean sptSet[])
	{	
		
	   int min = Integer.MAX_VALUE;
	   
	   int min_index = -1;
	
	   for(int v = 0; v < X; v++) {
		if(sptSet[v] == false && dist[v] <= min) {
			min = dist[v];
			min_index = v;
		}
	}
	   return min_index;
}
	
	void print(int dist[], int n)
	{
		System.out.println("Vertex       Distance from Source");
		for(int i = 0; i<X; i++) {
			System.out.println(i + "                  " + dist[i]);
		}
	}
	
	void shortestpath(int graph[][], int source)
	{
		
		int dist[] = new int[X];
		
		Boolean sptSet[] = new Boolean[X];
		
		
		for(int i = 0; i < X; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		
		
		
		
		dist[source] = 0;
		
		
		
		
		for(int count = 0; count < X - 1; count++) {
			int u = Distance(dist, sptSet);
			sptSet[u] = true;
			for(int v = 0; v < X; v++) {
				if(!sptSet[v] && graph[u][v] != 0 && dist[u]!= Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
					dist[v] = dist[u] + graph[u][v];
				}
					
			}
		}
		print(dist, X);
	}
	public static void main(String[] args)
	{
		int graph[][] = new int[][] {{100,3,100,100,5}, 
			                         {100,100,8,5,3}, 
			                         {100,100,100,100,100}, 
			                         {100,100,2,100,100}, 
			                         {100,100,100,4,100}};
			                         
			                         
		Dijkstra blah = new Dijkstra();
		
		
		
		blah.shortestpath(graph, 0);
	}
}
