package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<StudentCollection>{


    @Override
    public int compare(StudentCollection student1, StudentCollection student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}
public class StudentCollectionRunner {

    public static void main(String[] args) {
        List<StudentCollection> students = List.of(new StudentCollection(50, "Gopal"),
                new StudentCollection(100,"Adam"),
                new StudentCollection(21, "Eve"));

       ArrayList <StudentCollection> studentAL = new ArrayList<>(students);

        System.out.println(studentAL);

        Collections.sort(studentAL);
        System.out.println("Descending order " +studentAL);

//        Collections.sort(studentAL, new AscendingStudentComparator());
//        System.out.println("AscendingStudentComparator" + studentAL);

        studentAL.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator" + studentAL);
    }
}
