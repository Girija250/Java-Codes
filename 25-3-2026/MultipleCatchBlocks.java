public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a / b;   

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);   
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: Invalid array index.");
        }
    }
}