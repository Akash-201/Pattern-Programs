
public class Largest 
{
	public static int display(int a,int b,int c)
	{
		
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>c && b>a)
		{
			return b;
		}
		else
		{
			return c;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Largest Number is : "+display(10,45,17));
	}
}
