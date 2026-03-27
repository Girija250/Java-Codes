public class MatAdd {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{1,2,3}};
        int arr2[][] = {{1,2,3},{4,5,6},{1,2,3}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}