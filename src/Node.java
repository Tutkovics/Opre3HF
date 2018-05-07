public class Node {
    private int a;
    public String name;

    public Node(String name){
        this.name = name;
        this.a = 10;
//        asd();
    }

    public void asd(){
        System.out.println("asd()");
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
        return this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
