package LOOPS;

public class Sum
{
	public static void print(int n) 
	{
		int sum = 0;

		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		
		}
		System.out.println("Result is :"+sum);
		
	}
	public static void main(String[] args)
	{
		print(50);
	}


}