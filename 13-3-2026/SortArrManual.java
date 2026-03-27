import java.util.Arrays;

public class SortArrManual {
    public static void main(String[] args) {
        int[] arr = {2,6,1,8,3,5};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Final Sorted Array: " + Arrays.toString(arr));
    }
    
}
