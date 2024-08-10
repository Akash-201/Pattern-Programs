package While_loop;


// print digit

import java.util.Scanner;

public class Print
{

	public static void printdigit(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem+" ");
			n=n/10;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter a number");
				int n=sc.nextInt();
				printdigit(n);
		
				
	}

}
