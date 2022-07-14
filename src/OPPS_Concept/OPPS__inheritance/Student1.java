package OPPS_Concept.OPPS__inheritance;

public class Student1 extends Person {
    private String collegeName;
    private int year;

    public Student1(String name, String collegeName){
        super(name);
        this.collegeName = collegeName;
    }


    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }





}
