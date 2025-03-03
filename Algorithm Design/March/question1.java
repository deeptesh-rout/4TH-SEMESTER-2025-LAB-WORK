import java.util.*;

class Graph {
    int V;
    List<Edge>[] adj;

    @SuppressWarnings("unchecked")
    Graph(int V) {
        this.V = V;
        adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v, int weight) {
        adj[u].add(new Edge(u, v, weight));
        adj[v].add(new Edge(v, u, weight));
    }

    class Edge {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    public void primMST() {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        boolean[] inMST = new boolean[V + 1];
        int[] key = new int[V + 1];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[1] = 0;
        pq.add(new Edge(-1, 1, 0));
        int mstWeight = 0;
        System.out.println("Edges in MST:");

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.v;

            if (inMST[u]) {
                continue;
            }
            inMST[u] = true;

            if (edge.u != -1) {
                System.out.println(edge.u + " - " + edge.v + " weight: " + edge.weight);
                mstWeight += edge.weight;
            }

            for (Edge e : adj[u]) {
                if (!inMST[e.v] && e.weight < key[e.v]) {
                    key[e.v] = e.weight;
                    pq.add(new Edge(u, e.v, e.weight));
                }
            }
        }

        System.out.println("Total weight of MST: " + mstWeight);
    }
}

public class question1 {
    public static void main(String[] args) {

        

    }
}
