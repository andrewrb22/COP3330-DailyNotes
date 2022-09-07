import java.util.jar.Attributes.Name;

import javax.management.loading.PrivateClassLoader;

public class Day4Notes_Students {

    /*
     * Name -I
     * GPA
     * Class Rank
     * Total students in class
     */

/*******************************************
 * Static Variables
 ******************************************/
private static int totalStudents = 0;


/*******************************************
 * Instance Variables
 ******************************************/
private String name;
private double gpa;
private int rank;


/*******************************************
 * Constructors
 * must share same name as the class
 * they do not define a retinr type(this includes void)
 * Must be public 
 ******************************************/

public Student(String n){

    this.name = n;
    this.gpa = 0.0;
    this.rank = totalStudents + 1;
    totalStudents++;

}



 /*******************************************
 * Static Methods
 ******************************************/

 public static int getNumStudent(){

    return totalStudents;
 }

 /*******************************************
 * Instance Methods
 ******************************************/
public String getName(){

    return this.name;
}

public void updateGpa(double gpa){
    this.gpa = gpa;
}


public double getGPA(){

    return this.gpa;
}
}