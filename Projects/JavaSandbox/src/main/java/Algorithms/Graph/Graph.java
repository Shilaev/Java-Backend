package Algorithms.Graph;

import java.util.*;

public class Graph {
    private final Hashtable<Node, LinkedList<Node>> graph;
    private final Node head;

    public Graph(Node head) {
        graph = new Hashtable<>(100);
        this.head = head;
    }

    public void addEdge(Node src, Node dest) {
        graph.computeIfAbsent(src, k -> new LinkedList<>());
        graph.computeIfAbsent(dest, k -> new LinkedList<>());

        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    public String getNodesFor(Node node) {
        List<Node> connections = graph.get(node);
        List<String> resultSet = new LinkedList<>();

        connections.forEach(k -> resultSet.add(k.getLabel()));

        return resultSet.toString();
    }

    public String bfs(Node searchNode) {
        Queue<Node> searchQueue = new PriorityQueue<>(graph.get(head));
        LinkedList<Node> visited = new LinkedList(List.of(head));

        Hashtable<Node, LinkedList<Node>> savedPrevNodes = new Hashtable<>();

        while (!searchQueue.isEmpty()) {
            Node currentNode = searchQueue.poll();
            if (visited.contains(currentNode)) continue;

            visited.add(currentNode);
            searchQueue.addAll(graph.get(currentNode));
            savedPrevNodes.put(currentNode, graph.get(currentNode));

            if (currentNode.equals(searchNode)) {
                List<Node> path = new LinkedList<>();
                Node tmp = currentNode;
                tmp = savedPrevNodes.get(tmp).poll();
                while (savedPrevNodes.get(tmp) != null) {
                    path.add(tmp);
                    tmp = savedPrevNodes.get(tmp).poll();
                }
                path.add(head);
                Collections.reverse(path);
                path.add(searchNode);
                return "shortest path: " + path + '\n' +
                        (path.size() - 1);
            }
        }
        return null;
    }
}
