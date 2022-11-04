package Algorithms.Dijkstra;

import java.util.Hashtable;
import java.util.LinkedList;

public class WeightedDirectedGraph {
    private Hashtable<Node, LinkedList<Node>> graph;
    private Hashtable<Edge, Integer> edges;

    public WeightedDirectedGraph(int capacity) {
        this.graph = new Hashtable<>(capacity);
        this.edges = new Hashtable<>(capacity);
    }

    public void addEdge(Edge edge) {
        Node n1 = edge.getFirst();
        Node n2 = edge.getSecond();
        graph.computeIfAbsent(n2, value -> new LinkedList<>());
        graph.computeIfAbsent(n1, value -> new LinkedList<>()).add(n2);
    }

    public Hashtable<Node, LinkedList<Node>> getGraph() {
        return graph;
    }

    public Hashtable<Edge, Integer> getEdges() {
        return edges;
    }
}
