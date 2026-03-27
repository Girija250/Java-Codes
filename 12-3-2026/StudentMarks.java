import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int[] marks = new int[5];
         int choice;

         System.out.println("**STUDENT MARKS MANAGEMENT**");
         System.out.println("1. Enter Marks of 5 subjects of a Student");
         System.out.println("2. Display the Entered marks");
         System.out.println("3. Calculate Total marks");
         System.out.println("4. Calculate Average of marks");
         System.out.println("5. Find Highest Mark");
         System.out.println("6. Exit Program");
         System.out.println("Enter your choice : ");
         choice = sc.nextInt();

         switch (choice) {
            case 1:
                System.out.println("Enter marks:");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.print("Student " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }
                break;
            case 2:
                System.out.println("Entered marks are :");
                for (int i = 0; i < marks.length; i++) {
                        System.out.println("Student " + (i + 1) + ": " + marks[i]);
                    }
                break;
            case 3:
                int total = 0;
                        for (int i = 0; i < marks.length; i++) {
                            total = total + marks[i];
                        }
                        System.out.println("Total marks = " + total);
                break;
            case 4:
                int tot = 0;
                double average;
                        for (int i = 0; i < marks.length; i++) {
                            tot = tot + marks[i];
                        }
                        average = (double) tot / marks.length;
                        System.out.println("Average marks = " + average);
                break;
            case 5:
                int max = marks[0];
                        for (int i = 1; i < marks.length; i++) {
                            if (marks[i] > max) {
                                max = marks[i];
                            }
                        }
                        System.out.println("Highest mark = " + max);
                break;
            case 6:
                System.out.println("Exiting program...");
                sc.close();
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
         }
    }
    
}
