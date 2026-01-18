package com.BusinessLayer;

public class Factorial {

	public int findFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public int sumOfFactorial(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			int fact = findFactorial(ld);
			sum += fact;
			num = num / 10;

		}
		return sum;
	}

	public int sumOfFactorialOfEvenDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			if (ld % 2 == 0) {
				int fact = findFactorial(ld);
				sum += fact;

			}
			num = num / 10;

		}
		return sum;
	}

	public static boolean checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	public int sumOfFactOfPrime(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			if (checkPrime(ld)) {
				sum = sum + sumOfFactorial(ld);
			}
			num = num / 10;

		}
		return sum;

	}

}