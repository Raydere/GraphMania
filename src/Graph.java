/**
 * A basic graph class. Recalling from an old homework assignment. The graph is
 * represented by a two-dimensional array, with indices representing vertices
 * and entries representing edge weights. The first index of an entry represents
 * the vertex the edge exits and the second index represents the vertex that the
 * edge enters. This class assumes that all edges are non-negative; as such, -1
 * is used as a constant representing the absence of an edge between two
 * vertices.
 * 
 * @author Raydere
 * @version 0.1
 */
import java.util.Stack;
import java.util.Queue;

public class Graph {
    private static final int NO_EDGE = -1; // all edges will be >=0
    private int[][] adjacencies; // stfu 146 alumni
    private int edges; // number of edges
    private int vertices; // because lol i can't use .length

    /**
     * Constructs a new graph.     
     * @param vertices number of vertices in the grap
     */
    public Graph(int vertices) {
        adjacencies = new int[vertices][vertices];
        this.vertices = vertices;
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++)
                adjacencies[j][i] = NO_EDGE;
        }
    }

    /**
     * Adds a new edge to the graph or replaces an existing edge.     
     * @param out The vertex the edge will exit.
     * @param in the vertex the edge wil enter
     * @param weight the weight of the edge
     * @return true if new edge added, false if existing edge
     * @throws IllegalArgumentException if weight < 0
     */
    public boolean addEdge(int out, int in, int weight) {        
        if (weight < 0)
            throw new IllegalArgumentException(
                    "Edge weight must be nonnegative");
        
        boolean newEdge = false;
        if (adjacencies[out][in] == NO_EDGE) {
            newEdge = true;
            edges++;
        }
        adjacencies[out][in] = weight;
        return newEdge;
    }
    
    
    
    /**
     * Checks whether an edge going from one vertex to another exists.
     * @param out The out vertex.
     * @param in The in vertex.
     * @return true if the edge exists (weight is not -1), false otherwise
     */
    public boolean hasEdge(int out, int in) {
        return adjacencies[out][in] != NO_EDGE;
    }

    // Edge.
}
