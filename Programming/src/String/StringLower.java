package String;

import java.util.Scanner;

public class StringLower 
{

//	public static void main(String[] args) 
//	{
//		char ch='A';
//		if(ch>=65 && ch<=90)
//		{
//			ch=(char)(ch+32);
//		}
//		System.out.println(ch);
////		String str="HELLO";
////		str=str.toLowerCase();
////		System.out.println(str);
//	}
	
	public static String toLowerCase(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				res=res+(char)(str.charAt(i)+32);
			}
			else
			{
				res=res+str.charAt(i);
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
