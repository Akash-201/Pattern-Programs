package LOOPS;

import java.util.Scanner;

public class ArithmeticSeries
{
public static void print(int n)
{
	int x=1;
	for(int i=1;i<=n;i++)
	{
		System.out.print(x+" ");
		x=x+3;
	}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a number ");
	int n=sc.nextInt();
	
	print(n);
	
	}
	

}
