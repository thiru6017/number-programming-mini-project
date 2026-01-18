package com.BusinessLayer;

public class Factors {

	public void factors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	public int sumOfFactors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;

	}

	public int productOfFactors(int num) {
		int prod = 1;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				prod = prod * i;
			}
		}
		return prod;

	}

	public void factorsOfEachDigit(int num) {
		while (num > 0) {
			int ld = num % 10;
			System.out.println("The factors of " + ld);
			for (int i = 1; i <= ld; i++) {
				if (ld % i == 0) {
					System.out.print(i + " ");
				}
			}
			num = num / 10;
			System.out.println();
		}
	}
}