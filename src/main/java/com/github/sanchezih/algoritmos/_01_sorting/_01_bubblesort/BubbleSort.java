package com.github.sanchezih.algoritmos._01_sorting._01_bubblesort;

public class BubbleSort {

	/**
	 * 
	 * @param array
	 */
	public static void bubbleSort(Integer[] array) {
		int size = array.length;
		// loop over each element of the array to access them
		for (int i = 0; i < size - 1; i++)
			// compare the elements of the array with a loop
			for (int j = 0; j < size - i - 1; j++)
				// compare two adjacent elements in the array
				if (array[j] > array[j + 1]) {
					// Swap if the elements aren't in the right order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	/**
	 * bubbleSort always runs O(N^2) time even if the array is sorted. It can be
	 * optimized by stopping the algorithm if the inner loop didn’t cause any swap.
	 * 
	 * @param array
	 * @param length
	 */
	public void optimizedBubbleSort(Integer[] array) {
		int length = array.length;
		int i, j, temp;
		boolean swapped;

		for (i = 0; i < length - 1; i++) {
			swapped = false;
			for (j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}

	}
}
