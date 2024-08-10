package Array;

public class StartZero
{
public static void Print(int[] n)
{
	for(int i=0;i<=n.length-1;i++)
	{
		System.out.print(n[i]+" ");
	}
	System.out.println();
}
public static int[] FirstZero(int[] n)
{
	int[] res=new int[n.length];
	int j=n.length-1;
	for(int i=n.length-1;i>=0;i--)
	{
		if(n[i]!=0)
		{
			res[j]=n[i];
			j--;
		}
	}
	Print(res);
	return res;
	
			
}
public static void main(String[] args)
{
	int[] n= {1,2,0,0,0,6,3};
	Print(n);
	
	FirstZero(n);
}
	

}
