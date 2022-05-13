package graph;

/**
 * Concrete class of a directed edge - extends Edge
 */
public class DirectedEdge extends Edge{
    //attributes:
    private int id;
    private int source; //0 or 1

    //constructors

    /**
     * constructor of a DirectedEdge
     * @param color : Color - color of the edge
     * @param extremityOne : graph.Vertex - extremity one of the edge
     * @param extremityTwo : graph.Vertex - extremity two of the edge
     * @param value : double - value of the edge
     * @param source : int - source of the edge
     */
    public DirectedEdge(Color color, Vertex extremityOne, Vertex extremityTwo, double value, int source) {
        super(color, extremityOne, extremityTwo, value);
        this.source = source;
    }

    public DirectedEdge(Vertex extremityOne, Vertex extremityTwo,int source){
        super(extremityOne,extremityTwo);
        this.source = source;

    }

    //methods:

    /**
     * get the source of the edge
     * @return graph.Vertex
     */
    public Vertex getSource(){
        return super.getEnds()[this.source];
    }

    /**
     * get the tip of the directed edge
     * @return graph.Vertex
     */
    public Vertex getSink(){
        return super.getEnds()[1-this.source];
    }

    /**
     * displays the directed edge
     * @return String
     */
    public String toString() {
        return  super.toString() + "\n   - start : " + this.getSource() + "\n   - end : " + this.getSink();
    }
}
