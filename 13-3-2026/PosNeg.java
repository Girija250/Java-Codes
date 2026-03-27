public class PosNeg {
    public static void main(String[] args) {
        int arr[][]= {{1, 2, -3},{4, -5, 6},{7, -8, -9}};
        
        int pcount =0;
        int ncount=0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){

                if(arr[i][j] >=0){
                    pcount+=1;
                } else{
                    ncount+=1;
                }
            }
        }
        System.out.println("Number of positive numbers = " + pcount);
        System.out.println("Number of negative numbers = " + ncount);
    }    
}
