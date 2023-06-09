package dsa;

import java.util.Arrays;

//A real-time example of a dynamic programming algorithm is the problem of 
//finding the shortest path in a weighted graph, commonly known as the "Shortest Path" problem. 
//One of the most popular algorithms to solve this problem is
//Dijkstra's algorithm, which utilizes dynamic programming principles.

public class DijkstraAlgorithm {
	public static void main(String[] args) {
		int[][] graph = { { 0, 4, 2, 0, 0 }, { 1, 0, 1, 5, 0 }, { 2, 1, 0, 8, 10 }, { 0, 5, 8, 0, 2 },
				{ 0, 0, 10, 2, 0 } };

		int source = 0; // source vertex
		int[] distances = dijkstra(graph, source);
		
		System.out.println("Shortest distances from vertex " + source + " : ");
		
		for (int i =0; i < distances.length; i ++) {
			System.out.println("Vertex " + i + " : " + distances[i]);
		}
	}

	private static int[] dijkstra(int[][] graph, int source) {
		int n = graph.length;
		int[] distances = new int[n];// array to store the shortest distances
		boolean[] visited = new boolean[n];// Array to track visited vertices

		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[source] = 0;

		for (int i = 0; i < n - 1; i++) {
			int minVertex = findMinVertex(distances, visited);
			visited[minVertex] = true;
			
			for(int j = 0; j < n; j ++) {
				if(graph[minVertex][j] != 0 && !visited[j]) {
					int newDistance = distances[minVertex] + graph[minVertex][j];
					if(newDistance < distances[j]) {
						distances[j]  =  newDistance;
					}
				}
			}
		}

		return distances;
	}

	private static int findMinVertex(int[] distances, boolean[] visited) {
		int minVertex = -1;
		for (int i = 0; i < distances.length; i++) {
			if (!visited[i] && (minVertex == -1 || distances[i] < distances[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}
}

