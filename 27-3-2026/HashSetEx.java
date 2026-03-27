import java.util.*;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();

        set1.add("Apple");
        set1.add("Orange");
        set1.add("Mango");
        set1.add("Pear");

        System.out.println(set1);

        System.out.println("Cheking value is present or not");
        if(set1.contains("Apple")){
            System.out.println("Apple is present");
        }
        if(!set1.contains("Pomogranate")){
            System.out.println("Pomogranate is not present");
        }

        System.out.println("Set size = " + set1.size());

        System.out.println("Set elements = " + set1);

        set1.remove("Apple");
        System.out.println("Set elements after removing Apple = " + set1 );

        set1.clear();
        System.out.println("Set elements after clearing : " + set1);
    }
}
