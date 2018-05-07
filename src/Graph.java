import java.util.ArrayList;

public class Graph {
    private ArrayList<Edge> edges = new ArrayList<>();

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public void removeEdge(Edge edge){
        edges.remove(edge);
    }

    public boolean hasCircle(Node start, ArrayList<Node> parents){
        for (Edge e: edges) {
            if(e.start.equals(start)){
                return true;
            }
        }
        return false;
    }
}
