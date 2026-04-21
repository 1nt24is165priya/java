### Subarrays in Java

This repository contains a simple Java program that demonstrates how to generate all possible subarrays of a given array, calculate their sums, and determine the maximum and minimum subarray sums.

#  Features
- Prints all subarrays of an array
- Calculates the sum of each subarray
- Tracks and displays:
  - Total number of subarrays
  - Maximum subarray sum
  - Minimum subarray sum

# Code Examplejava
int numbers[] = {2, 4, 7, 9, 6};
Subarrays(numbers);
2  -> Sum = 2
2 4  -> Sum = 6
2 4 7  -> Sum = 13
... ...

Total Subarrays = 15
Maximum Subarray Sum = 28
Minimum Subarray Sum = 2


### Half Pyramid in Java

This project demonstrates how to print a **Half Pyramid** pattern using Java.  
The program takes an integer `n` as input and prints a pyramid of numbers with `n` rows.

---

## Problem Statement
Write a Java program that prints a half pyramid of numbers.  
For example, if `n = 5`, the output should be:


---

## Code Explanation
- The program uses a `Scanner` to read input from the user.
- Outer loop (`line`) controls the number of rows.
- Inner loop (`i`) prints numbers from `1` up to the current row number.
- After each row, `System.out.println()` moves to the next line.


## Output 
for n=4
1
12
123
1234

### Hallow Rectangle

This repository contains a simple Java program to print a **hollow rectangle pattern** using nested loops.  
It demonstrates conditional logic (`if-else`) and loop control structures (`for` loops).

---

## Program Overview
The program defines a method `Hallow_Rectangle(int totalrows, int totalcol)` that prints a rectangle of `*` characters with a hollow center.

- Border rows and columns are filled with `*`
- Inner cells are left blank (`space`)
- Example dimensions: 8 rows × 5 columns

## Output
for n = 8
*****
*   *
*   *
*   *
*   *
*   *
*   *
*****





# Decimal ↔ Binary Converter

## Overview
A simple Java program to:
- Convert a decimal number to binary  
- Convert a binary number to decimal  

## How to Run
```bash
javac DecToBin.java
java DecToBin


## Example
Enter the Decimal number:
10
Binary number is : 1010

Enter the binary number:
1010
Decimal number is : 10

## Features
- Two-way conversion (Decimal ↔ Binary)  
- Beginner-friendly logic using loops and `Math.pow()`  
- Interactive input with `Scanner`  




