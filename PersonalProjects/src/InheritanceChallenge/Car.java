package InheritanceChallenge;

public class Car extends Base{

    private int doors;
    private int seats;
    private String colorOfCar;

    public Car(int handSteering, int gears, int doors, int seats, String color) {
        super(1, gears);
        this.doors = doors;
        this.seats = seats;
        this.colorOfCar = color;
    }

    public int getDoors(){
        return doors;
    }
    public int getSeats(){
        return seats;
    }
    public String getColor(){
        return colorOfCar;
    }
    public void numOfSeats(int seats){
        if (seats == 2){
            System.out.println("2 seater");
        }
        else if(seats == 5 || seats == 4){
            System.out.println("regular 5 or 4 seater");
        }
        else {
            System.out.println("invalid value");
        }
    }
    private void gears(int gears){
        System.out.println("Car.gears() is called. Car will have " + gears + " gears");
    }

    @Override
    public void changingGears(int gears) {
        System.out.println("number of gears overrided");
        gears(gears);
        super.changingGears(gears);
    }
}
