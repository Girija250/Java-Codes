
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        set.remove(20);
        System.out.println("After removing :  " +set);
        System.out.println("Is 10 present? " +set.contains(10));
    }
    
}
