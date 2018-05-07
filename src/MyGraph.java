import java.util.ArrayList;

public class MyGraph {
    private ArrayList<Edge> edges;

    public MyGraph(){
        edges = new ArrayList<>();
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public void removeEdge(Edge edge){
        edges.remove(edge);
    }

 /*   public boolean fullHasCircle(){
        boolean was = false;
        for (Edge e:edges) {

            System.out.println("====== fullHasCircle("+ e.start.toString()+") ======");

            if(hasCircle(e.start.toString(), new ArrayList<>())){
                was = true;
            }
        }
        return was;
    }

    public boolean hasCircle(String star, ArrayList<Node> parents){
        Node start = new Node(star);

        System.out.println("==== hasCircle("+ start.toString()+") ====");


        System.out.print("\nparents = {");
        for (Node n: parents) {
            System.out.print(""+n.toString() + ",");
            if(n.equals(start)){
                System.out.println("==>> " + n.toString() + "-" + start);
                return true;
            }

        }
System.out.println("}");

        parents.add(start);

        for (Edge e:edges) {
//            System.out.println("=== Foreach ===");
                System.out.println("  * " + e.start.toString() + "-" + start.toString());
            if(e.start.equals(start)){
                System.out.println("== New node check ("+ e.finish.toString()+")==");
                return hasCircle(e.finish.toString(),parents);
            }
        }

        return false;
    }*/

    public boolean hasCircle(){

        for (Edge e: edges) {
            ArrayList<Node> was = new ArrayList<>();
            if(circle(e.start, was)){
                return true;
            }
        }
        return false;
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
}
