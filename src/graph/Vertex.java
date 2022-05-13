package graph;

/**
 * Class corresponding to a vertex of the graph
 */
public class Vertex {
    //attributes
    private int id;
    private static int currentId = 0;
    private Object info;
    private Color color;

    //Constructors

    /**
     * constructor of a vertex
     * @param info : Object - information on the vertex
     * @param color : Color - the color of the vertex
     */
    public Vertex(Object info, Color color) {
        this.id = currentId++;
        this.info = info;
        this.color = color;
    }

    //getters and setters

    /**
     * get the id of the vertex
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * set the id of the vertex
     * @param id - int : the new id for the vertex
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get the information on the vertex
     * @return Object
     */
    public Object getInfo() {
        return info;
    }

    /**
     * set the information of the vertex
     * @param info - Object : the new information for the vertex
     */
    public void setInfo(Object info) {
        this.info = info;
    }

    /**
     * get the color of the vertex
     * @return Color
     */
    public Color getColor() {
        return color;
    }

    /**
     * set the color of the vertex
     * @param color - Color : the new color of the vertex
     */
    public void setColor(Color color) {
        this.color = color;
    }

    //methods:
    /**
     * displays the vertex
     * @return String
     */
    public String toString() {
        return "graph.graph.Vertex : \n   - id : " + this.id + "\n   - color : " + this.color;
    }
}

