# Challenge Graph Depth First

## Whiteboard Process
![Whiteboard](../../assets/null%20(5).png)
## Approach & Efficiency
I implemented the depth-first traversal using a stack to keep track of vertices to be visited in a depth-first manner. The algorithm marks each visited vertex to avoid revisiting it. The time complexity of this approach is O(V + E), where V is the number of vertices, and E is the number of edges in the graph.

## Solution
To use the depth-first traversal in your `Graph` class:

1. **Create a Graph instance:**
   ```java
   Graph<String> graph = new Graph<>();

2. **Add vertices and edges:**
   ``` java
   Vertex<String> vertexA = graph.addVertex("A");
   Vertex<String> vertexB = graph.addVertex("B");
   
3. **Perform depth-first traversal:**
  ``` java
  Vertex<String> startVertex = graph.findVertex("A"); 
  List<Vertex<String>> result = graph.depthFirst(startVertex);
```
## Example:
![Input](../../assets/Screenshot%202023-11-27%20164722.png)
![Output](../../assets/Screenshot%202023-11-27%20164806.png)




