package com.bit.task2;

/**
 * Edge class that stores edges of graph vertices.
 *
 * @since 2.01.2025
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class Edge {
    int to;     // target vertex to which this edge points
    int cost;   // cost or weight of the edge

    /**
     * Constructs an Edge with a target vertex and its cost.
     *
     * @param to   the index of the target vertex
     * @param cost the cost or weight of traveling to the target vertex
     */
    public Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}
