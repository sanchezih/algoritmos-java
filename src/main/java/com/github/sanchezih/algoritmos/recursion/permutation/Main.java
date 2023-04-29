package com.github.sanchezih.algoritmos.recursion.permutation;

public class Main {
	public static void main(String[] argv) {

		Integer[] elements = { 1, 2, 3, 4 };

		System.out.println("Rec:");
		Permutation.printAllRecursive(elements, ';');

		System.out.println("Iter:");
		Permutation.printAllIterative(elements.length, elements, ';');

		System.out.println("Orderes:");
		Permutation.printAllOrdered(elements, ';');

		System.out.println("Random:");
		Permutation.printRandom(elements, ';');

		System.out.println("Random:");
		Permutation.printRandom(elements, ';');
	}
}
