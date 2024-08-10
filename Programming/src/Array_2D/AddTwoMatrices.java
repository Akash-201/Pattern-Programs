package Array_2D;

public class AddTwoMatrices 
{
	public static void add(int[][] a,int [][] b)
	{
		int[][] c=new int[a.length][b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");  
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
		add(a,b);
	}
	

}
