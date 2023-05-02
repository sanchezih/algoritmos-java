package com.github.sanchezih.algoritmos._03_recursion._01_factorial;

public class Factorial {

	public static Integer factorial(int n) {

		if (n == 0 || n == 1) // 0! = 1 or 1! = 1 is 1
			return 1;

		return n * factorial(n - 1); // Otherwise we do n*(n-1)!
	}

}