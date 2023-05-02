package com.github.sanchezih.algoritmos._03_recursion._01_factorial;

public class Main {

	public static void main(String[] args) {

		int NUMERO = 7;

		// Calling method 1 to compute factorial and storing the result into a variable
		Integer ans = Factorial.factorial(NUMERO);

		// Print and display the factorial of number customly passed as an argument
		System.out.println("Factorial of " + NUMERO + " is : " + ans);

	}

}
