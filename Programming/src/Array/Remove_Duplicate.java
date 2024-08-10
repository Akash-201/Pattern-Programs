package Array;

public class Remove_Duplicate 
{

	public static void print(int[] num)
	{
		//int c=1;
		for(int i=0;i<=num.length-1;i++)
		{
			int c=1;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					c++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1)
			{
			System.out.print(num[i]+" ");	
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,1,1,2,5,3,7,9,1,11,11,13};
		print(num);
	}

}
