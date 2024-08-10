package Patterns;

import java.util.Scanner;

public class Number2
{

	public static void print1(int row,int column)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
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
			System.out.println("Enter column");
			int c=sc.nextInt();
			print1(r,c);		
		}
	}

}
