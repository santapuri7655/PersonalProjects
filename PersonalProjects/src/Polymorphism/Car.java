package Polymorphism;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

public class Car {
    private boolean engine;
    private int cylinders;
    private String cylinderName;
    private int wheels;

    public Car(int cylinders, String cylinderName, boolean engine, int wheels){
        this.cylinders = cylinders;
        this.cylinderName = cylinderName;
        this.wheels = wheels;
        this.engine = engine;
    }

    public Car(int cylinders, String cylinderName){
        this(cylinders, cylinderName, true, 4);
        this.cylinders = cylinders;
        this.cylinderName = cylinderName;
    }
    public String startEngine(boolean engine){
        if(engine){
            System.out.println("Push button to start.");
            return "Engine has started.";
        }
        else {
            return "Engine not started.";
        }
    }
    public String accelerate(){
        return "Car has been accelerated.";
    }
    public String autoBrake(){
        return "Brake has been applied.";
    }
    public int getCylinders() {
        return cylinders;
    }
    public String getCylinderName() {
        return cylinderName;
    }
}

class MyCar extends Car{
    public MyCar() {
        super(6, "V6");

    }
    @Override
    public String autoBrake() {
        return "Automatic brake applied when my car goes too close to another car.";
    }
}

class LuxuryCar extends Car{
    public LuxuryCar() {
        super(8, "v8");
    }
    @Override
    public String startEngine(boolean engine) {
        if(engine){
            return "Super car starts with start button on remote.";
        }
        else {
            return "Super car runs on electricity.";
        }
    }
    @Override
    public String autoBrake() {
        return "Super car brakes at destination automatically.";
    }
}

class PremiumCar extends Car {
    public PremiumCar() {
        super(4, "V4");
    }
    @Override
    public String accelerate() {
        return "Premium cars accelerate to highest speed in 2 mins.";
    }
}

class CarTest {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            Car car = randomCarWithFeature();
            System.out.println("Car accelerates: " + car.accelerate() + "\n" +
            "Breaks: " + car.autoBrake() + "\n"+
                    "Starts engine: " + car.startEngine(true));
        }
    }
    public static Car randomCarWithFeature(){
        int randomCar = (int)(Math.random()*3)+1;
        System.out.println("Car: " + randomCar);
        switch (randomCar){
            case 1:
                return new MyCar();
            case 2:
                return new LuxuryCar();
            case 3:
                return new PremiumCar();
        }
        return null;
    }
}
