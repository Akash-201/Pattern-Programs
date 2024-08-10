package LOOPS;

import java.util.Scanner;

public class Fibonacci_even 
{
public static void print(int n)
{
	int a=2;
	int b=8;
	for(int i=1;i<=n;i++)
	{
		
		if(a%2==0)
		{
			System.out.println(a+" ");
		}
		int c=a+b;
			a=b;
			b=c;
		}

		}
	

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value ");
	int n=sc.nextInt();
	print(n);
}

	

}
