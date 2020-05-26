package com.MergeSort;

public class MergeSort {
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

	private static void sort(int[] arr, int length) {
		int[] tempArray = new int[length];
		mergeSort(arr, tempArray, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int[] tempArray, int lower, int upper) {
		System.out.println("lower : " + lower + ", upper : " + upper);

		if (lower >= upper) {
			return;
		}

		int mid = (lower + upper) / 2;
		mergeSort(arr, tempArray, lower, mid);
		mergeSort(arr, tempArray, mid + 1, upper);

		// Merge Code
		System.out.println("lower : " + lower);
		System.out.println("upper : " + upper);
		System.out.println("mid : " + mid);
		int lowerStart = lower;
		int lowerStop = mid;
		int upperStart = mid + 1;
		int upperStop = upper;
		int count = lower;
		System.out.println("count : " + count);
		while (lowerStart <= lowerStop && upperStart <= upperStop) {
			if (arr[lowerStart] < arr[upperStart]) {
				tempArray[count++] = arr[lowerStart++];
			} else {
				tempArray[count++] = arr[upperStart++];
			}
		}

		while (lowerStart <= lowerStop) {
			tempArray[count++] = arr[lowerStart++];
		}

		while (upperStart <= upperStop) {
			tempArray[count++] = arr[upperStart++];
		}

		for (int i = lower; i <= upper; i++) {
			System.out.println("tempArray[i] : " +tempArray[i]);
			arr[i] = tempArray[i];
		}
	}

}
