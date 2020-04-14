package OopsPartOne;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount(){
        this(2121221, 12345, "jim smith", "test@email.com", "2122222121");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String emailAddress, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber) {
        this(9999, 100.00, "tim", "tim@email.com", "12312");
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public double getBalance(){
        return balance;
    }
    public double getDeposit(double deposit) {
        return getBalance()+deposit;
    }
    public double getWithdrawal(double withDraw){
        if((getBalance() - withDraw) < 0){
            System.out.println("Withdrawal not processed");
            return getBalance() - withDraw;
        }
        else {
            return getBalance() - withDraw;
        }
    }
}
