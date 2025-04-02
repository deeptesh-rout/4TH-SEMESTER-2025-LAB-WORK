
/*Implement a Java program to traverse a graph using Breadth-First Search (BFS) with 
an adjacency list. Use ArrayDeque for efficient traversal. The program should include 
methods to initialize the graph, add edges, display the adjacency list, and perform BFS. 
Finally, use the main method to construct the graph, invoke BFS, and display the 
traversal output. */


import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private List<LinkedList<Integer>> adjList; // Adjacency list

    // Constructor to initialize the graph
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);

        // Initialize adjacency list for each vertex
        for (int i = 0; i < vertices; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // Since it's an undirected graph
    }

    // Method to display the adjacency list
    public void displayGraph() {
        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Breadth-First Search (BFS) Traversal using ArrayDeque
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Track visited nodes
        ArrayDeque<Integer> queue = new ArrayDeque<>(); // Queue for BFS

        // Start BFS from the given vertex
        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("Breadth-First Search (BFS) Traversal:");
        while (!queue.isEmpty()) {
            int vertex = queue.poll(); // Dequeue vertex
            System.out.print(vertex + " ");

            // Enqueue all unvisited adjacent vertices
            for (int neighbor : adjList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}

public class Question8 {
    public static void main(String[] args) {
        int vertices = 6; // Number of vertices
        Graph graph = new Graph(vertices);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Display adjacency list representation
        graph.displayGraph();

        // Perform BFS traversal starting from vertex 0
        graph.BFS(0);
    }
}
