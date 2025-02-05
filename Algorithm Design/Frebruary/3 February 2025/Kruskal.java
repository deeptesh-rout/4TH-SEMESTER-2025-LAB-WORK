import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class DisjointSet {
    int[] parent, rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]); // Path compression
        }
        return parent[node];
    }

    public void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        if (rootU != rootV) {
            if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }
}

class KruskalMST {
    int vertices;
    List<Edge> edges;

    public KruskalMST(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    public void findMST() {
        Collections.sort(edges);
        DisjointSet ds = new DisjointSet(vertices);
        List<Edge> mst = new ArrayList<>();

        for (Edge edge : edges) {
            if (ds.find(edge.src) != ds.find(edge.dest)) {
                mst.add(edge);
                ds.union(edge.src, edge.dest);
            }
            if (mst.size() == vertices - 1) break;
        }

        System.out.println("Minimum Spanning Tree (MST) using Kruskal's Algorithm:");
        int totalWeight = 0;
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
            totalWeight += edge.weight;
        }
        System.out.println("Total Weight of MST: " + totalWeight);
    }

    public static void main(String[] args) {
        KruskalMST graph = new KruskalMST(6);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 3, 8);
        graph.addEdge(2, 4, 5);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 10);
        graph.addEdge(4, 5, 7);

        graph.findMST();
    }
}
