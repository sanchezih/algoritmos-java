package com.github.sanchezih.algoritmos._04_dynamic_programming.fibonacci;

public class Main {
	public static void main(String[] args) {

		System.out.println(Fibonacci.getFibonacciNumberAt(6));

		////////////////////////////////////////////////////////////////////////

		int maxCount = 49;
		System.out.println("Inicio: " + java.time.LocalTime.now());

		for (int i = 0; i <= maxCount; i++) {
			int fibonacciNumber = Fibonacci.getFibonacci(i);
			System.out.println("Number at " + i + ": " + fibonacciNumber + " - " + java.time.LocalTime.now());
		}
		System.out.println("Fin: " + java.time.LocalTime.now());
	}
}
