/*Write a program to implement a graph using an adjacency matrix and adjacency list 
representation. Develop methods to construct the graph and display its adjacency 
matrix and adjacency list.  */

import java.util.*;

class Graph {
    private int vertices;
    private int[][] adjMatrix;
    private List<List<Integer>> adjList;

    // Constructor to initialize graph with n vertices
    public Graph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices]; // Initializing adjacency matrix
        adjList = new ArrayList<>(); // Initializing adjacency list

        // Initialize adjacency list with empty lists
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Method to add an edge
    public void addEdge(int u, int v) {
        // Add edge to adjacency matrix
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // Since it's an undirected graph

        // Add edge to adjacency list
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // Method to display adjacency matrix
    public void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to display adjacency list
    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        int vertices = 5; // Number of vertices in the graph
        Graph graph = new Graph(vertices);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display adjacency matrix and list
        graph.displayAdjMatrix();
        graph.displayAdjList();
    }
}
