//print factor excluding 1 or itself

package Factor;

public class Exclude_1oritself 
{

	public static void print(int n)
	{
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		print(20);
	}

}

