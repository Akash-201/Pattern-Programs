package String;

public class Repeat_N_Times 
{
public static String concat(char ch,int n)
{
	String res="";
	for(int i=1;i<=n;i++)
	{
		res=res+ch;
	}
	return res;
}
public static void main(String[] args)
{
	System.out.println(concat('w',5));
}
	
}
