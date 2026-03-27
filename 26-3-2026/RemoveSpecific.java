import java.util.List;
import java.util.ArrayList;

public class RemoveSpecific {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");

        animals.remove("Cheetah");

        System.out.println(animals);
    }

    
}
