public class MatMul {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{1,2,3}};
        int arr2[][] = {{1,2,3},{4,5,6},{1,2,3}};
        int result[][] = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}