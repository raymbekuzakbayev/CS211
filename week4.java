public class Main {

    public static void main(String[] args) {
        UserRole role = UserRole.MODERATOR;
        System.out.println(role.getAccessLevel());
    }
    public static String removeDuplicates(String input) {
        String new_text = "";
        for (char ch: new_text.toCharArray()){
            if (new_text.indexOf(ch)==-1){
                new_text+=ch;
            }
        }
        return new_text;
    }
}
public enum UserRole {
    ADMIN(1),
    MODERATOR(2),
    USER(3);
    private int value;
    UserRole(int value) {
        this.value = value;
    }
    public int getAccessLevel() {
        return this.value;
    }
}

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
    public class Customer {
    private String name;
    private BankAccount bankAccount;

    public Customer(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }
    public BankAccount getBankAccount() {
        return bankAccount;
    }
}

public class ATM {
    public Customer currentCustomer;
    ATM(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }
    private Customer currentCustomer;
    public String accountNumber;
    public void login(String accountNumber) {
        if (currentCustomer.getBankAccount().getAccountNumber().equals(accountNumber)) {}
        System.out.println(currentCustomer.getBankAccount().getAccountNumber());
    } else {
        System.out.println(currentCustomer.getBankAccount().getAccountNumber());
    }
    public void logout() {
        this.accountNumber = null;
    }
    public void deposit(double amount) {
        currentCustomer.getBankAccount().deposit(amount);
    }
    public void withdraw(double amount) {
        currentCustomer.getBankAccount().withdraw(amount);
    }

    public double checkBalance() {
        BankAccount AccNum = this.currentCustomer.getBankAccount();
        return AccNum.getBalance();
    }
}

public main void