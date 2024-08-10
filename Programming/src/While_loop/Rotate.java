package While_loop;

import java.util.Scanner;

public class Rotate 
{
public static int rotate(int n)
{
	
	int last=n%10;
	int first=n/10;
	int t=first;
	int res=1;
	while(t>0)
	{
		res=res*10;
		t=t/10;
		
	}
	n=last*res+first;

	
	return n;
	
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("enter digit");
		int n=sc.nextInt();
		System.out.println(rotate(n));
		
	}
}
	

}
