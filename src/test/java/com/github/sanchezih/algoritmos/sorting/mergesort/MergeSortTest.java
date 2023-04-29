package com.github.sanchezih.algoritmos.sorting.mergesort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.github.sanchezih.algoritmos.sorting.mergesort.MergeSort;

public class MergeSortTest {
	
	@Test
	void positiveTest() {
		
		int[] actual = { 5, 1, 6, 2, 3, 4 };
		int[] expected = { 1, 2, 3, 4, 5, 6 };
		
		MergeSort.mergeSort(actual, actual.length);
		assertArrayEquals(expected, actual);
	}

}