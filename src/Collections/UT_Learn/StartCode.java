package Collections.UT_Learn;

//import util package [all classes]

import java.util.*;

public class StartCode {

    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");

        /*
        creating collection

        1)Type safe --> same type of element(Objects) are added to collection
        eg--- ArrayList<String> name = new ArrayList<>();

        2) UnType safe --> different type of elements can be added to collection
          eg-- LinkList list = new LinkList();

         */

        //type safe collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Gopal");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Rohan");
        names.add("Rohan");

        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(2));

        names.remove("Sitara");
        System.out.println(names);

        names.set(3,"Akash");
        System.out.println(names);

        names.add(1, "Gargi");
        System.out.println(names);

        // un type safe collections
        LinkedList list = new LinkedList();
        list.add("Sachin");
        list.add(101);
        list.add(65.85);
        list.add(true);

        System.out.println(list);
    }
}
