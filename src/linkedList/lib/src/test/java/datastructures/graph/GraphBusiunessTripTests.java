package datastructures.graph;
import dataStructures.graph.Graph;
import dataStructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
public class GraphBusiunessTripTests {

    @Test
    void testPossibleBuisenessTrip(){
        Graph<String> graph = new Graph<>(10);

        Vertex<String> cityA = graph.addVertex("A");
        Vertex<String> cityB = graph.addVertex("B");
        Vertex<String> cityC = graph.addVertex("C");

        graph.addEdge(cityA, cityB, 80);
        graph.addEdge(cityA, cityC, 200);
        graph.addEdge(cityB, cityC, 170);

        LinkedList<String> cities = new LinkedList<>();
        cities.add("A");
        cities.add("B");
        cities.add("C");

        Integer totalCost = graph.businessTrip(graph, cities);

        assertEquals(250 , totalCost);
    }

    @Test
    void testNotPossibleBuisnessTrip(){
        Graph<String> graph = new Graph<>(10);

        Vertex<String> cityA = graph.addVertex("A");
        Vertex<String> cityB = graph.addVertex("B");
        Vertex<String> cityC = graph.addVertex("C");

        graph.addEdge(cityA, cityB, 80);


        LinkedList<String> cities = new LinkedList<>();
        cities.add("A");
        cities.add("c");

        Integer totalCost = graph.businessTrip(graph, cities);

        assertNull(totalCost);
    }

    @Test
    void testBusinessTripWithNotExistedCity(){
        Graph<String> graph = new Graph<>(10);

        Vertex<String> cityA = graph.addVertex("A");
        Vertex<String> cityB = graph.addVertex("B");
        Vertex<String> cityC = graph.addVertex("C");

        graph.addEdge(cityA, cityB, 80);


        LinkedList<String> cities = new LinkedList<>();
        cities.add("A");
        cities.add("r");

        Integer totalCost = graph.businessTrip(graph, cities);

        assertNull(totalCost);
    }
}
