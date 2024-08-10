package LOOPS;

import java.util.Scanner;

public class Squareseries
{
public static void print(int n)
{
	
	for(int i=1;i<=n;i++)
	{
		System.out.println(i*i);
	}
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
	int n=sc.nextInt();
	print(n);
	sc.close();
	
}
	

}
