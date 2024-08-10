package Array;

public class Even_Array
{
public static void print(int[] x)
{
	for(int i=0;i<=x.length-1;i++)
	{
		if(x[i]%2==0)
		{
		System.out.print(x[i]+" ");	
		}
	}
}
public static void main(String[] args)
{
	int[] x= {1,2,3,4,5,6};
	print(x);
}
	
}
