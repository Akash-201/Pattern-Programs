
public class CountEvenDigit 
{
	public static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n%2==0)
		{
			return 1+count(n/10);
		}
		return count(n/10);
		
	}
	public static void main(String[] args) 
	{
	System.out.println(count(135));	
	}

}
