
public class Fibonacci_recursive {

	public static void main(String[] args) {
		int n = 49;
		
		long startTime = System.nanoTime();
		long result =fibonacci(n);
		long endTime = System.nanoTime();
		
		System.out.printf("Result of fibonacci(recursion): %d\n",result);
		System.out.printf("Start: %d\n  End: %d\n",startTime, endTime);
	}

	private static long fibonacci(int n) {
		if (n<=1) {
			return n;
		} else {
			return (fibonacci(n-1) + fibonacci(n-2));
		}
	}
}
