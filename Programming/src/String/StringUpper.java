package String;

import java.util.Scanner;

public class StringUpper 
{
//public static void main(String[] args) 
//{
//	char ch='z';
//	if(ch>=97 && ch<=122)
//	{
//		ch=(char)(ch-32);
//	}
//	System.out.println(ch);
//	
//	
//	
////	String str="hello";
////	str=str.toUpperCase();
////	System.out.println(str);
//}
	
	public static String toUpperCase(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=90 && str.charAt(i)<=122)
			{
				res=res+(char)(str.charAt(i)-32);
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
			
			System.out.println(toUpperCase(str));
		}
	}
	

}
