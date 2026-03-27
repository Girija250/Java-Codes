import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};

        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);   // duplicate values will be ignored
        }

        System.out.println("Unique elements are:");
        for (int value : uniqueSet) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Total number of unique elements: " + uniqueSet.size());
    }
}