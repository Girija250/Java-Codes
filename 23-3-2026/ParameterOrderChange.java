class Example{
    void display(int a, String b){
        System.out.println("int, String");
    }
    void display(String a, int b){
        System.out.println("String, int");
    };
}

public class ParameterOrderChange {
    public static void main(String[] args) {
        Example e = new Example();
        e.display(4, "Welcome");
        e.display("Hello", 6);
    }
    
}
