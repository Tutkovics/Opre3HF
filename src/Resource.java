import java.util.ArrayList;

public class Resource {
    public String name;
    private ArrayList<Task> fifo;
    public boolean busy;

    public Resource(String name){
        this.name = name;
        fifo = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }
}
