class Area{
    int area(int a){
        return a*a;
    }
    int area (int h, int b){
        return h*b;
    }
    double area (double r){
        return 3.1416*r*r;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.area(5));
        System.out.println(a.area(2,5));
        System.out.println(a.area(5.5));
    }
    
}
