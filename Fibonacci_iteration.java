import java.util.Scanner;

public class Fibonacci_iteration {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int n = input.nextInt();
			
			long startTime = System.nanoTime();
			long result =fibonacci(n);
			long endTime = System.nanoTime();
			
			System.out.printf("\nNumber entered: %d\n", n);
			System.out.printf("Result of fibonacci(iteration): %d\n",result);
			System.out.printf("\nStart time: %d\n  End time: %d\n",startTime, endTime);
		}
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
