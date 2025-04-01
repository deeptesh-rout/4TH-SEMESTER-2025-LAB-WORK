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

    // Method to add an edge (undirected graph)
    public void addEdge(int v, int w) {
        adjacencyList[v].add(w);
        adjacencyList[w].add(v);
    }

    // BFS Traversal
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // To track visited nodes
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS Utility Function
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjacencyList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS Traversal
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal: ");
        DFSUtil(startVertex, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        while (true) {
            System.out.println("\nGraph Traversal Menu:");
            System.out.println("1) Add Edge");
            System.out.println("2) BFS Traversal");
            System.out.println("3) DFS Traversal");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first vertex: ");
                    int v1 = scanner.nextInt();
                    System.out.print("Enter second vertex: ");
                    int v2 = scanner.nextInt();
                    graph.addEdge(v1, v2);
                    System.out.println("Edge added between " + v1 + " and " + v2);
                    break;

                case 2:
                    System.out.print("Enter starting vertex for BFS: ");
                    int bfsStart = scanner.nextInt();
                    graph.BFS(bfsStart);
                    break;

                case 3:
                    System.out.print("Enter starting vertex for DFS: ");
                    int dfsStart = scanner.nextInt();
                    graph.DFS(dfsStart);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

/*import java.util.*;

class Graph {
    private List<Integer>[] adj;

    @SuppressWarnings("unchecked")
    Graph(int v) {
        adj = new LinkedList[v];
        Arrays.setAll(adj, i -> new LinkedList<>());
    }

    void addEdge(int v, int w) {
        if (v >= 0 && v < adj.length && w >= 0 && w < adj.length) {
            adj[v].add(w);
            adj[w].add(v);
        } else {
            System.out.println("Invalid edge! Vertices should be between 0 and " + (adj.length - 1));
        }
    }

    void BFS(int s) {
        if (s < 0 || s >= adj.length) {
            System.out.println("Invalid start vertex for BFS!");
            return;
        }

        boolean[] vis = new boolean[adj.length];
        Queue<Integer> q = new LinkedList<>();
        vis[s] = true;
        q.add(s);

        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int n : adj[v]) {
                if (!vis[n]) { 
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
        System.out.println();
    }

    void DFS(int s) {
        if (s < 0 || s >= adj.length) {
            System.out.println("Invalid start vertex for DFS!");
            return;
        }

        boolean[] vis = new boolean[adj.length];
        System.out.print("DFS: ");
        DFSUtil(s, vis);
        System.out.println();
    }

    private void DFSUtil(int v, boolean[] vis) {
        vis[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]) {
            if (!vis[n]) {
                DFSUtil(n, vis);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        Graph g = new Graph(vertices);

        while (true) {
            System.out.println("\n1) Add Edge  2) BFS  3) DFS  4) Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter two vertices: ");
                    int v = sc.nextInt(), w = sc.nextInt();
                    g.addEdge(v, w);
                }
                case 2 -> {
                    System.out.print("Start vertex for BFS: ");
                    g.BFS(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Start vertex for DFS: ");
                    g.DFS(sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
 */