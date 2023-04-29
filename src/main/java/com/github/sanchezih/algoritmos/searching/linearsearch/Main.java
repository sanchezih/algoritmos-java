package com.github.sanchezih.algoritmos.searching.linearsearch;

public class Main {

	static int array[] = { 5, 15, 6, 9, 4 };

	public static void main(String[] args) {

		int key = 4;

		// Function call to find key
		int index = LinearSearch.linearsearch(array, array.length, key);
		if (index != -1)
			System.out.println("The element " + key + " is found at " + index + " index of the given array.");
		else
			System.out.println("The element " + key + " is not found.");
	}
}
