package dataStructures.graph;

public class Driver {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>(8);

        Vertex<Integer> vertex1 = graph.addVertex(1);
        Vertex<Integer> vertex2 = graph.addVertex(2);
        Vertex<Integer> vertex3 = graph.addVertex(3);


        graph.addEdge(vertex1 , vertex2 , 2 );
        graph.addEdge(vertex1 , vertex3 , 1 );
        graph.addEdge(vertex2 , vertex3 , 3);


        System.out.println("Vertices: " + graph.getVertices());

        System.out.println("Neighbors of 1: " + graph.getNeighbors(vertex1));

        System.out.println("Graph size: " + graph.size());

        System.out.println("Graph representation:\n" + graph);
    }

}
