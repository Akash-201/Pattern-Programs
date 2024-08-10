package String;

import java.util.Arrays;

public class ToCharArray 
{

	public static char[] tochararray(String str)
	{
		char[] res=new char[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
			res[i]=str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) 
	{
//		String str="hello";
//		char[] res=str.toCharArray();
//		System.out.println(Arrays.toString(res));
		System.out.println(tochararray("hello"));
	}
}
