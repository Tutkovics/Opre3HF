public class Edge {
    public Node start;
    public Node finish;

    public Edge(String start, String finish){
        this.start =  new Node(start);
        this.finish = new Node(finish);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Edge))
            return false;
        Edge other = (Edge) obj;
        return this.start.equals(other.start) && this.finish.equals(other.finish);
    }
}
