package Factor;

import java.util.Scanner;

public class Prime_in_range
{
	
	// method to check the prime or not
   public static boolean checkPrime(int n) 
   {
	int count = 0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==0)
	{
		return true;
		
	}
	else
		return false;
		
}
    // method to print prime numbers with in given range
   public static void print(int range) 
   {
    	
//    	int sum = 0;
	for(int i = 2; i <= range; i++)
	{
		
		if(checkPrime(i)) 
		{
			System.out.print(i + " ");
//			sum=sum+i
		}
	}
	
//	System.out.print("\nSum of prime number: " + sum);
}

public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);

	System.out.print("Enter number:- ");
	int n=sc.nextInt();
	
	print(n);
	}

}
