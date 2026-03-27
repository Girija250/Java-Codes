public class ArrayIndexOutOFRangeExample {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        }
    }
}