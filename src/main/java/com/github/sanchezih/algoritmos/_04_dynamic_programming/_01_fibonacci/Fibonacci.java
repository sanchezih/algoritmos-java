package com.github.sanchezih.algoritmos._04_dynamic_programming._01_fibonacci;

public class Fibonacci {

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int getFibonacciNumberAt(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return getFibonacciNumberAt(n - 1) + getFibonacciNumberAt(n - 2);
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int getFibonacci(int n) {
		if (n <= 1)
			return n;
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}
}
