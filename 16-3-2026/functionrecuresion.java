import java.util.Random;
import java.util.Scanner;
public class functionrecuresion{
    static void guess(int number) 
    {
        Scanner get_data = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = get_data.nextInt();
        if (guess == number) 
        {
            System.out.println("Congratulations! You guessed the number🎉.");
        } 
        else if (guess < number) 
        {
            System.out.println("Too low! Try again🔺.");
            guess(number); // Recursive call
        } 
        else 
        {
            System.out.println("Too high! Try again🔻.");
            guess(number); // Recursive call
        }
         get_data.close();
    }
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int num=rand.nextInt(100)+1;
        guess(num);

    }
}