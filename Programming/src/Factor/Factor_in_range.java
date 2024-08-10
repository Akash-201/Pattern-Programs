package Factor;


public class Factor_in_range
{

	//method to find factor of a number
	public static void Factor(int n)
	{
		System.out.println("factors of "+n+" are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i+" ");
		}
	}
	{
System.out.println("\n");
	}
	//method to given range
	public static void GivenRange(int range)
	{
		for(int i=1;i<=range;i++)
		{
			Factor(i);
		}
	}
	public static void main(String[] args) 
	{
		GivenRange(10);
	}
}

