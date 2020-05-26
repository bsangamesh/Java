package com.SelectionSort;

public class SelectionSort {

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
		int temp, max;
		for (int i = 0; i < size - 1; i++) {
			max = 0;
			for (int j = 1; j < size - i; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}

			temp = arr[size - 1 - i];
			arr[size - 1 - i] = arr[max];
			arr[max] = temp;
		}
	}

}
