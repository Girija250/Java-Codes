public class moveZerolast{
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }

        System.out.println("Array after moving zeroes to last:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}