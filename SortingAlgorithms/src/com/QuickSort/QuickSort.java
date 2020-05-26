package com.QuickSort;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 6, 4, 1, 3, 8 };
		System.out.print("unsorted array --> ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("quick sorted array --> ");
		sort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int[] arr, int lower, int upper) {

		if (upper <= lower) {
			return;
		}
		int pivot = arr[lower];
		int start = lower;
		int end = upper;

		while (lower < upper) {
			while (arr[lower] <= pivot && lower < upper) {
				lower++;
			}
			while (arr[upper] > pivot && lower <= upper) {
				upper--;
			}
			if (lower < upper) {
				int temp = arr[lower];
				arr[lower] = arr[upper];
				arr[upper] = temp;
			}
		}

		int temp = arr[upper];
		arr[upper] = arr[start];
		arr[start] = temp;

		sort(arr, start, upper - 1);
		sort(arr, upper + 1, end);

	}
}
