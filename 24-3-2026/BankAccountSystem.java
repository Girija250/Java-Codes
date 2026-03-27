import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public void createAccount(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        acc.createAccount(accNo, name, initialBalance);
        
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);

        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);

        acc.display();

        sc.close();
    }
}