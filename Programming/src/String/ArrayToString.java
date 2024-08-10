package String;

public class ArrayToString
{

	public static String toString(char[] ch)
	{
		String res="";
		for(int i=0;i<=ch.length-1;i++)
		{
			res=res+ch[i];
		}
		return res;
	}
	public static void main(String[] args) 
	{
		char[] ch= {'h','e','l','l','o'};
		System.out.println(toString(ch));
}
}
