package String;

import java.util.Scanner;

public class UpperLower 
{

	public static String toLowerCase(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90) // upper to lower
			{
				res=res+(char)(str.charAt(i)+32);
			}
			else if(str.charAt(i)>=90 && str.charAt(i)<=122) // lower to upper
			{
				res=res+(char)(str.charAt(i)-32);
			}
			else   //numeric and special
			{
				res=res+'_';
			}
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
			
			System.out.println(toLowerCase(str));
		}
	}	

}
