package com.InserstionSort;

public class InserstionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 4, 1, 3, 8 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		sort(arr, arr.length);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void sort(int[] arr, int size) {
		int temp, j;

		for (int i = 1; i < size; i++) {
			temp = arr[i];
			for (j = i; j > 0 && (arr[j - 1] > temp); j--) {
				arr[j] = arr[j - 1];
			}

			arr[j] = temp;
		}
	}
}
