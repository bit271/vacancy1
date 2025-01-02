package com.bit.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph class represents a directed graph using an adjacency list.
 * Each node in the graph has a list of edges that point to its neighbors.
 *
 * @since 2.01.2025
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class Graph {

    /**
     * Adjacency list representing the graph.
     * Each index corresponds to a node, and the list at each index contains edges to its neighbors.
     */
    private final List<Edge>[] adjList;

    /**
     * Constructs a graph with the specified number of nodes.
     * The nodes are represented as indices from 1 to size (inclusive).
     *
     * @param size the number of nodes in the graph
     */
    @SuppressWarnings("unchecked")
    public Graph(int size) {
        adjList = new ArrayList[size + 1];
        for (int i = 1; i <= size; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    /**
     * Adds a directed edge from one node to another with a specified cost.
     *
     * @param from the starting node of the edge
     * @param to   the target node of the edge
     * @param cost the cost or weight of the edge
     */
    public void addEdge(int from, int to, int cost) {
        adjList[from].add(new Edge(to, cost));
    }

    /**
     * Returns a list of all neighbors (edges) of the specified node.
     *
     * @param node the node whose neighbors are to be retrieved
     * @return a list of edges representing the neighbors of the node
     */
    public List<Edge> getNeighbors(int node) {
        return adjList[node];
    }

    /**
     * Returns the total number of nodes in the graph.
     *
     * @return the number of nodes in the graph
     */
    public int size() {
        return adjList.length - 1;
    }
}
