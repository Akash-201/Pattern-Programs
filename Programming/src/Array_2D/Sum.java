package Array_2D;

public class Sum {

	public static void printArray(int[][] num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=num[i].length-1;j++)
			{
				sum=sum+num[i][j];
				
				
			}
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		printArray(num);
	}

}
