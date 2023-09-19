package com.github.sanchezih.algoritmos._01_sorting._03_quicksort;

public class Main {

	public static void main(String[] args) {

		int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };

		QuickSort.quickSort(actual, 0, 9);
		
		ThreeWayQuickSort.threeWayQuickSort(actual, 0, 9);

	}

}
