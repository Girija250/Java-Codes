import java.util.*;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);//duplicate removed automatically

        System.out.println("After add() = " +set);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(40);
        set2.add(50);
        set.addAll(set2);
        System.out.println("After addAll() = " +set);
        System.out.println("Contains 20 ? " + set.contains(20));
        System.out.println("Size = " +set.size());
        System.out.println("Is Empty ? " + set.isEmpty());
        set.remove(30);
        System.out.println("After removing 30 = " +set);
        set.removeAll(set2);
        System.out.println("After removing elements of set 2 = " +set);
        System.out.println("Using Iterator : ");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println();
        System.out.println("Using forEach : ");
        set.forEach(n -> System.out.print(n + " "));
        System.out.println();
        set.clear();
        System.out.println("After clear : " + set);
        System.out.println("Is empty after clear ? " +set.isEmpty());
 




    }
    
}
