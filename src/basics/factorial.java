package basics;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n = 10;
	int x = fact(n);
	System.out.println("factorial of " + n + " is: " + x );
	}
	public static int fact(int n) {
		if(n == 0)
			return 1;
		if(n == 0)
			return 1;
		
		return n*fact(n-1);
		
	}
	
	
	

}
