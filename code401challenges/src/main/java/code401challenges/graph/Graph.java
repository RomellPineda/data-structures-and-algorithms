package code401challenges.graph;

import java.util.*;

// https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T reference) {
        map.put(reference, new LinkedList<>());
    }

    public void addEdge(T start, T end, boolean twoWay) {
        if (!map.containsKey(start)) {
            addVertex(start);
        }
        if (!map.containsKey(end)) {
            addVertex(end);
        }
        map.get(start).add(end);
        if (twoWay) {
            map.get(end).add(start);
        }
    }

    public int size() {
        return map.keySet().size();
    }

    public String getVertices() {
        return String.valueOf(this.map);
    }

//    public String getAdjacent(T vertex) {
//        return String.valueOf(this.map.get(vertex));
//    }
    public List<T> getAdjacent(T vertex) {
        return this.map.get(vertex);
    }


    // https://www.youtube.com/watch?v=3L4YrGaR8E4
    public List<T> breadthFirstTraversal(T vertex) {
        List<T> yield = new ArrayList<>();
        HashSet<T> visited = new HashSet<>();
        LinkedList<T> queue = new LinkedList<>();
        queue.add(vertex);
        visited.add(vertex);
        while (!queue.isEmpty()) {
            T current = queue.removeFirst();
            yield.add(current);
            for (T adjacent : this.getAdjacent(current)) {
                if (!visited.contains(adjacent)) {
                    visited.add(adjacent);
                    queue.addLast(adjacent);
                }

            }
        }
        return yield;
    }

    public List<T> depthFirstTraversal(T vertex) {
        List<T> yield = new ArrayList<>();
        HashSet<T> visited = new HashSet<>();
        LinkedList<T> stack = new LinkedList<>();
        stack.add(vertex);
        visited.add(vertex);
        while (!stack.isEmpty()) {
            T current = stack.removeFirst();
            yield.add(current);
            for (T adjacent : this.getAdjacent(current)) {
                if (!visited.contains(adjacent)) {
                    visited.add(adjacent);
                    stack.addFirst(adjacent);
                }

            }
        }
        return yield;
    }
}
