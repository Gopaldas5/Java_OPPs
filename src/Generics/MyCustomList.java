package Generics;

import java.util.ArrayList;

public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(String element) {
        list.add((T) element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }
    public String toString() {
        return list.toString();
    }
}
