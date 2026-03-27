import java.util.List;
import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("One");
        names.add("two");

        boolean check = names.contains("One");
        System.out.println(check);
    }
    
}
