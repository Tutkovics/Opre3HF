import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    private String name;
    private ArrayList<String> allocations = new ArrayList<>();

    public Task(String name, String allocations){
        this.name = name;

        Scanner sc = new Scanner(allocations).useDelimiter("[,\\s]");
        while(sc.hasNext()) {
            String s = sc.next();

            this.allocations.add(s);
        }

    }

    public void list(){
        for (String s:
             allocations) {
            System.out.println(s);
        }
    }
}
