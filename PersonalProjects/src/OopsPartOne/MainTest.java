package OopsPartOne;

public class Main {

    public static void main(String[] args) {
        Car proche = new Car();
        Car helden = new Car();
        Person person = new Person();

        proche.setModel("carrera");
        System.out.println("Model type is " + proche.getModel());

        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);
        System.out.println("fullName = "+ person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = "+ person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName = " +person.getFullName());
    }
}
