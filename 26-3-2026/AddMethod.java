import java.util.ArrayList;
import java.util.*;
public class AddMethod {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Elements in Array List are : ");
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i)+ " ");
        }
    }
}
