package Algorithms.Dijkstra;

import java.util.*;

public class WeightedDirectedGraph {
    private Hashtable<Node, LinkedList<Node>> graph;
    private Hashtable<Edge, Integer> edges;
    private Node rootNode;

    public WeightedDirectedGraph(int capacity, Node rootNode) {
        this.graph = new Hashtable<>(capacity);
        this.edges = new Hashtable<>(capacity);
        this.rootNode = rootNode;
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

    public List<Node> dijkstra() {
        // weights
        Hashtable<Node, Integer> weights = new Hashtable<>(graph.size());
        Iterator<Node> graphNodesIterator = graph.keys().asIterator();
        while (graphNodesIterator.hasNext()) {
            Node next = graphNodesIterator.next();
            weights.put(next, Integer.MAX_VALUE);
        }
        // parents
        Hashtable<Node, Node> parents = new Hashtable<>(graph.size());
        // short path
        List<Node> shortestPath = new LinkedList<>();
        // visited nodes
        List<Node> isVisited = new ArrayList<>(graph.size());
        // unvisited nodes
        List<Node> isUnvisited = new ArrayList<>(graph.size());
        isUnvisited.add(rootNode);

        while (!isUnvisited.isEmpty()){

        }

        System.out.println(graph);
        System.out.println(weights);
        System.out.println(parents);
        System.out.println(shortestPath);
        System.out.println(isVisited);
        System.out.println(isUnvisited);

        return shortestPath;
    }
}
