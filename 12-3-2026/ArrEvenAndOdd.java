import java.util.Scanner;
public class ArrEvenAndOdd{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("even numbers are :");
        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("odd numbers are :");
        for(int i=0;i<5;i++){
            if(arr[i]%2!=0){ 
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
