package String;

import java.util.Scanner;

//rotate a string to left n times

public class Rotate_Left
{

	public static String  RotateLeft(String str,int n)
	{
		n=n%str.length();
		str=str.substring(n)+str.substring(0,n);
		return str;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("enter String ");
			String str=sc.nextLine();
			System.out.println("enter n ");
			int n=sc.nextInt();
			System.out.println( RotateLeft(str,n));
			
	}

}
