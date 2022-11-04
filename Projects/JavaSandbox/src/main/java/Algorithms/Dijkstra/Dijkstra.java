package Algorithms.Dijkstra;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class Dijkstra {

    public static void main(String[] args) {
        WeightedDirectedGraph wdGraph = new WeightedDirectedGraph();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node x = new Node("x");

        Edge ab = new Edge(a, b, 10);
        Edge ac = new Edge(a, c, 2);
        Edge bx = new Edge(b, x, 2);
        Edge bc = new Edge(b, c, 2);
        Edge cd = new Edge(c, d, 2);
        Edge dx = new Edge(d, x, 2);

        wdGraph.addEdge(ab);
        wdGraph.addEdge(ac);
        wdGraph.addEdge(bx);
        wdGraph.addEdge(bc);
        wdGraph.addEdge(cd);
        wdGraph.addEdge(dx);

    }

    /**
     * Return shortest path
     */
    private static List<Node> dijkstra(WeightedDirectedGraph graph) {



        // TODO: 04.11.2022 Return shortest path
        return null;
    }

}
