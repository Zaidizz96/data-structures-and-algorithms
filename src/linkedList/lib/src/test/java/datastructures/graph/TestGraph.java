package datastructures.graph;
import dataStructures.graph.Graph;
import dataStructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestGraph {

    @Test
    public void test_Add_Vertex_Successfully(){
        Graph<Integer> graph = new Graph<>(8);

        Vertex<Integer> vertex1 = graph.addVertex(1);
        Vertex<Integer> vertex2 = graph.addVertex(2);

        assertTrue(graph.getVertices().contains(vertex1));
    }

    @Test
    public void test_Add_Edge_Successfully(){
        Graph<String> graph = new Graph<>(8);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        graph.addEdge(vertexA, vertexB, 2);
        assertEquals("Edge{destination=Vertex{value=B}, weight=2}", graph.getNeighbors(vertexA).get(0).toString());
    }

    @Test
    public void test_Get_All_Vertices(){
        Graph<String> graph = new Graph<>(8);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        graph.addEdge(vertexA, vertexB, 2);
        assertEquals(2, graph.getVertices().size());
    }

    @Test
    public void test_Get_All_Neighbours(){
        Graph<String> graph = new Graph<>(10);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        graph.addEdge(vertexA, vertexB, 2);
        assertEquals(1, graph.getNeighbors(vertexA).size());
        assertEquals("Edge{destination=Vertex{value=B}, weight=2}", graph.getNeighbors(vertexA).get(0).toString());
    }

    @Test
    public void test_Size_Of_Graph(){
        Graph<Integer> graph = new Graph<>(8);

        Vertex<Integer> vertex1 = graph.addVertex(1);
        Vertex<Integer> vertex2 = graph.addVertex(2);

        assertEquals(2 , graph.size());
    }

    @Test
    public void test_Return_Grapgh_With_One_Vertex_And_Edge(){
        Graph<String> graph = new Graph<>(9);
        Vertex<String> vertexA = graph.addVertex("A");
        assertEquals(1, graph.size());
        assertTrue(graph.getVertices().contains(vertexA));

        graph.addEdge(vertexA, vertexA, 1);
        assertEquals(1, graph.size());
    }
    }

