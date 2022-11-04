package Algorithms.Dijkstra;

import java.util.Objects;

public class Edge {
    Node start;
    Node end;
    int weight;

    public Edge(Node start, Node end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return weight == edge.weight && start.equals(edge.start) && end.equals(edge.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, weight);
    }

    @Override
    public String toString() {
        return "start=" + start +
                ", end=" + end +
                ", weight=" + weight;
    }
}