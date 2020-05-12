package com.singleElementSortedArray;

public class Solution {

	// This solution is taking O(log n) time and O(1) space.
	public static void main(String[] args) {
		//storing the result from singleNonDuplicate method
		int res = singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 });
		//printing result
		System.out.println("res : " + res);

	}
	//This method will print single element which is non repeated in sorted array and remaining elements will be repeated once
	public static int singleNonDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (i + 1 >= nums.length) {
				return nums[i];
			} else if (nums[i] == nums[i + 1]) {
				i += 2;
			} else {
				return nums[i];
			}
		}
		return 0;
	}
}
