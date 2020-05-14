package com.ArmstrongNum;

public class ArmstrongNum {

	public static void main(String[] args) {
		int c = 0, a, temp;
		int n = 1634;// It is the number to check armstrong
		int len = String.valueOf(n).length();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + mult(a, len);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}

	private static int mult(int a, int len) {
		int temp = 1;
		while (len > 0) {
			temp *= a;
			len--;
		}
		return temp;
	}

}
