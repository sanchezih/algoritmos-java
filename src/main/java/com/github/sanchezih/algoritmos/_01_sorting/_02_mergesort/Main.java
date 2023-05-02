package com.github.sanchezih.algoritmos._01_sorting._02_mergesort;

public class Main {
	public static void main(String[] args) {
		int[] a = { 5, 1, 6, 2, 3, 4 };
		MergeSort.mergeSort(a, a.length);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
