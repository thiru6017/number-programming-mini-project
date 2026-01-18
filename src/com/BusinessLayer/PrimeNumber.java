package com.BusinessLayer;

public class PrimeNumber {

	public boolean checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}
		return count == 2;
	}

	public int nth_Prime(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkPrime(num)) {
				count++;
			}
			if (count == n) {
				return num;
			}
		}

	}

	public int next_Prime(int num) {
		for (int i = num + 1;; i++) {
			int next = i;
			if (checkPrime(next))
				return next;
		}
	}

	public static int reverse(int num) {
		int reverse = 0;
		while (num > 0) {
			int ld = num % 10;
			reverse = (reverse * 10) + ld;
			num = num / 10;
		}
		return reverse;
	}

	public boolean checkTwistedPrime(int num) {
		int reverse = reverse(num);
		if (checkPrime(num)) {
			if (checkPrime(reverse))
				return true;
			else
				return false;
		}
		return false;
	}

	public int nth_Twisted_Prime(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkTwistedPrime(num)) {
				count++;
			}
			if (count == n) {
				return num;
			}
		}
	}

	public int next_Twisted_Prime(int num) {
		for (int i = num + 1;; i++) {
			int next = i;
			if (checkTwistedPrime(next))
				return next;
		}

	}

	public boolean checkMegaPrime(int num) {
		if (checkPrime(num)) {
			while (num > 0) {
				int ld = num % 10;
				if (!checkPrime(ld))
					return false;

				num = num / 10;

			}
			return true;
		} else
			return false;
	}

	public int nth_Mega_Prime(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkMegaPrime(num))
				count++;
			if (count == n)
				return num;

		}
	}

	public int next_Mega_Prime(int num) {
		for (int i = num + 1;; i++) {
			int next = i;
			if (checkMegaPrime(next))
				return next;
		}
	}

}