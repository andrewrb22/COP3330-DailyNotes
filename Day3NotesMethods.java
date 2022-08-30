import java.util.Scanner;

public class Day3NotesMethods {
    //New Method

    public static void printGrades(double[] g) {
        for (int i = 0; i < g.length; i++) {
            System.out.printf(" %.1f \n", g[i]);
        }


    }

    public static void swap(double[] g, int p1, int p2) {
        double temp = g[p1];
        g[p1]= g[p2];
        g[p2]= temp;
    }

    public static void main(String[] args) {
       
        
        
        Scanner scan = new Scanner(System.in);

        System.out.println("How many grades would you like to make");
         int num = scan.nextInt();
         double[] grades = new double[num];

         for (int i = 0; i < grades.length; i++) {
            grades[i]= Math.random()*51+50;

         }

         printGrades(grades);
         swap(grades, 1, 2);
         printGrades(grades);

        scan.close();


    }
}
