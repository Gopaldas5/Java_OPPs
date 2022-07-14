package Generics;
import Generics.MyCustomList;

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element-1");
        list.addElement("Element-2");
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(String.valueOf(Integer.valueOf(5)));
        list2.addElement(String.valueOf(Integer.valueOf(9)));
        System.out.println(list2);
    }


}
