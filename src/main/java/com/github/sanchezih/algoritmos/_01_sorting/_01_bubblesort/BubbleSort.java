package com.github.sanchezih.algoritmos._01_sorting._01_bubblesort;

public class BubbleSort {

	public static void bubbleSortPocoOptimizado(Integer[] array) {
		int size = array.length - 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 
	 * @param array
	 */
	public static void bubbleSort(Integer[] array) {

		int size = array.length;
		System.out.println("El array tiene " + size + " elementos. Se recorrera " + (size - 1) + " veces.");

		// loop over each element of the array to access them
		for (int i = 0; i < size - 1; i++) {
			System.out.println("Iteracion nro. " + (i + 1));

			// compare the elements of the array with a loop
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print("\tEvaluo si el elemento en la posicion " + j + " (" + array[j] + ")"
						+ " es > al elemento en la posicion " + (j + 1) + " (" + array[j + 1] + ")");

				// compare two adjacent elements in the array
				if (array[j] > array[j + 1]) {
					System.out.print("\tIntercambio");
					// Swap if the elements aren't in the right order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} else {
					System.out.print("\tNo hago nada");
				}
				System.out.println();
			}
		}

	}

	/**
	 * bubbleSort always runs O(N^2) time even if the array is sorted. It can be
	 * optimized by stopping the algorithm if the inner loop didn’t cause any swap.
	 * 
	 * @param array
	 * @param length
	 */
	public static void optimizedBubbleSort(Integer[] array) {
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
