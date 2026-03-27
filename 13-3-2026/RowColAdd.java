public class RowColAdd {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{1,2,3}};

        System.out.println("Row-wise sum:");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row = " + sum);
        }

        System.out.println("Column-wise sum:");
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Column = " + sum);
        }
    }
}