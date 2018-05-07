import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Task> tasks = new ArrayList<>();

        String input =  "T1,+R1,0,0,+R2,-R1,-R2\n" +
                        "T2,+R2,+R1,-R1,-R2\n" +
                        "T3,0,0,0,+R3,+R3,-R3,-R3";

        Scanner sc = new Scanner(input).useDelimiter("[,\\s]");
        while(sc.hasNextLine()){
            if(sc.hasNext()){
                String name = sc.next();
//                System.out.println("Name: " + name);
            }
            if(sc.hasNext()){
                String s = sc.nextLine();
//                System.out.println("Maradék: " + s);
            }
        }


//        while(true){
//            for (Task t: tasks) {
//
//
//            }
//        }

    }
}
