/*Program-1 (Graph Traversal on DFS):  
Write Java program on Depth First Search Traversal for undirected graph */

import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjacencyList; // Adjacency list representation

    // Constructor
    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int w) {
        adjacencyList[v].add(w);
        adjacencyList[w].add(v);
    }

    // DFS utility function
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true; // Mark the current node as visited
        System.out.print(v + " "); // Print the visited node

        for (int neighbor : adjacencyList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal starting from a given vertex
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Array to track visited nodes
        DFSUtil(startVertex, visited);
    }

    public static void main(String[] args) {
        Graph g = new Graph(6); // Creating a graph with 6 vertices
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.println("Depth First Search (DFS) starting from vertex 0:");
        g.DFS(0);
    }
}
