package LOOPS;

public class Even100 
{

	public static void print()
	{
		System.out.println("first 100 even no are :- ");
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+" ");
					}
		}
	}
	public static void main(String[] args)
	{
		print();
	}
}
