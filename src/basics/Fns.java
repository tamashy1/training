package basics;

public class Fns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] array = {1,5,67,32,65,2,4};
	int smallest = minimum(array);
	int highest = maximum(array);
	int mean = average(array);
	System.out.println("Smallest : " + smallest);
	System.out.println("Highest : " + highest);
	System.out.println("Average : " + mean);
	}
static int minimum(int[] a)
	{
	int i = 1;
	int min = a[0];
		while( i< a.length) {
		 min = Math.min(min, a[i]);
		 i++;
		}
		return min;
	
}
static int maximum(int[] a)
{
int i = 1;
int max = a[0];
	while( i< a.length) {
	 max = Math.max(max, a[i]);
	 i++;
	}
	return max;

}
static int average(int[] a)
{
int i = 1;
int avg = 0;
int sum = 0;
	while( i< a.length) {
	 sum  += a[i];
	 i++;
	}
	avg = sum/a.length;
	return avg;

}

}