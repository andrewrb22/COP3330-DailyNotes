/**Septiembre 06,2022
 * 
 * 
 * 
 */

public class Day4Notes {

    public static void update_grades(int[]g) {

        for (int i = 0; i < g.length; i++) {
        
            g[i] = (int)(Math.random()*5);
    
        }
        
    }
    public static void main(String[] args) {
    int []grades;
    grades = new int[2];
    
    Student stud1 = new Student("Kyle") ;
    Student stud2 = new Student("Andrew");

    System.out.println("Students:" + Student.getNumStudent());
    System.out.println(stud1.getName());

    update_grades(grades);

    for (int i = 0; i < grades.length; i++) {
        System.out.println("grade" + (i+1) + ":" + grades[i]);
        
    }

// find the notes for this day and review how to get the average , public methods

// for each element in g, store it as score and run the code block
// public static void average(int[]g) {
//     int sum = 0;

//     for (int score : g) {
//         sum+=score;
         
// }

// }


    }
    
}
