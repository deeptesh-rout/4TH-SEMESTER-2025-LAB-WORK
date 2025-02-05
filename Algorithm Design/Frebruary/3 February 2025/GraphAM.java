
import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;

public class GraphAM {

	int count;
	int[][] adj;

	GraphAM(int cnt) {
		count = cnt;
		adj = new int[count][count];
	}

	public void addDirectedEdge(int src, int dst, int cost) {
		adj[src][dst] = cost;
	}

	public void addDirectedEdge(int src, int dst) {
		addDirectedEdge(src, dst, 1);
	}

	public void addUndirectedEdge(int src, int dst, int cost) {
		addDirectedEdge(src, dst, cost);
		addDirectedEdge(dst, src, cost);
	}

	public void addUndirectedEdge(int src, int dst) {
		addDirectedEdge(src, dst, 1);
		addDirectedEdge(dst, src, 1);
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.print("Vertex " + i + " is connected to : ");
			for (int j = 0; j < count; j++) {
				if (adj[i][j] != 0)
					System.out.print(j + "(cost: " + adj[i][j] + ") ");
			}
			System.out.println();
		}
	}

	/// Single source shortest path using Dijkstra Algorithm

	private static class Edge implements Comparable<Edge> {
		@SuppressWarnings("unused")
		int src, dest, cost;

		public Edge(int s, int d, int c) {
			src = s;
			dest = d;
			cost = c;
		}

		public int compareTo(Edge compareEdge) {
			return this.cost - compareEdge.cost;
		}
	}

	public void dijkstra(int source) {
		int[] previous = new int[count];
		int[] dist = new int[count];
		boolean[] visited = new boolean[count];

		Arrays.fill(previous, -1);
		Arrays.fill(dist, Integer.MAX_VALUE); // infinite

		dist[source] = 0;
		previous[source] = source;

		PriorityQueue<Edge> queue = new PriorityQueue<Edge>(100);
		Edge node = new Edge(source, source, 0);
		queue.add(node);

		while (queue.isEmpty() != true) {
			node = queue.peek();
			queue.remove();
			int src = node.dest;
			visited[src] = true;
			for (int dest = 0; dest < count; dest++) {
				int cost = adj[src][dest];
				if (cost != 0) {
					int alt = cost + dist[src];
					if (dist[dest] > alt && visited[dest] == false) {

						dist[dest] = alt;
						previous[dest] = src;
						node = new Edge(src, dest, alt);
						queue.add(node);
					}
				}
			}
		}
		printPath(previous, dist, count, source);
	}

	String printPathUtil(int[] previous, int source, int dest) {
		String path = "";
		if (dest == source)
			path += source;
		else {
			path += printPathUtil(previous, source, previous[dest]);
			path += ("->" + dest);
		}
		return path;
	}

	public void printPath(int[] previous, int[] dist, int count, int source) {
		String output = "Shortest Paths: ";
		for (int i = 0; i < count; i++) {
			if (dist[i] == 99999)
				output += ("(" + source + "->" + i + " @ Unreachable) ");
			else if (i != previous[i]) {
				output += "(";
				output += printPathUtil(previous, source, i);
				output += (" @ " + dist[i] + ") ");
			}
		}
		System.out.println(output);
	}

	// Minimum Spanning tree using prim's Algorithm

	public void primsMST() {
		int[] previous = new int[count];
		int[] dist = new int[count];

		boolean[] visited = new boolean[count];
		Arrays.fill(previous, -1);
		Arrays.fill(dist, Integer.MAX_VALUE); // infinite

		int source = 0;
		dist[source] = 0;
		previous[source] = source;

		PriorityQueue<Edge> queue = new PriorityQueue<Edge>(100);
		Edge node = new Edge(source, source, 0);
		queue.add(node);

		while (queue.isEmpty() != true) {
			node = queue.peek();
			queue.remove();
			source = node.dest;
			visited[source] = true;
			for (int dest = 0; dest < count; dest++) {
				int cost = adj[source][dest];
				if (cost != 0) {
					if (dist[dest] > cost && visited[dest] == false) {
						dist[dest] = cost;
						previous[dest] = source;
						node = new Edge(source, dest, cost);
						queue.add(node);
					}
				}
			}
		}

		// printing result.
		int sum = 0;
		boolean isMst = true;
		String output = "Edges are ";
		for (int i = 0; i < count; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				output += ("(" + i + ", Unreachable) ");
				isMst = false;
			} else if (previous[i] != i) {
				output += ("(" + previous[i] + "->" + i + " @ " + dist[i] + ") ");
				sum += dist[i];
			}
		}

		if (isMst) {
			System.out.println(output);
			System.out.println("Total MST cost: " + sum);
		} else
			System.out.println("Can't get a Spanning Tree");

	}

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner x1 = new Scanner(System.in);

		GraphAM gph = new GraphAM(5);
		// Demo l=new Demo();

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("\n********* MENU *********");
			System.out.println("\n1. Construct a undirected unweighted graph G.");
			System.out.println("\n2. Construct a undirected weighted graph G.");
			System.out.println("\n3. Construct a directed unweighted graph G  .");
			System.out.println("\n4. Construct a directed weighted graph G ");
			System.out.println("\n5. Single source shortest path using Dijkstra Algorithm");
			System.out.println("\n5. Minimum Spanning tree using prims Algorithm");

			System.out.println("\n9.EXIT");
			System.out.println("\nenter ur choice : ");
			int n = in.nextInt();
			switch (n) {
				case 1:
					System.out.println("\n .ADD the undirected edge of the graph G ");
					// System.out.println("\n Put the value of X : ");
					// int x=in.nextInt();
					gph.addUndirectedEdge(0, 1);
					gph.addUndirectedEdge(0, 2);
					gph.addUndirectedEdge(1, 2);
					gph.addUndirectedEdge(2, 3);
					gph.print();

					break;

				case 2:
					System.out.println("\n Construct a undirected weighted graph G.. ");

					break;

				case 3:
					System.out.println("\n Construct a directed unweighted graph G. ");

					break;

				case 4:
					System.out.println("\n Construct a directed weighted graph G ");

					break;
				case 5:
					System.out.println("\n5.Single source shortest path using Dijkstra Algorithm ");

					break;
				case 6:
					System.out.println("\n5.Minimum Spanning tree using prims Algorithm ");

					break;

				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("\n Wrong Choice!");
					break;
			}
			System.out.println("\n do u want to cont then press 1... ");
		} while (in.nextInt() == 1);

	}

}
