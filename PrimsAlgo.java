import java.util.*;

public class PrimsAlgo {
    public static class Edge {
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

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override 
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // cost, node
        }
    }
}
