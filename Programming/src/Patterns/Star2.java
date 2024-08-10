package Patterns;

import java.util.Scanner;

public class Star2
{
	public static void print(int row,int column)
	 {
		 for (int i=1;i<=row;i++)
		 {
			 for(int j=1;j<=column;j++)
			 {
				if(i==1 || j==column)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
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
				System.out.println("Enter column");
				int c=sc.nextInt();
				print(r,c);		
			}
		}
	

}
