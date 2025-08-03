package Ques_81_to_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Dijkstra's Algorithm (Simplified)

public class ques85 {
    static class Edge {
        int target;
        int weight;
        
        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }
    
    public static void shortestPath(List<List<Edge>> graph, int source) {
        int[] dist = new int[graph.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> dist[i]));
        pq.add(source);
        
        while (!pq.isEmpty()) {
            int u = pq.poll();
            for (Edge e : graph.get(u)) {
                if (dist[e.target] > dist[u] + e.weight) {
                    dist[e.target] = dist[u] + e.weight;
                    pq.add(e.target);
                }
            }
        }
        
        System.out.println("Shortest distances from node " + source + ": " + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        graph.add(Arrays.asList(new Edge(1, 4), new Edge(2, 1))); // Node 0
        graph.add(Arrays.asList(new Edge(3, 1)));                  // Node 1
        graph.add(Arrays.asList(new Edge(1, 2), new Edge(3, 5)));  // Node 2
        graph.add(Collections.emptyList());                        // Node 3
        
        shortestPath(graph, 0);
    }
}
