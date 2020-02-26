package code401challenges.graph;

public class Edge<T> {
    public T origin;
    public T destination;
    public int weight;

    public Edge(T origin, T destination, int weight) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
    }
}
