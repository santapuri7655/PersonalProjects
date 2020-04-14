package OopsPartOne;

public class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 20, 1, 23);
        Dog dog = new Dog("Yorkie", 12, 35, 2, 4, 1, 20, "fur");
        Fish fish = new Fish("fish", 2, 5, 4, 2, 2);

//        dog.eat();
//        dog.walk();
//        dog.run();
        fish.swim(5);
    }
}
