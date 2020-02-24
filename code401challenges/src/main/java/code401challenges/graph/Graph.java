package code401challenges.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

}
