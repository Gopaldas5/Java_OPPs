package OPPS_Concept.OPPS__inheritance;

class Person extends Object{
    private String name;
    private String email;
    private int phoneNumber;
    private String address;

//    public Person(){
//        System.out.println("Person constructor");
//    }

    public Person(String name) {
        System.out.println("Person Constructor");
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return name + "  #  "  +  email + "  #  " + phoneNumber + "  #  " + address;
    }
}
