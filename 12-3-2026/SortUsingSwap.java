import java.util.Arrays;
public class SortUsingSwap {
    public static void main(String[] args){
        int arr[] = { 8, 4, 6, 2, 3};
        for(int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++ ){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println("Final sorted array : " + Arrays.toString(arr));

    }
}
