public class Node {
    public String name;

    public Node(String name){
        this.name = name;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof String))
            return false;

        String other = (String) obj;
        return this.name.equals(other);
    }
}
