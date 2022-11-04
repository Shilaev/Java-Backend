package Algorithms.Dijkstra;

import java.util.Objects;

public class Node {
    String label;
    Node prev;

    public Node(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return label.equals(node.label) && Objects.equals(prev, node.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, prev);
    }

    @Override
    public String toString() {
        return "label: " + getLabel() + '\n' +
                "parent: " + getPrev().label;
    }
}
