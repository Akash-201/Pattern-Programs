package While_loop;

import java.util.Scanner;

public class Circular_prime_in_range
{
	public static void printCircularPrime(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			if(check(i))
			{
			System.out.println(i+" ");	
			}
		}
	}
	public static boolean check(int n)
	{
		int c=0;
		int t=n;
		while(t>0)
		{
			c++;
			t=t/10;
		}
		for (int i=1;i<=c;i++)
		{
			System.out.println(n);
			if(checkPrime(n))
			{
				int first=n/10;
				int last=n%10;
				n=last*pow(10,c-1)+first;
				
			}
			else
			{
				return false;
			}
		}
		return true;
	}
		

	public static int pow(int b,int p)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*b;
			 
		}
		return res;
	}
	public static boolean checkPrime(int num)
	{
		if(num<=1)
		{
			return false;
			
		}
		else if(num==2 || num==3)
		{
			return true;
		}
		else if(num%2==0 || num==3)
		{
			return false;
		}
		for (int i=5;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;	
		
			}
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter start");
			int s=sc.nextInt();
			System.out.println("enter end");
			int e=sc.nextInt();
			 printCircularPrime(s,e);
			System.out.println();
			
		}
	}
	

}
