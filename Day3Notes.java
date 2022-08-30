/*
 * Assigment 1 game
 * 08/30/2022
 * 
 */
public class Day3Notes {
    public static void main(String[] args) {
    
       // Arrays in Java
    
       int [] grades;
       grades = new int[50];

       //default value of an int is zero

       for (int i = 0; i<10; i++) {
        System.out.println( i + ":" + grades[i]);
       }
       System.out.println(grades.length);
       for (int i = 0; i<grades.length; i++) {
        System.out.println( i + ":" + grades[i]);
       }
    }
    
}
