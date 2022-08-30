import java.util.Arrays;
import java.util.Scanner;

/*
 * Assigment 1 game
 * 08/30/2022
 * 
 */
public class Day3Notes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Arrays in Java

        int[] grades;
        grades = new int[10];

        // default value of an int is zero

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + grades[i]);
        }
        System.out.println(grades.length);
        for (int i = 0; i < grades.length; i++) {
            System.out.println(i + ":" + grades[i]);
        }

        // Size of the array

        System.out.println("What size for the array?");
        int size = scan.nextInt();
        grades = new int[size];
        // [0 -1]
        // How many numbers on that range
        // creating random numbers
        
        
        //sum numbers in the array
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        System.out.println(sum);




        //randon number for all array
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * 6 + 1);
            System.out.println(i + ":" + grades[i]);
        }


        //Sort Arrays

        Arrays.sort(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.println(i + ":" + grades[i]);
        }



        // swapping values
        Arrays.sort(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.println(i + ":" + grades[i]);
        }

      //Swap algothirn 
      int temp = grades[0];
        int last = grades.length-1;
        grades[0] = grades[last];

        grades[last] = temp;
    }

}
