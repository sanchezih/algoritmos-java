package com.github.sanchezih.algoritmos.recursion.factorial.ejemplo1;

/**
 * https://www.geeksforgeeks.org/java-program-to-find-factorial-of-a-number-recursively/
 * 
 * @author ihsanch
 *
 */
public class GFG {

	public static int factorial(int n) {

		// Handling base case
		// If value of n=1 or n=0, it returns 1
		if (n == 0 || n == 1)
			return 1;

		// Generic case
		// Otherwise we do n*(n-1)!
		return n * factorial(n - 1);
	}

}