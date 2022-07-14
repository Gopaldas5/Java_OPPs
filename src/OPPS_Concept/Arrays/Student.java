package OPPS_Concept.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
  //  private int[] marks;                         //    -----------------------array
    private ArrayList<Integer> marks = new ArrayList<Integer>();   //---------arrayList

    // creating constructor
    public Student(String name, int... marks) {    //variable arguments (int...marks)  . it always be written in last
        this.name = name;

        // this.marks = marks;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public  int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalNumberOfMarks() {
        int sum =0;
        for (int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        return Collections.max(marks);

      //  int maximum = 0;

//        int maximum = Integer.MIN_VALUE;
//       for (int mark:marks) {
//            if (mark > maximum){
//                maximum = mark;
//            }
//        }
//        return maximum;
    }

    public int getMinimumMarks() {
        return Collections.min(marks);        // collection is used because  arrayList

       // int minimum = 100 ;

//        int minimum = Integer.MAX_VALUE;   //------------it is for array
//        for (int mark:marks){
//            if (mark < minimum){
//                minimum = mark;
//            }
//        }
//        return minimum;
    }

    public BigDecimal getAvgNumberOfMarks() {
        int sum = getTotalNumberOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public String toString(){
        return name + marks;
    }

    public void addNewMark( int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int mark) {
        marks.remove(mark);
    }
}

