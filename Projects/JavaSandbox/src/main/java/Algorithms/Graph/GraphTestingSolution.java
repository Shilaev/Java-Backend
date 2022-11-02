package Algorithms.Graph;

public class GraphTestingSolution {
    public static void main(String[] args) {

//        Node bob = new Node("bob");
//        Node alice = new Node("alice");
//        Node mark = new Node("mark");
//        Node kate = new Node("kate");
//        Node olga = new Node("olga");
//        Node vasua = new Node("vasua");
//        Node joshn = new Node("joshn");
//        Node nana = new Node("nana");
//        Node kolya = new Node("kolya");
//        Node pasha = new Node("pasha");
//        Node tanya = new Node("tanya");
//
//        Graph graph = new Graph(bob);
//
//        graph.addEdge(bob, alice);
//        graph.addEdge(bob, mark);
//        graph.addEdge(mark, kate);
//        graph.addEdge(kate, olga);
//        graph.addEdge(kate, vasua);
//        graph.addEdge(alice, joshn);
//        graph.addEdge(vasua, nana);
//        graph.addEdge(nana, kolya);
//        graph.addEdge(nana, tanya);
//        graph.addEdge(kolya, pasha);
//        graph.addEdge(olga, vasua);

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node x = new Node("x");
        Node n = new Node("n");

        Graph graph = new Graph(a);

        graph.addEdge(a, b);
        graph.addEdge(a, x);
        graph.addEdge(b, x);
        graph.addEdge(b, d);
        graph.addEdge(x, n);
        graph.addEdge(x, d);
        graph.addEdge(n, d);


        System.out.println(graph.bfs(d));
    }
}
