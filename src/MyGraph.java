import java.util.ArrayList;

public class MyGraph {
    private ArrayList<Edge> edges;

    public MyGraph(){
        edges = new ArrayList<>();
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }


    private boolean circle(Node start, ArrayList<Node> was) {
        if(was.contains(start)){
            return true;
        }
        was.add(start);
        for (Edge e:edges) {
            if(e.start.equals(start)){
                if(circle(e.finish, was)){
                    return true;
                }
            }
        }
        return false;
    }

    public void removeEdge(Edge edge){
        edges.remove(edge);
    }

    public boolean hasCircle(){

        for (Edge e: edges) {
            ArrayList<Node> was = new ArrayList<>();
            if(circle(e.start, was)){
                return true;
            }
        }
        return false;
    }
}
