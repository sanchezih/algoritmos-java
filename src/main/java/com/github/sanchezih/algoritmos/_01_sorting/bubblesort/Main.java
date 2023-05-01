package com.github.sanchezih.algoritmos._01_sorting.bubblesort;

public class Main {

	public static void main(String args[]) {
		Integer array[] = { 35, 10, 4, 2, 48, 19, 3 };
		BubbleSort.bubbleSort(array);
		System.out.println("Sorted array");
		printArray(array);
	}

	public static void printArray(Integer arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
