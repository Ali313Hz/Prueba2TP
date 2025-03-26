package utils;


import java.util.*;

public class Graph {
    private Map<String, Map<String, Integer>> adjList = new HashMap<>();

    public void addPort(String port) {
        adjList.putIfAbsent(port, new HashMap<>());
    }

    public void addConnection(String port1, String port2, int distance) {
        adjList.get(port1).put(port2, distance);
        adjList.get(port2).put(port1, distance);
    }

    public void depthFirstSearch(String start, Set<String> visited) {
        if (visited.contains(start)) return;
        System.out.println(start);
        visited.add(start);
        for (String neighbor : adjList.get(start).keySet()) {
            depthFirstSearch(neighbor, visited);
        }
    }

    public String findMostConnectedPort() {
        return adjList.entrySet().stream()
                .max(Comparator.comparingInt(entry -> entry.getValue().size()))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public void removePort(String port) {
        adjList.remove(port);
        adjList.values().forEach(edges -> edges.remove(port));
    }
}
