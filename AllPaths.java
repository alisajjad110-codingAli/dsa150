import java.util.*;

public class AllPaths {
    static class Edge {
        int src;
        int dest;

            public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void allPaths(ArrayList<Edge> graph[], int src, int tar, boolean vis[], String path) {
        if (src == tar) {
            System.out.println(path);
            return;
        }
        
        for (int i = 0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest]) {
                vis[e.dest] = true;
                allPaths(graph, e.dest, tar, vis, path + "->" + e.dest);
                vis[e.dest] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int tar = 5;
        boolean vis[] = new boolean[V];
        vis[src] = true;
        allPaths(graph, src, tar, vis, src + "");
    }
}
