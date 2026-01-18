package com.BusinessLayer;

public class Exponential {
	public static int count(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static int exponential(int x, int n) {
		int expo = 1;
		for (int i = 1; i <= n; i++) {
			expo = expo * x;
		}
		return expo;

	}

	public void exponentialOfEachDigit(int num) {
		int power = count(num);
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			int expo = exponential(ld, power);
			System.out.println("Exponential of " + ld + " is " + expo);
			num = num / 10;
		}
	}

	public int sumOfExponentialOfEachDigit(int num) {
		int power = count(num);
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			int expo = exponential(ld, power);
			sum = sum + expo;
			num = num / 10;
		}
		return sum;
	}

	public int sumOfExponentialOfEvenDigit(int num) {
		int power = count(num);
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			if (ld % 2 == 0) {
				int expo = exponential(ld, power);
				sum = sum + expo;
			}
			num = num / 10;
		}
		return sum;
	}

	public int sumOfExponentialOfOddDigit(int num) {
		int power = count(num);
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			if (ld % 2 != 0) {
				int expo = exponential(ld, power);
				sum = sum + expo;
			}
			num = num / 10;
		}
		return sum;
	}
}