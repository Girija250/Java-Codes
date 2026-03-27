class MathOperations{
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class MethodOverloadPoly {
    public static void main(String[] args){
        MathOperations m = new MathOperations();
        System.out.println(m.add(5,5));
        System.out.println(m.add(3.2, 5.2));
    }
    
}
