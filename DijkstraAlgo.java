import java.util.*;

public class DijkstraAlgo {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override 
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path, node
        }
    }
    
    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
    }
}
