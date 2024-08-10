package While_loop;

//print even digit

import java.util.Scanner;

public class Print_even_digit 
{

	public static void printdigit(int n)
	{
		while(n>0)
		{
			
			int rem=n%10;
			if(rem%2==0)
			{
			System.out.print(rem+" ");
			}
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
