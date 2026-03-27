public class DiffOfDiagonals {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int psum=0;
        int ssum=0;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            psum += arr[i][i];
        }
        for (int j = 0; j <n; j++){
            ssum += arr[j][n - 1- j];
        }
        System.out.println("Difference = "+(psum-ssum));
    }
    
}
