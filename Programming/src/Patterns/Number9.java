package Patterns;

import java.util.Scanner;

public class Number9 
{

	public static void print(int row)
	{
		int x=1;
		for(int i=1;i<=row;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x++;
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
