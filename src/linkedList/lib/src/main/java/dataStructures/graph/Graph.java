package dataStructures.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>> {
    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
    private int numberOfVertices = 0;

    public Graph(int maxNumberOfVertices) {
        adjacencyLists = new HashMap<>(maxNumberOfVertices);
    }

    public Vertex<T> addVertex(T value)
    {
        Vertex<T> vertex = new Vertex<>(value);
        adjacencyLists.put(vertex, new LinkedList<>());
        numberOfVertices++;
        return vertex;
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination) {
        addEdge(start, destination, 0);
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) {
        if (!adjacencyLists.containsKey(start)  || !adjacencyLists.containsKey(destination)){
            throw new IllegalArgumentException("TO ADD EDGE BETWEEN TWO VERTEX , THE BOTH SHOULD BE EXIST  ");
        }
        Edge<T> edge = new Edge<>(destination, weight);
        adjacencyLists.get(start).add(edge);

    }

    public LinkedList<Vertex<T>> getVertices()
    {
       return new LinkedList<>(adjacencyLists.keySet());
    }

    public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) {
       if (!adjacencyLists.containsKey(vertex)){
           throw new IllegalArgumentException("THIS VERTEX IS NOT FOUND");
       }
       return new LinkedList<>(adjacencyLists.get(vertex));
    }

    public LinkedList<Vertex<T>> breadthFirst(Vertex<T> start) {
        LinkedList<Vertex<T>> visitedVertices = new LinkedList<>();
        Queue<Vertex<T>> queue = new LinkedList<>();

        queue.add(start);
        visitedVertices.add(start);

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.poll();
            for (Edge<T> edge : adjacencyLists.get(current)) {
                Vertex<T> neighbor = edge.destination;
                if (!visitedVertices.contains(neighbor)) {
                    visitedVertices.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return visitedVertices;
    }

    public int size() {
        return numberOfVertices;
    }

    @Override
    public int compareTo(Graph<T> o) {
        throw new UnsupportedOperationException("Graph does not implement compareTo()");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (HashMap.Entry<Vertex<T>, LinkedList<Edge<T>>> entry : adjacencyLists.entrySet()) {
            result.append(entry.getKey().value).append(" -> ").append(entry.getValue()).append("\n");
        }
        return result.toString();


    }
}
