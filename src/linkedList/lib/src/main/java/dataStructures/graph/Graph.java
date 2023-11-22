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
    public Graph(){

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

    public   Integer businessTrip(Graph<T> graph, LinkedList<T> cities) {
        Integer totalCost = 0;

        for (int i = 0; i < cities.size() - 1; i++) {
            Vertex<T> currentCity = graph.findVertex(cities.get(i));
            Vertex<T> nextCity = graph.findVertex(cities.get(i + 1));

            if (currentCity == null || nextCity == null) {
                // Either the current city or the next city is not in the graph
                return null;
            }

            if (!graph.adjacencyLists.containsKey(currentCity) || !hasDirectFlight(currentCity, nextCity)) {
                // Either the current city is not in the route map or there is no direct flight to the next city
                return null;
            }

            totalCost += getDirectFlightCost(currentCity, nextCity);
        }

        return totalCost;
    }

    public  boolean hasDirectFlight(Vertex<T> start, Vertex<T> destination) {
        for (Edge<T> edge : adjacencyLists.get(start)) {
            if (edge.destination.equals(destination)) {
                return true;
            }
        }
        return false;
    }

    public Vertex<T> findVertex(T value) {
        for (Vertex<T> vertex : adjacencyLists.keySet()) {
            if (vertex.value.equals(value)) {
                return vertex;
            }
        }
        return null;
    }

    public int getDirectFlightCost(Vertex<T> start, Vertex<T> destination) {
        for (Edge<T> edge : adjacencyLists.get(start)) {
            if (edge.destination.equals(destination)) {
                return edge.weight;
            }
        }
        return 0; // Assuming cost of 0 if no direct flight (you can adjust this based on your implementation)
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
