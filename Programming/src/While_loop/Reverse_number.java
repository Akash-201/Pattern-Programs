package While_loop;

import java.util.Scanner;

public class Reverse_number 
{

	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
	
			rev=rev*10+rem;
			
			num=num/10;
		}
         	return rev;
	}
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=sc.nextInt();
//		System.out.println(reverse(n));
        System.out.println(reverse(1234));

	}
}
