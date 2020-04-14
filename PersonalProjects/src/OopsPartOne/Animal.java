package OopsPartOne;

public class Animal {
    private String name;
    private int body;
    private int size;
    private int brain;
    private int weight;

    public Animal(String name, int body, int size, int brain, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animal.eat() is called.");
    }
    public void move(int speed){
        System.out.println("Animal.move() is called. Animal was moving at " + speed);

    }
    public String getName(){
        return name;
    }
    public int getBody(){
        return body;
    }
    public int getSize(){
        return size;
    }
    public int getBrain(){
        return brain;
    }
    public int getWeight(){
        return weight;
    }
}
