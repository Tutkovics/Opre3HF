public class AllocationController {
    private static MyGraph rag = new MyGraph();

    public static void tryAllocate(Task t, Resource r){
        Edge e = new Edge(t.getName(), r.getName());
        rag.addEdge(e);
        if(rag.hasCircle()){
            System.out.println("Sikertelen erőforrásallokáció: " + t.getName() + " --> " + r.getName() +"("+t.iteration+")");
            rag.removeEdge(e);
        }
        else {
            //System.out.println("Sikeres erőforrásallokáció: " + t.getName() + " --> " + r.getName());
        }
    }

    public static void letAllocation(Task t, Resource r) {
        Edge e = new Edge(t.getName(), r.getName());
        //r.busy = false;
        rag.removeEdge(e);
    }
}
