// print count factor excluding 1 or itself

package Factor;

public class Count_exclude_1oritself
{
	public static void print(int n)
	{
		int count=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
	        }
		}
		System.out.println("\ncount is - "+count);
	}
	public static void main(String[] args) 
	{
		print(20);
	}
	

}




