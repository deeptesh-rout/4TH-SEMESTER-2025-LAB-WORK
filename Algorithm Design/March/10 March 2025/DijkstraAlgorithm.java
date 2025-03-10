import java.util.Arrays;

public class DijkstraAlgorithm {

    private static int findMinDistanceVertex(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;
        for (int v = 0; v < distances.length; v++) {
            if (!visited[v] && distances[v] < minDistance) {
                minDistance = distances[v];
                minVertex = v;
            }
        }
        return minVertex;
    }


    private static void printShortestDistances(int[] distances, int source) {
        System.out.println("Shortest distances from source vertex " + source + " to all other vertices:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Vertex " + i + ": " + distances[i]);
        }
    }

    // Function to apply Dijkstra's algorithm to find shortest paths
    public static void dijkstra(int[][] graph, int source) {
        int numVertices = graph.length;
        int[] distances = new int[numVertices]; // Array to store shortest distances from source
        boolean[] visited = new boolean[numVertices]; // Array to track visited vertices

        // Initialize distances array with infinity and source distance as 0
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        // Iterate over all vertices
        for (int i = 0; i < numVertices - 1; i++) {
            // Find the vertex with the minimum distance from the source
            int minVertex = findMinDistanceVertex(distances, visited);
            visited[minVertex] = true; // Mark the vertex as visited

            // Update distances of adjacent vertices of the selected vertex
            for (int v = 0; v < numVertices; v++) {
                if (!visited[v] && graph[minVertex][v] != 0 && distances[minVertex] != Integer.MAX_VALUE &&
                        distances[minVertex] + graph[minVertex][v] < distances[v]) {
                    distances[v] = distances[minVertex] + graph[minVertex][v];
                }
            }
        }

        // Print the shortest distances from source vertex to all other vertices
        printShortestDistances(distances, source);
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        dijkstra(graph, 0);
    }
}
