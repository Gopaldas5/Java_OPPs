package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
        public static void main(String args[]){

            ArrayList al=new ArrayList();  // creating array list
            al.add("Jack");                // adding elements
            al.add("Tyler");
            al.add("Akash");
            System.out.println("List of names -"+al);
            al.remove("Jack");
            System.out.println("List of names -"+al);

            Iterator itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
}

