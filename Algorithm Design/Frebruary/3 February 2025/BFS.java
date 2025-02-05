import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;
    private int[][] adjacencyMatrix;

    // Constructor
    @SuppressWarnings("unchecked")
    public Graph(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        adjacencyMatrix = new int[v][v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add edge for adjacency list representation
    public void addEdgeList(int src, int dest) {
        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src); // Assuming an undirected graph
    }

    // Add edge for adjacency matrix representation
    public void addEdgeMatrix(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1; // Assuming an undirected graph
    }

    // BFS using adjacency list
    public void bfsUsingList(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);
        
        System.out.println("BFS using Adjacency List:");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbor : adjacencyList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // BFS using adjacency matrix
    public void bfsUsingMatrix(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);
        
        System.out.println("BFS using Adjacency Matrix:");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        
        // Adding edges for both representations
        g.addEdgeList(0, 1);
        g.addEdgeList(0, 2);
        g.addEdgeList(1, 3);
        g.addEdgeList(1, 4);
        g.addEdgeList(2, 4);
        g.addEdgeList(3, 5);
        g.addEdgeList(4, 5);
        
        g.addEdgeMatrix(0, 1);
        g.addEdgeMatrix(0, 2);
        g.addEdgeMatrix(1, 3);
        g.addEdgeMatrix(1, 4);
        g.addEdgeMatrix(2, 4);
        g.addEdgeMatrix(3, 5);
        g.addEdgeMatrix(4, 5);
        
        // Performing BFS traversal from vertex 0
        g.bfsUsingList(0);
        g.bfsUsingMatrix(0);
    }
}
/* */