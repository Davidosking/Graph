package graph;

import java.util.ArrayList;

/**
 *
 * @author David Jennings This class implements a a graph node.
 */
public class GraphNode<T extends Comparable> {

    enum status {

        UNVISITED, INPROGRESS, VISITED
    }
    private status state;
    private T data;
    private ArrayList<GraphNode> neighbors = new ArrayList<>();

    public void addNeighbor(GraphNode node) {
        this.neighbors.add(node);
    }

    public void removeNeighbor(GraphNode node) {
        this.neighbors.remove(node);
    }

    public void createNeighborWithValue(T data) {
        neighbors.add(new GraphNode(data));
    }

    public boolean removeNeighborWithValue(T data) {
        for (int i = 0; i < neighbors.size(); i++) {
            if (neighbors.get(i).data == data) {
                neighbors.remove(neighbors.get(i));
                return true;
            }
        }
        return false;
    }

    /**
     * @return the state
     */
    public status getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(status state) {
        this.state = state;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the neighbors
     */
    public ArrayList<GraphNode> getNeighbors() {
        return neighbors;
    }

    /**
     * @param neighbors the neighbors to set
     */
    public void setNeighbors(ArrayList<GraphNode> neighbors) {
        this.neighbors = neighbors;
    }

    public GraphNode() {
        this.data = null;
        this.state = status.UNVISITED;

    }

    public GraphNode(T data) {
        this.data = data;
        this.state = status.UNVISITED;
    }

}
