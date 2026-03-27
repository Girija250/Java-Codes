import java.util.*;
public class AddElementHash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);  
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(20);
        set.add(19);

        System.out.println("Set elements = " +set);
    }
    
}
