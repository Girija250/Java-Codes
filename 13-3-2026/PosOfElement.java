public class PosOfElement {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int key = 5;
        boolean found = false;
         
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){

                if(arr[i][j] == key){
                    System.out.println("Element found at position : "+ i + "," + j);
                    found = true;
                }
            }
        }
        if(found == false){
            System.out.println("Element not found");
        }
    }
    
}
