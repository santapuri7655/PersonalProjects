package OopsPartOne;

public class VIPCustomerTest {
    public static void main(String[] args) {
        VipCustomer tim = new VipCustomer();
        VipCustomer radhika = new VipCustomer("radhika", 8000);
        VipCustomer tester = new VipCustomer("tester", 100, "abc@email.com");

        System.out.println("name = " + tim.getName());
        System.out.println("email = "+ tim.getEmailAddress());
        System.out.println("name = " + radhika.getName());
        System.out.println("email = " + radhika.getEmailAddress());
        System.out.println("credit limit = "+ radhika.getCreditLimit());
        System.out.println("email = " + tester.getEmailAddress());
    }
}
