package Array;

public class Count_even_array
{

	public static void print(int[] x)
	{
		int count=0;
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
	int[] x= {1,2,3,4,5};
	print(x);
	}
}
