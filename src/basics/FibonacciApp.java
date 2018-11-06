package basics;
import java.util.Scanner;
public class FibonacciApp {

	public static void main(String[] args) {
		//fib(0) = 0;
		//fib(1) = 1
		//fib(2)  = fib(1) + fib(0) = 0 + 1 =1
		//fib(3) = fib(2) + fib(1) = 1 + 1 =2
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = in.nextInt();
		int fib[] = new int[num];
		fib[0] = 0;
		fib[1] = 1;
		int sum = 0;
		if (num >0)
			sum = 1;
		if (num>1) {
			for(int i=2;i<num;i++)
			{
				fib[i] = fib[i-1] + fib[i-2];
				sum = sum + fib[i];
			}
		}
		System.out.println("The sum is: " + sum);
	}

}
