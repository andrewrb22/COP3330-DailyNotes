import java.util.Scanner;

public class Day2Notes {
    
 public static void main(String[] args) {
    
    //WORKING ON INPUTS
    //Create a scanner so we can accept text input;
    int happy;
    Scanner scan = new Scanner(System.in);
System.out.println("How many pizza do you need?");
    int pizza = scan.nextInt();
    System.out.print("\nthere are " + (pizza * 8) + " Slices in your order");
    System.out.print("\nthere are " + pizza + 8 + " Slices in your order");



    //Closes the scanner
    scan.close();


}


}
