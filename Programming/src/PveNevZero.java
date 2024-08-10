
public class PveNevZero 
{
	public static String display(int a)
	{
		;
		if(a>0)
		{
			return "Positive";
		}
		else if(a<0)
		{
			return "Negative";
		}
		else
		{
			return "Equal to Zero";
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(display(0));
		System.out.println(display(8));
		System.out.println(display(-13));
	}
	

}
