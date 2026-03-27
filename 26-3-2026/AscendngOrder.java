
import java.util.ArrayList;
import java.util.Collections;

public class AscendngOrder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);

        Collections.sort(numbers);

        System.out.println("ArrayList after Sorting in ascending order : ");
        
        System.out.println(numbers + " ");
    }
    
}
