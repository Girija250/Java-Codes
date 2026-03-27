import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        String subjects[] = {"Maths","Science","English","Tamil","Social Science"};
        Scanner get_data=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter marks for "+subjects[i]+": ");
            arr[i] = get_data.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(subjects[i]+": ");
            System.out.print(arr[i]+" ");
        }

    }
}