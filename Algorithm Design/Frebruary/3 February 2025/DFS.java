import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private int[][] adjMatrix; // Adjacency matrix representation
    private List<List<Integer>> adjList; // Adjacency list representation

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge to adjacency matrix
    public void addEdgeMatrix(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // Assuming undirected graph
    }

    // Add edge to adjacency list
    public void addEdgeList(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // Assuming undirected graph
    }

    // DFS using adjacency matrix
    public void dfsMatrix(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS using Adjacency Matrix:");
        dfsMatrixHelper(startVertex, visited);
        System.out.println();
    }

    private void dfsMatrixHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        
        for (int i = 0; i < vertices; i++) {
            if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                dfsMatrixHelper(i, visited);
            }
        }
    }

    // DFS using adjacency list
    public void dfsList(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS using Adjacency List:");
        dfsListHelper(startVertex, visited);
        System.out.println();
    }

    private void dfsListHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsListHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        
        // Adding edges
        graph.addEdgeMatrix(0, 1);
        graph.addEdgeMatrix(0, 2);
        graph.addEdgeMatrix(1, 3);
        graph.addEdgeMatrix(1, 4);
        graph.addEdgeMatrix(2, 4);
        
        graph.addEdgeList(0, 1);
        graph.addEdgeList(0, 2);
        graph.addEdgeList(1, 3);
        graph.addEdgeList(1, 4);
        graph.addEdgeList(2, 4);
        
        // Perform DFS traversal
        graph.dfsMatrix(0);
        graph.dfsList(0);
    }
}