package Algorithms.Dijkstra;

public class Edge {
    Node first;
    Node second;
    int weight;

    public Edge(Node start, Node end, int weight) {
        this.first = start;
        this.second = end;
        this.weight = weight;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getSecond() {
        return second;
    }

    public void setSecond(Node second) {
        this.second = second;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}