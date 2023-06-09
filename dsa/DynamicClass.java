package dsa;

import java.util.HashMap;
import java.util.Map;

/*
Certainly! Let's consider an example of the "Fibonacci sequence" to illustrate a dynamic programming algorithm in Java. The Fibonacci sequence is a sequence of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.

Here's an example implementation using dynamic programming to efficiently compute the nth Fibonacci number:
*/

public class DynamicClass {
	private static Map<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		int n = 10; // Example: Compute the 10th Fibonacci number

		int fibonacciNumber = fibonacci(n);
		System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		int fibNumber = fibonacci(n - 1) + fibonacci(n - 2);
		memo.put(n, fibNumber);
		return fibNumber;
	}
}



