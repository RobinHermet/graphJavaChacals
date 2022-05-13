package graph;

/**
 * Interface of a graph
 */
public interface Graph {
    /**
     * number of vertices of the graph
     * @return : int
     */
    int nbOfVertices();

    /**
     * number of edges in the graph
     * @return : int
     */
    int nbOfEdges();

    /**
     * add a vertex to the graph
     * @param vertex1 : graph.Vertex
     */
    void addVertex(Vertex vertex1) throws GraphException;

    /**
     * add an edge to the graph
     * @param vertex1 : graph.Vertex - extremity one of the edge
     * @param vertex2 : graph.Vertex - extremity two of the edge
     * @param edgeKind : String - 'directed' or 'undirected'
     */
    void addEdge(Vertex vertex1,Vertex vertex2,EdgeKind edgeKind);

    /**
     * whether there is a path between the two vertices (without accounting for the edge directions)
     * @param vertex1 : graph.Vertex
     * @param vertex2 : graph.Vertex
     * @return true whether there is a path between the two vertices (without accounting for the edge directions)
     */
    boolean isConnected(Vertex vertex1,Vertex vertex2);

    /**
     * says whether all vertices are interconnected
     * @return true whether all vertices are interconnected
     */
    boolean isConnected();

    /**
     * give edge(s) connecting these vertices
     * @param vertex1 : graph.Vertex
     * @param vertex2 : graph.Vertex
     * @return Edge[]
     */
    Edge[] getEdges(Vertex vertex1, Vertex vertex2);

    /**
     * give all edges of the graph
     * @return Edge[]
     */
    Edge[] getEdges();

    /**
     * give all vertices of the graph
     * @return graph.Vertex
     */
    Vertex[] getVertices();

    /**
     * give edges connected to this vertex
     * @param vertex1 : graph.Vertex
     * @return Edge[]
     */
    Edge[] getNeighborEdges(Vertex vertex1); //

    /**
     * Displays the edge and its vertices (if it's directed with the source and the target) or a vertex
     * @return String
     */
    String toString();
}

