package String;

import java.util.Scanner;

public class Palindrom 
{
    public static boolean check(String str)
	{
		String res="";
		//for(int i=str.length()-1;i>=0;i--)
		for(int i=0;i<=str.length()-1;i++)
		{
			//res=res+str.charAt(i);
			res=str.charAt(i)+res;
		}
		//return str.equals(res);
		 System.out.println(str+"---->"+res);
		if(str.equals(res))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter String");
			String str=sc.nextLine();
			System.out.println(check(str));
		}
	}

}
