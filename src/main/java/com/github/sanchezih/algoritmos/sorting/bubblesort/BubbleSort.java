package com.github.sanchezih.algoritmos.sorting.bubblesort;

import java.util.stream.IntStream;

public class BubbleSort {

	/**
	 * 
	 * @param array
	 */
	public void bubbleSort(Integer[] array) {
		int n = array.length;
		IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
			if (array[j - 1] > array[j]) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		});
	}

	/**
	 * 
	 * @param array
	 */
	public void optimizedBubbleSort(Integer[] array) {
		int i = 0;
		int n = array.length;

		boolean swapNeeded = true;
		while (i < n - 1 && swapNeeded) {
			swapNeeded = false;
			for (int j = 1; j < n - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					swapNeeded = true;
				}
			}
			if (!swapNeeded)
				break;
			i++;
		}
	}
}
