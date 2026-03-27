import java.util.*;
public class SweetServing {
    public static void main(String[] args) {
        int n = 5;   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sweets: ");
        int sweets = scanner.nextInt();
        int current = 0; 
        for (int i = 1; i <= sweets; i++) {
            System.out.println("Sweet " + i + " goes to person " + (current + 1));
            current = (current + 2) % n;
        }
    }
}
