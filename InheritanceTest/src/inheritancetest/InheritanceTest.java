/* class Bicycle is a base class, class MountainBike is a derived class that extends 
Bicycle class and class Test is a driver class to run program. */

package inheritancetest;

class Bicycle {
    public int gear;
    public int speed;
    
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    
    public void applyBreak(int decrement) {
        this.speed -= decrement;
    }
    
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
    public String showInfo() {
        return ("No of gears area: "+gear+ "\n"+"Speed of bicycle is: " + speed);
    }
}

class MountainBike extends Bicycle {
    
    public int seatHeight;
    
    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }
    
    public String showInfo() {
        return (super.showInfo()+"\nSeatheight is: "+ seatHeight);
    }
}

public class InheritanceTest {

    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3,200,25);
        System.out.println(mb.showInfo());
    }
    
}
