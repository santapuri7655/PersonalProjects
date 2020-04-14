package InheritanceChallenge;
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Base {

    private int handSteering;
    private int gears;

    public Base(int handSteering, int gears){
        this.handSteering = handSteering;
        this.gears = gears;
    }

    public int getHandSteering(){
        return handSteering;
    }
    public int getGears(){
        return gears;
    }
    public void moving(int speed){
        System.out.println("Base.moving() is called. Base car moves at " + speed + "miles/hr");
    }
    public void changingGears(int gears){
        if(gears < 3){
            System.out.println("Automatic transmission.");
        }
        else{
            System.out.println("Base.gears() is called. Base car will have " + gears);
        }
    }
}
