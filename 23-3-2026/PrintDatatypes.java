class PrintData{
    int display(int a){
        return a;
    }
    String display(String b){
        return b;
    }
    double display(double c){
        return c;
    }
}

public class PrintDatatypes {
    public static void main(String[] args) {
        PrintData p = new PrintData();
        System.out.println(p.display(5));
        System.out.println(p.display("Apple"));
        System.out.println(p.display(5.8976));
    }
    
}
