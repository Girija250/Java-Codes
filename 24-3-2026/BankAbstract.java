abstract class Bank{
    abstract void getInterestRate();

    void display(){
        System.out.println("Welcome !!!");
    }
}
class sbi extends Bank{
    void getInterestRate(){
        System.out.println("Interest Rate of SBI is 10000");
    }
}
class hdfc extends Bank{
    void getInterestRate(){
        System.out.println("Interest Rate of hdfc is 2000");
    }
}
public class BankAbstract {
    public static void main(String[] args) {
        Bank b;
        b = new sbi();
        b.display();
        b.getInterestRate();

        b = new hdfc();
        b.getInterestRate();
    }
    
}
