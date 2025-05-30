/*Program-4 (Graph Traversal on BFS):  Write Java program on 
Breadth First Search Traversal for directed graph
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
        adjacencyList[from].add(to); // Directed edge from 'from' to 'to'
    }

    // BFS traversal starting from a given vertex
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Array to track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        visited[startVertex] = true; // Mark the start vertex as visited
        queue.add(startVertex); // Add start vertex to queue

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll(); // Remove and get front of the queue
            System.out.print(currentVertex + " "); // Print the visited node

            // Visit all unvisited neighbors
            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(6); // Creating a directed graph with 6 vertices
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(4, 5);

        System.out.println("Breadth First Search (BFS) starting from vertex 0:");
        g.BFS(0);
    }
}
