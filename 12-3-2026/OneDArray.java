import java.util.Scanner;
public class OneDArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[2];
        System.out.println( "Enter elements: ");
        for(int i=0; i<2; i++) {
            
                arr[i] = sc.nextInt();
            }
        
        System.out.println("Array elements: ");
        for(int i=0; i<2; i++) {
        
                System.out.println(arr[i] + " ");
            }
            sc.close();
        }
    }