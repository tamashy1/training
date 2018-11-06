 package basics;

public class Sum {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		sum = adder(n);
		System.out.println( "sum is:  " + sum);
	}
static int adder(int n) {
	int sum = 0;
	for (int i =1;i <= n;i++)
	{
		sum += i;
	}
	return sum;
}
}
