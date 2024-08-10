package LOOPS;

import java.util.Scanner;

public class Table
{
	public static void print(int n)
	{
		
		for (int i=1;i<=10;i++)
		{
			
			System.out.println(n+ "*" + i+ "= "+i*n);
			
		}
		 
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value :-");
		int n=sc.nextInt();
		print(n);
		
	}
    
	
}
