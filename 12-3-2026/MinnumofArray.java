//import java.util.Scanner;
public class MinnumofArray {
    public static void main(String[] args) {
        int[] arr = {10, 23, 6, 2, 1};
        //Scanner sc = new Scanner(System.in);
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            System.out.println("arr["+i+"]  "+"min = "+min);
        }

        System.out.println("Minimum number = " + min);
    }
}