package String;

public class StringMultiply 
{
	public static String test(String s1,String s2)
	{
		// return multiply(s1)+multiply(s2)+"";
		//return multiply(s1)*multiply(s2)+"";
		
		return multiply(s1)/multiply(s2)+"";
		
	}

	public static long multiply(String str)
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
		//if(j==1)
		if(str.charAt(0)=='-')
		{
		return -1*res;
		}
		return res;
	}
	
	// only for in integer value
	
//	public static void main(String[] args) 
//	{
//		long a= multiply("0033");
//		long b= multiply("2");
//		System.out.println(a*b);
//	}
	
	public static void main(String[] args)
	{
		System.out.println(test("123","10"));
	}
	
}
