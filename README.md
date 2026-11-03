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

### Java source code vs Bytecode 
Source code is the highest level human readable code.  It's written by programmers using programming languages like java, c++, and python.  It's designed to be easily edited and understood by humans, and is translated into a bytecode to be read by the computer.  Bytecode is a lower level intermediate representation of the source code.  It's generated after the source code is compiled by a virtual machine like JVM and Python Interpreter and is not readable by humans.  



## Assignment 2: Inventory Application

### Files

- `Product.java`: the `Product` class, with private attributes (name, price, quantity), a constructor, `calculateInventoryValue()`, and getters.
- `InventoryApp.java`: creates three `Product` objects, prints each product's details and inventory value to the console, and shows the same summary in a `JOptionPane` dialog. 

### How to run

```
cd Assignment2
javac Product.java InventoryApp.java
java InventoryApp
```

### Output

Console:

```
12 in Print: 4 x $20.00 = $80.00
18 in Print: 3 x $30.00 = $90.00
32 in Print: 2 x $45.00 = $90.00
Total Inventory Value: $260.00
```

A dialog box opens showing the same four lines.



### Reflection: How do Classes, Objects, Attributes, and Methods all work together in this application? 

InventoryApp is a class that creates objects from the product class using new. The objects product1, product2, product3, and their attributes name, price, and quantity are private classes so InventoryApp can't interact with their attributes directly.  To do so it calls a method, which is a getter program to read the data, and use calculateInventoryValue() to calculate & return the result, which is printed in the terminal and shown in the dialog box. InventoryApp is also started by the method main().