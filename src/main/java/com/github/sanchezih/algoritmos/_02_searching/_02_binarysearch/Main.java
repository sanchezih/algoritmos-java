package com.github.sanchezih.algoritmos._02_searching._02_binarysearch;

public class Main {

	public static void main(String[] args) {
		int sortedArray[] = new int[] { 2, 5, 6, 8, 11, 24, 76 };
		int res = BinarySearch.runBinarySearchRecursively(sortedArray, 24, 0, 7);
		System.out.println(res);
	}

}
