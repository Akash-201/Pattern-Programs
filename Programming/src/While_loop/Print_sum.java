package While_loop;

// print sum or product of digit

import java.util.Scanner;

public class Print_sum 
{

	public static void printdigit(int n)
	{
		int prod=1;
		int sum=0;
		while(n>0)
		{
			
			int rem=n%10;
			System.out.print(rem+" ");
			n=n/10;
			sum=sum+rem;
			prod=prod*rem;
		}
		
		System.out.println("\nsum : "+sum);
		System.out.println("\nprod: "+prod);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter a number");
				int n=sc.nextInt();
				printdigit(n);
		
				
	}


}
