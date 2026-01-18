package com.BusinessLayer;

public class Digits {

	public int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;
		}
		return sum;
	}

	public int productOfDigits(int num) {
		int prod = 1;
		while (num > 0) {
			int ld = num % 10;
			prod = prod * ld;
			num = num / 10;
		}
		return prod;

	}

	public int sumOfEvenDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			if (ld % 2 == 0) {
				sum = sum + ld;
			}

			num = num / 10;
		}
		return sum;
	}

	public void sumOfExtreameAndSumOfMean(int num) {
		int lastDigit = num % 10;
		num = num / 10;
		int sumOfMean = 0;
		while (num > 9) {
			int ld = num % 10;
			sumOfMean += ld;
			num = num / 10;
		}
		int sumOfExtreame = lastDigit + num;
		System.out.println("Sum of Extreame Digits: " + sumOfExtreame);
		System.out.println("Sum of Mean Digits: " + sumOfMean);
	}

	public static int countDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

	public static int placeValue(int num) {
		int count = countDigits(num);
		int place = 1;
		for (int i = 1; i <= count / 2; i++) {
			place = place * 10;
		}
		return place;

	}

	public int sumOfTwoHalves(int num) {
		int place = placeValue(num);
		int secondHalf = num % place;
		int firstHalf = num / place;
		int sum = firstHalf + secondHalf;
		return sum;
	}
}