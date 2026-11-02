# CMPS360 Java Module 1

## Assignment 1: Student Grade Calculator

### How to run

```
cd Assignment1
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

Or compile and run in one step: `java StudentGradeCalculator.java`

### Versions
File contains 2 versions of assignment:
1. **Class Assignment Version** (3 grade variables) as required by assignment, commented at top of file. 
2. **Improved Loop Version** (active) Stores grades in an array and loops through for ease of including new grades, uses additional grades to demonstrate.

To switch to class assignment version:

1. Delete `/*` at the very top of the file, and `*/` after the first version's closing braces.
2. Add `/*` on line before the second `public class StudentGradeCalculator` and `*/` after the last closing brace at the end of the file. 

only one version can be active at a time, if both are uncommented, the file will not compile.  If both are commented, there is nothing to run. 

### Test Results

Class assignment version:

```
Fail: (values 10, 10, 10)
PS C:\CMPS360-Java-Module1\Assignment1> java StudentGradeCalculator.java
Student: Cam Mariotti
Major: Computer Science
Course: CMPS 360           
Average: 10.0
Status: Failed
```
```
Pass: (values 97, 99, 92)
PS C:\CMPS360-Java-Module1\Assignment1> java StudentGradeCalculator.java
Student: Cam Mariotti
Major: Computer Science
Course: CMPS 360            
Average: 96.0
Status: Passed
```

Improved Loop version:

```
Pass: (values 85, 92, 88, 99, 100, 82)
PS C:\CMPS360-Java-Module1\Assignment1> java StudentGradeCalculator.java
Student: Cam Mariotti
Major: Computer Science
Course: CMPS 360           
Average: 91.0
Status: Passed
```
```
Fail: (values 46, 28, 63, 75, 67, 52)
PS C:\CMPS360-Java-Module1\Assignment1> java StudentGradeCalculator.java
Student: Cam Mariotti
Major: Computer Science
Course: CMPS 360            
Average: 55.166666666666664                   
Status: Failed
```


### Final Reflection
I used this opportunity to refresh on a number of coding aspects that I had felt shaky on up to this point, and applied problem solving & critical analysis to the grade assignment to improve the program we wrote in class and make it more usable in future cases.  I have been seeking to gain a stronger understanding of the effective application of logic in progamming to critically analyze, assess, and solve problems.  Java has been interesting to learn.  It seems clear that the basic syntax is pretty similar to other languages like JavaScript, and a lesser overlap with the syntax and functionality of SQL.  I struggled initially with the concepts of compiling, and conflated the functinality of a JVM, and a VM like we've used in previous classes to create databases that caused some confusion at the start.  I'm really excited to see what else this language is capable of, and took the time to make a study guide for quick reference.  Refreshers on the anatomy of different types of statements & commands has really helped to restore my confidence in my ability to code.  