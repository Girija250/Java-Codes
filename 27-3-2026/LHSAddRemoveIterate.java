import java.util.*;
public class LHSAddRemoveIterate {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(24);
        set.add(19);
        System.out.println("Set = " +set);
        set.remove(20);
        System.out.println("Set elements after removing : " +set);
        System.out.println("using Iterator :");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+ " ");
        }
        System.out.println();
    }
    
}
