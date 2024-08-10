package Recursion;

public class Even
{
	

	public static void print(int n)
	{
		
		
		if(n==0)
		{
			
			return;
		}
		if(n%2==0)
		{
		
		System.out.print(n+" ");
		
		
		}
		
		print(n-1);
		
	}
	
	public static void main(String[] args)
	{
		print(10);
	}

}

// for forward direction

//if(n==0)
//{
//	return;
//}
//print(n-1);
//
//if(n%2==0)
//{
//
//System.out.print(n+" ");
//}







