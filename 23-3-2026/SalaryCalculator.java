class Salary{
    int view(int a){
        return a;
    }
    int view(int a, int b){
        return a+b;
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Salary s = new Salary();
        System.out.println("Salary is = " +s.view(100000));
        System.out.println("Salary with bomus is = " +s.view(100000, 50000));
    }
    
}
