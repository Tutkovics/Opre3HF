import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    /**
     * Unique name and their allocations
     */
    private String name;
    private ArrayList<String> allocations = new ArrayList<>();
    public int iteration;

    /**
     * Constructor
     */
    public Task(String name, String allocations){
        this.name = name;
        this.iteration = 1;

        /**
         * Delimit the allocations
         */
        Scanner sc = new Scanner(allocations).useDelimiter("[,\\s]");
        while(sc.hasNext()) {
            String s = sc.next();
            //Resource r = new Resource(s);
            this.allocations.add(s);
        }

    }

    /**
     * List task's allocations
     */
    public void list(){
        for (String s:
             allocations) {
            System.out.println(s);
        }
    }

    public String getName(){return this.name;}

    @Override
    public String toString() {
        return this.name;
    }

    public String getCurrentResource(){
        if(!allocations.isEmpty()){
            return allocations.get(0);
        } else {
            return null;
        }
    }

    public void hadAllocationTry() {
        allocations.remove(0);
        iteration++;
    }

    public boolean hasMoreAction() {
        return !allocations.isEmpty();
    }
}
