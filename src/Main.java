import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Task> tasks = new ArrayList<>();

        Scanner sc = new Scanner(System.in).useDelimiter("[,\\s]");
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

        Edge e1;
        e1 = new Edge(new Node("T1"), new Node("T2"));
        System.out.println(""+ );


    }
}
