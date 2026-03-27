import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {
        ArrayList<String> shopping = new ArrayList<>();

        shopping.add("Soap");
        shopping.add("Apple");
        shopping.add("Carrot");
        shopping.add("Rice");

        System.out.println("Needed :" + shopping);

        shopping.remove(1);
        System.out.println("Balance : " + shopping);
    }
    
}
