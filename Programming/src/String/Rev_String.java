package String;

import java.util.Scanner;

public class Rev_String 
{

	public static String reverse(String str)
	{
		String res="";
		//for(int i=str.length()-1;i>=0;i--)
		for(int i=0;i<=str.length()-1;i++)
		{
			//res=res+str.charAt(i);
			res=str.charAt(i)+res;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter String");
			String str=sc.nextLine();
			System.out.println(reverse(str));
		}
	}

}
