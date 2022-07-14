package OPPS_Concept.Arrays;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
       // int[] marks = {99,90,100};
        Student student = new Student("Gopal", new int[] {99,90,100});
//        Student student1 = new Student("Ram", new int[] {99,90,95,89});
//        Student student2 = new Student("Rohan", new int[] {91,93});
//        Student student3 = new Student("Nipa", new int[] {80,75,33,87,44});

        int number = student.getNumberOfMarks();
        System.out.println("Number of the marks :- "+number);

        int totalNumber = student.getTotalNumberOfMarks();
        System.out.println("Total number of marks :- "+totalNumber);

        int maxiMark = student.getMaximumMarks();
        System.out.println("Maximum of mark :- "+maxiMark);

        int miniMark = student.getMinimumMarks();
        System.out.println("Minimum of mark :- "+miniMark);
        
        BigDecimal avgMark = student.getAvgNumberOfMarks();
        System.out.println("Average number of marks :- " +avgMark);

        System.out.println(student);


        student.addNewMark(35);               // ----------------- it is not easily done in array---- but it is done by easily in arrayList
        System.out.println(student);

        student.removeMarkAtIndex(1);            // -----------     "  "     "   "       "
        System.out.println(student);
    }
}
