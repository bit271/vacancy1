package com.bit.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class
 *
 * @since 30.12.2024
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Test count: ");
        int testsCount = Integer.parseInt(sc.nextLine()); // count of tests

        for (int test = 0; test < testsCount; test++) {
            if (test > 0) sc.nextLine(); // empty line between tests

            System.out.print("City count: ");
            int cityCount = Integer.parseInt(sc.nextLine()); // city count
            Map<String, Integer> cityToIndex = new HashMap<>(); // city indexing
            Graph graph = new Graph(cityCount);

            for (int i = 1; i <= cityCount; i++) {
                System.out.print("City name: ");
                String cityName = sc.nextLine();
                cityToIndex.put(cityName, i);

                System.out.print("Neighbors count: ");
                int p = Integer.parseInt(sc.nextLine()); // neighbors count
                for (int j = 0; j < p; j++) {
                    // adding edges with values for a vertex
                    String[] edgeData = sc.nextLine().split(" ");
                    int nr = Integer.parseInt(edgeData[0]);
                    int cost = Integer.parseInt(edgeData[1]);
                    // i - index, nr - neighbor vertex name, cost - edge weight
                    graph.addEdge(i, nr, cost);
                }
            }

            System.out.print("Paths count: ");
            int r = Integer.parseInt(sc.nextLine()); // Paths count
            for (int i = 0; i < r; i++) {
                System.out.print("Two cities: ");
                String[] query = sc.nextLine().split(" ");

                int start = cityToIndex.get(query[0]);  // from the vertex
                int end = cityToIndex.get(query[1]);    // to the vertex

                int[] dist = Dijkstra.findShortestPaths(graph, start);
                System.out.println(dist[end]);
            }
        }

        sc.close();
    }
}