import java.util.Scanner;
public class input_and_output
{
    public static void main (String args[])
    {
        Scanner get_input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = get_input.nextLine();
        System.out.print("Enter your Marks: ");
        int marks = get_input.nextInt();
        System.out.print("Enter your Blood Group: ");
        char blood_group = get_input.next().charAt(0);
        get_input.nextLine();
        System.out.print("Enter your height: ");
        double height = get_input.nextDouble();
        System.out.print("Enter your weight: ");
        float weight = get_input.nextFloat();
        double pi = 3.14;
        System.out.println("Your name is: "+name);
        System.out.println("Your Marks are: "+marks);   
        System.out.println("Your Blood Group is: "+blood_group);
        System.out.println("Your height is: "+height);
        System.out.println("Your weight is: "+weight);
    }
}