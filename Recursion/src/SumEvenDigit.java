
public class SumEvenDigit 
{
	public static int Sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if((n%10)%2==0)
		{
			return n%10+Sum(n/10);
		}
		return Sum(n/10);
		
	}
	public static void main(String[] args) 
	{
	System.out.println(Sum(135242));	
	}

}
