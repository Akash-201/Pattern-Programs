package Array;

public class EvenOddShift
{

	public static void Print(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] Shift(int[] n)
	{
		int[] res=new int[n.length];
		int j=0;
		
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]%2==0)
			{
				res[j]=n[i];
				j++;
			}
			
		}
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]%2!=0)
			{
				res[j]=n[i];
				j++;
			}
		}
		
		Print(res);
		return res;
	}
	public static void main(String[] args)
	{
		int[] n= {1,2,8,0,7,6,5};
		Print(n);
		
		Shift(n);
	}


}
