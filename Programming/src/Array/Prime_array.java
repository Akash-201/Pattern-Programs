package Array;

public class Prime_array 
{

	public static boolean check(int n)
	{
		if(n < 1) {
			return false;
		}
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n % i ==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		else
			return false;
	}
	public static void prime(int[] x)
	{
		for(int i=0;i<x.length;i++) 
		{
			if(check(x[i]))
			{
				System.out.println(x[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] x= {1,4,5,6,7,8,9,10};
		prime(x);
		}
	}


