import java.util.Scanner;
public class calciswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /)");
        char op = sc.next().charAt(0);

        int result;

        switch(op){
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2!=0){
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error !! Division by zero is invalid");
                }
                break;
            default:
                System.out.println("Invalid Operation!!");
        }
        sc.close();

    }
}