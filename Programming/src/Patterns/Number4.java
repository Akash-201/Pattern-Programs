package Patterns;

import java.util.Scanner;

public class Number4 
{

	public static void print1(int row,int column)
	{
		for(int i=row;i>=1;i--)
		{
			for(int j=column;j>=1;j--)
			{
				System.out.print(i+" ");
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
