package Patterns_Practice;

import java.util.Scanner;

public class N3 
{

	public static void print(int row,int n)
	{ 
		int x=n;
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n--;
		
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
		System.out.println("Enter n");
		int n=sc.nextInt();
		print(r,n);
	}
			
	
	
}

}
