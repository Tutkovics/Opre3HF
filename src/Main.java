import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**
         * List for the tasks
         */
        ArrayList<Task> tasks = new ArrayList<>();

        /**
         * Example input
         */
        String input =  "T1,+R1,0,0,+R2,-R1,-R2\n" +
                        "T2,+R2,+R1,-R1,-R2\n" +
                        "T3,0,0,0,+R3,+R3,-R3,-R3";

        Scanner sc = new Scanner(input).useDelimiter("[,\\s]");
        String name = null;
        String s = null;

        /**
         * Read input line by line
         */
        while(sc.hasNextLine()){
            if(sc.hasNext()){
                /**
                 * Get the task's name
                 */
                name = sc.next();
//                System.out.println("Name: " + name);
            }
            if(sc.hasNext()){
                s = sc.nextLine();
//                System.out.println("Maradék: " + s);
            }

            /**
             * Create new task and and to list
             */
            if(name != null && s != null){
                tasks.add(new Task(name, s));
            }
        }

        /**
         * Start the iteration
         */
        int i = 0;
        boolean start = true;
        while(start){
            start = false;
            i++;
            System.out.println(i + ". kör lépések");
            for (Task t: tasks) {
                if(t.hasMoreAction()){
                    start = true;

                    String str = t.getCurrentResource();
                    switch (str.charAt(0)){
                        case '+':
                            AllocationController.tryAllocate(t, new Resource(str.substring(1,str.length())));
                            t.hadAllocationTry();
                            break;
                        case '-':
                            AllocationController.letAllocation(t, new Resource(str.substring(1,str.length())));
                            t.hadAllocationTry();
                            break;
                        case '0':
                            t.hadAllocationTry();
                            break;
                    }

                }
            }
        }
    }
}
