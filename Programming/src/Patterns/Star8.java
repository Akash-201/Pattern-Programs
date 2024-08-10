package Patterns;

import java.util.Scanner;

public class Star8 
{

	public static void print(int r)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++) //for space   
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) //for star 
			{
				System.out.print("*");
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
