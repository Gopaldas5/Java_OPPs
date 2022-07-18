package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();// creating linked list
        al.add("Rachit"); // adding elements
        al.add("Rahul");
        al.add("Rajat");

        for (int i=0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
        System.out.println("---------------------");

        for(String name:al){
            System.out.println(name);
        }
        System.out.println("-----------------------");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
