
public class Type 
{
public static String display(int a)
{
	if(a>=65 && a<=90)
	{
		return "uppercase";
	}
	else if (a>=97 && a<=122)
	{
		return "lowercase";
	}
	else if(a>=48 && a<57 )
	{
		return "numeric";
	}
	else
	{
		return "symbol";
	}
}
	public static void main(String[] args) 
	{
		System.out.println(display(50));
	}

}
