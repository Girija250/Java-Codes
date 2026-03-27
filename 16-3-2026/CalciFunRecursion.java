import java.util.Scanner;

public class CalciFunRecursion {
    public static void main(Scanner sc) {
        System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
        int choice = sc.nextInt();
        if (choice == 5) {
            System.out.println("Exit");
            return;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b)); 
                break;
            case 2: 
                System.out.println("Result = " + (a - b));
                break;
            case 3: 
                System.out.println("Result = " + (a * b)); 
                break;
            case 4: 
                System.out.println("Result = " + (a / b)); 
                break;
            default: 
                System.out.println("Invalid");
        }

         main(sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main(sc);
    }
}

