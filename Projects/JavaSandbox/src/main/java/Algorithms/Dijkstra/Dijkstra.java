package Algorithms.Dijkstra;

import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {

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

        WeightedDirectedGraph wdGraph = new WeightedDirectedGraph(10, a);
        wdGraph.addEdge(ab);
        wdGraph.addEdge(ac);
        wdGraph.addEdge(bx);
        wdGraph.addEdge(bc);
        wdGraph.addEdge(cd);
        wdGraph.addEdge(dx);
        wdGraph.dijkstra();
    }
}
