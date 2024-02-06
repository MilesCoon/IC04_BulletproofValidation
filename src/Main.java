import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int rating = 0, min = 1, max = 5;
        Scanner keyboard = new Scanner(System.in);
        boolean error;

        do {
            try {
                System.out.print("Please enter a rating between " + min + " and " + max + ": ");
                rating = keyboard.nextInt();

                // Check to make sure rating is between 1 and 5
                error = (rating < min || rating > max);
            }
            // Catch block
            catch (InputMismatchException e) {
                error = true;
                keyboard.nextLine();
            }
            if (error) {
                System.err.println("Error: Please enter a rating between " + min + " and " + max);
                Thread.sleep(100);
            }
        } while(error);

        // Only print when you don't have an error
        System.out.println("\nThe rating you entered is: " + rating);
        keyboard.close();
    }

}