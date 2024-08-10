package LOOPS;

//sum of n fibonacci number


public class Fibonacci_sum 
{
	public static void print(int n)
	{
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{

			

			sum=sum+a;
			int c=a+b;
			a=b;
			b=c;
			

		}
		System.out.println(sum);
		
	
	
}
public static void main(String[] args) 
{
	print(10);
}


}
