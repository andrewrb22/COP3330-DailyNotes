import java.util.Scanner;

public class Day2NotesLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice = 0;
        // while loops run 0 or more times

        while (choice != 10) {
            System.out.println("Pick a Number");
            choice = scan.nextInt();
        }

        // Do while loops run 1 or more times
        int age;
        do {
            System.out.println("whats your age??");
            age = scan.nextInt();

        } while (age >= 13);

        //for loops run a fixed number of times
        for (int i = 0; i < args.length; i++) {
            
        }

        scan.close();

    }
}
