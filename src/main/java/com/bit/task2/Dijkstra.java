package com.bit.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Dijkstra class that implements the Dijkstra algorithm
 *
 * @since 2.01.2025
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class Dijkstra {

    /**
     * Method for finding the shortest paths from a vertex in a given graph
     *
     * @param graph custom class that represents a List<Edge> values
     *              in which the Graph is stored
     * @param start vertex from which the shortest routes should be constructed
     * @return {@code dist} array with distances from a given vertex, where
     *              a[0] - index,
     *              a[1] - a value
     */
    public static int[] findShortestPaths(Graph graph, int start) {

        // dist[] stores the minimal cost of the path from vertex [start] to vertex [i]
        int[] dist = new int[graph.size() + 1];
        // All distances are initialized with Integer.MAX_VALUE to symbolize infinity (until a path is found).
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0; // start vertex

        // Priority sorting by the first value of the array (a[0])
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, start}); // {current cost, vertex}

        /*
        The vertex with the minimum distance from the queue is retrieved.
        If the distance to this node in the dist array is already less, the current node is skipped.
         */
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentDist = current[0];
            int node = current[1];

            if (currentDist > dist[node]) continue;

            /*
            For each vertex, its neighboring vertices are processed (retrieved from the adjacency list).
            If a new path with lower cost is found (newDist < dist[edge.to]), the dist array is updated
            and the neighboring vertex is added to the queue.
             */
            for (Edge edge : graph.getNeighbors(node)) {
                int newDist = currentDist + edge.cost;
                if (newDist < dist[edge.to]) {
                    dist[edge.to] = newDist;
                    pq.add(new int[]{newDist, edge.to});
                }
            }
        }
        // array of minimal distances from the start vertex to all other vertices.
        return dist;
    }
}
