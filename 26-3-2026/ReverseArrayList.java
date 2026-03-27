
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);

        Collections.reverse(numbers);        
        System.out.println(numbers + " ");
    }
    
}
