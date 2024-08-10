package While_loop;

// spy number in given range

import java.util.Scanner;

public class Spy_in_range 
{
public static boolean checkSpy(int n)
{
	int prod=1;
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		n=n/10;
		sum=sum+rem;
		prod=prod*rem;
		
	}
	if(sum==prod)
	{
		return true;
		
	}
	return false;
}
public static void range(int s,int e)
{
	for(int i=s;i<=e;i++)
	{
	if(checkSpy(i))
	 {
		System.out.println(i);
	 }
	}
}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting number");
	int s=sc.nextInt();
	System.out.println("enter ending number");
	int e=sc.nextInt();
	
	range(s,e);
			
			
	}
	

}
