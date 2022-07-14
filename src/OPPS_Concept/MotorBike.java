package OPPS_Concept;

public class MotorBike {
    //state
   private int speed;   //local variable

    //behaviours   ------>   |
    //method                 |
    //inputs- int speed      |
    //output- void         \ | /
    //name - setSpeed        |

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed > 0)
        this.speed = speed;
    }
    public void increaseSpeed(int howMuch){
        setSpeed(this.speed = this.speed + howMuch);
    }
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed = this.speed - howMuch);
    }
    void start(){
        System.out.println("Bike Started");
    }
}
