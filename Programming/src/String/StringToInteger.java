package String;

public class StringToInteger
{

	public static long convert(String str)
	{
		long res=0L;
		int j=0;
		if(str.charAt(0)=='-')
		{
			j=1;
			//j++;
		}
		for(int i=j;i<=str.length()-1;i++)
		{
			res=res*10+(str.charAt(i)-48);
		}
		if(str.charAt(0)=='-')
		{
		return -1*res;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(convert("-123"));
	}

}
