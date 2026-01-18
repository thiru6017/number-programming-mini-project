package com.UserLayer;

import java.util.Scanner;

import com.BusinessLayer.Advance;
import com.BusinessLayer.Digits;
import com.BusinessLayer.Exponential;
import com.BusinessLayer.Factorial;
import com.BusinessLayer.Factors;
import com.BusinessLayer.PrimeNumber;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cond = true;
		while (cond) {
			System.out.println("Select the Operation...");
			System.out.println("1.Factorial");
			System.out.println("2.Factors");
			System.out.println("3.Prime");
			System.out.println("4.Digits");
			System.out.println("5.Exponential");
			System.out.println("6.Advance");
			System.out.println("7.Exit");
			System.out.println("Enter the Option...");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				boolean choiceCondn = true;
				Factorial fact = new Factorial();
				while (choiceCondn) {
					System.out.println("Select the Operation...");
					System.out.println("1.Find the Factorial");
					System.out.println("2.Sum of the Factorial of each Digit");
					System.out.println("3.Sum of the Factorial of Even Digit");
					System.out.println("4.Sum of the Factorial of Prime Digit ");
					System.out.println("5.Main Menu");
					System.out.println("Enter the Choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int factorial = fact.findFactorial(num);
						System.out.println("The Factorial of " + num + " = " + factorial);

					} else if (choice == 2) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sumOfFactorial = fact.sumOfFactorial(num);
						System.out.println("The Sum of Factorial of Each Digit in " + num + " = " + sumOfFactorial);

					} else if (choice == 3) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sumOfFactorialOfEven = fact.sumOfFactorialOfEvenDigits(num);
						if (sumOfFactorialOfEven == 0) {
							System.out.println("No Even Digits Present in the Given Number");
						} else
							System.out.println(
									"The Sum of Factorial of Even Digits in " + num + " = " + sumOfFactorialOfEven);
					} else if (choice == 4) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sumOfFactorialOfPrime = fact.sumOfFactOfPrime(num);
						if (sumOfFactorialOfPrime == 0) {
							System.out.println("No Prime Digits Present in the Given Number");
						} else
							System.out.println(
									"The Sum of Factorial of Prime Digits in " + num + " = " + sumOfFactorialOfPrime);

					} else if (choice == 5) {
						choiceCondn = false;
					} else
						System.out.println("Invalid Choice..Enter a valid Choice..");

				}

			}
				break;
			case 2: {

				boolean choiceCondn = true;
				Factors factor = new Factors();
				while (choiceCondn) {
					System.out.println("Select the Operation...");
					System.out.println("1.Print the Factors");
					System.out.println("2.Sum of Factors");
					System.out.println("3.Product of Factors ");
					System.out.println("4.Factors of Each Digit ");
					System.out.println("5.Main Menu");
					System.out.println("Enter the Choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("The Factors of " + num + " are ");
						factor.factors(num);
					} else if (choice == 2) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sum = factor.sumOfFactors(num);
						System.out.println("The Sum of Factors of " + num + " is " + sum);
					} else if (choice == 3) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int prod = factor.productOfFactors(num);
						System.out.println("The Product of Factors of " + num + " is " + prod);
					} else if (choice == 4) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("the Factors of digits in " + num);
						factor.factorsOfEachDigit(num);
					} else if (choice == 5) {
						choiceCondn = false;
					} else {
						System.out.println("Invalid Choice..Enter a valid Choice..");

					}
				}

			}
				break;
			case 3: {
				boolean choiceCondn = true;
				PrimeNumber prime = new PrimeNumber();
				while (choiceCondn) {
					System.out.println("Select the Operation...");
					System.out.println("1.Prime");
					System.out.println("2.Twisted Prime");
					System.out.println("3.Mega Prime ");
					System.out.println("4.Main Menu");
					System.out.println("Enter the Choice..");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check Prime");
							System.out.println("2.Nth Prime Number");
							System.out.println("3.Next Prime Number");
							System.out.println("4.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (prime.checkPrime(num))
									System.out.println(num + " is Prime Number");
								else
									System.out.println(num + " is not a Prime Number");

							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								int nthPrime = prime.nth_Prime(n);
								System.out.println(n + " th Prime Number is " + nthPrime);

							} else if (selection == 3) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								int nextPrime = prime.next_Prime(num);
								System.out.println("The Next Prime Number is " + nextPrime);
							} else if (selection == 4) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}
					}
						break;
					case 2: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check Twisted Prime");
							System.out.println("2.Nth Twisted Prime Number");
							System.out.println("3.Next Twisted Prime Number");
							System.out.println("4.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (prime.checkTwistedPrime(num))
									System.out.println(num + " is Twisted Prime Number");
								else
									System.out.println(num + " is not a Twisted Prime Number");

							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								int nthTwistedPrime = prime.nth_Twisted_Prime(n);
								System.out.println(n + " th Twisted Prime Number is " + nthTwistedPrime);

							} else if (selection == 3) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								int nextTwistedPrime = prime.next_Twisted_Prime(num);
								System.out.println("The Next Prime Number is " + nextTwistedPrime);
							} else if (selection == 4) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 3: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check Mega Prime");
							System.out.println("2.Nth Mega Prime Number");
							System.out.println("3.Next Mega Prime Number");
							System.out.println("4.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (prime.checkMegaPrime(num))
									System.out.println(num + " is Mega Prime Number");
								else
									System.out.println(num + " is not a Mega Prime Number");

							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								int nthMegaPrime = prime.nth_Mega_Prime(n);
								System.out.println(n + " th Mega Prime Number is " + nthMegaPrime);

							} else if (selection == 3) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								int nextMegaPrime = prime.next_Mega_Prime(num);
								System.out.println("The Next Mega Number is " + nextMegaPrime);
							} else if (selection == 4) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 4: {
						choiceCondn = false;
					}
					default:
						System.out.println("Invalid Option❌❌..Try Again..");
					}
				}
			}
			case 4: {

				boolean choiceCondn = true;
				Digits digit = new Digits();
				while (choiceCondn) {
					System.out.println("Select the Operation...");
					System.out.println("1.Sum of Digits");
					System.out.println("2.Product of Digits");
					System.out.println("3.Sum of Even Digits");
					System.out.println("4.Sum of Extreme and Sum of Mean Digits");
					System.out.println("5.Sum Of First Half and Second Half Digits");
					System.out.println("Enter the Choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("The Sum of Digits in " + num + " is " + digit.sumOfDigits(num));

					} else if (choice == 2) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("The Product of Digits in " + num + " is " + digit.productOfDigits(num));

					} else if (choice == 3) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("The Sum of Even Digits in " + num + " is " + digit.sumOfEvenDigits(num));

					} else if (choice == 4) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						digit.sumOfExtreameAndSumOfMean(num);
					} else if (choice == 5) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("The sum of First Half and Second Half is " + digit.sumOfTwoHalves(num));
					} else if (choice == 6) {
						choiceCondn = false;
					} else {
						System.out.println("Invalid Choice..Enter a valid Choice..");

					}
				}

			}
				break;
			case 5: {

				boolean choiceCondn = true;
				Exponential exp = new Exponential();
				while (choiceCondn) {
					System.out.println("Select the Operation...");
					System.out.println("1.Exponential of Each Digit to Count of Digits");
					System.out.println("2.Sum of Exponential of Each Digit to Count of Digits");
					System.out.println("3.Sum of Exponential of Even Digits to Count of Digits");
					System.out.println("4.Sum of Exponential of Odd Digits to Count of Digits ");
					System.out.println("5.Main Menu");
					System.out.println("Enter the Choice..");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						System.out.println("Exponential of each Digit in " + num + " to the count of Digits ");
						exp.exponentialOfEachDigit(num);
					} else if (choice == 2) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sumOfExponential = exp.sumOfExponentialOfEachDigit(num);
						System.out.println("The Sum of Exponential of Each Digit in " + num + " = " + sumOfExponential);

					} else if (choice == 3) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sumOfExponentialOfEven = exp.sumOfExponentialOfEvenDigit(num);
						if (sumOfExponentialOfEven == 0) {
							System.out.println("No Even Digits Present in the Given Number");
						} else
							System.out.println(
									"The Sum of Exponential of Even Digits in " + num + " = " + sumOfExponentialOfEven);
					} else if (choice == 4) {
						System.out.println("Enter the Number..");
						int num = sc.nextInt();
						int sumOfExponentialOfOdd = exp.sumOfExponentialOfOddDigit(num);
						if (sumOfExponentialOfOdd == 0) {
							System.out.println("No Odd Digits Present in the Given Number");
						} else
							System.out
									.println("The Exponential Of Odd Digits in " + num + " = " + sumOfExponentialOfOdd);

					} else if (choice == 5) {
						choiceCondn = false;
					} else
						System.out.println("Invalid Choice..Enter a valid Choice..");

				}
			}
				break;
			case 6: {
				boolean choiceCondn = true;
				Advance adv = new Advance();
				Exponential exp = new Exponential();
				while (choiceCondn) {
					System.out.println("Select the Operation...");
					System.out.println("1.Palindrome");
					System.out.println("2.SPY");
					System.out.println("3.Armstrong");
					System.out.println("4.TECH Number");
					System.out.println("5.Happy Number");
					System.out.println("6.Magic Number");
					System.out.println("7.HCF and LCM of two Numbers");
					System.out.println("8.Decimal-Binary");
					System.out.println("9.Series terms");
					System.out.println("10.Main Menu");
					System.out.println("Enter the Choice..");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check Palindrome");
							System.out.println("2.Nth Palindrome Number");
							System.out.println("3.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (adv.checkPalindrome(num))
									System.out.println(num + " is a Palindrome Number..");
								else
									System.out.println(num + " is not a Palindrome Number..");
							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								adv.nth_Palindrome(n);

							} else if (selection == 3) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}
					}
						break;
					case 2: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check SPY Number");
							System.out.println("2.Back to SPY Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (adv.checkSpy(num))
									System.out.println(num + " is SPY Number");
								else
									System.out.println(num + " is not a SPY Number");

							} else if (selection == 2) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 3: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check ArmStrong");
							System.out.println("2.Nth ArmStrong Number");
							System.out.println("3.Back to  Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (exp.sumOfExponentialOfEachDigit(num) == num)
									System.out.println(num + " is Armstrong Number");
								else
									System.out.println(num + " is not Armstrong Number");

							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								int nthArmstrong = adv.nthArmstrongNumber(n);
								System.out.println(n + " th Armstrong Number is " + nthArmstrong);

							} else if (selection == 3) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 4: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check TECH Number");
							System.out.println("2.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								adv.checkTechNumber(num);

							} else if (selection == 2) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 5: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check Happy Number");
							System.out.println("2.Nth Happy Number");
							System.out.println("3.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (adv.checkHappy(num) == 1)
									System.out.println(num + " is a Happy Number");
								if (adv.checkHappy(num) == 4)
									System.out.println(num + " is a UnHappy Number");
								if (adv.checkHappy(num) == 0)
									System.out.println(num + " is zero");

							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								int nthHappyNumber = adv.nthHappyNumber(n);
								System.out.println(n + " th Happy Number is " + nthHappyNumber);

							} else if (selection == 3) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 6: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Check Magic Number");
							System.out.println("2.Nth Magic Number");
							System.out.println("3.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								if (adv.checkMagicNumber(num))
									System.out.println(num + " is Magic Number");
								else
									System.out.println(num + " is not a Magic Number");

							} else if (selection == 2) {
								System.out.println("Enter n value..");
								int n = sc.nextInt();
								int nthMagicNumber = adv.nthMagicNumber(n);
								System.out.println(n + " th Magic Number is " + nthMagicNumber);

							} else if (selection == 3) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 7: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.HCF");
							System.out.println("2.LCM");
							System.out.println("3.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter first Number");
								int n1 = sc.nextInt();
								System.out.println("Enter second Number");
								int n2 = sc.nextInt();
								int hcf = adv.hcf(n1, n2);
								System.out.println("The HCF of " + n1 + " and " + n2 + " is " + hcf);

							} else if (selection == 2) {
								System.out.println("Enter first Number");
								int n1 = sc.nextInt();
								System.out.println("Enter second Number");
								int n2 = sc.nextInt();
								int lcm = adv.lcm(n1, n2);
								System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm);

							} else if (selection == 3) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 8: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Decimal to Binary");
							System.out.println("2.Binary to Decimal");
							System.out.println("3.Back to Menu ");
							int selection = sc.nextInt();
							if (selection == 1) {
								System.out.println("Enter the Number..");
								int num = sc.nextInt();
								int binary = adv.decimalToBinary(num);
								System.out.println("The Binary Representation of " + num + " is " + binary);

							} else if (selection == 2) {
								System.out.println("Enter Binary value..");
								int binary = sc.nextInt();
								int decimal = adv.binaryToDecimal(binary);
								System.out.println("The Decimal Form of " + binary + " is " + decimal);

							} else if (selection == 3) {
								pickOption = false;
							} else
								System.out.println("Invalid Choice..Enter a valid Choice..");
						}

					}
						break;
					case 9: {
						boolean pickOption = true;
						while (pickOption) {
							System.out.println("Select the Option..");
							System.out.println("1.Fibanocci Series");
							System.out.println("2.Perfect Squares");
							System.out.println("3.Back to Menu ");
							int seriesOption = sc.nextInt();
							switch (seriesOption) {
							case 1: {
								boolean serOpt = true;
								while (serOpt) {
									System.out.println("Select the Option");
									System.out.println("1.First n terms of Fibanocci Series ");
									System.out.println("2.Nth Fibanocci term");
									System.out.println("3.Back to Menu");
									int selection = sc.nextInt();
									if (selection == 1) {
										System.out.println("Enter n value: ");
										int n = sc.nextInt();
										adv.ntermsOfFibanocciseries(n);

									} else if (selection == 2) {
										System.out.println("Enter n value: ");
										int n = sc.nextInt();
										int nthTerm = adv.nth_fibanocci_term(n);
										System.out.println("The " + n + " th term in Fibanocci Series is " + nthTerm);

									} else if (selection == 3) {
										serOpt = false;
									} else
										System.out.println("Invalid Choice..Enter a valid Choice..");

								}

							}
								break;
							case 2: {
								boolean serOpt = true;
								while (serOpt) {
									System.out.println("Select the Option");
									System.out.println("1.First n Perfect Squares ");
									System.out.println("2.Nth Perfect Square");
									System.out.println("3.Back to Menu");
									int selection = sc.nextInt();
									if (selection == 1) {
										System.out.println("Enter n value: ");
										int n = sc.nextInt();
										adv.nterms_Of_PerfectSquares(n);

									} else if (selection == 2) {
										System.out.println("Enter n value: ");
										int n = sc.nextInt();
										int nthTerm = adv.nth_PerfectSquare(n);
										System.out.println("The " + n + " th Perfect Sqaure is " + nthTerm);

									} else if (selection == 3) {
										serOpt = false;
									} else
										System.out.println("Invalid Choice..Enter a valid Choice..");
								}
							}
								break;
							case 3: {
								pickOption = false;
							}
								break;

							default:
								System.out.println("Invalid Choice..Enter a valid Choice..");
							}

						}
					}
						break;
					case 10: {
						choiceCondn = false;
					}
					default:
						System.out.println("Invalid Option❌❌..Try Again..");
					}
				}

			}
				break;
			case 7: {
				cond = false;
				System.out.println("Thank You..");
			}
				break;
			default: {
				System.out.println("Invalid Option❌❌..Try Again..");
			}

			}
		}
	}
}