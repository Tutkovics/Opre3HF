public class Edge {
    public Node start;
    public Node finish;

    public Edge(Node start, Node finish){
        this.start = start;
        this.finish = finish;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Node))
            return false;
        Node other = (Node) obj;
        return this.start.equals(other.equals(start)) && this.finish.equals(other.equals(finish));
    }
}
