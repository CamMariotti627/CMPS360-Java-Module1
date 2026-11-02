/*
Class assignment version of StudentGradeCalculator.java

public class StudentGradeCalculator {             // declares class
    public static void main(String[] args) {
        String studentName = "Cam Mariotti";      //declares string for student name
        String major = "Computer Science";        //declares string for student major
        String course = "CMPS 360";               //declares string for course name
        
        double grade1 = 97;  //
        double grade2 = 99;  //declares grades-can be changed to dif variables to test
        double grade3 = 92;  //
        double average = (grade1 + grade2 + grade3) / 3;
             // calculates average of the 3 available grades. See loop example below for more efficient code that updates with the addition of new grades. 

        System.out.println("Student: " + studentName); // prints student name
        System.out.println("Major: " + major);         // prints student major
        System.out.println("Course: " + course);       // prints student course
        System.out.println("Average: " + average);     // prints simple average



        if (average >= 70) {
            System.out.println("Status: Passed"); 
        } else {
            System.out.println("Status: Failed"); 

            // if else statement is setup to print "Status: Passed" if the grade is above 70, and "Status: Failed" if grade is below 70. 
        }
    }
}
*/


//Upgraded Loop example below allows for addition of new grades, and automatically updates the average with every new addition when ran, more efficient.

public class StudentGradeCalculator {
    public static void main(String[] args) {
        String studentName = "Cam Mariotti"; 
        String major = "Computer Science";
        String course = "CMPS 360";
        
        double[] grades = {99, 100, 92, 95, 97, 99};          // adds grades in an array to be updated with new grades as needed.
        double sum = 0;                                       // declares and assigns 0 to variable sum for loop to use.
        for ( int i = 0; i < grades.length; i++) {            // For Loop (for every grade) runs through all grades and adds them then assigns to sum variable.
            sum += grades[i]; 
            }
            double average = sum / grades.length;             // takes sum of all grades and devides by number of grades in array to find average. 

            System.out.println("Student: " + studentName);    // prints student name
            System.out.println("Major: " + major);            // prints student major
            System.out.println("Course: " + course);          // prints student course
            System.out.println("Average: " + average);        // prints simple average
            if (average >= 70) {
                System.out.println("Status: Passed");         //
            } else {                                          //  If else statement sets condition for passing/failing then prints based on average.
                System.out.println("Status: Failed");         //
        }
    }
}
