package OopsPartOne;

public class MainTest {

    public static void main(String[] args) {
        CarClass proche = new CarClass();
        CarClass helden = new CarClass();
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
