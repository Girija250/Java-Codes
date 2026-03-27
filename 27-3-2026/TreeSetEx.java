import java.util.*;
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(25);
        set.add(28);
        set.add(14);
        set.add(50);
        set.add(18);

        System.out.println("Tree set = " +set);
        System.out.println("Contains 10? " + set.contains(10));
        set.remove(28);
        System.out.println("After removing : " + set);
        System.out.println("First element = " + set.first());
        System.out.println("Last element = " + set.last());
        System.out.println("Higher element than 15 = " + set.higher(15));
        System.out.println("Lower element than 15 = " + set.lower(15));
        System.out.println("Ceiling of 14 = " + set.ceiling(14));
        System.out.println("Floor of 14 = " + set.floor(14));
        System.out.println("Poll Last = " +set.pollLast());
        System.out.println("Poll First = " +set.pollFirst());
        System.out.println("After polling = " + set);
        System.out.println("Set Size = " +set.size());
        System.out.println("Is the set empty ? " + set.isEmpty());
        set.clear();
        System.out.println("After clearing = " + set);
        System.out.println("Is the set empty ? " + set.isEmpty());

    }
    
}
