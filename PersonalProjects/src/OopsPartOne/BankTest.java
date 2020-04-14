package OopsPartOne;

public class BankTest {
    public static void main(String[] args) {
        //BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount = new BankAccount(11211, 0, "adam smith", "abc@email.com", "9090980980");
        BankAccount tim = new BankAccount("tim", "tim@email.com", "9090980980");
        System.out.println("Account Number = " + tim.getAccountNumber());
        System.out.println("Balance = "+ tim.getBalance());
        System.out.println("Customer Name = " + bankAccount.getCustomerName());
        System.out.println("Email = " + bankAccount.getEmailAddress());
        System.out.println("Phone Number = " + bankAccount.getPhoneNumber());
        System.out.println("deposit = "+ bankAccount.getDeposit(90));
        System.out.println("new balance = "+ bankAccount.getWithdrawal(200));
    }
}
