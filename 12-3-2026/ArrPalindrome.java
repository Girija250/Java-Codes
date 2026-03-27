public class ArrPalindrome{
    public static void main(String[] args){
        
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        boolean ispolindrome=true;
        while(start<end){
            if(arr[start]!=arr[end]){
                ispolindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(ispolindrome){
            System.out.println("the array is palindrome" );
        }else{
            System.out.println("the array is not a palindrome");
        }
    }
}