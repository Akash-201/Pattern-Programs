package While_loop;

//count number of digit

import java.util.Scanner;

public class Count_digit 
{

	public static void printdigit(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem+" ");
			count++;
			n=n/10;
		}
		System.out.println("\ncount :"+count);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter a number");
				int n=sc.nextInt();
				printdigit(n);
		
				
	}


}
