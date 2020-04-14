package OopsPartOne;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, size, 1, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveMuscle(){
        System.out.println("Fish.moveMuscle() is called.");
    }
    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() is called.");
    }
    public void swim(int speed){
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }
    private void rest(){

    }
}
