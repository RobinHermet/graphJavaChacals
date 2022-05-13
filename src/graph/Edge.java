package graph;
/**
 * Concrete class corresponding to an edge and an undirected edge
 */
public class Edge {
    //Attributes
    private int id;
    private static int currentId = 0;
    private Color color;
    private Vertex[] ends = new Vertex[2];
    private double value;

    //constructors

    /**
     * constructor of an edge
     * @param color : Color - color of the edge
     * @param extremityOne : graph.Vertex - extremity one of the edge
     * @param extremityTwo : graph.Vertex - extremity two of the edge
     * @param value : double - value of the edge
     */
    public Edge(Color color, Vertex extremityOne, Vertex extremityTwo, double value) {
        this.id = currentId++;
        this.color = color;
        this.ends[0] = extremityOne;
        this.ends[1] = extremityTwo;
        this.value = value;
    }

    /**
     * another constructor for aen Edge which only require the two Vertices of the edge
     * @param extremityOne : graph.Vertex - extremity one of the edge
     * @param extremityTwo : graph.Vertex - extremity two of the edge
     */
    public Edge(Vertex extremityOne, Vertex extremityTwo) {
        this.id = currentId++;
        this.ends[0] = extremityOne;
        this.ends[1] = extremityTwo;
    }

    //getters and setters

    /**
     * get the id of the edge
     * @return int
     */
    public int getId() {
        return this.id;
    }

    /**
     * set the id of the edge
     * @param id - int : the new id for the edge
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get the color of the edge
     * @return Color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * set the color of the edge
     * @param color - Color : the new color for the edge
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * get the two vertices that are the extremities of the edge
     * @return graph.Vertex[2]
     */
    public Vertex[] getEnds() {
        return this.ends;
    }

    /**
     * set the vertices that are the new extremities of the edge
     * @param ends : graph.Vertex[2] - couple of the new extremities
     */
    public void setEnds(Vertex[] ends) {
        this.ends = ends;
    }

    /**
     * get the value of the edge
     * @return double
     */
    public double getValue() {
        return value;
    }

    /**
     * set the value of the edge
     * @param value - double : the new value of the edge
     */
    public void setValue(double value) {
        this.value = value;
    }
    /**
     * displays the edge
     * @return String
     */
    @Override
    public String toString() {
        return "graph.Edge :\n   - id : " + this.id + "\n   - extremityOne : " + this.ends[0] + "\n   - extremityTwo : " + this.ends[1] + "\n   - color : " + this.color + "\n   - label : " + this.ends;
    }
}
