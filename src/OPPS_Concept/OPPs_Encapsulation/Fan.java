package OPPS_Concept.OPPs_Encapsulation;

public class Fan {

    //State
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;     // 0 to 5

  //creation
    public Fan(String make, double radius, String color){
      this.make = make;
      this.radius = radius;
      this.color = color;
  }
      //isOn method
//    public void isOn(boolean isOn){      // (1)
//        this.isOn = isOn;
//    }
    public void switchOn(){
        this.isOn = true;
        setSpeed((byte) 5);
    }
    public void switchOff(){
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }


  // Print the State
    public String toString(){
      return String.format("Make -> %s, Radius -> %f, Color -> %s, isOn -> %b, Speed -> %d",
              make, radius, color, isOn, speed);
    }
}
