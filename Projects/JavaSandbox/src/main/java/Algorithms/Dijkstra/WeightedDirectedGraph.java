package Algorithms.Dijkstra;

import java.util.Hashtable;
import java.util.LinkedList;

public class WeightedDirectedGraph {
    private Hashtable<Node, LinkedList<Node>> graph = new Hashtable<>(50);
    private Hashtable<Edge, Integer> weights = new Hashtable<>(50);
    private Hashtable<Node, Node> parents = new Hashtable<>(50);

    public Hashtable<Node, LinkedList<Node>> getGraph() {
        return graph;
    }

    public Hashtable<Edge, Integer> getWeights() {
        return weights;
    }

    public void addNode(Node n) {
        graph.computeIfAbsent(n, v -> new LinkedList<>());
    }

    public void addEdge(Edge edge) {
        graph.computeIfAbsent(edge.end, v -> new LinkedList<>());
        graph.computeIfAbsent(edge.start, v -> new LinkedList<>()).add(edge.end);
        weights.put(edge, edge.weight);

        edge.end.setPrev(edge.start);
        parents.put(edge.end, edge.end.getPrev());
    }
}
