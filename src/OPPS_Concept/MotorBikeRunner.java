package OPPS_Concept;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(80);
        ducati.increaseSpeed(35);
        ducati.decreaseSpeed(125);
        System.out.println(ducati.getSpeed());

//        ducati.setSpeed(-80);
//        System.out.println(ducati.getSpeed());

        honda.setSpeed(45);
        honda .increaseSpeed(100);
        honda.decreaseSpeed(550);
        System.out.println(honda.getSpeed());
    }
}
