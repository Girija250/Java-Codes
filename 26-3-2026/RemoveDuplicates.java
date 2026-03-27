import java.util.ArrayList;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("ArrayList after removing duplicates:");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
    }
}