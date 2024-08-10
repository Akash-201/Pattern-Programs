package Array_2D;

public class Count_Even 
{

	public static void printArray(int[][] num)
	{
		int count=0;
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=num[i].length-1;j++)
			{
				if(num[i][j]%2==0)
				{
				count++;
				}
				
				
			}
			
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		printArray(num);
	}

}
