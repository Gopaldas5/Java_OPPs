package OPPS_Concept.OPPs_Encapsulation;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.5345, "Green" );
       // fan.isOn(true);        // (1)
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte) 3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
