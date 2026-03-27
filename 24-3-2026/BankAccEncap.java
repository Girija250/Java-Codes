class BankAccount{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class BankAccEncap {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(5000);
        b.withdraw(2000);

        System.out.println("Balance : " + b.getBalance());
    }
    
}
