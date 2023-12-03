package com.github.sanchezih.algoritmos._01_sorting._01_bubblesort;

public class Main {

	public static void main(String args[]) {

		Integer array[] = { 1,8,3,4,5,6,7,8}; // Array desordenado
		printArray(array);
		BubbleSort.bubbleSortPocoOptimizado(array);
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
