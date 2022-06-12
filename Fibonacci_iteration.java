
public class Fibonacci_iteration {

	public static void main(String[] args) {
		int n = 40;
		
		long startTime = System.nanoTime();
		long result = fibonacci(n);
		long endTime = System.nanoTime();
		
		System.out.printf("Result of fibonacci(Iteration): %d\n\n",result);
		System.out.printf("Start: %d\n  End: %d\n",startTime, endTime);
	}

	private static long fibonacci(int n) {
		if(n <= 0) return 0;
		int fn1= 1;
		int fn2 = 1;
		
		for(int i= 3; i <= n; i++) {
			int aux = fn1;
			fn1 = fn2 + fn1;
			fn2 = aux;
		}
		
		return fn1;
	}

}
