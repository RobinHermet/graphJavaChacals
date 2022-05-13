package graph;

import java.util.Arrays;

/**
 * Test class - (main class)
 */
public class MyTest {
    public static void main(String[] args) {
        Vertex myVertex = new Vertex("an info", Color.BLACK);
        new DirectedEdge(Color.GREEN,myVertex,myVertex,3.8,1);
        new Edge(Color.BLUE,myVertex,myVertex,6.2);
        System.out.println(myVertex.toString());
        System.out.println("Ceci est un affichage");
    }
}
