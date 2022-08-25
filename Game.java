import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hiddenNumber = 9000;
        int choice = 0;

        while (choice != 3) {
            System.out.println("Game Menu");
            System.out.println("1. High low game");
            System.out.println("2. TBA");
            System.out.println("3. Exit");
            System.out.println("Select your option");
            choice = scan.nextInt();

            if (choice == 1) {
                int guess = 0;
                while (guess != hiddenNumber) {
                    System.out.println("Guess a number");
                    guess = scan.nextInt();

                    if (guess < hiddenNumber) {
                        System.out.println("To Low");
                    } else if (guess > hiddenNumber) {
                        System.out.println("To High");
                    } else {
                        System.out.println("You got it!");
                    }
                }
            }

        }

    }
}
