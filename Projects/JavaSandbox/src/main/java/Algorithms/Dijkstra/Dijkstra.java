package Algorithms.Dijkstra;

import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {
        WeightedDirectedGraph wdGraph = new WeightedDirectedGraph(10);

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node x = new Node("x");

        Edge ab = new Edge(a, b, 10);
        Edge ac = new Edge(a, c, 1);
        Edge bx = new Edge(b, x, 5);
        Edge bc = new Edge(b, c, 23);
        Edge cd = new Edge(c, d, 14);
        Edge dx = new Edge(d, x, 12);

        wdGraph.addEdge(ab);
        wdGraph.addEdge(ac);
        wdGraph.addEdge(bx);
        wdGraph.addEdge(bc);
        wdGraph.addEdge(cd);
        wdGraph.addEdge(dx);

        dijkstra(wdGraph);

    }

    private static List<Node> dijkstra(WeightedDirectedGraph wdGraph) {
        // graph
        Hashtable<Node, LinkedList<Node>> graph = wdGraph.getGraph();
        // weights
        Hashtable<Node, Integer> weights = new Hashtable<>(graph.size());
        Iterator<Node> graphNodesIterator = graph.keys().asIterator();
        while (graphNodesIterator.hasNext()) {
            Node next = graphNodesIterator.next();
            weights.put(next, 0);
        }
        // parents
        Hashtable<Node, Node> parents = new Hashtable<>();
        // short path
        List<Node> shortestPath = new LinkedList<>();
        // visited nodes
        List<Node> isVisited = new ArrayList<>(graph.size());

        return shortestPath;
    }


}
