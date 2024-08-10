package Patterns;

import java.util.Scanner;

public class Star5 
{

	public static void print(int r)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				if(i+j==r+1 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
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
