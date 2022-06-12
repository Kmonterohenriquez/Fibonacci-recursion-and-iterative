import java.util.Scanner;

public class Fibonacci_recursive {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int n = input.nextInt();
			
			long startTime = System.nanoTime();
			long result =fibonacci(n);
			long endTime = System.nanoTime();
			
			System.out.printf("\nNumber entered: %d\n", n);
			System.out.printf("Result of fibonacci(recursion): %d\n",result);
			System.out.printf("\nStart time: %d\n  End time: %d\n",startTime, endTime);
		}
	}

	private static long fibonacci(int n) {
		if (n<=1) {
			return n;
		} else {
			return (fibonacci(n-1) + fibonacci(n-2));
		}
	}
}
