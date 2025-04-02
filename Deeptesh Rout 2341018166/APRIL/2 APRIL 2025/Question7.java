/*Create a class Graph that uses a linked list to represent N vertices. Implement a 
constructor to initialize the graph. Add a method to read a graph and store it using an 
adjacency list representation. Additionally, implement a Depth-First Search (DFS) 
method to traverse the graph's vertices. Finally, include a main method to create a 
graph, invoke the implemented methods, and display the traversal results. */

import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor to initialize the graph
    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        // Initialize adjacency list for each vertex
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // For undirected graph
    }

    // Method to display the adjacency list
    public void displayGraph() {
        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Depth-First Search (DFS) Traversal
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // To keep track of visited nodes
        System.out.println("Depth-First Search (DFS) Traversal:");
        DFSUtil(startVertex, visited);
        System.out.println();
    }

    // Recursive helper function for DFS
    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " "); // Print current node

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}

public class Question7 {
    public static void main(String[] args) {
        int vertices = 5; // Number of vertices
        Graph graph = new Graph(vertices);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Display adjacency list representation
        graph.displayGraph();

        // Perform DFS traversal starting from vertex 0
        graph.DFS(0);
    }
}
