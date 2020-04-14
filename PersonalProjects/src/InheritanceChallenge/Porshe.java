package InheritanceChallenge;

public class Porshe extends Car{
    private int engine;
    private String model;
    private String interior;

    public Porshe(int gears, int seats, String color, int engine, String model, String interior) {
        super(1, gears, 4, seats, color);
        this.engine = engine;
        this.model = model;
        this.interior = interior;
    }
    public int getEngine(){
        return engine;
    }
    public String getModel(){
        return model;
    }
    public String getInterior(){
        return interior;
    }

    private void porsheMoving(int speed){
        System.out.println("speed of this model reaches " + speed + "in 2 mins");
    }
    @Override
    public void moving(int speed) {
        System.out.println("speed of car overrided");
        porsheMoving(speed);
        super.moving(speed);
    }
}
