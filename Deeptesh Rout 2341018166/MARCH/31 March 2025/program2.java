/*Program-2 (Graph Traversal on DFS):  
Write Java program on Depth First Search Traversal for directed graph
 */

import java.util.*;

class DirectedGraph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjacencyList; // Adjacency list representation

    // Constructor
    @SuppressWarnings("unchecked")
    public DirectedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add a directed edge
    public void addEdge(int from, int to) {
        adjacencyList[from].add(to);
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
        DirectedGraph g = new DirectedGraph(6); // Creating a directed graph with 6 vertices
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(4, 5);

        System.out.println("Depth First Search (DFS) starting from vertex 0:");
        g.DFS(0);
    }
}
