package com.github.sanchezih.algoritmos._02_searching.linearsearch;

public class LinearSearch {

	// Recursive Method to search key in the array
	static int linearsearch(int arr[], int size, int key) {
		if (size == 0) {
			return -1;
		} else if (arr[size - 1] == key) {

			// Return the index of found key.
			return size - 1;
		} else {
			return linearsearch(arr, size - 1, key);
		}
	}

}