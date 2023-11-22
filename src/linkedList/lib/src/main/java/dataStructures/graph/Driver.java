package dataStructures.graph;

import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {

        // lab35 //
//        Graph<Integer> graph = new Graph<>(8);
//
//        Vertex<Integer> vertex1 = graph.addVertex(1);
//        Vertex<Integer> vertex2 = graph.addVertex(2);
//        Vertex<Integer> vertex3 = graph.addVertex(3);
//
//
//        graph.addEdge(vertex1 , vertex2 , 2 );
//        graph.addEdge(vertex1 , vertex3 , 1 );
//        graph.addEdge(vertex2 , vertex3 , 3 );
//
//
//        System.out.println("Vertices: " + graph.getVertices());
//
//        System.out.println("Neighbors of 1: " + graph.getNeighbors(vertex1));
//
//        System.out.println("Graph size: " + graph.size());
//
//        System.out.println("Graph representation:\n" + graph);


        // codeChallenge 36 //
//        Graph<Integer> graph = new Graph<>(8);
//
//        Vertex<Integer> vertex1 = graph.addVertex(1);
//        Vertex<Integer> vertex2 = graph.addVertex(2);
//        Vertex<Integer> vertex3 = graph.addVertex(3);
//        Vertex<Integer> vertex4 = graph.addVertex(4);
//        Vertex<Integer> vertex5 = graph.addVertex(5);
//
//        graph.addEdge(vertex1, vertex2);
//        graph.addEdge(vertex1, vertex3);
//        graph.addEdge(vertex2, vertex4);
//        graph.addEdge(vertex3, vertex5);
//
//        System.out.println(graph.breadthFirst(vertex1));

        // lab37//

        Graph<String> graph = new Graph<>(10);

        Vertex<String> cityA = graph.addVertex("A");
        Vertex<String> cityB = graph.addVertex("B");
        Vertex<String> cityC = graph.addVertex("C");

        graph.addEdge(cityA, cityB, 80);
        graph.addEdge(cityA, cityC, 150);
        graph.addEdge(cityB, cityC, 350);

        LinkedList<String> cities = new LinkedList<>();
        cities.add("A");
        cities.add("B");
        cities.add("C");

        Integer totalCost = graph.businessTrip(graph, cities);

        System.out.println("total cost is between these cities is :" + totalCost);
    }

    }


