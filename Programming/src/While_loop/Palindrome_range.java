package While_loop;

public class Palindrome_range 
{

	public static boolean check(int n)
	{
		
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
	
			rev=rev*10+rem;
			
			n=n/10;
			
		}
		
         	
	
	if(rev==temp)
	{
		return true;
	}
	return false;

}
	public static void range(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			if( check(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		range(1,100);
	}

}
