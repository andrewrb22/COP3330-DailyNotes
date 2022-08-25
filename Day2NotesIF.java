import java.util.Scanner;

public class Day2NotesIF {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("what grade do you have in this class??");
        int grade = scan.nextInt();

        if (grade >= 90){
            System.out.println("A");
        }else if (grade <= 89 && grade >= 80){
            System.out.println("B");
        }else{
            System.out.println("C");
        }


    }
}
