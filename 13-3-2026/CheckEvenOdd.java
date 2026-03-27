public class CheckEvenOdd {
    public static void main(String[] args) {
        int arr[][]= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        int ecount =0;
        int ocount=0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){

                if(arr[i][j] % 2 ==0){
                    ecount+=1;
                } else{
                    ocount+=1;
                }
            }
        }
        System.out.println("Number of Even numbers = " + ecount);
        System.out.println("Number of odd numbers = " + ocount);
    }    
}
