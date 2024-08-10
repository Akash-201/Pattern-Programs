//count factor of a given number 

package Factor;

public class Count_factor
{
	
	public static void print(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				c++;
			}
		}
		System.out.println("\nCount is : "+c);
	}
	
	public static void main(String[] args) 
	{
		print(20);
	}
	

}


