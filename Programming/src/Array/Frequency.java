package Array;

public class Frequency 
{

	public static void print(int[] num)
	{
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
			if(num[i]!=-1 )
			{
				System.out.println(num[i]+"---> "+c);
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,1,1,2,5,3,7,9,1};
		print(num);
	
	}
}
