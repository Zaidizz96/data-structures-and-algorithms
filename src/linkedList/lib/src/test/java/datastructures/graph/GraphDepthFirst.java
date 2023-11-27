package datastructures.graph;

import dataStructures.graph.Graph;
import dataStructures.graph.Vertex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GraphDepthFirst {


        @Test
        void testDepthFirstTraversal() {
            Graph<String> graph = new Graph<>(10);
            Vertex<String> vertexA = graph.addVertex("A");
            Vertex<String> vertexB = graph.addVertex("B");
            Vertex<String> vertexC = graph.addVertex("C");
            Vertex<String> vertexD = graph.addVertex("D");

            graph.addEdge(vertexA, vertexB);
            graph.addEdge(vertexA, vertexC);
            graph.addEdge(vertexB, vertexD);

            List<Vertex<String>> result = graph.depthFirst(vertexA);

            List<Vertex<String>> expected = List.of(vertexA, vertexB, vertexD, vertexC);

            assertEquals(expected, result);
        }

        @Test
        void testDepthFirstTraversalWithDisconnectedGraph() {
            Graph<Integer> graph = new Graph<>(10);
            Vertex<Integer> vertex1 = graph.addVertex(1);
            Vertex<Integer> vertex2 = graph.addVertex(2);
            Vertex<Integer> vertex3 = graph.addVertex(3);
            Vertex<Integer> vertex4 = graph.addVertex(4);

            graph.addEdge(vertex1, vertex2);
            graph.addEdge(vertex2, vertex3);


            List<Vertex<Integer>> result = graph.depthFirst(vertex1);

            List<Vertex<Integer>> expected = List.of(vertex1, vertex2, vertex3);

            assertEquals(expected, result);
        }
    }


