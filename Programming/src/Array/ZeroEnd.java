package Array;

public class ZeroEnd 
{
	public static void Print(int[] num) 
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
			System.out.println();
	}
public static int[] shift(int[] n)
{
	int[] res=new int[n.length];
	int j=0;
	for(int i=0;i<=n.length-1;i++)
	{
		if(n[i] !=0)
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
	int[] n= {1,0,2,0,3,0,4};
	Print(n);
	
	shift(n);
}
	

}
