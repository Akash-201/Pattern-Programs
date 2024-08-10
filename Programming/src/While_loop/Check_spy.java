package While_loop;

// spy number (sum==product)

import java.util.Scanner;

public class Check_spy 
{

	public static boolean printdigit(int n)
	{
		int prod=1;
		int sum=0;
		while(n>0)
		{
			
			int rem=n%10;
//			sum=sum+rem;
//			prod=prod*rem;
			n=n/10;
			sum=sum+rem;
			prod=prod*rem;
		}
		
		System.out.println("\nsum : "+sum);
		System.out.println("\nprod: "+prod);
		if(sum==prod)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter a number");
				int n=sc.nextInt();
				System.out.println(printdigit(n));

}
	}
