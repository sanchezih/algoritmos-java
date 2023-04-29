package com.github.sanchezih.algoritmos.recursion.factorial.ejemplo2;
//Java Program to Find Factorial of a Number
//where N>=0 is currently N=1

//Importing input output classes
import java.io.*;
//Importing utility classes
import java.util.*;

//Main class
public class GFG {

 // Method 1
 // To calculate factorial
 public static int factorial(int n)
 {

     // Handling base case
     // If value of n=1 or n=0 we return 1
     if (n == 0 || n == 1)
         return 1;

     // Generic case computation math
     // Otherwise we do n*(n-1)!
     return n * factorial(n - 1);
 }


}