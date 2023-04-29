package com.github.sanchezih.algoritmos.searching.linearsearch;

public class Main {
	static int arr[] = { 5, 15, 6, 9, 4 };

	// Driver method
	public static void main(String[] args) {
		int key = 4;

		// Function call to find key
		int index = LinearSearch.linearsearch(arr, arr.length, key);
		if (index != -1)
			System.out.println("The element " + key + " is found at " + index + " index of the given array.");

		else
			System.out.println("The element " + key + " is not found.");
	}
}
