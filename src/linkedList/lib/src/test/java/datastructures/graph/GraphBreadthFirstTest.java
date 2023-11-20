package datastructures.graph;
import dataStructures.graph.Edge;
import dataStructures.graph.Graph;
import dataStructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
public class GraphBreadthFirstTest {

    @Test
    void testBreadthFirstTraversal() {
        Graph<Integer> graph = new Graph<>(10);

        Vertex<Integer> v1 = graph.addVertex(1);
        Vertex<Integer> v2 = graph.addVertex(2);
        Vertex<Integer> v3 = graph.addVertex(3);
        Vertex<Integer> v4 = graph.addVertex(4);
        Vertex<Integer> v5 = graph.addVertex(5);

        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v2, v4);
        graph.addEdge(v3, v5);

        LinkedList<Vertex<Integer>> result = graph.breadthFirst(v1);

        assertEquals(v1, result.get(0));
        assertEquals(v2, result.get(1));
        assertEquals(v3, result.get(2));
        assertEquals(v4, result.get(3));
        assertEquals(v5, result.get(4));
    }

    @Test
    void testAddVertex() {
        Graph<String> graph = new Graph<>(5);

        Vertex<String> vertex = graph.addVertex("A");

        // Assert that the vertex was added successfully
        assertTrue(graph.getVertices().contains(vertex));
        assertEquals(1, graph.size());
    }

    @Test
    void testBreadthFirstTraversalDisconnectedGraph() {
        Graph<Integer> graph = new Graph<>(10);

        Vertex<Integer> v1 = graph.addVertex(1);
        Vertex<Integer> v2 = graph.addVertex(2);
        Vertex<Integer> v3 = graph.addVertex(3);


        LinkedList<Vertex<Integer>> result = graph.breadthFirst(v1);

        assertEquals(v1, result.get(0));
        assertEquals(1, result.size());
    }
}
