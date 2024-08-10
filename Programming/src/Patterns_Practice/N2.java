package Patterns_Practice;

import java.util.Scanner;

public class N2 
{

	public static void print(int row)
	{
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("Enter row");
		int r=sc.nextInt();
		print(r);
	}
			
	
	
}

}
