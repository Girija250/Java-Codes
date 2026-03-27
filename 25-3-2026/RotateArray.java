import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        result[0] = arr[0];

        int len = n - 1;   
        k = k % len;

        for (int i = 1; i < n; i++) {
            int newPos = ((i - 1 + k) % len) + 1;
            result[newPos] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}