
public class Count7
{
	public static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n%10==7)
		{
			return 1+count(n/10);
		}
		return count(n/10);
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n%10==7)
		{
			return n%10+sum(n/10);
		}
		return sum(n/10);
	}
	public static void main(String[] args)
	{
		System.out.println(count(937537877));	
		System.out.println(sum(937537877));	
	}
}
