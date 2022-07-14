package OPPS_Concept.OPPS__inheritance;


 class StudentRunner1 {
    public static void main(String[] args) {
//        Student1 student1 = new Student1();
//        student1.setName("Gopal Kumar Das");
//        student1.setEmail("gopalkr@gmail.com");

        /*
        Person person = new Person();
        person.setName("Gopal Das");
        person.setEmail("gopalkrada@gmail.com");
        person.setPhoneNumber(839370922);
        person.setAddress("Kishanganj");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
         */

        Employee employee = new Employee("GopalDas","Programmer Analyst");
       // employee.setName("Gopal");
        employee.setEmail("gopalkrdas@gmail.com");
        employee.setPhoneNumber(77643586);
        employee.setAddress("Motibhag");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);

    }
}
