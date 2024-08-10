
public class Evenoradd
{
	public static String display(int a)
	{
		String ans;
		if(a%2==0)
		{
		ans = "Even";	
		}
		else 
		{
		ans= "Odd";	
		}
		return ans;
	}
	public static void main(String[] args)
	{
		
	System.out.println(display(18));

	System.out.println(display(35));
	System.out.println(display(0));
	}
}