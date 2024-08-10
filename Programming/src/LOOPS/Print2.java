package LOOPS;

public class Print2 
{
public static void print(int n)
{
	int x=1;
	int y=6;
	for(int i=1;i<=n;i++)
	{
		System.out.print(x+" ");
		x=x+5;
	}
}
public static void main(String[] args)
{
	print(5);
}
	

}
