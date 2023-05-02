package com.github.sanchezih.algoritmos.searching.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.sanchezih.algoritmos._02_searching._02_binarysearch.BinarySearch;

public class BinarySearchTest {

	int[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
	int key = 6;
	int expectedIndexForSearchKey = 7;
	int low = 0;
	int high = sortedArray.length - 1;
	List<Integer> sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

	@Test
	void givenASortedArrayOfIntegers_whenBinarySearchRunIterativelyForANumber_thenGetIndexOfTheNumber() {
		assertEquals(expectedIndexForSearchKey, BinarySearch.runBinarySearchIteratively(sortedArray, key, low, high));
	}

	@Test
	void givenASortedArrayOfIntegers_whenBinarySearchRunRecursivelyForANumber_thenGetIndexOfTheNumber() {
		assertEquals(expectedIndexForSearchKey, BinarySearch.runBinarySearchRecursively(sortedArray, key, low, high));
	}

	@Test
	void givenASortedArrayOfIntegers_whenBinarySearchRunUsingArraysClassStaticMethodForANumber_thenGetIndexOfTheNumber() {
		assertEquals(expectedIndexForSearchKey, BinarySearch.runBinarySearchUsingJavaArrays(sortedArray, key));
	}

	@Test
	void givenASortedListOfIntegers_whenBinarySearchRunUsingCollectionsClassStaticMethodForANumber_thenGetIndexOfTheNumber() {
		assertEquals(expectedIndexForSearchKey, BinarySearch.runBinarySearchUsingJavaCollections(sortedList, key));
	}

}