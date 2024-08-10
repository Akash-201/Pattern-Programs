package String;

import java.util.Scanner;

// rotate a string to right n times

public class Rotate_String_N 
{

	public static String  rotateright(String str,int n)
	{
		n=n%str.length();
		str=str.substring(str.length()-n)+str.substring(0,str.length()-n);
		return str;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("enter String ");
			String str=sc.nextLine();
			System.out.println("enter n ");
			int n=sc.nextInt();
			System.out.println( rotateright(str,n));
		
	
	

}
}
