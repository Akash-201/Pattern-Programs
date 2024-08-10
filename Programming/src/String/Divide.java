package String;

import java.util.Scanner;

public class Divide 
{

	 public static void print( String str)
	   {
	       String upper="";
	       String lower="";
	       String num="";
	       String spl="";
		   for(int i=0;i<=str.length()-1;i++)
		   {
			   if(str.charAt(i)>=65 && str.charAt(i)<=90 )
			   {
				   upper=upper+str.charAt(i);
			   }
			   else if(str.charAt(i)>=97 && str.charAt(i)<=122 )
			   {
				   lower=lower+str.charAt(i);
			   }
			   else if(str.charAt(i)>=48 && str.charAt(i)<=57 )
			   {
				   num=num+str.charAt(i);
			   }
			   else
			   {
			   spl=spl+str.charAt(i);
			   }
			   
		   }
		   System.out.println("upper :- "+upper);
		   System.out.println("lower :- "+lower);
		   System.out.println("num :- "+num);
		   System.out.println("spl :-"+spl);
		   }
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter String");
				String str=sc.nextLine();
				
			print(str);
			}
	}
}
