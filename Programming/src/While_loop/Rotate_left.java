package While_loop;

import java.util.Scanner;

public class Rotate_left 
{
public static int rotateLeft(int n)
{
	

	
	int res=1;
	int t=n;
	while(t>9)
	{
		res=res*10;
		t=t/10;
		
	}
	int last=n%res;
	int first=n/res;
	
	n=last*10+first;

	
	return n;
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("enter digit");
		int n=sc.nextInt();
		System.out.println(rotateLeft(n));
		
	}
}
}
