package com.BubbleSort;

public class BubbleSort {
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
		int temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	//Improving bubble sort using a reference variable
	public static void imprivedBubbleSort(int[] arr, int size) {
		int temp, swapped = 1;
		for (int i = 0; i < size - 1 && swapped == 1; i++) {
			swapped = 0;
			for (int j = 0; j < size - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = 1;
				}
			}
		}
	}
}
