package graph;

import java.util.ArrayList;

/**
 *
 * @author David Jennings This class implements a graph.
 */
public class Graph {

    ArrayList<GraphNode> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public void Graph(GraphNode node) {
        this.nodes.add(node);
    }
    
    public void addNode(GraphNode node){
        nodes.add(node);
    }
    
    public void removeNode(GraphNode node){
        nodes.remove(node);
        
    }
    
      

}
