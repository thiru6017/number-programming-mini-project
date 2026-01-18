package com.BusinessLayer;

public class Advance {

	public boolean checkPalindrome(int num) {
		int reverse = PrimeNumber.reverse(num);
		return reverse == num;

	}

	public void nth_Palindrome(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkPalindrome(num)) {
				count++;
			}
			if (count == n) {
				System.out.println("The " + n + " th Palindrome Number is " + num);
				break;
			}

		}

	}

	public boolean checkSpy(int num) {
		int sum = 0;
		int prod = 1;
		while (num > 0) {
			int ld = num % 10;
			sum = sum + ld;
			prod = prod * ld;
			num = num / 10;
		}
		return sum == prod;
	}

	public static boolean checkArmstrong(int num) {
		Exponential exp = new Exponential();
		return exp.sumOfExponentialOfEachDigit(num) == num;
	}

	public int nthArmstrongNumber(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkArmstrong(num)) {
				count++;
			}
			if (count == n) {
				return num;
			}
		}
	}

	public static int countDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

	public static int placeValue(int count) {
		int place = 1;
		for (int i = 1; i <= count; i++) {
			place = place * 10;
		}
		return place;

	}

	public void checkTechNumber(int num) {
		int count = countDigits(num);
		if (count % 2 == 0) {
			int half = count / 2;
			int divisor = placeValue(half);
			int firstHalf = num / divisor;
			int secondHalf = num % divisor;
			int sum = firstHalf + secondHalf;
			int square = sum * sum;
			if (square == num)
				System.out.println(num + " is a TECH Number");
			else
				System.out.println(num + " is not a TECH Number");

		} else
			System.out.println("Not a TECH Number");

	}

	public static int SquareAndSum(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			int square = ld * ld;
			sum = sum + square;
			num = num / 10;

		}
		return sum;
	}

	public int checkHappy(int num) {
		int temp = num;
		while (true) {
			num = SquareAndSum(num);
			if (num == 1 || num == 4 || num == 0)
				break;

		}
		return num;

	}

	public int nthHappyNumber(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkHappy(num) == 1) {
				count++;
			}
			if (count == n)
				return num;
		}
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int ld = num % 10;
			sum = sum + ld;
			num = num / 10;
		}
		return sum;
	}

	public boolean checkMagicNumber(int num) {
		while (true) {
			num = sumOfDigits(num);
			if (num <= 9)
				break;
		}
		return num <= 9;
	}

	public int nthMagicNumber(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkMagicNumber(num))
				count++;
			if (count == n)
				return n;
		}
	}

	public int hcf(int n1, int n2) {
		int range = 0;
		if (n1 <= n2)
			range = n1;
		else
			range = n2;
		int hcf = 0;
		for (int i = range; i >= 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
				break;
			}

		}
		return hcf;
	}

	public int lcm(int n1, int n2) {
		int hcf = hcf(n1, n2);
		int lcm = (n1 * n2) / hcf;
		return lcm;
	}

	public int decimalToBinary(int num) {
		int place = 1;
		int binary = 0;
		while (num > 0) {
			int rem = num % 2;
			binary = binary + (rem * place);
			place = place * 10;
			num = num / 2;
		}
		return binary;
	}

	public int binaryToDecimal(int binary) {
		int decimal = 0;
		int power = 0;
		if (binary == 0)
			System.out.println("The decimal form of " + binary + " is " + binary);
		else {
			while (binary > 0) {
				int digit = binary % 10;
				if (digit == 1) {
					int expo = 1;
					for (int i = 1; i <= power; i++) {
						expo = expo * 2;
					}
					decimal += expo;
				}
				power++;
				binary = binary / 10;
			}

		}
		return decimal;
	}

	public void ntermsOfFibanocciseries(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("The first " + n + "terms in fibanocci series are ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	public int nth_fibanocci_term(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;

	}

	public void nterms_Of_PerfectSquares(int n) {
		for (int i = 1; i <= n; i++) {
			int perfectSquare = i * i;
			System.out.println(perfectSquare);
		}

	}

	public boolean checkPerfectSquare(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return num == sum;
	}

	public int nth_PerfectSquare(int n) {
		int count = 0;
		for (int i = 1;; i++) {
			int num = i;
			if (checkPerfectSquare(num))
				count++;
			if (count == n)
				return n;
		}
	}
}