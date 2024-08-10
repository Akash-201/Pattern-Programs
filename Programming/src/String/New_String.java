package String;

import java.util.Scanner;

public class New_String 
{

	public static String copy(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			res=res+str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		//System.out.println(copy("hello"));
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter String");
			String str=sc.nextLine();
			System.out.println(copy(str));
		}
	}

}
